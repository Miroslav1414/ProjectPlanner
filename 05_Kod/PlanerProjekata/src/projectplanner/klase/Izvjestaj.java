package projectplanner.klase;

public class Izvjestaj {
    private String stanjeProjekta;
    private String finansijskiPregled;
    private String pregledAktivnosti;
    
    public void setStanjeProjekta(String stanjeProjekta) {
        this.stanjeProjekta = stanjeProjekta;
    }
    
    public String getStanjeProjekta() {
        return stanjeProjekta;
    }
    
    public void setFinansijskiPregled(String finansijskiPregled) {
        this.finansijskiPregled = finansijskiPregled;
    }
    
    public String getFinansijskiPregled() {
        return finansijskiPregled;
    }
    
    public void setPregledAktivnosti(String pregledAktivnosti) {
        this.pregledAktivnosti = pregledAktivnosti;
    }
    
    public String getPregledAktivnosti() {
        return pregledAktivnosti;
    }
}
