package fact.it.supermarktproject.model;
//Ferre Van Hoof r0785026
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Personeelslid extends Persoon {
    private LocalDate inDienstSinds;
    private double wedde;

    public Personeelslid(String voornaam, String familienaam) {
        super(voornaam, familienaam);
        this.inDienstSinds = LocalDate.now();
    }

    public LocalDate getInDienstSinds() {
        return inDienstSinds;
    }

    public void setInDienstSinds(LocalDate inDienstsinds) {

    }

    public double getWedde() {
        return wedde;
    }

    public void setWedde(double wedde) {
        this.wedde = wedde;
    }

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM yyyy");

    public String toString() {
        return ("Personeelslid " + getFamilienaam().toUpperCase() + " " + getVoornaam() + " is in dienst sinds " + inDienstSinds.format(dtf));
    }
}
