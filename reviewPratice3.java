package javastudy;

public class test3 {

	public static void main(String[] args) {
		for(int i =0; i<6;i++) 
		{
			
			for(int k =0;k<=i;k++) 
			{
				System.out.print("$");
				
			}
			System.out.println("");
		}
		for(int i =0; i<=6;i++) 
		{
			
			for(int k =6;k>=i;k--) 
			{
				System.out.print("$");
				
			}
			System.out.println("");
		}
	}
}