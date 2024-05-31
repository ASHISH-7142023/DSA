package labassignment2;

public class HABook {
	String BName;
	int BEdition;
	double BPrice;
	
	 void Book(String n, int b, double p)
	{
		BName=n;
		BEdition=b;
		BPrice=p;
	}
   void Display()
   {
	   System.out.println(BName+" "+BEdition+" "+BPrice);
   }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book a[]= new Book[5];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter book price: ");
			a[i]=new Book("dsa",18,sc.nextDouble());
		}
		double max=a[0].BPrice;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i].BPrice)
			{
				max=a[i].BPrice;
			}
		}
		System.out.println(max);

	}

}
