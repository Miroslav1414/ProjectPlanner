package projectplanner.klase;

import java.util.ArrayList;

public class Podcjelina {
    private String nazivPodcjeline;
    private String vremenskiRok;
    private int brojRadnihCasova;
    private int brojOdradjenihCasova;
    private ArrayList<KorisnickiNalog> ucesnici;
    private ArrayList<String> aktivnosti;
    private int idPodcjeline;
    private int idRoditeljskePodcjeline;
    
    public Podcjelina() {
        ucesnici = new ArrayList<KorisnickiNalog>();
        aktivnosti = new ArrayList<String>();
    }
    
    public void setNazivPodcjeline(String nazivPodcjeline) {
        this.nazivPodcjeline = nazivPodcjeline;
    }
    
    public String getNazivPodcjeline() {
        return nazivPodcjeline;        
    }
    
    public void setVremenskiRok(String vremenskiRok) {
        this.vremenskiRok = vremenskiRok;
    }
    
    public String getVremenskiRok() {
        return vremenskiRok;        
    }
    
    public void setBrojRadnihCasova(int brojRadnihCasova) {
        this.brojRadnihCasova = brojRadnihCasova;
    }
    
    public int getBrojRadnihCasova() {
        return brojRadnihCasova;        
    }
    
    public void setBrojOdradjenihCasova(int brojOdradjenihCasova) {
        this.brojOdradjenihCasova = brojOdradjenihCasova;
    }
    
    public int getBrojOdradjenihCasova() {
        return brojOdradjenihCasova;        
    }
    
    public void setIdPodcjeline(int idPodcjeline) {
        this.idPodcjeline = idPodcjeline;
    }
    
    public int getIdPodcjeline() {
        return idPodcjeline;        
    }
    
    public void setIdRoditeljskePodcjeline(int idRoditeljskePodcjeline) {
        this.idRoditeljskePodcjeline = idRoditeljskePodcjeline;
    }
    
    public int getIdRoditeljskePodcjeline() {
        return idRoditeljskePodcjeline;        
    }
    
    public void setAktivnosti(String aktivnost) {
        aktivnosti.add(aktivnost);
    }
    
    public String getAktivnosti(int i) {
        return aktivnosti.get(i);        
    }
    
    public void setUcesnici(KorisnickiNalog ucesnik) {
        ucesnici.add(ucesnik);
    }
    
    public KorisnickiNalog getUcesnici(int i) {
        return ucesnici.get(i);        
    }
    
    public ArrayList<String> getListaAktivnosti() {
        return aktivnosti;
    }
    
    public ArrayList<KorisnickiNalog> getListaUcesnici() {
        return ucesnici;
    }
}
