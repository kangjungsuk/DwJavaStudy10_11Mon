package javastudy;

import java.util.Scanner;

public class Test19
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

				int score[][] = new int[3][3];
		String subject[] =
		{ "국어", "영어", "수학" };

		for (int i = 0; i < score.length; i++)
		{
			for (int j = 0; j < subject.length; j++)
			{
				System.out.print((i + 1) + "번 학생 " + subject[j] + " 점수: ");
				score[i][j] = in.nextInt();
			}
			System.out.println();
		}
		in.close();

		System.out.print("\t");
		for (int i = 0; i < subject.length; i++)
		{
			System.out.print(subject[i] + "\t");
		}
		System.out.print("총점\t");
		System.out.print("평균");
		System.out.println();

		for (int i = 0; i < score.length; i++)
		{
			System.out.print((i + 1) + "번" + "\t");
			int total = 0;
			for (int j = 0; j < score[i].length; j++)
			{
				System.out.print(score[i][j] + "\t");
				total += score[i][j];
			}
			int avg = total / subject.length;
			System.out.print(total + "\t");
			System.out.print(avg + "\t");
			System.out.println();
		}

		System.out.print("합계\t");
		int total = 0;
		for (int i = 0; i < score.length; i++)
		{
			int tempTotal = 0;
			for (int j = 0; j < score[i].length; j++)
			{
				tempTotal += score[j][i];
				total += score[j][i];
			}
			System.out.print(tempTotal + "\t");
		}
		System.out.print(total + "\t");
		System.out.print(total / subject.length + "\t");

//		for(int i=0; i<arr.length; i++)
//		{
//			for(int j=0; j<arr[i].length; j++)
//			{
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

}
