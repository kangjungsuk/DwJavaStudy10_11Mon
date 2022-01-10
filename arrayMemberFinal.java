package chobo;

import java.util.Scanner;

public class L1 {

	public static void main(String[] args) {
		Member member = new Member();
	}

}
class Member{
	Scanner sc = new Scanner(System.in);

	//��������	
	int select;		
	int MAX = 1000; //���ο��� �����ϳ����� Ȱ��
	int cnt = 0; //���Ե� ȸ�� �� üũ����
	String id[] = new String[MAX];
	String pw[] = new String[MAX];
	String name[] = new String[MAX];
	String hp[] = new String[MAX];
	String addr[] = new String[MAX];
	String job[] = new String[MAX];
	String etc[] = new String[MAX];
	
	
	//���� ������ ���̵� ��� 
	String idAdmin = "admin";
	String pwAdmin = "1234";
	
	Member()
	{
		while(true)
		{
			System.out.println("1.�α���\n2.����");			
			System.out.print("����:");
			select = sc.nextInt();
			if(select == 1) {	loginCheck(); 	}						
			else if(select == 2) {
				System.out.println("���α׷� ����.");	
				break;
			}
		}
	}
	void join()
	{
		System.out.println();
		System.out.print("���̵�:");	id[cnt] = sc.next();
		System.out.print("���:");	pw[cnt] = sc.next();
		System.out.print("�̸�:");	name[cnt] = sc.next();
		System.out.print("����:");	hp[cnt] = sc.next();
		System.out.print("�ּ�:");	addr[cnt] = sc.next();
		System.out.print("����:");	job[cnt] = sc.next();
		System.out.print("��Ÿ:");	etc[cnt] = sc.next();
		System.out.println();
		
		cnt++;  //ȸ�� �߰��� ȸ�� ����
		
	}
	
	void loginCheck()
	{
		String id, pw;
		System.out.println();
		System.out.print("���̵�:");	id = sc.next();
		System.out.print("���:");	pw = sc.next();
		System.out.println();
		
		if(id.equals(idAdmin))
		{
			if(pw.equals(pwAdmin))
			{
				System.out.println();
				System.out.println("�α��εǾ����ϴ�");
				System.out.println();
				subMenu();
				
			}
		}
	}
	
	void subMenu()
	{
		int select;//����޼��� �ȿ����� ����.
		while(true)
		{			System.out.println("1.ȸ������\n2.ȸ����ü����\n3.ȸ����������\n4.ȸ����������\n5.ȸ���˻�\n6.�α׾ƿ�(�ڷΰ���)\n7.����");			
			System.out.print("����:");
			select = sc.nextInt();
			if(select == 1) {	 		join();			}
			else if(select == 2) {		subMemberAll();	}			
			else if(select == 3) {		subMemeberModi();	}
			else if(select == 4) {		subMemberDel();	}
			else if(select == 5) {		subMemberSearch();	}
			else if(select == 6) {	break;		}
			else if(select == 7) {
				System.out.println("���α׷� ����.");	
				break;
			}
		}
	}
	
	void subMemberAll()
	{
		System.out.println("==============  ȸ����ü��������Ʈ   =================");
		for(int i = 0 ; i < cnt ; i++)
		{			
			System.out.println(i+1+"��:"+name[i]+" / "+ id[i] + " / "+ hp[i] + " / "+ addr[i] + " / "+ job[i] + " / "+ etc[i]);			
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
		
		
		System.out.print("������ ȸ�����̵� :");
		String idDel = sc.next();		
		
		
		
		for(int i = 0 ; i < cnt ; i++)
		{			
			if(idDel.equals(id[i]))
			{
				//�ش� ���̵𳻿�� ����
				id[i]="";
				pw[i]="";
				name[i]="";
				hp[i]="";
				addr[i]="";
				job[i]="";
				etc[i]="";				
				
				
				
				//�ش� �迭���� �ڿ��� ������ ����Ÿ �̵�
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
				
				//1���� �����Ǿ����Ƿ� ī��Ʈ ������ ��� �Ѹ� ����.
				id[cnt]="";
				pw[cnt]="";
				name[cnt]="";
				hp[cnt]="";
				addr[cnt]="";
				job[cnt]="";
				etc[cnt]="";	
			
				cnt--; //������ �ؼ� ī��Ʈ�� ����
				
			}						
		}
		System.out.println();
	}
	void subMemberSearch()
	{
		System.out.print("�˻��� ȸ�����̵� :");
		String idSearch = sc.next();		
		
		
		for(int i = 0 ; i < cnt ; i++)
		{			
			if(idSearch.equals(id[i]))
			{
				System.out.println(i+1+"��:"+name[i]+" / "+ id[i] + " / "+ hp[i] + " / "+ addr[i] + " / "+ job[i] + " / "+ etc[i]);	
				break;	//�̸� ã����� Ż���ϰԵǸ� ������󵵸�..
			}						
		}
		System.out.println();
	}
	void subMemeberModi()
	{
		
		System.out.print("������ȸ�����̵� :");
		String idModi = sc.next();		
		
		
		for(int i = 0 ; i < cnt ; i++)
		{			
			if(idModi.equals(id[i]))
			{
				System.out.println("�̸�-"+name[i] + " : "); name[i] = sc.next();
				System.out.println("���-"+pw[i] + " : ");   pw[i] = sc.next();
				System.out.println("����-"+hp[i] + " : ");   hp[i] = sc.next();
				System.out.println("�ּ�-"+addr[i] + " : "); addr[i] = sc.next();
				System.out.println("����-"+job[i] + " : ");  job[i] = sc.next();
				System.out.println("��Ÿ-"+etc[i] + " : ");  etc[i] = sc.next();	
				break;	//�̸� ã����� Ż���ϰԵǸ� ������󵵸�..
			}						
		}
		System.out.println("������ ����Ǿ����ϴ�!");
	}
	
	
	
	
	
	
}