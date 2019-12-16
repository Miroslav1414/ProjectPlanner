package projectplanner.klase;

public class Poruka {
    private int idPoruke;
    private String tekstPoruke;
    private String korisnickoImeRadnika;
    private int idAktivnosti;
    private String nazivAktivnosti;
    private int idPodcjeline;
    
    public void setIdPoruke(int idPoruke) {
        this.idPoruke = idPoruke;
    }
    
    public int getIdPoruke() {
        return idPoruke;
    }
    
    public void setIdPodcjeline(int idPodcjeline) {
        this.idPodcjeline = idPodcjeline;
    }
    
    public int getIdPodcjeline() {
        return idPodcjeline;
    }
    
    public void setIdAktivnosti(int idAktivnosti) {
        this.idAktivnosti = idAktivnosti;
    }
    
    public int getIdAktivnosti() {
        return idAktivnosti;
    }
    
    public void setKorisnickoImeRadnika(String korisnickoImeRadnika) {
        this.korisnickoImeRadnika = korisnickoImeRadnika;
    }
    
    public String getKorisnickoImeRadnika() {
        return korisnickoImeRadnika;
    }
    
    public void setTekstPoruke(String tekstPoruke) {
        this.tekstPoruke = tekstPoruke;
    }
    
    public String getTekstPoruke() {
        return tekstPoruke;
    }
    
    public void setNazivAktivnosti(String nazivAktivnosti) {
        this.nazivAktivnosti = nazivAktivnosti;
    }
    
    public String getNazivAktivnosti() {
        return nazivAktivnosti;
    }
}
