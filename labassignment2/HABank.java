package labassignment2;
import java.util.*;
public class HABank {
	String bankNname;
	double depositAamount;
	
	void setBankName()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bank name: ");
		this.bankNname=sc.nextLine();
	}
	void setAmount()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter deposit( minimum deposit amount 1000: ");
		this.depositAamount=s.nextDouble();
	}
	void showData() {
		System.out.println(this.bankNname+" "+this.depositAamount);
	}
	void showData(Bank b[])
	{
		double add=0;
		for(int i=0;i<b.length;i++)
        {
        	System.out.println(b[i].bankNname+" "+b[i].depositAamount);
        	add=add+b[i].depositAamount;
        }
		System.out.println(add);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bank b[]= new Bank[5];
        Bank out = new Bank();
        for(int i=0;i<b.length;i++)
        {
        	b[i]=new Bank();
        	b[i].setBankName();
        	b[i].setAmount();
        }
        out.showData(b);
       
	}

}


}
