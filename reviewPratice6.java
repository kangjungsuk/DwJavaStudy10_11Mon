package javastudy;

public class Test6 
{

	public static void main(String[] args) 
	{
		
		for(int i=1; i<6; i++) 
		{
			System.out.println("["+i+"]"+"대분류");
			for(int j=1;j<6; j++) 
			{
				System.out.println("{"+j+"}"+"중분류");
				for(int k =1;k<6;k++) 
				{
					System.out.println("*"+k+"소분류");
				}
			}
		}
	}

}
