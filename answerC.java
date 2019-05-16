public class answerC extends answer
{
	String q1,q2,q3,q4,q5,q6,q7,q8,q9,q10;
   

	public answerC()
	{
		super();
		q1 =" ";
		q2 =" ";
		q3 =" ";
		q4 =" ";
		q5 =" ";
		q6 =" ";
		q7 =" ";
		q8 =" ";
		q9 =" ";
		q10 =" ";
	}

	public answerC(String n, String m, String g, String l, int mr, String a1,String a2,String a3,String a4,String a5,String a6,String a7,String a8,String a9,String a10)
	{
		super(n,m,g,l,mr);
		q1 =a1;
		q2 =a2;
		q3 =a3;
		q4 =a4;
		q5 =a5;
		q6 =a6;
		q7 =a7;
		q8 =a8;
		q9 =a9;
		q10 =a10;
	}

	public void setAnswerC(String n, String m, String g, String l, int mr, String a1,String a2,String a3,String a4,String a5,String a6,String a7,String a8,String a9,String a10)

	{
		super.setAnswer(n,m,g,l,mr);
		q1 =a1;
		q2 =a2;
		q3 =a3;
		q4 =a4;
		q5 =a5;
		q6 =a6;
		q7 =a7;
		q8 =a8;
		q9 =a9;
		q10 =a10;
	}

	public String getQ1()
	{
		return q1;
	}

	public String getQ2()
	{
		return q2;
	}

	public String getQ3()
	{
		return q3;
	}

	public String getQ4()
	{
		return q4;
	}

	public String getQ5()
	{
		return q5;
	}

	public String getQ6()
	{
		return q6;
	}

	public String getQ7()
	{
		return q7;
	}

	public String getQ8()
	{
		return q8;
	}

	public String getQ9()
	{
		return q9;
	}

	public String getQ10()
	{
		return q10;
	}

	public int calcAnswer()
	{
		int tru =0,a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0;
		if(getQ1().equalsIgnoreCase("C"))
		{
			tru++;
		}
		if(getQ2().equalsIgnoreCase("d"))
		{
			tru++;
		}
		if(getQ3().equalsIgnoreCase("b"))
		{
			tru++;
		}
		if(getQ4().equalsIgnoreCase("a"))
		{
			tru++;
		}
		if(getQ5().equalsIgnoreCase("d"))
		{
			tru++;
		}
		if(getQ6().equalsIgnoreCase("a"))
		{
			tru++;
		}
		if(getQ7().equalsIgnoreCase("d"))
		{
			tru++;
		}
		if(getQ8().equalsIgnoreCase("c"))
		{
			tru++;
		}
		if(getQ9().equalsIgnoreCase("c"))
		{
			tru++;
		}if(getQ10().equalsIgnoreCase("mahfudzah"))
		{
			tru++;
		}
      //tru = a+b+c+d+e+f+g+h+i+j;
		return tru;
	}

	int total_c;

	public int calculateAnswer()
	{
		total_c = total_c + calcAnswer();
		return total_c;
	}


	public String toString()
	{
		return super.toString()+"\n Marks = "+calcAnswer();
	}
}