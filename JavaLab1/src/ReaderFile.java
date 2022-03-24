import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;

public class ReaderFile {
    public static void main(String[] args) throws FileNotFoundException {
        try {

            FileInputStream fis = new FileInputStream("out.txt");

            Scanner in = new Scanner(fis);
            while (in.hasNext()) {
                System.out.println(in.nextLine());
            }


        }catch(FileNotFoundException ex) {

            ex.printStackTrace();
        }
    }
}