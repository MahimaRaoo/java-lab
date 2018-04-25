package q5a;
class q
{
	boolean value=false;
	synchronized public void disp_welc()
	{
		if(!value)
		{
			try
			{
			wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		
		System.out.println("Welcome");
		value=false;
		notify();
		
		
		
		
	}
	
	synchronized public void disp_bye()
	{
		if(value)
		{
			try
			{
			wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		
		System.out.println("GoodBye");
		value=true;
		notify();
		
		
		
		
	}
}


class thread1 extends Thread
{
	q q1;
	thread1(q q1)
	{
		this.q1=q1;
		this.start();
	}
	
	public void run()
	{
		while(true)
		{
			q1.disp_welc();
		}
	}
}

class thread2 extends Thread
{
	q q2;
	thread2(q q2)
	{
		this.q2=q2;
		this.start();
	}
	
	public void run()
	{
		while(true)
		{
			q2.disp_bye();
		}
	}
}




public class q5a {

	public static void main(String[] args) {
		q qq=new q();
		thread1 t1=new thread1(qq);
		thread2 t2=new thread2(qq);
		

	}

}
