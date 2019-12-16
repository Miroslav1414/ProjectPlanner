package projectplanner.klase;

import java.util.ArrayList;

public class Projekat {
    private String naziv;
    private String opis;
    private String sef;
    private String nadzor;
    private ArrayList<Podcjelina> podcjeline;
    private ArrayList<Prihod> prihodi;
    private ArrayList<Rashod> rashodi;
    private Izvjestaj izvjestaj;
    private String idProjekta;
    private ArrayList<KorisnickiNalog> ucesnici;
    
    public Projekat() {
        podcjeline = new ArrayList<Podcjelina>();
        prihodi = new ArrayList<Prihod>();
        rashodi = new ArrayList<Rashod>();
        ucesnici = new ArrayList<KorisnickiNalog>();
    }
    
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    public String getNaziv() {
        return naziv;
    }
    
    public void setOpis(String opis) {
        this.opis = opis;
    }
    
    public String getOpis() {
        return opis;
    }
    
    public void setUcesnici(KorisnickiNalog ucesnik) {
        ucesnici.add(ucesnik);
    }
    
    public KorisnickiNalog getUcesnici(int i) {
        return ucesnici.get(i);        
    }
    
    public ArrayList<KorisnickiNalog> getListaUcesnici() {
        return ucesnici;
    }
    
    public ArrayList<Podcjelina> getListaPodcjeline() {
        return podcjeline;
    }
    
    public ArrayList<Prihod> getListaPrihodi() {
        return prihodi;
    }
    
    public ArrayList<Rashod> getListaRashodi() {
        return rashodi;
    }
    
    public void setSef(String sef) {
        this.sef = sef;
    }
    
    public String getSef() {
        return sef;        
    }
    
    public void setNadzor(String nadzor) {
        this.nadzor = nadzor;
    }
    
    public String getNadzor() {
        return nadzor;        
    }
    
    public void setPodcjeline(Podcjelina podcjelina) {
        podcjeline.add(podcjelina);
    }
    
    public Podcjelina getPodcjeline(int i) {
        return podcjeline.get(i);        
    }
    
    public void setPrihodi(Prihod prihod) {
        prihodi.add(prihod);
    }
    
    public Prihod getPrihodi(int i) {
        return prihodi.get(i);        
    }
    
    public void setRashodi(Rashod rashod) {
        rashodi.add(rashod);
    }
    
    public Rashod getRashodi(int i) {
        return rashodi.get(i);        
    }
    
    public void setIzvjestaj(Izvjestaj izvjestaj) {
        this.izvjestaj = izvjestaj;
    }
    
    public Izvjestaj getIzvjestaj() {
        return izvjestaj;        
    }
    
    public void setIdProjekta(String idProjekta) {
        this.idProjekta = idProjekta;
    }
    
    public String getIdProjekta() {
        return idProjekta;        
    }
    
    public KorisnickiNalog nadjiUcesnika(String korisnickoIme) {
        for (KorisnickiNalog nalog : ucesnici) {
            if(korisnickoIme.equals(nalog.getKorisnickoIme()))
                return nalog;            
        }
        return null;
    }
    
    public Podcjelina nadjiRoditeljskuPodcjelinu(int idPodcjeline) {
        for (Podcjelina podcjelina : podcjeline) {
            if(idPodcjeline == podcjelina.getIdPodcjeline())
                return podcjelina;            
        }
        return null;
    }
     
    public String getProcenatIzvrsenosti() {
        int brojRadnihCasova = 0;
        int brojOdradjenihCasova = 0;
        String rez = "";
        for(Podcjelina podcjelina: podcjeline) {
            brojRadnihCasova += podcjelina.getBrojRadnihCasova();            
            brojOdradjenihCasova += podcjelina.getBrojOdradjenihCasova();
        }
        if(brojRadnihCasova == 0 && brojOdradjenihCasova == 0) {
            return "0";
        }
        rez += ((brojOdradjenihCasova*100)/brojRadnihCasova);        
        return rez;
    }
    
    public String getUkupnoPrihoda() {
        double zbir = 0;
        String rez = "";
        for(Prihod prihod: prihodi)
            zbir += prihod.getIznos();        
        zbir = (Math.round(zbir * 100.0))/100.0;
        rez += zbir;
        return rez;
    }
    
    public String getUkupnoRashoda() {
        double zbir = 0;
        String rez = "";
        for(Rashod rashod: rashodi)
            zbir += rashod.getIznos();
        zbir = (Math.round(zbir * 100.0))/100.0;
        rez += zbir;
        return rez;
    }
}
