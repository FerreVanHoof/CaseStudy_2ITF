package fact.it.supermarktproject.model;
//Ferre Van Hoof r0785026
import java.util.ArrayList;


public class Supermarkt {
    private String naam;
    private ArrayList<Afdeling> afdelingen = new ArrayList<>();
    private int aantalKlanten;

    public Supermarkt(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    int aantalAfdelingen;
    public ArrayList<Afdeling> getAfdelingen() {
        return afdelingen;
    }



    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getAantalAfdelingen() {
        return afdelingen.size();
    }

    public void voegAfdelingToe(Afdeling afdeling) {
        afdelingen.add(afdeling);
    }

    public Afdeling zoekAfdelingOpNaam(String naam) {
        for (Afdeling afdeling : afdelingen) {
            if (afdeling.getNaam().equals(naam)) {
                return afdeling;
            }
        }
        return null;

    }

    public void registreerKlant(Klant klant) {
        aantalKlanten += 1;
        klant.setKlantenkaartnr(aantalKlanten);
    }
}
