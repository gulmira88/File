import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        fileReader();

    }

    private static void fileReader() {
        try {
            FileReader fileReader = new FileReader("song.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());


        }

    }


    private static void fileWriter() throws IOException {
        FileWriter fileWriter = new FileWriter("song.txt");
        fileWriter.write("Metallica  " +
                "   So close, no matter how far " +
                "   Couldn't be much more from the heart " +
                "   Forever trusting who we are  " +
                "   And nothing else matters  " +
                "   Never opened myself this way " +
                "   Life is ours, we live it our way " +
                "   All is ours , we live it our way " +
                "   And nothing else matters ");
        fileWriter.close();


    }
}

