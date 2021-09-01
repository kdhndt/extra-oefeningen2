package be.vdab.oef1;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Personen implements Serializable {
    private final List<Persoon> personen = new ArrayList<>();
    @Serial
    private static final long serialVersionUID = 1L;

    public void add (Persoon persoon) {
        personen.add(persoon);
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        for (var persoon : personen) {
            builder.append(persoon.getNaam()).append("\n");
        }
        return builder.toString();
    }
}
