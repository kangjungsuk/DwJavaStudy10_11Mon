package javastudy;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		String name[] = {"crush","ziont","deen"};
		String gwamok[] = {"����","����","����"};
		int jumsu[][] = new int[3][3];//3�κ� ���� ���� ����
		int result[] = new int[3];
		int avg [] = new int[3];
		//�Էºκ�=========================================================
		for(int i = 0; i<jumsu.length;i++) 
		{
			for(int j = 0;j<jumsu[i].length;j++) 
			{
				System.out.println(name[i]+" �л� "+gwamok[j]+" ���� �Է�:");
				jumsu[i][j]= sc.nextInt();
				result[i]+=jumsu[i][j];
				avg[i]=result[i]/3;
			}
		}
		//��ºκ�==========================================================
		for(int i = 0; i <gwamok.length;i++) 
		{
			System.out.print("\t"+gwamok[i]);
		}
		System.out.print("\t"+"����"+"\t"+"���"+"\n");//(��� ������ �� �κ�)
		
		
		for(int i =0;i<name.length;i++) 
		{
			System.out.print(name[i]+"\t");//���� �̸� ��
			for(int j = 0; j<gwamok.length+1;j++) 
			{
				if(j<gwamok.length) 
				{
					System.out.print(jumsu[i][j]+"\t");//����� ���
				}
				else 
				{	
					System.out.print(result[i]+"\t"+avg[i]+"\n");//���κ� ���� ���.
				}	
			}
		}
		System.out.print("�հ�");
		//������ �� �� ��ºκ�=====================================
		int gwamokSum = 0;
		int totSum= 0 ;
		int totAvg = 0;
		for(int i =0;i<jumsu.length;i++) 
		{
			for(int j = 0; j<jumsu[i].length+1;j++) 
			{
				if(j<jumsu.length) 
				{
					gwamokSum+=jumsu[j][i];
				}
				else 
				{
					totSum+=result[i];
					totAvg+=avg[i];
				}
			}
			System.out.print("\t"+gwamokSum);
			gwamokSum=0;
			
		}
		System.out.print("\t"+totSum+"\t"+totAvg);

	}

}
