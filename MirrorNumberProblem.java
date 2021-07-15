package Pattern.java;
import java.util.Scanner;

public class MirrorNumberProblem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n)
        {
        	int spaces=n-i;
            int j=0;
            while(j<spaces)
            {
            	System.out.print(" ");
            	j=j+1;
            }
            j=0;
            int start=1;
            while(j<i)
            {
            	System.out.print(start);
            	j=j+1;
            	start=start+1;
            }
            i=i+1;
            System.out.println();
        }

	}

}
