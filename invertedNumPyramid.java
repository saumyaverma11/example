import java.util.Scanner;

public class invertedNumPyramid {
   	public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   int n = sc.nextInt();
	   for(int i=0;i<n;i++){
	       for(int j=0;j<i;j++)
	       {
	           System.out.print(" ");
	       }
	       int num=1;
	       for(int j=0;j<n-i;j++){
	           System.out.print(num);
	           num = num+1;
	       }

	       int num2 = num-2;
	       for(int j=0;j<n-i-1;j++){
	           System.out.print(num2);
	           num2 = num2-1;
	       }
	       
	       	       System.out.println();

	       
	   }
	   
	   
	} 
}
