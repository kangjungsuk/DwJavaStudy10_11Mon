package javastudy;

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2시간이내는기본여금 2000원
		//2시간이후는 10분당 200원
		//하루 최대 요금은 8000원
		//2시간 기본은 하루가 지난다음날에도 적용됩니다.
		//2시간 이후 10분당 200원에서 10분 미만단위는 버립니다.
		//dc 해주지뭐 쓰바새꺄.
		Scanner sc = new Scanner(System.in);
		
		int inHour= 0;
		
		int inMin = 0;
		
		int dayYogum = 0;
		
		int tomrYofum = 0;
		
		System.out.println("===이랏샤이마세 행복 주차타워 데스~!!!===");
		System.out.println("");
		System.out.println("===고객님 주차 정산 도와드리겠스무니다~!===");
		System.out.println("주차시간 과 분을 입력해주세요.");
		
		System.out.println("주차시간 :");
		inHour=sc.nextInt();
		System.out.println("주차시간(분) :");
		inMin=sc.nextInt();
		
		dayYogum = (((inHour*60)/10)*200)+((inMin/10)*200);
		tomrYofum= 8000+((inMin/10)*200);
		
		if(inHour<=2)
		{
			System.out.println("기본요금 2000원 입니다.");
		}
		else if(inHour>2 && inHour<24) 
		{
			
			if(dayYogum>=8000 && inHour<=24) 
			{
				System.out.println("종일 주차요금 8000원 입니다.");

			}
		
		}
		else if(inHour>2 && inHour<=24 && inMin>=10)
		{
			System.out.println("정산 주차요금"+tomrYofum+"원 입니다.");
		}
		
		
		

		
		
		
		
	}

}
	