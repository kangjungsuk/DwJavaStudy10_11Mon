package javastudy;

public class Test13

{
	public static void main(String[] args)

	{

		// ▲ 변수선언

		int i, j, k;

		// ▲ 연산 및 출력

		for (i = 0, j = 0; i < 9; i++)

		{
			for (k = 0; k < j + 5; k++) {

				System.out.print((k < (4 - j)) ? " " : "*");

			}

			if (i < 4)

			{

				j++;

			}

			else

			{

				j--;

			}

			System.out.println();

		}

	}

}
