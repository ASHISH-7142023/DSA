package labassignment1;
import java.util.Scanner;
public class Q9 {
	public static double sumMajorDiagonal(double m[][])
	  {
	    double sum=0;
	    for(int i=0;i<m.length;i++)
	    {
	      for(int j=0;j<m.length;j++)
	      {
	        if(i==j)
	        {
	          sum=sum+m[i][j];
	        }          
	      }
	    }
	    return sum; 
	  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a 4-by-4 matrix row by row: ");
	    double a[][]= new double[4][4];
	    for(int i=0;i<a.length;i++)
	    {
	      for(int j =0;j<a.length;j++)
	      {
	        a[i][j]=sc.nextDouble();
	      }
	    }
	    
	    System.out.println(sumMajorDiagonal(a));
	    
	}

}
