package be.vdab.oef1;

import java.io.Serial;
import java.io.Serializable;

//Serializable wordt niet ge auto-import, je moet nl. de interface zelf implementeren om een membervariable te kunnen aanmaken
public class Persoon implements Serializable {
    public final String voornaam;
    public final String naam;
    @Serial
    private static final long serialVersionUID = 1L;

    public Persoon(String voornaam, String naam) {
        this.voornaam = voornaam;
        this.naam = naam;
    }

    public String getNaam() {
        return voornaam + " " + naam;
    }

    @Override
    public String toString() {
        return voornaam + " " + naam;
    }
}
