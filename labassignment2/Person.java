package labassignment2;
import java.util.Scanner;
public class Person {
	String name;
	int age;
	
	void Setdata()
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter name and age: ");
	   String n=sc.nextLine();
	   int a=sc.nextInt();
	   name=n;
	   age=a;
	}
	void displayData()
	{
		System.out.println(name+" "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1= new Person();
        Person p2= new Person();
        p1.name="Rohan";
        p1.age=20;
        p2.Setdata();
        p1.displayData();
        p2.displayData();
        if(p1.age>p2.age)
        {
        	System.out.println(p2.name+" is younger");
        }
        
        else
        {
        	System.out.println(p1.name+" is younger");
        }

	}

}
