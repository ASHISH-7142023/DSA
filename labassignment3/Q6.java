package labassignment3;

public class Q6 {

	public static <T> int count(T[] array, T item)
    {
        int c=0;
        for(int i=0;i<array.length;i++)
        {
              if(array[i]==item)
              {
                ++c;
              }
        }
        return c;
    }
    public static void main(String[] args) {
        Integer a[]={1,2,3,4,5,5,4,3,2,12,2,2,22,2,2,2,2,2,2,2,2,2,22,22,2,2,2,22,2,2};
        System.out.println(count(a, 2));
    }


	}

}
