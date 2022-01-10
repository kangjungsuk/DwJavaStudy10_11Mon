package javastudy;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int sel = 0;

//	int jumsu [][]= 
//		{
//			{0,0,0,0,0},
//			{0,0,0,0,0},
//			{0,0,0,0,0}
//		};
		int jumsu[][] = new int[3][5];

		while (true) 
		{
			System.out.println("1입력/2출력/3종료");
			sel = sc.nextInt();
			if (sel == 1) 
			{

				System.out.println("1번 학생 국어 점수를 입력해 주세요.");
				jumsu[0][0] = sc.nextInt();
				System.out.println("1번 학생 수학 점수를 입력해 주세요.");
				jumsu[0][1] = sc.nextInt();
				System.out.println("1번 학생 과학 점수를 입력해 주세요.");
				jumsu[0][2] = sc.nextInt();

				jumsu[0][3] = jumsu[0][0] + jumsu[0][1] + jumsu[0][2];
				jumsu[0][4] = jumsu[0][3] / 3;

				System.out.println("2번 학생 국어 점수를 입력해 주세요.");
				jumsu[1][0] = sc.nextInt();
				System.out.println("2번 학생 수학 점수를 입력해 주세요.");
				jumsu[1][1] = sc.nextInt();
				System.out.println("2번 학생 과학 점수를 입력해 주세요.");
				jumsu[1][2] = sc.nextInt();

				jumsu[1][3] = jumsu[1][0] + jumsu[1][1] + jumsu[1][2];
				jumsu[1][4] = jumsu[1][3] / 3;

				System.out.println("3번 학생 국어 점수를 입력해 주세요.");
				jumsu[2][0] = sc.nextInt();
				System.out.println("3번 학생 수학 점수를 입력해 주세요.");
				jumsu[2][1] = sc.nextInt();
				System.out.println("3번 학생 과학 점수를 입력해 주세요.");
				jumsu[2][2] = sc.nextInt();

				jumsu[2][3] = jumsu[2][0] + jumsu[2][1] + jumsu[2][2];
				jumsu[2][4] = jumsu[2][3] / 3;

			}

			else if (sel == 2) 
				{
					System.out.println("\t" + "" + "국어" + "\t" + "수학" + "\t" + "과학" + "\t" + "총점" + "\t" + "평균" + "\n");

					for (int i = 0; i < jumsu.length; i++) {
						System.out.print(i + 1 + "번\t" + jumsu[i][0] + "\t" + jumsu[i][1] + "\t" + jumsu[i][2] + "\t"
								+ jumsu[i][3] + "\t" + jumsu[i][4] + "\n");

				}

				System.out.println("합계\t" + (jumsu[0][0] + jumsu[1][0] + jumsu[2][0]) + "\t"
						+ (jumsu[0][1] + jumsu[1][1] + jumsu[2][1]) + "\t" + (jumsu[0][2] + jumsu[1][2] + jumsu[2][2])
						+ "\t" + (jumsu[0][3] + jumsu[1][3] + jumsu[2][3]) + "\t"
						+ (jumsu[0][4] + jumsu[1][4] + jumsu[2][4]));
				break;

			}

			else if (sel == 3) 
			{
				break;
			}

		}

	}
}
