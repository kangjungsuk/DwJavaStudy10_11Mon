package javastudy;

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2�ð��̳��±⺻���� 2000��
		//2�ð����Ĵ� 10�д� 200��
		//�Ϸ� �ִ� ����� 8000��
		//2�ð� �⺻�� �Ϸ簡 �������������� ����˴ϴ�.
		//2�ð� ���� 10�д� 200������ 10�� �̸������� �����ϴ�.
		//dc �������� ���ٻ���.
		Scanner sc = new Scanner(System.in);
		
		int inHour= 0;
		
		int inMin = 0;
		
		int dayYogum = 0;
		
		int tomrYofum = 0;
		
		System.out.println("===�̶����̸��� �ູ ����Ÿ�� ����~!!!===");
		System.out.println("");
		System.out.println("===���� ���� ���� ���͵帮�ڽ����ϴ�~!===");
		System.out.println("�����ð� �� ���� �Է����ּ���.");
		
		System.out.println("�����ð� :");
		inHour=sc.nextInt();
		System.out.println("�����ð�(��) :");
		inMin=sc.nextInt();
		
		dayYogum = (((inHour*60)/10)*200)+((inMin/10)*200);
		tomrYofum= 8000+((inMin/10)*200);
		
		if(inHour<=2)
		{
			System.out.println("�⺻��� 2000�� �Դϴ�.");
		}
		else if(inHour>2 && inHour<24) 
		{
			
			if(dayYogum>=8000 && inHour<=24) 
			{
				System.out.println("���� ������� 8000�� �Դϴ�.");

			}
		
		}
		else if(inHour>2 && inHour<=24 && inMin>=10)
		{
			System.out.println("���� �������"+tomrYofum+"�� �Դϴ�.");
		}
		
		
		

		
		
		
		
	}

}
	