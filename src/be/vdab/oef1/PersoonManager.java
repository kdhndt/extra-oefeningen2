package be.vdab.oef1;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class PersoonManager {
    private final static Path PAD = Path.of("/data/oefening1.txt");

    //write
    public void save(Personen personen) {
        try (var writer = new ObjectOutputStream(Files.newOutputStream(PAD))) {
            writer.writeObject(personen);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //read
    public Personen load() {
        try (var reader = new ObjectInputStream(Files.newInputStream(PAD))) {
            return (Personen) reader.readObject();
            //veralgemeen hier naar Exception ipv IOException | ClassNotFoundException ex
        } catch (Exception ex) {
            ex.printStackTrace();
            //niet vergeten een return null toe te voegen igv van Exception
            return null;
        }
    }
}