package javastudy;

import java.util.Scanner;

public class Test14 {
	//기본요금3천원 2000미터 추가시 140미터마다 150원 추가

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int inMit =0;
		int yogum = 0;
		
		System.out.println("얼마나 가세요?");
		inMit =sc.nextInt();
		
		if(inMit<=2000) 
		{
			System.out.println("기본요금 3천원 입니다.");
		}
		
		else if(inMit>2000) 
		{
			yogum = (((inMit-2000)/140)*150)+3000;
			System.out.println("요금은"+yogum+"입니다.");
		}
	}

}
