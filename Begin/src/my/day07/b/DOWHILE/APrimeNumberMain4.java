package my.day07.b.DOWHILE;

import java.util.InputMismatchException;
import java.util.Scanner;

public class APrimeNumberMain4 {
		
	public static void main(String[] args) {
	
		// === 입력한 숫자 사이의 소수들의 합을 구해보자! === // 
	
		Scanner sc = new Scanner(System.in); // 값을 입력받을 스캐너를 가장 먼저 불러와준다.
		
		int startNo = 0 , endNo = 0; // 시작값과 끝값을 선언해주자!
		
		do {
		
			try {
				
				
				System.out.print("=> 시작 자연수 : "); //=> 시작 자연수 : 를 콘솔에 출력할것이다.
				startNo = sc.nextInt(); // 값을 입력받자
				
				System.out.print("=> 끝 자연수 : "); //=> 시작 자연수 : 를 콘솔에 출력할것이다.
				endNo = sc.nextInt();
		
				if(!(startNo < 1 || endNo <= 1 )) { // 말이 안되는 경우를 필터링해주자! (ex. 끝 번호가 1, 첫 시작 번호가 0)
					System.out.println(">> 자연수만을 입력해주세요! <<");
				}
				// 또한 끝번호가 첫 번호보다 작은 경우도 걸러줘야한다.
					
				else if(startNo >= endNo) { //두번째 입력한 숫자가 첫번째 입력한 숫자보다 작은 경우도 있을것이다.
					System.out.println(">> 두번째 입력한 숫자가 첫번째 입력한 숫자보다 커야 합니다!");
				}
				
				else {
					break; 
				}
				
			}catch(InputMismatchException e) {
				System.out.println(">> 오로지 정수만 입력해주세요! <<");
			}
		}while(true);	
			
		///////////////// 유효성 검사 끝 ///////////////////
		
		
		String resultStr = "";
		
		int cnt=0, sum=0;
		
		for(int i=startNo; i<=endNo; i++) {
			if(i==1)
			continue;
			
			
			
		boolean isSosu = true;
		
		for(int j=2; j<i; j++) {
			if(i%j == 0) {
				isSosu = false;
				break;
			}
		}
			
		
		
		
			
		}
		
		
		
		
		
		
		
		
		
	
	
	
	}
		
	}//end of main(String[] args)------------------------


