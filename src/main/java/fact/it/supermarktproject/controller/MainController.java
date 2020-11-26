package fact.it.supermarktproject.controller;
//Ferre Van Hoof r0785026
import fact.it.supermarktproject.model.Klant;
import fact.it.supermarktproject.model.Personeelslid;
import fact.it.supermarktproject.model.Persoon;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



@Controller
public class MainController {
    /*deze code heb je pas nodig in deel 2
    private ArrayList<Personeelslid> personeelsleden;
    private ArrayList<Klant> klanten;
    private ArrayList<Supermarkt> supermarkten;
    */

    /* Codeer hieronder al je verschillende mappings */
    @RequestMapping("/1_NieuweKlant")
    public String NieuweKlant() {

        return "1_NieuweKlant";
    }

    @RequestMapping("2_WelkomKlant")
    public String WelkomKlant(Model model, HttpServletRequest request) {
        String voornaam = request.getParameter("voornaam");
        String familienaam = request.getParameter("familienaam");
        String geboortejaarstr = request.getParameter("geboortejaar");
        int geboortejaar = Integer.parseInt(geboortejaarstr);
        Klant k = new Klant(voornaam, familienaam);
        k.setGeboortejaar(geboortejaar);
        model.addAttribute("klant", k);
        return "2_WelkomKlant";
    }

    @RequestMapping("/3_NieuwPersoneelslid")
    public String NieuwPersoneelslid() {

        return "3_NieuwPersoneelslid";
    }

    @RequestMapping("4_WelkomPersoneelslid")
    public String WelkomPersoneel(Model model, HttpServletRequest request) {
        String voornaam = request.getParameter("voornaam");
        String familienaam = request.getParameter("familienaam");
        String inDienstsinds = request.getParameter("inDienstsinds");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate inDienstSinds = LocalDate.parse("1/3/2019", dtf);
        Personeelslid pl = new Personeelslid(voornaam, familienaam);
        model.addAttribute("personeelslid", pl);
        return "4_WelkomPersoneelslid";
    }














    /*Deze methodes heb je pas nodig in deel 2
    private ArrayList<Personeelslid> vulPersoneelsledenLijst() {
        ArrayList<Personeelslid> personeelsleden = new ArrayList<>();
        ArrayList<Personeelslid> personeelsleden = new ArrayList<>();
        Personeelslid jitse = new Personeelslid("Jitse", "Verhaegen");
        Personeelslid bert = new Personeelslid("Bert", "De Meulenaere");
        Personeelslid sanne = new Personeelslid("Sanne", "Beckers");
        personeelsleden.add(jitse);
        personeelsleden.add(bert);
        personeelsleden.add(sanne);
        return personeelsleden;
    }

    private ArrayList<Klant> vulKlantenLijst() {
        ArrayList<Klant> klanten = new ArrayList<>();
        Klant daan = new Klant("Daan", "Mertens");
        daan.setGeboortejaar(2001);
        Klant wim = new Klant("Wim", "Wijns");
        wim.setGeboortejaar(1956);
        Klant gert = new Klant("Gert", "Pauwels");
        gert.setGeboortejaar(1978);
        klanten.add(daan);
        klanten.add(wim);
        klanten.add(gert);
        klanten.get(0).voegToeAanBoodschappenlijst("melk");
        klanten.get(0).voegToeAanBoodschappenlijst("kaas");
        klanten.get(1).voegToeAanBoodschappenlijst("eieren");
        klanten.get(1).voegToeAanBoodschappenlijst("water");
        klanten.get(1).voegToeAanBoodschappenlijst("bloemkool");
        klanten.get(1).voegToeAanBoodschappenlijst("sla");
        klanten.get(2).voegToeAanBoodschappenlijst("tomaten");
        return klanten;
    }

    private ArrayList<Supermarkt> vulSupermarktenLijst() {
        ArrayList<Supermarkt> supermarkten = new ArrayList<>();
        Supermarkt supermarkt1 = new Supermarkt("Colruyt Geel");
        Supermarkt supermarkt2 = new Supermarkt("Okay Meerhout");
        Supermarkt supermarkt3 = new Supermarkt("Colruyt Herentals");
        Afdeling afdeling1 = new Afdeling("Brood");
        Afdeling afdeling2 = new Afdeling("Groenten");
        afdeling2.setGekoeld(true);
        Afdeling afdeling3 = new Afdeling("Fruit");
        afdeling3.setGekoeld(true);
        Afdeling afdeling4 = new Afdeling("Vlees");
        afdeling4.setGekoeld(true);
        Afdeling afdeling5 = new Afdeling("Dranken");
        Afdeling afdeling6 = new Afdeling("Diepvries");
        afdeling1.setFoto("/img/brood.jpg");
        afdeling2.setFoto("/img/groenten.jpg");
        afdeling3.setFoto("/img/fruit.jpg");
        afdeling1.setVerantwoordelijke(personeelsleden.get(0));
        afdeling2.setVerantwoordelijke(personeelsleden.get(1));
        afdeling3.setVerantwoordelijke(personeelsleden.get(2));
        afdeling4.setVerantwoordelijke(personeelsleden.get(0));
        afdeling5.setVerantwoordelijke(personeelsleden.get(1));
        afdeling6.setVerantwoordelijke(personeelsleden.get(2));

        supermarkt1.voegAfdelingToe(afdeling1);
        supermarkt1.voegAfdelingToe(afdeling2);
        supermarkt2.voegAfdelingToe(afdeling3);
        supermarkt2.voegAfdelingToe(afdeling4);
        supermarkt3.voegAfdelingToe(afdeling5);
        supermarkt3.voegAfdelingToe(afdeling6);
        supermarkten.add(supermarkt1);
        supermarkten.add(supermarkt2);
        supermarkten.add(supermarkt3);
        return supermarkten;
    }
    */
}
