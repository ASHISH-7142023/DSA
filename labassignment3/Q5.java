package labassignment3;

public class Q5 {

	public static < E > void printArray( E[] inputArray){
        for(int i=0;i<inputArray.length;i++)
        {
            System.out.println(inputArray[i]);
        }
    }
    public static void main(String[] args) {
        Integer ar[] = {1,2,3,4};
        printArray(ar);
        }


}
