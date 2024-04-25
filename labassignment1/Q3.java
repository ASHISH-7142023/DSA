package labassignment1;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter a number: ");
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int or=a;
	        int temp=a;
	        int sum=0;
	        int prod=1;
	        while(a!=0)
	        {
	        	temp=a%10;
	        	sum=sum+temp;
	        	prod=prod*temp;
	        	a=a/10;
	        }
	        if(sum==prod)
	        {
	        	System.out.println(or+" is a spy number");
	        }


	}

}
