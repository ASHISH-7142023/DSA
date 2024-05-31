package labassignment2;
import java.util.Scanner;
class Commission {
	 double sales;
	  
	  Commission(double s)
	  {
		  sales=s;
	  }
	  
	 void getCommission()
	  {
		  if(this.sales<100)
		  {
			  System.out.println((2/100d)*this.sales);
		  }
		  else if(this.sales>=500 && this.sales <5000)
		  {
			  System.out.println((5/100d)*this.sales);
		  }
		  else if(this.sales>=5000)
		  {
			  System.out.println((8/100d)*this.sales);
		  }
		  else if(this.sales<0)
		  {
			  System.out.println("Invalid Input");
		  }
	  } 
	}

public class HADemo extends Commission{
	public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				Commission c= new Commission(1233d);
		        c.getCommission();
			}

		}


}
