//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package be.vdab.oef7;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Klant {
    private final Set<Kasbon> kasbonnen = new HashSet<>();

    public Klant() {
    }

    public void add(Kasbon kasbon) {
        this.kasbonnen.add(kasbon);
    }

    public BigDecimal getEindWaarde() {
        BigDecimal eindwaarde = BigDecimal.ZERO;
        for (var kasbon : kasbonnen) {
            eindwaarde = eindwaarde.add(kasbon.getEindWaarde());
        }

        return eindwaarde;
    }
}