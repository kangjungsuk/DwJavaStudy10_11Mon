package javastudy;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		String name[] = {"crush","ziont","deen"};
		String gwamok[] = {"국어","수학","과학"};
		int jumsu[][] = new int[3][3];//3인분 국어 수학 과학
		int result[] = new int[3];
		int avg [] = new int[3];
		//입력부분=========================================================
		for(int i = 0; i<jumsu.length;i++) 
		{
			for(int j = 0;j<jumsu[i].length;j++) 
			{
				System.out.println(name[i]+" 학생 "+gwamok[j]+" 점수 입력:");
				jumsu[i][j]= sc.nextInt();
				result[i]+=jumsu[i][j];
				avg[i]=result[i]/3;
			}
		}
		//출력부분==========================================================
		for(int i = 0; i <gwamok.length;i++) 
		{
			System.out.print("\t"+gwamok[i]);
		}
		System.out.print("\t"+"총점"+"\t"+"평균"+"\n");//(상단 과목줄 뒷 부분)
		
		
		for(int i =0;i<name.length;i++) 
		{
			System.out.print(name[i]+"\t");//왼쪽 이름 행
			for(int j = 0; j<gwamok.length+1;j++) 
			{
				if(j<gwamok.length) 
				{
					System.out.print(jumsu[i][j]+"\t");//과목들 출력
				}
				else 
				{	
					System.out.print(result[i]+"\t"+avg[i]+"\n");//끝부분 총점 평균.
				}	
			}
		}
		System.out.print("합계");
		//마짐막 한 줄 출력부분=====================================
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
