package javastudy;

import java.util.Scanner;

public class Test14 {
	//�⺻���3õ�� 2000���� �߰��� 140���͸��� 150�� �߰�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int inMit =0;
		int yogum = 0;
		
		System.out.println("�󸶳� ������?");
		inMit =sc.nextInt();
		
		if(inMit<=2000) 
		{
			System.out.println("�⺻��� 3õ�� �Դϴ�.");
		}
		
		else if(inMit>2000) 
		{
			yogum = (((inMit-2000)/140)*150)+3000;
			System.out.println("�����"+yogum+"�Դϴ�.");
		}
	}

}
