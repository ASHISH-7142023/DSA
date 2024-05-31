package labassignment2;

class Complex {

    int real;
	int imag;
	void Setdata()
	{
       this.real=5;
	   this.imag=6;
	}
	void display()
	{
      System.out.println("i");
	}
	public static Complex add(Complex c,Complex c1)
	{ 
		Complex s= new Complex();
		s.real=c.real+c1.real;
		s.imag=c.imag+c1.imag;
		return s;
		
	}
}
public class COMPLEXNUM extends Complex{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Complex c= new Complex();
		Complex c1 = new Complex();
		c1.Setdata();
		c.Setdata();
	    Complex temp;
		temp=add(c,c1);
		
	}

}

