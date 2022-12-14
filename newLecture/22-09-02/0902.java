import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
	
		// TODO Auto-generated method stub
		int kor1=0, kor2=0, kor3=0;
		int total;
		float avg;

		
		Scanner scan = new Scanner(System.in);
		
		EXIT:
		while(true)
		{
			System.out.println("┌────────────┐");
			System.out.println("│       메인 메뉴        │");
			System.out.println("└────────────┘");
			
			System.out.println("1. 성적 입력 ");
			System.out.println("2. 성적 출력");
			System.out.println("3.성적 읽기");
			System.out.println("4.성적 저장");
			System.out.println("5.프로그램 종료");
			System.out.print("선택 > "); //1. 입력 or 2. 출력 선택
			int menu = scan.nextInt();
			
			switch(menu){
				case 1:
					//==========성적 입력===============	
					{
						System.out.println("┌────────────┐");
						System.out.println("│       성적 입력        │");
						System.out.println("└────────────┘");
						
						do
						{
						System.out.print("kor1:");
						kor1 = scan.nextInt();
						
						if(kor1 <0 || kor1 >100)
							System.out.println("성적의 범위(0~100)를 벗어났습니다.");
						
						}
						while(kor1 <0 || kor1 >100);
						 
						
				
						do
						{
							System.out.print("kor2:");
							kor2 = scan.nextInt();
						
							if(kor2 <0 || kor2 >100)
								System.out.println("성적의 범위(0~100)를 벗어났습니다.");
						}
						while(kor2 <0 || kor2 >100);
						
						do
						{
							System.out.print("kor3:");
							kor3 = scan.nextInt();
						
							if(kor3 <0 || kor3 >100)
								System.out.println("성적의 범위(0~100)를 벗어났습니다.");
						}
						while(kor3 <0 || kor3 >100);
				
					}	break;
					
				case 2:
					//=================성적 출력 부분=============
				{
						total = kor1 + kor2 + kor3;
						avg = total / 3.0f;
					
						System.out.println("┌────────────┐");
						System.out.println("│        성적 출력       │");
						System.out.println("└────────────┘");
		
						int i=0;
						while( i <3)
						{
							System.out.printf("국어1 : %d \n",kor1);
							System.out.printf("국어2 : %d \n",kor2);
							System.out.printf("국어3 : %d \n",kor3);
							
							System.out.printf("총점 : %d  \n", total);
							System.out.printf("평균 : %.2f \n", avg);
							System.out.println();
							i++;
						}
					
				}	break;
				
				case 3: //성적 파일 읽기
				{	
						FileInputStream fis = new  FileInputStream("C:\\WorkSpace\\Java3thPrj\\res\\data.csv");
						Scanner fscan = new Scanner(fis);
						
						fscan.nextLine();
						kor1= Integer.parseInt(fscan.nextLine()); // "10"->10 integer.parseint()
						kor2= Integer.parseInt(fscan.nextLine());
						kor3= Integer.parseInt(fscan.nextLine());
						
						fscan.close();
						fis.close();
						
						
					} break;	
					
					case 4:	//읽은 성적 저장
					{
						FileOutputStream fis = new  FileOutputStream("C:\\WorkSpace\\Java3thPrj\\res\\data.csv");
						PrintStream fout = new PrintStream(fis);
						
						fout.println("kor"); 
						fout.println(kor1);
						fout.println(kor2);
						fout.println(kor3);
						
						fout.close();
						fis.close();
				} break;

				case 5:
					System.out.println("프로그램이 종료되었습니다.");
					break EXIT;
				
				default:
					System.out.println("1~3번만 입력하세요");
					break;	
							
			}

		}

	}

}