package labassignment3;

public class Q10 {

	static int c=0;
    static void fibo(int x,int y, int n)
    {    
      if(n==0)
      {
        return;
      }
      else{
       int sum=x+y;
       x=y;
       y=sum;
       System.out.println(sum);
       fibo(x, y, n-1);
      }
    }
    public static void main(String[] args) {
        fibo(0,1,10);
    }


	}

}
