package be.vdab.oef1;

public class Main {
    public static void main(String[] args) {
        var personen = new Personen();
        personen.add(new Persoon("Joe", "Dalton"));
        personen.add(new Persoon("Sarah", "Bernhardt"));
        var manager = new PersoonManager();
        manager.save(personen); //opslaan op harde schijf
        Personen personen2 = manager.load(); //leest de data van het bestand terug
        System.out.println(personen2);
    }
}
