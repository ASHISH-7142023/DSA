package inclassproblems;
import java.util.Scanner;
interface StaffInterface{
    void display();
    void giveBonus();
}
abstract class Staff{
    String fname;
    String lname;
    int salary;
    Staff(String fname, String lname, int salary)
    {
        this.fname=fname;
        this.lname=lname;
        this.salary=salary;
    }
}

public  class Supervisor extends Staff implements StaffInterface
{
	int bonus;
	Supervisor(String fname, String lname, int salary)
	{
		super(fname, lname, salary);
		
	}
	public void display()
    {
        System.out.println(this.fname+" "+this.lname+" "+this.salary+" "+this.bonos);
    }
    public void giveBonus()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter bonus");
       this.bonus=sc.nextInt();
    }
    public static void main(String[] args) {
        Supervisor e[]= new Supervisor[5];
     
        for(int i=0;i<e.length;i++)
        {
            e[i]= new Supervisor("ASHISH", "SINGH", i);
             e[i].giveBonus();
        }
        
        for(int i=0;i<e.length;i++)
        {
           try{
                if(e[i].bonus==0)
                {
                    throw new bhikari("paisa zyaada de");
                }
                else
                {
                    e[i].display();
                } 
            }
            catch(bhikari a)
            {
              System.out.println(a);
            }    
        }
        
    }

}
