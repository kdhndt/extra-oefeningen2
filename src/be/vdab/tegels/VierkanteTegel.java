package be.vdab.tegels;

import java.math.BigDecimal;

public class VierkanteTegel extends Tegel {
    public final double zijde;

    public VierkanteTegel(BigDecimal prijs, double zijde) {
        super(prijs);
        this.zijde = zijde;
    }

    public double getOppervlakte() {
        return this.zijde * this.zijde;
    }
}

