package abc.pra;

import java.util.Scanner;

public class study01 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
//내꺼아님				
		esc1 : while(true) {
			System.out.print	("가위바위보"+"\n"+"(1=가위, 2=바위, 3=보)");
			int player= scan.nextInt();
			int com = (int)(Math.random()*3+1); // 1, 2, 3  
			//1가위 <> 1가위 =1-1=0 무
			//1가위 <>2바위=1-2=-1 패
			//1가위<>3보=1-3=-3 승

			//2바위 <> 1가위 =2-1=1 승 
			//2바위 <>2바위=2-2=0 무
			//2바위<>3보=2-3=-1 패
		
			//3보 <> 1가위 =3-1=2 패
			//3보 <>2바위=3-2=1 승
			//3보<>3보=3-3=0 무
			
			String pans ="";
			String cans = "";
			int count = 0;
			int win = 0;
			
			int result = player-com;
			
		   		
			if (player == 1) { 
				pans="가위";
			}else if(player == 2) {	
				pans="바위";
			}else if(player == 3) {	
				pans="보";
			}
			
			if (com == 1) {
				cans="가위";
			}else if (com == 2) {
				cans="바위";
			}else if (com == 3) { 
				cans="보";
			}
			
		    
			System.out.println("나: "+pans+"| 컴퓨터: "+ cans);
			
			if(result == -2 || result == 1) {
				System.out.println("-------------------");
				System.out.println("   player win");
				System.out.println("-------------------");
				win ++;
				count++;
			}else if(result == 2 || result == -1) {
				System.out.println("-------------------");
				System.out.println("   player lose");
				System.out.println("-------------------");
				count++;
			}else if(result == 0) {
				System.out.println("-------------------");
				System.out.println("        draw");
				System.out.println("-------------------");
				count++;
			}else if(player != 1 && player != 2 && player != 3){
				System.out.println("다시 입력주세요");
			}
			
			System.out.print("계속하시겠습니까? (y/n)");
			
				 while(true) {
					String a = scan.next();
						if (a.equals("y")) {
							System.out.println();
							break;
						} else if (a.equals("n")) {
							System.out.println("플레이 횟수: " + count);
							System.out.println("승리 횟수 : " + win);
							System.out.println("승률: " + ((int)(win * 1.0 / count * 1000) / 10.0));
			
							break esc1 ;
						}else { System.out.println("다시입력해주세요 \n 계속하시겠습니까? (y/n)"); continue;
						}
				}
		}
	}//main
	}
