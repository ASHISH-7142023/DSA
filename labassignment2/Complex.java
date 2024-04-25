package labassignment2;
import java.util.Scanner;
public class Complex {
	int real , imag ;
	void setData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter real no. : ");
		real = sc.nextInt();
		this.real=real;
		System.out.println("Enter imag no. : ");
		imag = sc.nextInt();
		this.imag = imag;
	
	}
	void display()
	{
		System.out.println(" This complex no. is "+ this.real+this.imag);
		
	}
	public Complex add ( Complex c1 , Complex c2 )
	{
		Complex c3 = new Complex();
		c3.real = c1.real + c2.real;
		c3.imag =- c1.imag + c2.imag ;
		return c3;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1= new Complex();
		Complex c2 = new Complex();
		c1.setData();
		c1.display();
		c2.setData();
		c2.display();
		Complex c3 =  new Complex();
		c3.add(c1, c2);
		c3.display();
		

	}

}
