package javastudy;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) 
	{
		Login1 log = new Login1();
		
	}
}

class Login1 extends Student //로그인 관련 클래스. 
{
	String id="admin";
	String pw="1004";
	String inputId="";
	String inputPw="";
	
	Login1()
	{
		while(true) 
		{
			System.out.println("==== 회원가입 ====");
			System.out.print("ID : ");
			inputId = sc.next();
			System.out.print("PW : ");
			inputPw = sc.next();

			
			if(inputId.equals(id)) 
			{
				if(inputPw.equals(pw)) 
				{
					System.out.println("접속에 성공 했습니다.");
					System.out.println("");
					jumsu();//Student (부모클래스의 메소드) 
					break;
					
				}
				else 
				{
					System.out.println("비밀번호가 틀렸습니다.");
					System.out.println("");
					
				}
			}
			else 
			{
				System.out.println("ID 가 틀렸습니다.");
				System.out.println("");
			}
			
		}
	}
	
}
class Student extends Thread //학생 점수 및 진학학교 선택.
{
	Scanner sc = new Scanner(System.in);
	int max = 20;//배열 최대 저장 갯수
	int select = 0;
	int cnt = 0;
	String inputName = "";
	int j;//숫자 배열 공란화.

	String name[] = new String[max];
	int kor[]= new int[max];
	int eng[]= new int[max];
	int math[]= new int[max];
	int avg[]= new int[max];
	
	Student()
	{
		System.out.println("학생관리프로그램이 시작 됩니다.");
	}
	public void jumsu() 
	{
		while(true) 
		{
			System.out.println("원하는 항목의 숫자를 입력해주세요.");
			System.out.println("1.추가/2.보기/3.삭제/4수정/5.진학학교선택/6.종료");
			select = sc.nextInt();
			
			if(select==1) 
			{
				jumsuAdd();//
			}
			else if(select==2) 
			{
				show();
			}
			else if(select==3) 
			{
				Delete();
			}
			else if(select==4) 
			{
				update();
			}
			else if(select==5) 
			{
				run();//학교 추천 쓰레드
			}
			else if(select==6) 
			{
				System.out.println("프로그램이 종료 됩니다.");
				break;
			}
		}
	}
	
	public void jumsuAdd()//점수입력 메소드
	{
		System.out.print("이름 입력 :");
		name[cnt] = sc.next();
		System.out.print("");
		System.out.print("국어 점수 입력 :");
		kor[cnt] = sc.nextInt();
		System.out.print("");
		System.out.print("영어 점수 입력 :");
		eng[cnt] = sc.nextInt();
		System.out.print("");
		System.out.print("수학 점수 입력 :");
		math[cnt] = sc.nextInt();
		System.out.print("");
		
		avg[cnt]=(kor[cnt]+eng[cnt]+math[cnt])/3;
		
		
		cnt++;
	}
	public void show() 
	{
		for(int i =0; i<cnt; i++) 
		{
			System.out.println("이름 :"+name[i]+"/"+"국어 점수 :"+kor[i]+"/"+"영어 점수 :"+eng[i]
					+"/"+"수학 점수 :"+math[i]+"/"+"평균 점수 :"+avg[i]);
			System.out.print("");
		}
	}
	
	public void update() 
	{
			System.out.print("수정할 학생 이름을 입력해 주세요 :");
			System.out.print("");
			inputName = sc.next();
			
			for(int i =0;i<cnt;i++) 
			{
				if(inputName.equals(name[i])) 
				{
					System.out.print("수정 할 이름 입력 : ");
					name[i] = sc.next();
					System.out.println("");
					System.out.print("수정 할 국어 점수 : ");
					kor[i] = sc.nextInt();
					System.out.println("");
					System.out.print("수정 할 영어 점수 : ");
					eng[i] = sc.nextInt();
					System.out.println("");
					System.out.print("수정 할 수학 점수 : ");
					math[i] = sc.nextInt();
					System.out.println("");
					
					avg[i]=(kor[i]+eng[i]+math[i])/3;
					System.out.println("수정이완료 되었습니다.");
					System.out.println("");
					
					break;
				}
				else 
				{
					System.out.println("=========================");
					System.out.println("수정 할 대상을 잘못 입력하셨습니다.");
					System.out.println("=========================");
					break;
				}
			}
	}
	
	public void Delete() 
	{
		System.out.print("삭제 할 학생 이름을 입력해주세요 :");
		inputName = sc.next();
		System.out.print("");
		
		for(int i =0;i<cnt;i++) 
		{
			if(inputName.equals(name[i]))
			{
				name[i] = "";//해당 학생 공란화.
				kor[i] = j;//j??
				eng[i] = j;
				math[i] = j;
				avg[i] = j;
				
				for(int j = i; j<cnt;j++) 
				{
					name[j]=name[j+1];
					kor[j] = kor[j+1];
					eng[j] = eng[j+1];
					math[j] = math[j+1];
					avg[j] = avg[j+1];
				}
				
				name[cnt] = "";//마지막 번째 줄 공란화
				kor[cnt] = j;
				eng[cnt] = j;
				math[cnt] = j;
				avg[cnt] = j;
				
				cnt--;
				System.out.println("수정이 완료 되었습니다.");
				System.out.println("");
				break;
			}
			else 
			{
				System.out.println("=========================");
				System.out.println("삭제 할 대상을 잘못 입력하셨습니다.");
				System.out.println("=========================");
				break;
			}
		}
	}
	
	public void run()
	{
		
		String thName = "";
		int selNum =0;
		
		System.out.println("진학학교 추첨을 시작 합니다!!");
		System.out.print("진학 할 학생 이름을 입력해 주세요 :");
		thName =sc.next();
		System.out.println("");
		
		
		for(int i = 0; i <cnt;i++) 
		{
			if(thName.equals(name[i])) 
			{
					try {
						selNum = (int)(Math.random()*4)+1;
						System.out.println("추첨중..");
						sleep(800);
						System.out.println("추첨중....");
						sleep(700);
						System.out.println("추첨중......");
						sleep(500);
						System.out.println("추첨이완료되었습니다!!");
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("학교 추첨이 작동 되고 있지 않습니다.");
						e.printStackTrace();
					}
					
					if(selNum==1) 
					{
						System.out.println(thName+"학생은 [충남여고]로 배정되었습니다.");
					}
					else if(selNum==2) 
					{
						System.out.println(thName+"학생은 [대전예고]로 배정되었습니다.");
					}
					else if(selNum==3) 
					{
						System.out.println(thName+"학생은 [대전외고]로 배정되었습니다.");
					}
					else if(selNum==4) 
					{
						System.out.println(thName+"학생은 [대전과학고]로 배정되었습니다.");
					}
				
			}
			else 
			{
				continue;	
			}
			
		}

	}
}



