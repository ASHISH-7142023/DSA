package inclassproblems;
import java.util.*;
 class Bank {
	String name;
	int acc_no;
	String b_name;
   

	
	void Bankdata(String n,int a,String b) {
		name = n;
		acc_no = a;
		b_name = b;
		}
		
		public static void main(String[]args) {
			Bank b[] = new Bank[5];
			for(int i=0;i<5;i++)
			{
				b[i] = new Bank();
			}
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
				b[i].Bankdata(sc.nextLine());
				b[i].display();
			}
		}
			void display() {
				System.out.println("Name of the customer "+name+"Acc no. is "+acc_no+"bank name is "+b_name);
				
			}
			
		
	}
	
	
 


