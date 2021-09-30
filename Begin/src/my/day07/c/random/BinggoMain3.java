package my.day07.c.random;

import java.util.Random;
import java.util.Scanner;

public class BinggoMain3 {
	
	
	/*
	 PC가 만들수 있는 숫자는 1 ~ 100 까지중 아무거나 1개를 만든다.

	  59 (PC가 랜덤하게 만든 숫자)
	  
	  1 부터 100 사이의 숫자입력 =>  50엔터  1번시도
	   >> 50보다 큰값입니다.

	  1 부터 100 사이의 숫자입력 =>  71엔터  2번시도
	   >> 71보다 적은값입니다. 

      1 부터 100 사이의 숫자입력 => 60엔터  3번시도
       >> 60보다 적은값입니다.

	  1 부터 100 사이의 숫자입력 =>  58엔터  4번시도
	   >> 58보다 큰값입니다.

	  1 부터 100 사이의 숫자입력 =>  59엔터  5번시도 
	      빙고!!  5번만에 맞추었습니다.       
	 */
	
		
	
	
	
	public static void main(String[] args) {
		
	
		
		
		
		Random rnd = new Random();
		
		int pcNum = rnd.nextInt(100 - 1 + 1) + 1;
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0; // 시도회수
		
		
		do { // 사용자가 입력을 잘못했을 경우
			try {
				System.out.print("1 부터 100 사이의 숫자입력 =>");
				int userNum = Integer.parseInt(sc.nextLine()); 
				
				if( userNum < 1 || userNum > 100) { //1 부터 100사이 인가?
					System.out.println(">> 1 부터 100 사이의 정수만 입력해주세요! <<\n");
				}
				
				else {
					cnt++; 
				
					if(pcNum < userNum) {
						System.out.println(">> "+userNum+" 보다 작은 수 입니다. <<");
					}
					else if(pcNum > userNum) {
						System.out.println(">> "+userNum+" 보다 큰 수 입니다. <<");
					}
					else {
						System.out.println("### 빙고!! "+cnt+"번 만에 맞추었습니다!###");
						sc.close();
						break;
				}
					
			} // end of else-----------------
				
				
		}catch(NumberFormatException e){
				System.out.println(">> 정수만 입력해주세요! <<\n");
	    }
	 		
			
			
		//	cnt++; //사용자가 게임룰에 맞는 1부터 100까지중 하나를 입력했을 경우에만 적용시키도록 한다.
		
		
		
	}while(true);
		
		
		
    System.out.println("\n=== 프로그램 종료 ====");
		
		
		
	}// end of main(String[] args)

}
