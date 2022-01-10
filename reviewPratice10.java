package javastudy;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cal1 c = new Cal1(2,1);
		Cal34 c3 = new Cal34(2,1);	
	}

}

class Cal1
{
	int v1, v2;
	Cal1(int  v1, int v2)
	{
		this.v1=v1;
		this.v2=v2;
		System.out.println("Cal init!!");
	}
	
	public int sum() 
	{
		return this.v1+v2;
	}
	
}

class Cal34 extends Cal1
{
	Cal34(int v1, int v2)
	{
		super(v1,v2);
		System.out.println("Cal34 init!!");
	}
	public int minus() 
	{
		return this.v1-v2;
	}
}
