//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package be.vdab.oef7;

import java.math.BigDecimal;

public class NietKapitaliseerbareKasbon extends Kasbon {
    public NietKapitaliseerbareKasbon(BigDecimal beginwaarde, int jaren, BigDecimal intrest) {
        super(beginwaarde, jaren, intrest);
    }

    public BigDecimal getEindWaarde() {
        return this.getBeginwaarde().add(this.getBeginwaarde().multiply(this.getIntrest()).multiply(BigDecimal.valueOf((long)this.getJaren())));
    }
}