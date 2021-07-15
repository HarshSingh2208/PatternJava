package Pattern.java;
import java.util.Scanner;

public class DiamondOfStars {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i=0;
        int n1=(n/2)+1;
        int limit=0;
       while(i<n1)
       {
           int spaces=n1-i-1;
           int j=0;
           while(j<spaces)
           {
               System.out.print(" ");
               j=j+1;
           }
           j=0;
           limit=(2*i)+1;
           while(j<limit)
           {
               System.out.print("*");
               j=j+1;
           }
           i=i+1;
           System.out.print('\n');
           
       }
       
       int n2=n-n1;
       i=0;
       int limit2 = limit-2;
       while(i<n2)
       {
    	   int spaces1=i+1;
    	   int k=0;
           while(k<spaces1)
           {
               System.out.print(" ");
               k=k+1;
           }
           
           k=0;
            
           while(k<limit2)
           {
               System.out.print("*");
               k=k+1;
           }
           i=i+1;
           limit2=limit2-2;
           System.out.print('\n');
            
       }
       


	}

}
