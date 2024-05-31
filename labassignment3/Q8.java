package labassignment3;

public class Q8 {
	 static int power(int x, int n)
	    {
	        if(n==1)
	        {
	            return x;
	        }
	        else{
	            return x*power(x, n-1);
	        }
	    }

	    public static void main(String[] args) {
	        System.out.println(power(2, 3));
	    }


}
