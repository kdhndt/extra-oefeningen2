package be.vdab.oef3;

import java.util.ArrayList;
import java.util.List;

public class Lokaal {
    private final int nummer;
    private Trainer trainer;
    private final List<Cursist> cursisten = new ArrayList<>();

    public Lokaal(int nummer, Trainer trainer) {
        this.nummer = nummer;
        this.trainer = trainer;
    }

    public void cursistToevoegen(Cursist cursist) {
        cursisten.add(cursist);
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        builder
                .append("Lokaal ")
                .append(nummer)
                .append(" ")
                .append(trainer)
                .append("\n")
                .append(cursisten.size())
                .append(" cursisten:\n");
        for (var cursist : cursisten) {
            builder
                    .append(cursist)
                    .append(" volgt ")
                    .append(cursist.getTraject().getNaam())
                    .append("\n");
        }
        return builder.toString();
    }
}