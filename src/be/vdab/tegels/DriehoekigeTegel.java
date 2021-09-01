package be.vdab.tegels;

import java.math.BigDecimal;

public class DriehoekigeTegel extends Tegel {
    public final double lengte;
    public final double breedte;

    public DriehoekigeTegel(BigDecimal prijs, double lengte, double breedte) {
        super(prijs);
        this.lengte = lengte;
        this.breedte = breedte;
    }

    public double getOppervlakte() {
        return 0.5D * this.lengte * this.breedte;
    }
}

