package be.vdab.tegels;

import java.math.BigDecimal;

public class RechthoekigeTegel extends Tegel {
    public final double lengte;
    public final double breedte;

    public RechthoekigeTegel(BigDecimal prijs, double lengte, double breedte) {
        super(prijs);
        this.lengte = lengte;
        this.breedte = breedte;
    }

    public double getOppervlakte() {
        return this.lengte * this.breedte;
    }
}
