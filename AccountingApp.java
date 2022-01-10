package javastudy;

class Accounting
{
	public static double valueOfSupply;//공급액
	
	public static double vatRate = 0.1;//부가세
	
	public static double getVAT() 
	{
		return valueOfSupply * vatRate;
	} 
	
	public static double getTotal()
	{ 
		return valueOfSupply + getVAT();
	}
}

public class AccountingApp {

	public static void main(String[] args) {
		Accounting.valueOfSupply = 10000.0;
		System.out.println("valueOfSupply :"+Accounting.valueOfSupply);
		System.out.println("VAT :"+ Accounting.getVAT() );
		System.out.println("Total :"+Accounting.getTotal());

	}

}
