import java.util.Scanner;

public class hollowPyramid {
    public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   int n = sc.nextInt();
	   for(int i=0;i<n;i++){
	       for(int j=0;j<n-i-1;j++){
	           System.out.print(" ");
	       }
	       for(int j=0;j<2*(i+1)-1;j++){
	           if(j==0 || j == 2*(i+1)-2 || i==n-1){
	               System.out.print("*");
	           }
	           else{
	               System.out.print(" ");
	           }
	       }
	       System.out.println();
	   }
	   
	}
}
