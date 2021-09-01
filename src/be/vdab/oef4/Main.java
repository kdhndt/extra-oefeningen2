package be.vdab.oef4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var landen = new ArrayList<String>();

        try (var sc = new Scanner(System.in)) {
            for (String regel; !(regel = sc.nextLine()).equals("stop"); ) {
                landen.add(regel);
            }
        }

        landen.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Totaal: " +
                landen.stream()
                        .map(regel -> regel.split(" ")[1])
                        .mapToInt(Integer::parseInt)
                        .sum()
        );
    }
}
