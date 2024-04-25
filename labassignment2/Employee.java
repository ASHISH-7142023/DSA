package labassignment2;

class Person1 {
	String name;
	int age;
    Person1(String n,int a) {
		name=n;
		age=a;
	}
}
public class Employee extends Person1{
	int Eid;
	double salary;
	Employee(String n,int a, int b, double d)
	{
		super(n,a);
		Eid=b;
		salary=d;
	}
	   void empDisplay()
	    {
	    	System.out.println("Name= "+this.name+"\nAge ="+this.age+"\nEid = "+this.Eid+"\nSalary ="+this.salary);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Yash", 18, 1928238,34.4);
        e.empDisplay();

	}

}
