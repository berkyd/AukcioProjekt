import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class Main {

        public static void main(String[] args) throws IOException {
            var sorok = Files.readAllLines(Paths.get("festmenyek.csv"));
            var festmenyek=new LinkedList<Festmeny>();
            for (var sor: sorok) {
                var painting = new Festmeny(sor);
                festmenyek.add(painting);
            }
            System.out.println(festmenyek);
        }
    }