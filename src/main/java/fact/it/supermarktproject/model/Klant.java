package fact.it.supermarktproject.model;
//Ferre Van Hoof r0785026
import java.util.ArrayList;

public class Klant extends Persoon {
    private ArrayList<String> boodschappenlijst = new ArrayList<>();;
    private int klantenkaartnr = -1;



    public Klant(String voornaam, String familienaam) {
        super(voornaam, familienaam);
    }

    public ArrayList<String> getBoodschappenlijst() {
        return boodschappenlijst;
    }

    public int getKlantenkaartnr() {
        return klantenkaartnr;
    }

    public void setBoodschappenlijst(ArrayList<String> boodschappenlijst) {
        this.boodschappenlijst = boodschappenlijst;
    }

    public void setKlantenkaartnr(int klantenkaartnr) {
        this.klantenkaartnr = klantenkaartnr;
    }



    public boolean voegToeAanBoodschappenlijst(String product) {
        if (getAantalOpBoodschappenlijst() >= 5) {
            return false;
        }
        else {
            boodschappenlijst.add(product);
            return true;
        }
    }

    public int getAantalOpBoodschappenlijst() {
        return boodschappenlijst.size();
    }

    public String toString() {
        return ("Klant " + getFamilienaam().toUpperCase() + " " + getVoornaam() + " met klantenkaartnr " + getKlantenkaartnr());
    }
}
