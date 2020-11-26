package fact.it.supermarktproject.model;
//Ferre Van Hoof r0785026

public class Afdeling {
    private String naam;
    private String foto;
    private Personeelslid verantwoordelijke;
    private boolean gekoeld;


    public Afdeling() {
    }

    public Afdeling(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public String getFoto() {
        return foto;
    }

    public Personeelslid getVerantwoordelijke() {
        return verantwoordelijke;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setVerantwoordelijke(Personeelslid verantwoordelijke) {
        this.verantwoordelijke = verantwoordelijke;
    }

    public void setGekoeld(boolean gekoeld) {
        this.gekoeld = gekoeld;
    }

    public boolean isGekoeld() {
        return this.gekoeld;
    }
}
