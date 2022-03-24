import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;

public class ReadFileByLine {
    public static void main(String[] args) throws FileNotFoundException {
        try {

            FileInputStream fis = new FileInputStream("out.txt");
            int i = 1 ;
            Scanner in = new Scanner(fis);
            while (in.hasNext()) {

                System.out.println(i + "." + in.nextLine());
                i++;
            }


        }catch(FileNotFoundException ex) {

            ex.printStackTrace();
        }
    }
}