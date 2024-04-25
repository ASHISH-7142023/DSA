package labassignment3;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       String name = sc.nextLine();
	       int roll = sc.nextInt();
	       double marks= sc.nextDouble();
	       try{
	        if(marks>100d)
	        {
	            throw new MarksOutOfBoundException(">100");
	        }
	       }
	       catch(MarksOutOfBoundException e)
	       {
	        System.out.println(e);
	        e.printStackTrace();
	       }
	       System.out.println("rest");
	    }
	    class MarksOutOfBoundException extends Exception{
	        MarksOutOfBoundException(String S)
	        {
	            System.out.println(S);
	        }


	}

}
