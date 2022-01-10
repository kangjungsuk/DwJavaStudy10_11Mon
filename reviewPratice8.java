package javastudy;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =""; 
		
		while(true)
		{
			System.out.println("과목명을 입력해주세요 :");
			str = sc.next();
			
			if(str.equals("HTML")||str.equals("PHP")||
				str.equals("CSS")||str.equals("JavaScript")||
				str.equals("JQuery")||str.equals("Android")) 
			{
				break;
			}
			else 
			{
				System.out.println("입력하신 과목명이 없습니다.. 다시 입력해주세요!");
			}
		}
		
		switch(str) 
		{
			case "HTML" :System.out.println("HTML 설명");break;
			case "PHP" :System.out.println("PHP 설명");break;
			case "CSS" :System.out.println("CSS 설명");break;
			case "JavaScript" :System.out.println("JavaScript 설명");break;
			case "JQuery" :System.out.println("JQuery 설명");break;
			case "Android" :System.out.println("Android 설명");break;
			
		
		}
	}

}
