package labassignment2;

class Employee extends Person1
{
    int Eid;
    double salary;
    Employee (String n, int a, int b, double d)
    {   super(n, a);
        name=n;
        age=a;
        Eid=b;
        salary=d;
    }
    void empDisplay()
    {
    	System.out.println(name+" "+age+" "+Eid+" "+salary);
    }
}
public class Person1 {
	String name;
    int age;

    Person1(String n,int a)
    {
        name=n;
        age=a;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("yash", 2, 3, 4);
        e1.empDisplay();


	}

}
