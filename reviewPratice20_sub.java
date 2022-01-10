package javastudy;

import java.util.Scanner;

public class Test21_sub {
	Scanner sc = new Scanner(System.in);
	Test21_sub()
	{
		//기본 생셩자를 만들어 둬야 Test21 클래스에  [  int a = aa.total(10,20); ] 형태를 쓸 수 있음.
		
	}
	Test21_sub(String txt1)
	{
		Text(txt1);//아랫 쪽 메소드 호출
	}
	Test21_sub(int cnt, String outTxt)
	{
		fire(cnt,outTxt);//아랫 쪽 메소드 호출
	}
	
	//사칙연산 계산 부분.
	public int total(int Num1,int Num2) {
		int select =0;
		int result = 0;
		System.out.println("1:덧셈,2:뺄셈,3:곱셈,4:나눗셈");
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
		
		else {System.out.println("숫자를 잘못 선택 하셨습니다.");}
		return result;
		
		
		
	}
	
	public void Text(String txt) 
	{
		String a = "안녕";
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
