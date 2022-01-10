package javastudy;

import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		int ban1[][]= new int[5][5];
		int ban2[][]= new int[5][5];
		int ban3[][]= new int[5][5];
		String name[][] = new String[3][3];
		
		int cnt=0;//1번반의 자릿수를 위한 카운트 변수
		int select = 0;//
		int bana =0;
		
			while(true) 
			{
				System.out.println("1.입력/2.출력/3.종료");
				System.out.println("===선택해주세요===");
				select = a.nextInt();
				cnt=0;
				if(select ==1) 
				{
					
						System.out.print("반 :");
						bana =a.nextInt();
						if(bana==1) 
						{
							while(true) 
							{
								System.out.print("이름 : ");
								name[cnt][0] =a.next();
								System.out.print("국어 : ");
								ban1[cnt][0] =a.nextInt();
								System.out.print("영어 : ");
								ban1[cnt][1] =a.nextInt();
								System.out.print("수학 : ");
								ban1[cnt][2] =a.nextInt();
								System.out.print("test1");
								
								ban1[cnt][3] = ban1[cnt][0] + ban1[cnt][1] + ban1[cnt][2];
								ban1[cnt][4] = ban1[cnt][3]/3;
								
								System.out.print("1계속 0종료");
								
								select=a.nextInt();
								if(select==1) 
								{
									cnt++;
								}
								else if(select==0)
								{
									break;
								}
								
							}
						}
							if(bana==2) 
							{
								while(true) 
								{
									System.out.print("이름 : ");
									name[cnt][1] =a.next();
									System.out.print("국어 : ");
									ban2[cnt][0] =a.nextInt();
									System.out.print("영어 : ");
									ban2[cnt][1] =a.nextInt();
									System.out.print("수학 : ");
									ban2[cnt][2] =a.nextInt();
									
									ban2[cnt][3] = ban2[cnt][0] + ban2[cnt][1] + ban2[cnt][2];
									ban2[cnt][4] = ban2[cnt][3]/3;
									
									System.out.print("1계속 0종료");
									select=a.nextInt();
									if(select==1) 
									{
										cnt++;
									}
									else if(select==0)
									{
										break;
									}
									
								}
							}
							
							if(bana==3) 
							{
								while(true) 
								{
									System.out.print("이름 : ");
									name[cnt][2] =a.next();
									System.out.print("국어 : ");
									ban3[cnt][0] =a.nextInt();
									System.out.print("영어 : ");
									ban3[cnt][1] =a.nextInt();
									System.out.print("수학 : ");
									ban3[cnt][2] =a.nextInt();
									
									ban3[cnt][3] = ban3[cnt][0] + ban3[cnt][1] + ban3[cnt][2];
									ban3[cnt][4] = ban3[cnt][3]/3;
									
									System.out.print("1계속 0종료");
									select=a.nextInt();
									if(select==1) 
									{
										cnt++;
									}
									else if(select==0)
									{
										break;
									}
									
								}
							}
						}
						
					
					
				
				else if(select ==2)
				{
					
					
					System.out.println("1반 출력내용.");
					System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
					
					for(int i =0;i<3;i++) 
					{
						
						System.out.print("\n"+name[i][0]+"\t");
						
						for(int j =0;j<5;j++) 
						{
							
							
							System.out.print(ban1[i][j]+"\t");
						
							
							
						}
					}
					
					System.out.println("\n2반 출력내용.");
					System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
					for(int i =0;i<3;i++) {
						System.out.print("\n"+name[i][1]+"\t");
						for(int j =0;j<5;j++) {
							
							
							System.out.print(ban2[i][j]+"\t");
						
							
							
						}
					}
					
					System.out.println("\n3반 출력내용.");
					System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
					for(int i =0;i<3;i++) {
						System.out.print("\n"+ name[i][2]+"\t");
						for(int j =0;j<5;j++) {
							
							
							System.out.print(ban3[i][j]+"\t");
						
							
							
						}
					}
					
				}
				else if(select ==3)
				{
					cnt = 1;
					System.out.println("===프로그램종료===");
					break;
				}			
			}
		}

	}


