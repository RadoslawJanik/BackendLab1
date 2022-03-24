import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
public class TypingInFIle {
    public static void main(String[] args) {
        try
        {
            // Save original out stream.
            PrintStream originalOut = System.out;

            // Create a new file output stream.
            PrintStream fileOut = new PrintStream("./out.txt");

            // Redirect standard out to file.
            System.setOut(fileOut);

            // Wrapped Scanner to get user input.
            Scanner scanner = new Scanner(System.in);
            // Print data in command console.
            originalOut.println("Please type line to put in file. ");
            // Read string line.
            String line = scanner.nextLine();
            while(true)
            {
                // If user input 'quit' then break the loop.
                if("quit".equalsIgnoreCase(line))
                {
                    break;
                }

                // If user input a valid email then write the email to ./out.txt and console.
                originalOut.println("Your line has been saved , type another one or type quit to exit ");
                System.out.println( line );

                // Get next user input line text.
                line = scanner.nextLine();
            }
            originalOut.println("Program exit. ");

            // Do not forget set original output and error stream back again.
            System.setOut(originalOut);

        }catch(FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }


}
