package javastudy;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<10;i++)
		{
			System.out.println("구구단"+i+"단");
			for(int j =1;j<10;j++)
			{
				if(j==9) 
				{
					System.out.print(i+"x"+j+"="+i*j);
				}
				else 
				{
					System.out.print(i+"x"+j+"="+i*j+"\t");
				}
			}
			i++;
			System.out.println("");
		}
	}

}
