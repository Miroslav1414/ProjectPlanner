package projecrplanerserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ServerThread extends Thread {

    private Socket sock;
    private BufferedReader in;
    private PrintWriter out;
    private Connection conn = null;
    
    
    public String prvoVelikoSlovo(String str) {
        String temp = "";
        return temp += str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
    public String trenutniDatum(){
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date today = new Date();
        return (format.format(today));
    }
    public String login(String user, String pass) {

        String query = "Select * from nalog where Username = '" + user + "' and "
                + "Password = '" + pass + "'";
        String ime, prezime, radnoMjesto;
        Statement s;
        ResultSet rs;
        try {
            s = conn.createStatement();
        
            rs = s.executeQuery(query);
            //da li postoji nalog
            if (rs.next()) {
                if (rs.getBoolean(5) == false) {
                    return "DEAKTIVIRAN_NALOG";

                } else {
                    ime = prvoVelikoSlovo(rs.getString(3));
                    prezime = prvoVelikoSlovo(rs.getString(4));
                    radnoMjesto = prvoVelikoSlovo(rs.getString(6));
                    rs = s.executeQuery("select * from Admin where username ='" + user + "'");
                    if (rs.next()) {
                        return "ADMIN";
                    }
                    return "KORISNIK#" + ime + "#" + prezime + "#" + radnoMjesto;
                    //KORISNIK#ime#prezime#radnoMjesto
                }
            }

            return "GRESKA_UNOSA";
        } catch (Exception e) {
            e.printStackTrace();
            return "IZUZETAK";
        }

    }
    public String register(String user, String pass, String ime, String prezime, String radnoMjesto) {
        String query = "select username from nalog where username = '" + user + "'";
        Statement s;
        ResultSet rs;
        try {
            s = conn.createStatement();
            rs = s.executeQuery(query);
            if (rs.next()) {
                return "NETACNO";
            }
            s.executeUpdate("Insert into Nalog (Username,Password,Ime,Prezime,RadnoMjesto) "
                    + "values ('" + user + "','" + pass + "','" + prvoVelikoSlovo(ime) + "','"
                    + prvoVelikoSlovo(prezime) + "','" + radnoMjesto + "')");
            return "TACNO";

        } catch (Exception e) {
            e.printStackTrace();
            return "IZUZETAK";
        }

    }
    public void listaNaloga(boolean svi) {
        String query = "SELECT "
                + "r.username, n.Ime, n.Prezime, n.aktivan "
                + "from radnik r, nalog n "
                + "where r.username = n.username;";
        Statement s;
        ResultSet rs;
        try {
            s = conn.createStatement();
            rs = s.executeQuery(query);
            if (svi) {
                while (rs.next()) {
                    out.println(rs.getString(1) + "#" + rs.getString(2) + "#"
                            + rs.getString(3));
                }
            } else {
                while (rs.next()) {
                    if (rs.getBoolean(4)) {
                        out.println(rs.getString(1) + "#" + rs.getString(2) + "#"
                                + rs.getString(3));
                    }
                }
            }

            out.println("KRAJ_NALOGA");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("izizetak lista naloga");
            out.println("IZUZETAK");
        }
    }
    public void listaProjekata(String username) {
        String query = "";

        if (username.equals("ADMIN")) {
            query = "SELECT  IdProjekta, NazivProjekta, opis from projekat ";
        } else {
            query = "Select distinct p.IdProjekta, p.NazivProjekta, p.opis from projekat p "
                    + "inner join cjelina c on p.IdProjekta = c.IdProjekta "
                    + "inner join aktivnost a on c.idCjeline = a.idCjeline "
                    + "inner join radnik r on a.username = r.username "
                    + "where a.username ='" + username + "'";
        }
        Statement s;
        ResultSet rs;
        try {
            s = conn.createStatement();

            rs = s.executeQuery(query);
            while (rs.next()) {
                out.println(rs.getInt(1) + "#" + rs.getString(2) + "#" +rs.getString(3).replaceAll("_novired_","\n") + "#radnik");
            }
            rs= s.executeQuery("Select p.IdProjekta, p.NazivProjekta, p.opis from projekat p "
                    + "where UsernameSef = '"+username+"'");
            while (rs.next()){
                out.println(rs.getInt(1) + "#" + rs.getString(2)+ "#" +rs.getString(3).replaceAll("_novired_","\n") + "#sef");
            }
            
            rs= s.executeQuery("Select p.IdProjekta, p.NazivProjekta, p.opis from projekat p "
                    + "where UsernameNadzor = '"+username+"'");
            while (rs.next()){
                out.println(rs.getInt(1) + "#" + rs.getString(2)+ "#" +rs.getString(3).replaceAll("_novired_","\n") + "#nadzor");
            }
            
            out.println("KRAJ_PROJEKATA");

        } catch (Exception e) {
            e.printStackTrace();
            out.println("IZUZETAK");
        }
    }
    public String kreirajProjekat(String naziv, String usernameAdmin,
            String usernameSef, String usernameNadzor, String opis) {
        String opis2 = opis.replaceAll("\n", "_novired_");
        String query = "insert into projekat (NazivProjekta,Username,UsernameSef,"
                + "UsernameNadzor,Opis)"
                + "values ('" + naziv + "','" + usernameAdmin + "','" + usernameSef + "','"
                + usernameNadzor + "','" + opis2 + "')";
        Statement s;
        try {
            s = conn.createStatement();
            s.executeUpdate(query);
            return "TACNO";

        } catch (Exception e) {
            e.printStackTrace();
            return "IZUZETAK";
        }
    }
    public String brisiNalog(String username) {
        String query = "update nalog set Aktivan = '0' where username = '" + username + "'";
        Statement s;
        try {
            s = conn.createStatement();
            if (s.executeUpdate(query) == 1) {
                return "TACNO";
            }
            return "NETACNO";

        } catch (Exception e) {
            e.printStackTrace();
            return "IZUZETAK";
        }
    }
    public String brisiProjekat(String idProjekta) {
        String query = "delete from projekat where idProjekta ='" + idProjekta + "'";
        Statement s;
        try {
            s = conn.createStatement();
            if (s.executeUpdate(query) == 1) {
                return "TACNO";
            }
            return "NETACNO";

        } catch (Exception e) {
            e.printStackTrace();
            return "IZUZETAK";
        }

    }
    
    public String getSef(String idProjekta){
        String query = "Select Ime,Prezime "
                + "from nalog n "
                + "inner join projekat p on n.username = p.usernameSef "
                + "where p.IdProjekta = '"+idProjekta+"'";
        Statement s;
        ResultSet rs;
        try {
            s = conn.createStatement();
            rs = s.executeQuery(query);
            if(rs.next()){
                return rs.getString(1)+"#"+rs.getString(2);
            }
            return "greska";

        } catch (Exception e) {
            e.printStackTrace();
            return "IZUZETAK";
        }
    }
    public String getNadzor(String idProjekta){
        String query = "Select Ime,Prezime "
                + "from nalog n "
                + "inner join projekat p on n.username = p.usernameNadzor "
                + "where p.IdProjekta = '"+idProjekta+"'";
        Statement s;
        ResultSet rs;
        try {
            s = conn.createStatement();
            rs = s.executeQuery(query);
            if(rs.next()){
                return rs.getString(1)+"#"+rs.getString(2);
            }
            return "greska";

        } catch (Exception e) {
            e.printStackTrace();
            return "IZUZETAK";
        }
    }
    public String getOpis(String idProjekta){
        String query = "select opis from projekat where idProjekta = '" +idProjekta+ "'";
        Statement s;
        ResultSet rs;
        try {
            s = conn.createStatement();
            rs = s.executeQuery(query);
            rs.next();
            return rs.getString(1).replaceAll("_novired_", "\n");

        } catch (Exception e) {
            e.printStackTrace();
            return "IZUZETAK";
        }
    }
    public void radniciNaProjektu(String idProjekta) {
        String query = "Select distinct n.ime,n.prezime,n.username,n.radnoMjesto "
                + "from nalog n "
                + "inner join cjelina c on c.username = n.username "
                + "inner join projekat p on c.idProjekta = p.idProjekta "
                + "where p.idProjekta = '" + idProjekta + "'";
        Statement s;
        try {
            s = conn.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                out.println(rs.getString(1) + "#" + rs.getString(2) + "#" + rs.getString(3) + "#" + rs.getString(4));
            }
            out.println("KRAJ_UCESNIKA");

        } catch (Exception e) {
            e.printStackTrace();
            out.println("IZUZETAK");
        }
    }
    public void radniciNaCjelini(int idCjeline){
        String query = "select username "
                + "from Cjelina "
                + "where idCjeline ='"+idCjeline+"'";
        
        Statement s;
        try {
            s = conn.createStatement();
            ResultSet rss = s.executeQuery(query);
            while(rss.next()){
                out.println(rss.getString(1));
            }
            out.println("KRAJ_UCESNIKA");
        } catch (Exception e) {
            e.printStackTrace();
            out.println("IZUZETAK");
        }
    }
    public void aktivnostiNaCjelini(int idCjeline){
        String query = "select distinct NazivAktivnosti "
                + "from aktivnost "
                + "where idCjeline ='"+idCjeline+"'";
        
        Statement s;
        try {
            s = conn.createStatement();
            ResultSet rss = s.executeQuery(query);
            while(rss.next()){
                out.println(rss.getString(1));
            }
            out.println("KRAJ_AKTIVNOSTI");
        } catch (Exception e) {
            e.printStackTrace();
            out.println("IZUZETAK");
        }
    }
    public void saljiRadnikeIAktivnostiCjeline(String idCjeline){
        String query = "select distinct naziv, idCjeline, vremenskiRok, brojRadnihCasova ,"
                + "BrojOdradjenihCasova, idNadcjeline "
                + "from Cjelina "
                + "where idCjeline ='"+idCjeline+"'";
        int idNad;
        
        try {
            Statement ss = conn.createStatement();
            ResultSet rss = ss.executeQuery(query);
            while(rss.next()){
                if (rss.getInt(6) == 0){idNad = rss.getInt(2);}
                else {idNad = rss.getInt(6);}
                out.println(rss.getString(1) +"#"+ rss.getInt(2)+"#"+ rss.getDate(3)+"#"+ rss.getInt(4)
                +"#"+ rss.getInt(5)+"#"+ idNad);
                
                radniciNaCjelini(rss.getInt(2));
                aktivnostiNaCjelini(rss.getInt(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println("IZUZETAK");
        }
    }
    public void prihodiNaProjektu(String idProjekta){
        String query = "select Naziv, opis, iznos, datumKreiranja "
                + " from prihod where idProjekta = '" +idProjekta+"'";
        Statement s;
        ResultSet rs;
        try {
            s = conn.createStatement();
            rs = s.executeQuery(query);
            while (rs.next())
                out.println(rs.getString(1) +"#"+ rs.getString(2) +"#"+ rs.getFloat(3) +"#"+ rs.getDate(4));

        } catch (Exception e) {
            e.printStackTrace();
            out.println("IZUZETAK");
        }
    }
    public void rashodiNaProjektu(String idProjekta){
        String query = "select Naziv, opis, iznos, datumKreiranja "
                + " from rashod where idProjekta = '" +idProjekta+"'";
        Statement s;
        ResultSet rs;
        try {
            s = conn.createStatement();
            rs = s.executeQuery(query);
            while (rs.next())
                out.println(rs.getString(1) +"#"+ rs.getString(2) +"#"+ rs.getFloat(3) +"#"+ rs.getDate(4));

        } catch (Exception e) {
            e.printStackTrace();
            out.println("IZUZETAK");
        }
    }
    public int izracunajProcenat(String idProjekta){
        String query =  "select sum(ukupno) as suma from " +
                        "(select distinct (brojodradjenihcasova) as ukupno, idCjeline from cjelina where "
                        + " idprojekta = '"+idProjekta+"') as TABELA";
        Statement s;
        ResultSet rs;
        try {
            s = conn.createStatement();
            rs = s.executeQuery(query);
            rs.next();
            int sumaOdradjenihSati = rs.getInt(1);
            rs = s.executeQuery("select sum(ukupno) as suma from " +
                        "(select distinct distinct (brojradnihcasova) as ukupno, idCjeline from cjelina where "
                        + " idprojekta = '"+idProjekta+"') as TABELA");
            rs.next();
            int sumaSvihSati = rs.getInt(1);
            
            
            return (int) ((sumaOdradjenihSati*100)/sumaSvihSati);

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
        
    }
    public void aktivnostiZaRadnika(String username,String idProjekta){
        String query = "select distinct a.idAktivnosti, a.NazivAktivnosti from aktivnost a inner join "
                + "cjelina c on a.idCjeline = c.idCjeline "
                + "where a.username = '"+username+"' and c.idProjekta = '"+ idProjekta+"'";
        Statement s;
        ResultSet rs;
        try {
            s = conn.createStatement();
            rs = s.executeQuery(query);
            while(rs.next()){
                out.println(rs.getInt(1)+"#"+ rs.getString(2));
                //System.out.println(rs.getInt(1)+"#"+ rs.getString(2));
            }
            out.println("KRAJ_AKTIVNOSTI");

        } catch (Exception e) {
            e.printStackTrace();
            out.println("IZUZETAK");
        }
    }
    public void poruke(String idProjekta,String username, boolean poslatiSefu){
         
        if(poslatiSefu){
        String query = "Select distinct  p.IdPoruke,p.TekstPoruke,p.username,p.idAktivnosti,a.NazivAktivnosti,a.IdCjeline "
                + "from poruka p "
                + "inner join aktivnost a on p.idAktivnosti = a.idAktivnosti "
                + "inner join cjelina c on c.idCjeline = a.idCjeline "
                + "inner join projekat pr on c.idProjekta = pr.idProjekta "
                + "where pr.idProjekta = '" +idProjekta+"' and p.procitana = 0 and poslaoSef = 0 ";
            Statement s;
            ResultSet rs;
        try {
            s = conn.createStatement();
            rs = s.executeQuery(query);
            while(rs.next()){
                out.println(rs.getInt(1) +"#"+rs.getString(2) +"#"+rs.getString(3) 
                        +"#"+rs.getInt(4) +"#"+rs.getString(5) +"#"+rs.getString(6));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println("IZUZETAK");
        }}
        else{
            
        String query = "Select distinct p.IdPoruke,p.TekstPoruke "
                + "from poruka p "
                + "inner join aktivnost a on p.idAktivnosti = a.idAktivnosti "
                + "inner join cjelina c on c.idCjeline = a.idCjeline "
                + "inner join projekat pr on c.idProjekta = pr.idProjekta "
                + "where pr.idProjekta = '" +idProjekta+"' and p.username ='"+username+"' "
                + "and poslaoSef = '"+1+"'";
            Statement s;
            ResultSet rs;
        try {
            s = conn.createStatement();
            rs = s.executeQuery(query);
            while(rs.next()){
                out.println(rs.getInt(1) +"#"+rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
            out.println("IZUZETAK");
        }}
            
    }
    public void prikaziProjekat(String username, String idProjekta) throws Exception{
        String query;
        
            out.println(
                    getOpis(idProjekta) + "#" +
                    getSef(idProjekta)  + "#" +
                    getNadzor(idProjekta));
            
            
            System.out.println(in.readLine());// primio podatke
            radniciNaProjektu(idProjekta);
            System.out.println(in.readLine());//primio ucesnike
            if (username.equals("ADMIN") || username.equals("NADZOR")|| username.equals("SEF")){
            
            query = "Select distinct c.idcjeline from cjelina c "
                    + "where c.idProjekta = '" +idProjekta+"'";
            Statement s;
            ResultSet rs;
        try {
            s = conn.createStatement();
            rs = s.executeQuery(query);
            while(rs.next()){
                saljiRadnikeIAktivnostiCjeline(rs.getString(1));
            }
            out.println("KRAJ_PODCJELINA");
            System.out.println(in.readLine()); //primiro podcjeline
            
            prihodiNaProjektu(idProjekta);
            out.println("KRAJ_PRIHODA");
            System.out.println(in.readLine()); //primiro prihode
            
            rashodiNaProjektu(idProjekta);
            out.println("KRAJ_RASHODA");
            System.out.println(in.readLine()); //primiro rashode

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (username.equals("SEF")){
            poruke(idProjekta,"SEF",true);
            out.println("KRAJ_PORUKA");
            System.out.println(in.readLine()); //primio poruke
            out.println(sledeciIdCjeline());
            System.out.println(in.readLine());//primio id cjeline
        } 
        
        }
        else {
            out.println(izracunajProcenat(idProjekta));
            System.out.println(in.readLine()); //primio procenat
            aktivnostiZaRadnika(username,idProjekta);
            System.out.println(in.readLine()); //primio aktivnosti
            poruke(idProjekta,username,false);
            out.println("KRAJ_PORUKA");
            System.out.println(in.readLine()); //primio poruke
        }
                
    }
     
    
    public void kreirajPrihod(String idProjekta,String naziv, String opis, String iznos){
        String query = "insert into prihod (idProjekta,Naziv,Opis,Iznos,DatumKreiranja) values "
                + "('"+idProjekta+"','"+naziv+"','"+opis+"','"+iznos+"','"+trenutniDatum()+"')";
        Statement s;
        
        try {
            s = conn.createStatement();
            if(s.executeUpdate(query)==1)
            out.println("USPJESNO");
            else out.println("NEUSPJESNO");

        } catch (Exception e) {
            e.printStackTrace();
            out.println("IZUZETAK");
        }
    }
    public void kreirajRashod(String idProjekta,String naziv, String opis, String iznos){
        String query = "insert into rashod (idProjekta,Naziv,Opis,Iznos,DatumKreiranja) values "
                + "('"+idProjekta+"','"+naziv+"','"+opis+"','"+iznos+"','"+trenutniDatum()+"')";
        Statement s;
        
        try {
            s = conn.createStatement();
            if(s.executeUpdate(query)==1)
            out.println("USPJESNO");

        } catch (Exception e) {
            e.printStackTrace();
            out.println("IZUZETAK");
        }
    }
        public void kreirajCjelinu(String idProjekta,String username,String naziv,String idNadcjeline,String vremenskiRok,
            String brojRadnihCasova, String idCjeline){
        String query;
        String [] datum = vremenskiRok.split("[.]");
        String rok = datum[2] + "-" + datum[1] + "-" + datum[0];
        if(idNadcjeline.equals("NULL"))
        query = "insert into cjelina (IdCjeline,Username,IdProjekta,Naziv,VremenskiRok,BrojRadnihCasova) "
                + "values ('"+idCjeline+"','"+username+"','"+idProjekta+"','"+naziv+"','"+rok+"','"+brojRadnihCasova+"')";
        else query = "insert into cjelina (IdCjeline,Username,IdProjekta,Naziv,VremenskiRok,BrojRadnihCasova,idNadcjeline) "
                + "values ('"+idCjeline+"','"+username+"','"+idProjekta+"','"+naziv+"','"+rok+"','"+brojRadnihCasova+"','"+idNadcjeline+"')";
        Statement s;
        ResultSet rs;
        try {
            s = conn.createStatement();
            if(s.executeUpdate(query)==1){
                //rs = s.executeQuery("select max(idCjeline) as id from cjelina where idProjekta='"+idProjekta+"'");
                //rs.next();
                //String idCjelinee = rs.getString(1);
                System.out.println("SALJI_AKTIVNOSTI");
                out.println("SALJI_AKTIVNOSTI");
                String ulaz = in.readLine();
                System.out.println(ulaz);
                String niz [] = ulaz.split("#");
                for( String i:niz){
                    query = "insert into aktivnost (NazivAktivnosti,IdCjeline,Username) values ('"+i+"'"
                    + ",'"+idCjeline+"','"+username+"')";
                    s.executeUpdate(query);
                }
                System.out.println("UPISAO_AKTIVNOSTI");
                out.println("UPISAO_AKTIVNOSTI");
            }
            else out.println("GRESKA");

        } catch (Exception e) {
            e.printStackTrace();
            out.println("IZUZETAK");
        }
        
    }
    public void kreirajPorukuRadnik(String idAktivnosti,String tekstoPoruke,String username){
        String query;
        
        query = "insert into poruka (IdAktivnosti,TekstPoruke,username,PoslaoSef) values "
                + "('"+idAktivnosti+"','"+tekstoPoruke+"','"+username+"','0')";
        
        Statement s;
        ResultSet rs;
        try {
            s = conn.createStatement();
            if(s.executeUpdate(query)==1)
                out.println("PORUKA_UPISANA");
            else out.println("GRESKA");
            

        } catch (Exception e) {
            e.printStackTrace();
            out.println("IZUZETAK");
        }
    }
    public void kreirajPorukuSef(String idAktivnosti,String tekstoPoruke,String username,
            String idCjeline, String brojCasova, String idPoruke){
        String query;
        
        query = "insert into poruka (IdAktivnosti,TekstPoruke,username,PoslaoSef) values "
                + "('"+idAktivnosti+"','"+tekstoPoruke+"','"+username+"','"+1+"')";
        
        Statement s;
        ResultSet rs;
        try {
            s = conn.createStatement();
            if(s.executeUpdate(query)==1)
                out.println("PORUKA_UPISANA");
            else out.println("GRESKA");
            
            rs = s.executeQuery("select brojRadnihCasova, brojOdradjenihCasova "
                    + "from cjelina where idCjeline ='"+idCjeline+"' and username ='"+username+"'");
            rs.next();
            if(Integer.parseInt(brojCasova) > rs.getInt(1)-rs.getInt(2)){
                brojCasova = ""+ (rs.getInt(1)- rs.getInt(2)) + ""; }
            
                if(s.executeUpdate("update cjelina set brojOdradjenihCasova = brojOdradjenihCasova + '"+brojCasova+"' "
                        + "where idCjeline ='"+idCjeline+"'" )== 1)
                out.println("USPJESNO_DODANI_SATI");
                else out.println("GRESKA");
                
            s.executeUpdate("update Poruka set procitana = '"+1+"' "
                        + "where idPoruke ='"+idPoruke+"'" );
            if (brojCasova.equals("0"))
                s.executeUpdate("delete from Poruka "
                        + "where idPoruke ='"+idPoruke+"'" );
            
            

        } catch (Exception e) {
            e.printStackTrace();
            out.println("IZUZETAK");
        }
    }

    public void posaljiPorukeZaProjekat(String idProjekta){
        String query = "select distinct p.username , a. nazivAktivnosti, p. tekstPoruke, p.idPoruke "
                + "from poruka p "
                + "inner join aktivnost a on p.idAktivnosti = a.idAktivnosti "
                + "inner join cjelina c on c.idCjeline= a.idCjeline "
                + "where c.idProjekta = '"+idProjekta+"' and p.poslaosef = 0";
        Statement s;
        ResultSet rs;
        try {
            s = conn.createStatement();
            rs = s.executeQuery(query);
            while (rs.next())
                out.println(rs.getString(1) +"#"+ rs.getString(2) +"#"+ rs.getString(3));
            out.println("KRAJ_AKTIVNOSTI");

        } catch (Exception e) {
            e.printStackTrace();
            out.println("IZUZETAK");
        }
    }
    
    public int sledeciIdCjeline(){
        String query = "select max(idCjeline) as id from Cjelina ";
        Statement s;
        ResultSet rs;
        try {
            s = conn.createStatement();
            rs = s.executeQuery(query);
            if(rs.next()) return rs.getInt(1);
            return 0;

        } catch (Exception e) {
            e.printStackTrace();
            out.println("IZUZETAK");
            return -1;
        }
    }
    public void brisiPoruku(String idPoruke){
        String query = "delete from poruka where idPoruke = '"+idPoruke+"'";
        Statement s;
        try {
            s = conn.createStatement();
            s.executeUpdate(query);

        } catch (Exception e) {
            e.printStackTrace();
            out.println("IZUZETAK");
    }}
    
    public void sifra(String username, String pass){
        String query = "update  nalog set password = '"+pass+"' "
                + "where username = '"+username+"'" ;
        Statement s;
        try {
            s = conn.createStatement();
            if(s.executeUpdate(query)==1)out.println("TACNO");
            else out.println("NETACNO");

        } catch (Exception e) {
            e.printStackTrace();
            out.println("IZUZETAK");
    }}
    
    

    public ServerThread(Socket sock) {
        this.sock = sock;
        try {

            in = new BufferedReader(
                    new InputStreamReader(
                            sock.getInputStream(), "UTF-8"));

            out = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    sock.getOutputStream())), true);

            conn = DriverManager.getConnection(ProjectPlanerServer.URL,
                    ProjectPlanerServer.username, ProjectPlanerServer.password);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        start();
    }

    @Override
    public void run() {
        try {
            

            String request;

            do {
                request = in.readLine();

                if (request.startsWith("LOGIN#")) {//<editor-fold defaultstate="collapsed" desc="reg">
                    System.out.println(request);
                    String loginOdgovor = (login(request.split("#")[1], request.split("#")[2]));
                    out.println(loginOdgovor);
                    if (loginOdgovor.equals("ADMIN") || loginOdgovor.equals("KORISNIK")) {
                        ProjectPlanerServer.users.put(request.split("#")[1], out);
                    }//</editor-fold>
                } else if (request.startsWith("REGISTER#")) {//<editor-fold defaultstate="collapsed" desc="reg">
                    System.out.println(request);
                    out.println(register(request.split("#")[1], request.split("#")[2],
                            request.split("#")[4], request.split("#")[3], request.split("#")[5]));//</editor-fold>
                } else if (request.startsWith("LISTA_NALOGA")) {//<editor-fold defaultstate="collapsed" desc="nalozi">
                    System.out.println(request);
                    listaNaloga(false);//</editor-fold>
                } else if (request.startsWith("LISTA_PROJEKATA#")) {//<editor-fold defaultstate="collapsed" desc="projekti">
                    System.out.println(request);
                    listaProjekata(request.split("#")[1]);//</editor-fold>
                } else if (request.startsWith("KREIRAJ_PROJEKAT")) {//<editor-fold defaultstate="collapsed" desc="kreiranje projekta">
                    System.out.println(request);
                    out.println(kreirajProjekat(request.split("#")[1], request.split("#")[2],
                            request.split("#")[3], request.split("#")[4], request.split("#")[5]));//</editor-fold>
                } else if (request.startsWith("BRISI_NALOG")) {//<editor-fold defaultstate="collapsed" desc="deaktivacija naloga">
                    System.out.println(request);
                    out.println(brisiNalog(request.split("#")[1]));
                }//</editor-fold>
                  else if (request.startsWith("BRISI_PROJEKAT#")) {//<editor-fold defaultstate="collapsed" desc="...">
                    System.out.println(request);
                    out.println(brisiProjekat(request.split("#")[1]));
                }//</editor-fold>
                  else if (request.startsWith("PRIKAZI_PROJEKAT#")){//<editor-fold defaultstate="collapsed" desc="...">
                      System.out.println(request);
                      prikaziProjekat(request.split("#")[1], request.split("#")[2]);
                }//</editor-fold>
                  else if (request.startsWith("KREIRAJ_PRIHOD#")){//<editor-fold defaultstate="collapsed" desc="...">
                      System.out.println(request);
                      kreirajPrihod(request.split("#")[1], request.split("#")[2], request.split("#")[3], request.split("#")[4]);
                }//</editor-fold>
                  else if (request.startsWith("KREIRAJ_RASHOD#")){//<editor-fold defaultstate="collapsed" desc="...">
                      System.out.println(request);
                      kreirajRashod(request.split("#")[1], request.split("#")[2], request.split("#")[3], request.split("#")[4]);
                }//</editor-fold>
                  else if (request.startsWith("KREIRAJ_CJELINU#")){//<editor-fold defaultstate="collapsed" desc="...">
                      System.out.println(request);
                      kreirajCjelinu(request.split("#")[1], request.split("#")[2],
                              request.split("#")[3], request.split("#")[4], request.split("#")[5],
                              request.split("#")[6], request.split("#")[7]);
                }//</editor-fold>
                  else if (request.startsWith("KREIRAJ_PORUKU_RADNIK#")){//<editor-fold defaultstate="collapsed" desc="...">
                      System.out.println(request);
                      kreirajPorukuRadnik(request.split("#")[1], request.split("#")[2],
                              request.split("#")[3]);
                }//</editor-fold>
                  else if (request.startsWith("PREGLED_AKTIVNOSTI#")){//<editor-fold defaultstate="collapsed" desc="...">
                      System.out.println(request);
                      posaljiPorukeZaProjekat(request.split("#")[1]);
                }//</editor-fold>
                  else if (request.startsWith("KREIRAJ_PORUKU_SEF#")){//<editor-fold defaultstate="collapsed" desc="...">
                      System.out.println(request);
                      kreirajPorukuSef(request.split("#")[1], request.split("#")[2], request.split("#")[3],
                      request.split("#")[4], request.split("#")[5],request.split("#")[6]);
                      
                }//</editor-fold>
                  else if (request.startsWith("BRISI_PORUKU#")){//<editor-fold defaultstate="collapsed" desc="...">
                      System.out.println(request);
                      brisiPoruku(request.split("#")[1]);
                }//</editor-fold>
                  else if (request.startsWith("SIFRA#")){//<editor-fold defaultstate="collapsed" desc="...">
                      System.out.println(request);//username,novipassword
                      sifra(request.split("#")[1],request.split("#")[2]);
                }//</editor-fold>

            } while (!request.equals("KRAJ"));
            System.out.println("kraj konekcije");

            in.close();
            out.close();
            sock.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            out.println("IZUZETAK");
        } finally {
        }
    }
}
