package be.vdab.tegels;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        var tegel1 = new VierkanteTegel(BigDecimal.valueOf(3), 30.0);
        // parameter 1 = prijs tegel, parameter 2 = zijde tegel in cm.
        var tegel2 = new RechthoekigeTegel(BigDecimal.valueOf(5), 40.0, 20.0);
        // par.1=prijs tegel, par.2=lengte tegel, par.3=breedte tegel
        var tegel3 = new DriehoekigeTegel(BigDecimal.valueOf(4), 40.0, 15.0);
        // par.1=prijs tegel, par.2=lengte tegel, par.3=breedte tegel
        var bestelling = new Bestelling();
        bestelling.detailToevoegen(tegel1, 10); // 10=aantal tegels
        bestelling.detailToevoegen(tegel2, 3);
        bestelling.detailToevoegen(tegel3, 15);
        bestelling.wijzigAantalVanDetail(tegel2, 5);
        System.out.println(bestelling.getOppervlakte());
        System.out.println(bestelling.getTeBetalen());

    }
}