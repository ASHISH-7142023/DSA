2package labassignment1;
import java.util.Scanner;
public class Q10 {
	public static double sumColumn(double[][] m, int columnIndex){
	    double sum=0d;
	    for(int i=0;i<m.length;i++)
	    {    
	      sum=sum+m[i][columnIndex];
	    }
	    return sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    double a[][] =new double[3][4];
	    for(int i=0;i<a.length;i++)
	    {
	      for(int j=0;j<a.length;j++)
	    {
	        a[i][j]=sc.nextDouble();
	    }
	    }
	    System.out.println(sumColumn(a, 0));
	    
	  }
	  


	}

}
