package javastudy;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c = new Cal();
		Cal3 c3 = new Cal3();
		
		System.out.println("Cal"+c.sum(3,2));
		
		System.out.println("Cal"+c3.sum(3,2));
		
	}
}
class Cal
{
	public int sum(int v1, int v2) 
	{
		return v1+v2;
	}
	public int sum(int v1, int v2,int v3) 
	{
		return v1+v2+v3;
	}
	
}
class Cal3 extends Cal 
{
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	public int sum(int v1, int v2) {
		System.out.println("Cal3!!");
		return super.sum(v1,v2);
	}
	
}
