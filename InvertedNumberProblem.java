package Pattern.java;
import java.util.Scanner;

public class InvertedNumberProblem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n)
        {
            int j=0;
            int start=n-i+1;
            while(j<n-i+1)
            {
            	System.out.print(start);
            	j=j+1;
            }
            i=i+1;
            System.out.println();
        }

	}

}
