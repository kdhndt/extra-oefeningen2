package be.vdab.oef3;

import be.vdab.oef1.Persoon;

public class Cursist extends Persoon {
    private Traject traject;

    public Cursist(String voornaam, String naam, Traject traject) {
        super(voornaam, naam);
        this.traject = traject;
    }

    public Traject getTraject() {
        return traject;
    }

    public void setTraject(Traject traject) {
        this.traject = traject;
    }
}
