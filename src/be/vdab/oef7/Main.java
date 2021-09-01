//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package be.vdab.oef7;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        var klant = new Klant();
        klant.add(
                new NietKapitaliseerbareKasbon(BigDecimal.valueOf(100), 2,
                        BigDecimal.valueOf(0.05)));
        klant.add(
                new KapitaliseerbareKasbon(BigDecimal.valueOf(100), 2,
                        BigDecimal.valueOf(0.05)));
        System.out.println(klant.getEindWaarde());
    }
}