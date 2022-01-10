package chobo;

import java.util.Scanner;

public class L1 {

	public static void main(String[] args) {
		Member member = new Member();
	}

}
class Member{
	Scanner sc = new Scanner(System.in);

	//변수선언	
	int select;		
	int MAX = 1000; //총인원을 변수하나만들어서 활용
	int cnt = 0; //가입된 회원 수 체크변수
	String id[] = new String[MAX];
	String pw[] = new String[MAX];
	String name[] = new String[MAX];
	String hp[] = new String[MAX];
	String addr[] = new String[MAX];
	String job[] = new String[MAX];
	String etc[] = new String[MAX];
	
	
	//접속 관리자 아이디 비번 
	String idAdmin = "admin";
	String pwAdmin = "1234";
	
	Member()
	{
		while(true)
		{
			System.out.println("1.로그인\n2.종료");			
			System.out.print("선택:");
			select = sc.nextInt();
			if(select == 1) {	loginCheck(); 	}						
			else if(select == 2) {
				System.out.println("프로그램 종료.");	
				break;
			}
		}
	}
	void join()
	{
		System.out.println();
		System.out.print("아이디:");	id[cnt] = sc.next();
		System.out.print("비번:");	pw[cnt] = sc.next();
		System.out.print("이름:");	name[cnt] = sc.next();
		System.out.print("전번:");	hp[cnt] = sc.next();
		System.out.print("주소:");	addr[cnt] = sc.next();
		System.out.print("직업:");	job[cnt] = sc.next();
		System.out.print("기타:");	etc[cnt] = sc.next();
		System.out.println();
		
		cnt++;  //회원 추가시 회원 증가
		
	}
	
	void loginCheck()
	{
		String id, pw;
		System.out.println();
		System.out.print("아이디:");	id = sc.next();
		System.out.print("비번:");	pw = sc.next();
		System.out.println();
		
		if(id.equals(idAdmin))
		{
			if(pw.equals(pwAdmin))
			{
				System.out.println();
				System.out.println("로그인되었습니다");
				System.out.println();
				subMenu();
				
			}
		}
	}
	
	void subMenu()
	{
		int select;//서브메서드 안에서만 영향.
		while(true)
		{			System.out.println("1.회원가입\n2.회원전체보기\n3.회원정보수정\n4.회원정보삭제\n5.회원검색\n6.로그아웃(뒤로가기)\n7.종료");			
			System.out.print("선택:");
			select = sc.nextInt();
			if(select == 1) {	 		join();			}
			else if(select == 2) {		subMemberAll();	}			
			else if(select == 3) {		subMemeberModi();	}
			else if(select == 4) {		subMemberDel();	}
			else if(select == 5) {		subMemberSearch();	}
			else if(select == 6) {	break;		}
			else if(select == 7) {
				System.out.println("프로그램 종료.");	
				break;
			}
		}
	}
	
	void subMemberAll()
	{
		System.out.println("==============  회원전체정보리스트   =================");
		for(int i = 0 ; i < cnt ; i++)
		{			
			System.out.println(i+1+"번:"+name[i]+" / "+ id[i] + " / "+ hp[i] + " / "+ addr[i] + " / "+ job[i] + " / "+ etc[i]);			
		}
		System.out.println();
	}
	void subMemberDel()
	{
		
		String idTemp[] = new String[MAX];
		String pwTemp[] = new String[MAX];
		String nameTemp[] = new String[MAX];
		String hpTemp[] = new String[MAX];
		String addrTemp[] = new String[MAX];
		String jobTemp[] = new String[MAX];
		String etcTemp[] = new String[MAX];
		
		
		System.out.print("삭제할 회원아이디 :");
		String idDel = sc.next();		
		
		
		
		for(int i = 0 ; i < cnt ; i++)
		{			
			if(idDel.equals(id[i]))
			{
				//해당 아이디내용들 삭제
				id[i]="";
				pw[i]="";
				name[i]="";
				hp[i]="";
				addr[i]="";
				job[i]="";
				etc[i]="";				
				
				
				
				//해당 배열부터 뒤에서 앞으로 데이타 이동
				for(int k=i; k < cnt-1; k++)
				{
					id[k]=id[k+1];
					pw[k]=pw[k+1];
					name[k]=name[k+1];
					hp[k]=hp[k+1];
					addr[k]=addr[k+1];
					job[k]=job[k+1];
					etc[k]=etc[k+1];	
				}
				
				//1개가 삭제되었으므로 카운트 마지막 사람 한명 삭제.
				id[cnt]="";
				pw[cnt]="";
				name[cnt]="";
				hp[cnt]="";
				addr[cnt]="";
				job[cnt]="";
				etc[cnt]="";	
			
				cnt--; //삭제를 해서 카운트가 감소
				
			}						
		}
		System.out.println();
	}
	void subMemberSearch()
	{
		System.out.print("검색할 회원아이디 :");
		String idSearch = sc.next();		
		
		
		for(int i = 0 ; i < cnt ; i++)
		{			
			if(idSearch.equals(id[i]))
			{
				System.out.println(i+1+"번:"+name[i]+" / "+ id[i] + " / "+ hp[i] + " / "+ addr[i] + " / "+ job[i] + " / "+ etc[i]);	
				break;	//미리 찾을경우 탈출하게되면 성능향상도모..
			}						
		}
		System.out.println();
	}
	void subMemeberModi()
	{
		
		System.out.print("수정할회원아이디 :");
		String idModi = sc.next();		
		
		
		for(int i = 0 ; i < cnt ; i++)
		{			
			if(idModi.equals(id[i]))
			{
				System.out.println("이름-"+name[i] + " : "); name[i] = sc.next();
				System.out.println("비번-"+pw[i] + " : ");   pw[i] = sc.next();
				System.out.println("전번-"+hp[i] + " : ");   hp[i] = sc.next();
				System.out.println("주소-"+addr[i] + " : "); addr[i] = sc.next();
				System.out.println("직업-"+job[i] + " : ");  job[i] = sc.next();
				System.out.println("기타-"+etc[i] + " : ");  etc[i] = sc.next();	
				break;	//미리 찾을경우 탈출하게되면 성능향상도모..
			}						
		}
		System.out.println("내용이 변경되었습니다!");
	}
	
	
	
	
	
	
}