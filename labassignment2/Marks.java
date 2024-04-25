package labassignment2;

abstract public class Marks {
	double marksIcp;
	double markDSA;
	double percentage;
    abstract void getPercentage();
    public static void main(String[]args)
    {
    	CSE c = new CSE(100, 20, 20);
    	NonCse n = new NonCse(100, 19, 89);
    	c.getPercentage();
    	n.getPercentage();
    }
}
class CSE extends Marks{
	double algoDesign;
	CSE(double m,double d, double a)
	{
		marksIcp=m;
		markDSA=d;
		algoDesign=a;
	}
	void getPercentage()
	{
	  System.out.println("Percentage = "+((this.marksIcp+this.markDSA+this.algoDesign)/100)*200d+"%");
	}
}

class NonCse extends Marks{
	double enggMechanics;
	NonCse(double mar,double ds,double egg)
	{
		marksIcp=mar;
		markDSA=ds;
		enggMechanics=egg;
	}
	void getPercentage()
	{
		System.out.println("Percentage = "+((this.marksIcp+this.markDSA+this.enggMechanics)/100)*200d+"%");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
