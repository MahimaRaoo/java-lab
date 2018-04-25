package q3aa;

import java.util.Scanner;

class nameexception extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8926676391842626697L;

	public String toString()
	{
		return("name exception");
	}
}
class ageexception extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5905555464719582453L;

	public String toString()
	{
		return("age exception");
	}
}
class emp{
	int age;
	String name;
	emp(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
}
public class q3aa{
	public static void main(String Args[])
	{
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("ËNTER NAME :");
		String name=input.next();
		System.out.println("ËNTER AGE :");
		int age=input.nextInt();
		int k=1,c=1;
		
		try{
			try{
				@SuppressWarnings("unused")
				int s=Integer.parseInt(name);
			}
			catch(Exception e)
			{
				k=0;
			}
			if(k==1)
			{
				throw new nameexception();
				
				
			}
		}
		
		catch(nameexception e)
		{
			c=0;
		}
		
		try{
			if(age>50)
				throw new ageexception();
			
		}
		catch(ageexception e)
		{
			c=0;
		}
		
		
		if(c==1)
		{
			@SuppressWarnings("unused")
			emp obj=new emp(name,age);
			System.out.println("Object created ");
		
		}
		else
			System.out.println("Object not created ");
			
	}

}
