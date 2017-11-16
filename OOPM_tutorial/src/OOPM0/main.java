import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

public class main {

	public static void main (String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Integer: ");
        try{
            String input = br.readLine();            
            int i = Integer.parseInt(input);
            System.out.println(Functionality.quersumme(i));
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        }catch(IOException io){
            System.err.println("Invalid Input!");
        }
	}

}
