package labassignment2;
import java.util.Scanner;
public class Product {
	int prodID;
	double price;
	double quantity;
	static double totalPrice;
	
	void display()
	{
		System.out.println(prodID +" "+price+" "+quantity);
		
	}
	Product(int p , double r , double q)
	{
		prodID = p;
		price = r;
		quantity = q;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Product p[]= new Product[5];
		for (int i=0 ; i<p.length ; i++)
		{
			p[i] = new Product(sc.nextInt(),sc.nextDouble(),sc.nextDouble());
			
		}
		for (int i=0;i<p.length;i++)
		{
			totalPrice = totalPrice +p[i].price;
			
		}
		System.out.println(totalPrice);
		
	}

}
