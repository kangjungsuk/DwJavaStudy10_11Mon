package javastudy;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) 
	{
		Login1 log = new Login1();
		
	}
}

class Login1 extends Student //�α��� ���� Ŭ����. 
{
	String id="admin";
	String pw="1004";
	String inputId="";
	String inputPw="";
	
	Login1()
	{
		while(true) 
		{
			System.out.println("==== ȸ������ ====");
			System.out.print("ID : ");
			inputId = sc.next();
			System.out.print("PW : ");
			inputPw = sc.next();

			
			if(inputId.equals(id)) 
			{
				if(inputPw.equals(pw)) 
				{
					System.out.println("���ӿ� ���� �߽��ϴ�.");
					System.out.println("");
					jumsu();//Student (�θ�Ŭ������ �޼ҵ�) 
					break;
					
				}
				else 
				{
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					System.out.println("");
					
				}
			}
			else 
			{
				System.out.println("ID �� Ʋ�Ƚ��ϴ�.");
				System.out.println("");
			}
			
		}
	}
	
}
class Student extends Thread //�л� ���� �� �����б� ����.
{
	Scanner sc = new Scanner(System.in);
	int max = 20;//�迭 �ִ� ���� ����
	int select = 0;
	int cnt = 0;
	String inputName = "";
	int j;//���� �迭 ����ȭ.

	String name[] = new String[max];
	int kor[]= new int[max];
	int eng[]= new int[max];
	int math[]= new int[max];
	int avg[]= new int[max];
	
	Student()
	{
		System.out.println("�л��������α׷��� ���� �˴ϴ�.");
	}
	public void jumsu() 
	{
		while(true) 
		{
			System.out.println("���ϴ� �׸��� ���ڸ� �Է����ּ���.");
			System.out.println("1.�߰�/2.����/3.����/4����/5.�����б�����/6.����");
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
				run();//�б� ��õ ������
			}
			else if(select==6) 
			{
				System.out.println("���α׷��� ���� �˴ϴ�.");
				break;
			}
		}
	}
	
	public void jumsuAdd()//�����Է� �޼ҵ�
	{
		System.out.print("�̸� �Է� :");
		name[cnt] = sc.next();
		System.out.print("");
		System.out.print("���� ���� �Է� :");
		kor[cnt] = sc.nextInt();
		System.out.print("");
		System.out.print("���� ���� �Է� :");
		eng[cnt] = sc.nextInt();
		System.out.print("");
		System.out.print("���� ���� �Է� :");
		math[cnt] = sc.nextInt();
		System.out.print("");
		
		avg[cnt]=(kor[cnt]+eng[cnt]+math[cnt])/3;
		
		
		cnt++;
	}
	public void show() 
	{
		for(int i =0; i<cnt; i++) 
		{
			System.out.println("�̸� :"+name[i]+"/"+"���� ���� :"+kor[i]+"/"+"���� ���� :"+eng[i]
					+"/"+"���� ���� :"+math[i]+"/"+"��� ���� :"+avg[i]);
			System.out.print("");
		}
	}
	
	public void update() 
	{
			System.out.print("������ �л� �̸��� �Է��� �ּ��� :");
			System.out.print("");
			inputName = sc.next();
			
			for(int i =0;i<cnt;i++) 
			{
				if(inputName.equals(name[i])) 
				{
					System.out.print("���� �� �̸� �Է� : ");
					name[i] = sc.next();
					System.out.println("");
					System.out.print("���� �� ���� ���� : ");
					kor[i] = sc.nextInt();
					System.out.println("");
					System.out.print("���� �� ���� ���� : ");
					eng[i] = sc.nextInt();
					System.out.println("");
					System.out.print("���� �� ���� ���� : ");
					math[i] = sc.nextInt();
					System.out.println("");
					
					avg[i]=(kor[i]+eng[i]+math[i])/3;
					System.out.println("�����̿Ϸ� �Ǿ����ϴ�.");
					System.out.println("");
					
					break;
				}
				else 
				{
					System.out.println("=========================");
					System.out.println("���� �� ����� �߸� �Է��ϼ̽��ϴ�.");
					System.out.println("=========================");
					break;
				}
			}
	}
	
	public void Delete() 
	{
		System.out.print("���� �� �л� �̸��� �Է����ּ��� :");
		inputName = sc.next();
		System.out.print("");
		
		for(int i =0;i<cnt;i++) 
		{
			if(inputName.equals(name[i]))
			{
				name[i] = "";//�ش� �л� ����ȭ.
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
				
				name[cnt] = "";//������ ��° �� ����ȭ
				kor[cnt] = j;
				eng[cnt] = j;
				math[cnt] = j;
				avg[cnt] = j;
				
				cnt--;
				System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
				System.out.println("");
				break;
			}
			else 
			{
				System.out.println("=========================");
				System.out.println("���� �� ����� �߸� �Է��ϼ̽��ϴ�.");
				System.out.println("=========================");
				break;
			}
		}
	}
	
	public void run()
	{
		
		String thName = "";
		int selNum =0;
		
		System.out.println("�����б� ��÷�� ���� �մϴ�!!");
		System.out.print("���� �� �л� �̸��� �Է��� �ּ��� :");
		thName =sc.next();
		System.out.println("");
		
		
		for(int i = 0; i <cnt;i++) 
		{
			if(thName.equals(name[i])) 
			{
					try {
						selNum = (int)(Math.random()*4)+1;
						System.out.println("��÷��..");
						sleep(800);
						System.out.println("��÷��....");
						sleep(700);
						System.out.println("��÷��......");
						sleep(500);
						System.out.println("��÷�̿Ϸ�Ǿ����ϴ�!!");
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("�б� ��÷�� �۵� �ǰ� ���� �ʽ��ϴ�.");
						e.printStackTrace();
					}
					
					if(selNum==1) 
					{
						System.out.println(thName+"�л��� [�泲����]�� �����Ǿ����ϴ�.");
					}
					else if(selNum==2) 
					{
						System.out.println(thName+"�л��� [��������]�� �����Ǿ����ϴ�.");
					}
					else if(selNum==3) 
					{
						System.out.println(thName+"�л��� [�����ܰ�]�� �����Ǿ����ϴ�.");
					}
					else if(selNum==4) 
					{
						System.out.println(thName+"�л��� [�������а�]�� �����Ǿ����ϴ�.");
					}
				
			}
			else 
			{
				continue;	
			}
			
		}

	}
}



