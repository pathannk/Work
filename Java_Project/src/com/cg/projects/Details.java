package com.cg.projects;

//driver class
public class Details 
{
	public static void main(String[] args)
	{
		PersonalDetails pd = new PersonalDetails();
		System.out.println(pd.title);
		pd.name();
		pd.age();
		pd.olderage(10);
		pd.olderage(10,6);
		pd.mybooks();
		pd.output();

	}
}
