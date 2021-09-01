//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package be.vdab.oef7;

import java.math.BigDecimal;

public class KapitaliseerbareKasbon extends Kasbon {
    public KapitaliseerbareKasbon(BigDecimal beginwaarde, int jaren, BigDecimal intrest) {
        super(beginwaarde, jaren, intrest);
    }

    public BigDecimal getEindWaarde() {
        BigDecimal totaalIntrest = BigDecimal.ZERO;
        BigDecimal vasteIntrest = this.getBeginwaarde().multiply(this.getIntrest());

        for(int i = 0; i < this.getJaren(); ++i) {
            totaalIntrest = totaalIntrest.add(vasteIntrest.add(totaalIntrest.multiply(this.getIntrest())));
        }

        return this.getBeginwaarde().add(totaalIntrest);
    }
}
