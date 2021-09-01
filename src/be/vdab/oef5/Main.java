package be.vdab.oef5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var zinnen = new ArrayList<String>();

        try (var sc = new Scanner(System.in)) {
            for (String regel; !(regel = sc.nextLine()).equals("stop"); ) {
                zinnen.add(regel);
            }
        }

        zinnen.stream()
                .map(zin -> zin.split(" "))
                .flatMap(array -> Arrays.stream(array))
                //oplossing voor onderstaande online teruggevonden
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted((entry1, entry2) -> entry1.getKey().compareTo(entry2.getKey()))
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }
}
