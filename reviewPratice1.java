package javastudy;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		int i =0;
		int j =0;
		
		while(i<6) {
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			j=0;
			System.out.println("");
			i++;
		}
		i=0;
		j=5;
		while(i<6) {
			while(j>=i) {
				System.out.print("*");
				j--;
			}
			j=5;
			System.out.println("");
			i++;
		}
	}

}
