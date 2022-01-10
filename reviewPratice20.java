package javastudy;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test21_sub aa = new Test21_sub();
		
		
		Test21_sub aa1 = new Test21_sub("하세요");
		Test21_sub aa2 = new Test21_sub(5,"화가 가득합니다.");
		
		int a = aa.total(10,20);
		System.out.println("메인창 값은 :"+a);
	

	}

}
