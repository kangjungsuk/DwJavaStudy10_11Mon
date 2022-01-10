package javastudy;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		for(i=0; i<6 ; i++) {
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(i=0;i<6;i++) {
			for (j=5;j>i;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
