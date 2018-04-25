package q7a;

import java.util.Scanner;

class Record{
	Scanner input=new Scanner(System.in);
	String[] name=new String[3];
	int[] rnk=new int[3];
	public Record()
	{
		for(int i=0;i<3;i++)
		{
			name[i]="";
			rnk[i]=0;
		}
		
		
	}
	
	void readvalues()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("ENTER FOR :"+(i+1));
			rnk[i]=input.nextInt();
			name[i]=input.next();
			
		}
	}
	
	void display()
	{
		for(int i=0;i<3;i++)
		{
			
			System.out.println("Rank : "+rnk[i]);
			System.out.println("Name : "+name[i]);
			
		}
		
	}
	
}

class Rank extends Record{
	int index;
	Rank()
	{
		//super.Record();
		index=0;
		
	}
	void highest()
	{
		int max=0;
		for(int i=0;i<3;i++)
		{
			if(max<rnk[i])
			{
				max=rnk[i];
				index=i;
			}
		
		}
	}
	void display()
	{
		super.display();
		System.out.println("Topmost Rank : "+rnk[index]);
		System.out.println("Rank holder Name : "+name[index]);
		
	}
}

public class q7a {
	public static void main(String Args[]){
Rank r1=new Rank();
r1.readvalues();
r1.highest();
r1.display();


}
}
