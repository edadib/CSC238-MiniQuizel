public abstract class answer extends studentDetail
{
	int mark;

	public answer()
	{
		super();
		mark = 0;
	}

	public answer(String n, String m, String g, String l, int mr)
	{
		super(n,m,g,l);
		mark = mr;
	}

	public void setAnswer(String n, String m, String g, String l, int mr)
	{
		super.setStudentDetail(n,m,g,l);
		mark = mr;
	}

	public abstract int calculateAnswer();
}