package be.vdab.oef2;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var verzameling = Stream.of("Kasper Dehondt", "Hannah Dehondt", "Ludwina Vervisch", "Eddy Dehondt", "Xander De Grote", "Andre De Grote");
        var familieledenPerFamilienaam =
                verzameling.collect(Collectors.groupingBy(regel -> regel.substring(regel.indexOf(' ') + 1)));
        familieledenPerFamilienaam.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    entry.getValue().stream()
                            .map(regel -> regel.split(" ")[0])
                            .sorted()
                            .forEach(voornaam -> System.out.println("\t" + voornaam));
                });
    }
}