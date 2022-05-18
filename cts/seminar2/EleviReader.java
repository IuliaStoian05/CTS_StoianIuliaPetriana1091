package cts.seminar2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class EleviReader extends AplicantiReader {

    EleviReader(String numeFiser) throws FileNotFoundException {
        super(numeFiser);
    }

    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {

        scanner.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
            Elev elev = new Elev();
            readAplicant(scanner, elev);
            int clasa = scanner.nextInt();
            String tutore = scanner.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        scanner.close();
        return elevi;

    }
}