public class student extends studentDetail
{
	int totalA,totalB;

	public student()
	{
		super();
		totalA = 0;
		totalB = 0;
	}

	public student(String n, String m, String g, String l, int tA, int tB)
	{
		super(n,m,g,l);
		totalA = 0;
		totalB = 0;
	}

	public void setStudentPerformance(String n, String m, String g, String l,int tA, int tB)
	{
		super(n,m,g,l);
		totalA = 0;
		totalB = 0;
	}

	public int getTotalA()
	{
		return totalA;
	}

	public int getTotalB()
	{
		return totalB;
	}

	public double calcClassA()
	{
		if(super.getGroup.equalsIgnoreCase("a"))
		{
			totalA++;
		}
		return totalA;
	}

	public double calcClassB();
	{
		if(super.getGroup.equalsIgnoreCase("b"))
		{
			totalB++;
		}
		return totalB;
	}

	public String toDisplay()
	{
		return (super.toDisplay+"\n"+calcClassA()+"\t"+calcClassB());
	}
}