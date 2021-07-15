package Pattern.java;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i=2;
        int start=2;
        int limit=1;
        System.out.println('1');
        while(i<=n)
        {
            int j=0;
            limit=limit*2;
            while(j<limit)
            {
                System.out.print(start);
                j=j+1;
                if(start==9)
                {
                    start=1;
                }
                else
                {
                start=start+1;
                }
            }
            i=i+1;
            System.out.println();
        }
	}

}
