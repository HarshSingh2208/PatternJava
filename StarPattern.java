package Pattern.java;
import java.util.Scanner;
public class StarPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i=0;
       while(i<n)
       {
           int spaces=n-i-1;
           int j=0;
           while(j<spaces)
           {
               System.out.print(" ");
               j=j+1;
           }
           j=0;
           int limit=(2*i)+1;
           while(j<limit)
           {
               System.out.print("*");
               j=j+1;
           }
           i=i+1;
           System.out.print('\n');
           
       }

	}

}
