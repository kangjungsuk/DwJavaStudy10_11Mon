package javastudy;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =""; 
		
		while(true)
		{
			System.out.println("������� �Է����ּ��� :");
			str = sc.next();
			
			if(str.equals("HTML")||str.equals("PHP")||
				str.equals("CSS")||str.equals("JavaScript")||
				str.equals("JQuery")||str.equals("Android")) 
			{
				break;
			}
			else 
			{
				System.out.println("�Է��Ͻ� ������� �����ϴ�.. �ٽ� �Է����ּ���!");
			}
		}
		
		switch(str) 
		{
			case "HTML" :System.out.println("HTML ����");break;
			case "PHP" :System.out.println("PHP ����");break;
			case "CSS" :System.out.println("CSS ����");break;
			case "JavaScript" :System.out.println("JavaScript ����");break;
			case "JQuery" :System.out.println("JQuery ����");break;
			case "Android" :System.out.println("Android ����");break;
			
		
		}
	}

}
