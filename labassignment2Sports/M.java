package labassignment2Sports;
import studenttest.*;
interface Sports
{
  int score1=46;
  int score2=54;
  
}

public class M {
	 public static void main(String[] args, int score1, int score2)
	   {
		   Test t1=new Test();
		   t1.inputDetails();
		   t1.showDetails();
		   
		   System.out.println(score1+score2);
		   
	   }

}
