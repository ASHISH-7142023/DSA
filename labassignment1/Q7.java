package labassignment1;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of elements of Array: ");
	    Scanner sc = new Scanner(System.in);
	    int ar[]=new int[sc.nextInt()];
	    for(int i=0;i<ar.length;i++)
	    {
	      ar[i]=sc.nextInt();
	    }
	    int count=0;
	    int count1=0;
	    int max=ar[0];
	    int min=ar[0];
	    for(int i =0;i<ar.length;i++)
	    {
	      if(ar[i]>max)
	      {
	        max=ar[i];
	      }
	      if(ar[i]<min)
	      {
	        min=ar[i];
	      }
	    }
	    for(int i=0;i<ar.length;i++)
	    {
	      if(max==ar[i])
	      {
	      ++count;
	      }
	      if(min==ar[i])
	      {
	       ++count1;
	      }
	    }
	    System.out.println("Maximum element of Array is "+max+" and occurs "+count+" times.");
	    System.out.println("Minimum element of Array is "+min+" and occurs "+count1+" times.");
	    for(int i=0;i<ar.length;i++)
	    {
	      if(max==ar[i])
	      {
	      System.out.println("First occurrence of maximum element is at position "+(i+1));
	      break;
	      }
	    }
	    for(int i =ar.length-1;i>=0;i--)
	    {
	      if(min==ar[i])
	      {
	      System.out.println("Last occurrence of minimum element is at position "+(i+1));
	      break;
	      }
	    }

	}

}
