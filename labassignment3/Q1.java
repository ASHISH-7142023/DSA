package labassignment3;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		try {
		if(i<0)
		{
			throw new NumberFormatException("Lucky no can't be negative");
		}}
		catch(NumberFormatException e)
		{
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("rest");

	}

}
