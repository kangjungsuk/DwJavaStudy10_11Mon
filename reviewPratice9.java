package javastudy;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd=0, even=0, result=0;
		
		for(int i =0;i<2;i++) 
		{
			for(int j =1;j<=10;j++) 
			{
				result=j%2;
				
				if(i==0)
				{
					if(1==result) 
					{
					System.out.print(odd+"+"+j+"=");
					odd+=j;
					System.out.println(odd);
					}
					
				}
				else 
				{
					if(0==result) 
					{
					System.out.print(even+"+"+j+"=");
					even+=j;
					System.out.println(even);
					}
				}
			}
			if(i==1) 
			{
				System.out.println("Â¦¼öÀÇ ÃÑÇÕÀº :"+even);
			}
			else
			{
				System.out.println("È¦¼öÀÇ ÃÑÇÕÀº :"+odd);
			}
			
			
		}
		
	}

}

