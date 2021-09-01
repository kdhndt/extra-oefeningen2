package be.vdab.tegels;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bestelling {
    //dit is de correcte syntax, anders kan je je entries niet aanspreken
    private final Map<Tegel, Integer> entries = new LinkedHashMap<>();

    public Bestelling() {
    }

    public void detailToevoegen(Tegel tegel, int aantal) {
        this.entries.put(tegel, aantal);
    }

    public void wijzigAantalVanDetail(Tegel tegel, int aantal) {
        this.entries.put(tegel, aantal);
    }

    public BigDecimal getTeBetalen() {
        BigDecimal totalePrijs = BigDecimal.ZERO;

        for (var entry : entries.entrySet()) {
            //getPrijs is hier niet nodig, je hebt direct toegang tot prijs
            totalePrijs = totalePrijs.add(entry.getKey().prijs.multiply(BigDecimal.valueOf(entry.getValue())));
        }

        return totalePrijs;
    }

    public double getOppervlakte() {
        double totaleOppervlakte = 0.0D;

        for (var entry : entries.entrySet()) {
            totaleOppervlakte += entry.getKey().getOppervlakte() * entry.getValue();
        }

        return totaleOppervlakte;
    }
}
