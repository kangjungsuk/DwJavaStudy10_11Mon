package javastudy;//생성자를 사용하여 인스터스화 한것.

class Accounting_sub
{
	public double valueOfSupply;//공급액
	public  static double vatRate = 0.1;//부가세
	
	public Accounting_sub(double valueOfSupply)
	{
		this.valueOfSupply =valueOfSupply;
	}
	
	
	public double getVAT() 
	{
		return valueOfSupply * vatRate;
	} 
	public double getTotal()
	{ 
		return valueOfSupply + getVAT();
	}
}

public class AccountingApp_sub {

	public static void main(String[] args) {
		Accounting_sub a1 = new Accounting_sub(10000.0);
		Accounting_sub a2 = new Accounting_sub(20000.0);
		
		
		System.out.println("valueOfSupply : "+a1.valueOfSupply);
		System.out.println("valueOfSupply : "+a2.valueOfSupply);
		
		System.out.println("부가세 : "+a1.getVAT() );
		System.out.println("부가세 : "+a2.getVAT() );
		
		System.out.println("총금액 : "+a1.getTotal());
		System.out.println("총금액 : "+a2.getTotal());
		
		
		
//		Accounting_sub.valueOfSupply = 10000.0;
//		System.out.println("valueOfSupply :"+Accounting_sub.valueOfSupply);
//		System.out.println("VAT :"+ Accounting_sub.getVAT() );
//		System.out.println("Total :"+Accounting_sub.getTotal());

	}

}
