package labassignment2;
import java.util.Scanner;
public class PersonInfo {

	static int maxcount;
	String name;
	int count()
	{
		maxcount=this.name.length();
		return maxcount;
	}
	void display()
	{
		count();
		System.out.println("Name= "+this.name+"\nno of chars = "+maxcount);
	}
	void Setdata()
	{
		Scanner sc = new Scanner(System.in);
		this.name=sc.nextLine();
	}
	public static void main(String[] args) 
	{
		PersonInfo p = new PersonInfo();
		p.Setdata();
		p.display();
	}
}

interface DetailInfo {
	void display();
	int count();
}

