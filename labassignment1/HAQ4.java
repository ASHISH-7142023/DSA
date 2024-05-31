package labassignment1;
import java.util.Scanner;
public class HAQ4 {

	public static double[][] addMatrix(double[][] a, double[][] b)
	{
		
		double c[][]=new double[a.length][a.length];
		for(int i=0;i<a.length;i++)
        {
        	for(int j=0;j<a.length;j++)
        	{
        		c[i][j]=a[i][j]+b[i][j];                            
        	}
        } 
	
		return c;
	}
	static void display(double[][]c)
	{
		int x=0;
      for(int i=0;i<c.length;i++)
	  {
		x=0;
		for(int j=0;j<c.length;j++)
		{
			System.out.print(c[i][j]);
		}
		if(x%c.length==0)
		{
			System.out.println();
		}
	  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dimensions of the array: ");
		Scanner sc = new Scanner(System.in);
		int m= sc.nextInt();
		int x=0;
		
        double a[][]= new double[m][m];
        double b[][]=new double[m][m];
        System.out.println("For array A:");
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<m;j++)
        	{
        		
        		a[i][j]=sc.nextDouble();
        		
        	}
        }
        System.out.println("For array B:");
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<m;j++)
        	{
        		b[i][j]=sc.nextDouble();
        	}
        	}
    	display(addMatrix(a, b));
        	
        }
        
        
        
	}
