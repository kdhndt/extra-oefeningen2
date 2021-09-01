//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package be.vdab.oef7;

import java.math.BigDecimal;

abstract class Kasbon {
    public final BigDecimal beginwaarde;
    public final int jaren;
    public final BigDecimal intrest;

    public Kasbon(BigDecimal beginwaarde, int jaren, BigDecimal intrest) {
        this.beginwaarde = beginwaarde;
        this.jaren = jaren;
        this.intrest = intrest;
    }

    public BigDecimal getBeginwaarde() {
        return this.beginwaarde;
    }

    public int getJaren() {
        return this.jaren;
    }

    public BigDecimal getIntrest() {
        return this.intrest;
    }

    public abstract BigDecimal getEindWaarde();
}
