package advmath;

public class calc {
	double x;
	public calc(int x)
	{
		this.x=x*0.01745;
	}
	
	
	public double y()
	{
		double y=Math.sin(x)+Math.cos(x)+Math.tan(x);
		return y;
		
	}
	
	

}
