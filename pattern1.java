import java.util.Scanner;

public class pattern1 {
    	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
             int a = 65;
             for(int j=0;j<i+1;j++){
                 System.out.print((char) (a+j));
             }
             
             for(int j=i-1;j>=0;j--)
             {
                 System.out.print((char) (a+j));
             }
             System.out.println();
        }
	}
}
