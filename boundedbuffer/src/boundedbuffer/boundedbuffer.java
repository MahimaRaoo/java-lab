package boundedbuffer;



class Q{
	int n;
	boolean valuesets=false;
	
	synchronized int GET(){
		while(!valuesets)
			{try{
				wait();
			}
		catch(InterruptedException e)
		{
			System.out.println(e);
			
		}}
			
		valuesets=false;
		System.out.println("GOT :"+ n);
		notify();
		return n;
		
	
		
	}

	
	synchronized void PUT(int n){
		while(valuesets)
			{try{
				wait();
			}
		catch(InterruptedException e)
		{
			System.out.println(e);
			
		}
			}
		valuesets=true;
		this.n=n;
		System.out.println("PUT :"+ n);
		notify();
			
	}
}

class C implements Runnable{
	Q q;
	
	C(Q q){
		this.q=q;
		new Thread(this,"CONUSMER").start();
	}
	
	public void run()
	{
		while(true)
		{
			q.GET();
			
		}
	}
}
class P implements Runnable{
	Q q;
	
	P(Q q){
		this.q=q;
		new Thread(this,"PRODUCER").start();
	}
	
	public void run()
	{ int i=0;
		while(i<10)
		{
			q.PUT(++i);
			
		}
	}
}
public class boundedbuffer {
	public static void main(String args[])
	{
	Q q1=new Q();
	
	new P(q1);
	new C(q1);
	
	
	}
}

