public abstract class studentDetail
{

	public String name, matNo, group, lecturer;
	public int mark;

	public studentDetail()
	{
		name = " ";
		matNo = " ";
		group = " ";
		lecturer = " ";

	}

	public studentDetail(String n, String m, String g, String l)
	{
		name = n;
		matNo = m;
		group = g;
		lecturer = l;
	}

	public void setStudentDetail(String n, String m, String g, String l)
	{
		name = n;
		matNo = m;
		group = g;
		lecturer = l;
	}

	public String getName()
	{
		return name;
	}

	public String getMatNo()
	{
		return matNo;
	}

	public String getGroup()
	{
		return group;
	}

	public String getLecturer()
	{
		return lecturer;
	}

	public String toString()
	{
		return "Name "+"\n"+getName()+"\n"+" Matric Number "+"\n"+getMatNo()+"\n"+" Class "+"\n"+getGroup()+"\n"+" Lecturer "+"\n"+getLecturer();
	}

	public String toDisplay()
	{
		return ("Total Class A student that answer = \t Total Class B student that answer = ");
	}
}