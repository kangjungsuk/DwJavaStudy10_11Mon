package javastudy;

import java.util.Scanner;

public class Test21_sub {
	Scanner sc = new Scanner(System.in);
	Test21_sub()
	{
		//�⺻ �����ڸ� ����� �־� Test21 Ŭ������  [  int a = aa.total(10,20); ] ���¸� �� �� ����.
		
	}
	Test21_sub(String txt1)
	{
		Text(txt1);//�Ʒ� �� �޼ҵ� ȣ��
	}
	Test21_sub(int cnt, String outTxt)
	{
		fire(cnt,outTxt);//�Ʒ� �� �޼ҵ� ȣ��
	}
	
	//��Ģ���� ��� �κ�.
	public int total(int Num1,int Num2) {
		int select =0;
		int result = 0;
		System.out.println("1:����,2:����,3:����,4:������");
		select = sc.nextInt();
		
		if(select == 1) 
		{
			System.out.println(Num1+"+"+Num2+"="+(Num1+Num2));
			result = Num1+Num2;
			
		}
		else if(select == 2) 
		{
			System.out.println(Num1+"-"+Num2+"="+(Num1-Num2));
			result = Num1-Num2;
		}
		else if(select == 3) 
		{
			System.out.println(Num1+"*"+Num2+"="+(Num1*Num2));
			result = Num1*Num2;
		}
		else if(select == 4) 
		{
			System.out.println(Num1+"/"+Num2+"="+(Num1/Num2));
			result = Num1/Num2;
		}
		
		else {System.out.println("���ڸ� �߸� ���� �ϼ̽��ϴ�.");}
		return result;
		
		
		
	}
	
	public void Text(String txt) 
	{
		String a = "�ȳ�";
		System.out.println(a+txt);
	}
	
	public void fire(int fNum, String ftxt ) 
	{
		for(int i= 0;i<=fNum;i++) 
		{
			System.out.println(ftxt);
		}
	}
}
