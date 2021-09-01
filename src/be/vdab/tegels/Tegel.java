package be.vdab.tegels;

import java.math.BigDecimal;

public abstract class Tegel {
    public final BigDecimal prijs;

    public Tegel(BigDecimal prijs) {
        this.prijs = prijs;
    }

    public abstract double getOppervlakte();
}
