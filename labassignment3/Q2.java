package labassignment3;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    String color[]= new String[4];
	    try{
	        for(int i=0;i<=color.length;i++)
	        {
	            color[i]=sc.nextLine();
	            if(color[i].equals(""))
	            {
	                throw new NullPointerException("nothing here");
	            }
	        }
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	        System.out.println(e);
	    }
	    catch(NullPointerException e)
	    {
	        System.out.println(e);
	    }


	}

}
