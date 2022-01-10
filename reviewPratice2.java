package javastudy;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		int i = 0, j = 6;
		while (i < 6) {
			while (j > i) {
				System.out.print("*");
				j--;
			}
			j = 5;
			i++;
			System.out.println("");
		}

		j = 0;
		i = 0;
		while (i <= 5) {
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			j = 0;
			i++;
			System.out.println("");
		}

	}
}
