package labassignment2;

public class Deposit {
	long Principal;
	int time;
	double rate;
	double totalAmt;
	Deposit()
	{
		Principal = 0l;
		time = 0;
		rate = 0;
		
	}
	Deposit(long l , int t)
	{
		Principal = l;
		time = t;
		
	}
	Deposit(long p , int t , double r)
	{
		Principal = p;
		time = t;
		rate = r;
		
	}
	Deposit(long p , double r)
	{
		Principal = p;
		rate = r;
		
	}
	void display()
	{
		calcAmt();
		System.out.println(Principal+" "+time+" "+rate+" "+totalAmt);
		
	}
	void calcAmt()
	{
		totalAmt = Principal+((Principal*rate*time)/100d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deposit d = new Deposit(1l,4,5);
		d.display();

	}

}



















