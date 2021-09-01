package be.vdab.oef6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var woordenMetZinIndex = new TreeMap<String, Set<Integer>>();
        var huidigeZin = 0;

        for (String zin; !(zin = sc.nextLine()).equals("stop"); ) {
            huidigeZin++;
            var woorden = zin.split(" ");
            for (var woord : woorden) {
                var setVanZinnen = woordenMetZinIndex.get(woord);
                if (setVanZinnen == null) {
                    //dit woord wordt niet teruggevonden in onze Map dus we maken een Set aan, toon hier aan WELKE set
                    var value = new LinkedHashSet<Integer>();
                    value.add(huidigeZin);
                    woordenMetZinIndex.put(woord, value);
                } else {
                    setVanZinnen.add(huidigeZin);
                }
            }
        }
        for (var entry : woordenMetZinIndex.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}