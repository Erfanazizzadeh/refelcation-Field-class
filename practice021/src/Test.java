import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
      // we want to uppercase the all line  in 16.txt ;
        File file = new File("D:\\15.txt");
        Scanner scanner = new Scanner(file);
        Formatter format = new Formatter("D:\\16.txt");
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
            format.format(line.toUpperCase());
            format.flush();

        }


    }
}
