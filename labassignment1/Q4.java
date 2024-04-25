package labassignment1;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String a= "carbon";
		  for(int i=0;i<a.length();i++)
		  {
			  for(int j=0;j<a.length();j++)
			  {
				  for(int k=0;k<a.length();k++)
				  {
					  for(int l=0;l<a.length();l++)
					  {
						  for(int m=0;m<a.length();m++)
						  {
							  for(int n=0;n<a.length();n++)
							  {
								  if(i!=j && j!=k && 
										  k!=l && l!=m && 
										  m!=n && i!=k && 
										  i!=l && i!=m && 
										  i!=n && j!=l && 
										  j!=m && j!=n && 
										  k!=m && k!=n && l!=n )
								  {
									  System.out.println(a.charAt(i)+""+a.charAt(j)+""+a.charAt(k)+""+a.charAt(l)+""+a.charAt(m)+""+a.charAt(n));
								  }
							  }
	                	   }
	            	  }
	        		}
	        	}
	      }

	}

}
