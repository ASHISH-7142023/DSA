package labassignment1;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter person weight in kg: ");
        double a=sc.nextDouble();
        System.out.println("Enter height of a person in meter: ");
        double b= sc.nextDouble();
        double c= a/(b*b);
        if(c<18.5)
        {
        	System.out.println("Underweight");
        }
        else if(c>18.5 && c<24.9)
        {
        	System.out.println("Normal Weight");
        }
        else if(c>25 && c<29.9)
        {
        	System.out.println("Overweight");
        }
        else
        {
        	System.out.println("Obese");
        }


	}

}
