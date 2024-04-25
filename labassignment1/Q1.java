package labassignment1;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The positive integer greater than 2 from command line argument is: ");
        int a = Integer.parseInt(args[0]);
        int temp=a;
        int count=0;
        if(a>2)
        {
        	while(temp/2>1)
        	{
        		temp=temp/2;
        		++count;
        	}
        }
        System.out.println(count);
        
	}

}
