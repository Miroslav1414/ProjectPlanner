package projectplanner.klase;

public class Rashod {
    private String naziv;
    private String opis;
    private String datum;
    private double iznos;
    
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
    
    public void setDatum(String datum) {
        this.datum = datum;
    }
    
    public String getDatum() {
        return datum;
    }
    
    public void setIznos(double iznos) {
        this.iznos = iznos;
    }
    
    public double getIznos() {
        return iznos;
    }    
}
