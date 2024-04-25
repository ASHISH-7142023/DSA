package labassignment1;

public class Q5 {
	 public static int sum_of_digits(int a)
		{
			int sum=0;
			int temp=0;
			while(a!=0)
			{
				temp=a%10;
				sum=sum+temp;
				a=a/10;
			}
			if(sum<9)
			{
				return sum;
			}
			else
			{
				return sum_of_digits(sum);
			}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum_of_digits(9294));

	}

}
