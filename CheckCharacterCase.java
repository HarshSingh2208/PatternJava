package Pattern.java;
import java.util.Scanner;
public class CheckCharacterCase {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String st = s.next();
        
        char x = st.charAt(0);
        
        if(x>=97 && x<=122)
        {
            System.out.println("0");
        }
        else if(x>=65 && x<=90)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("-1");
        }


	}

}
