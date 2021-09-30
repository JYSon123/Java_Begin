package my.day07.b.DOWHILE;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumberMain3 {
		
	   // === 소수란? === 
	   // 소수란? 1과 자기 자신으로밖에 나누어지지 않는 1 이외의 정수 
	   // 예> 1 부터 10까지의 소수를 나타내면 
	   //     2%2 ==> 0   2 는 소수
	   //     3%3 ==> 0   3 는 소수
	   //     4%2 ==> 0   4 는 소수가 아님
	   //     5%5 ==> 0   5 는 소수
	   //     6%2 ==> 0   6 는 소수가 아님
	   //     7%7 ==> 0   7 는 소수
	   //     8%2 ==> 0   8 는 소수가 아님
	   //     9%3 ==> 0   9 는 소수가 아님
	   //     10%2 ==> 0  10 는 소수가 아님  
	
	/*
     ==실행결과==
	     ▷시작 자연수 : 1엔터
	     ▷끝 자연수 : 20엔터 
	  1 부터 20 까지의 소수는?
	  2,3,5,7,11,13,17,19
	  
	  1부터 20 까지의 소수의 개수? 8개  
	  
	  1부터 20 까지의 소수들의 합? 77 
	  
	  === 프로그램 종료 ===      
    */
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int startNo = 0 , endNo = 0;
		
		
		do {

			try {
				System.out.print("▷시작 자연수: ");
				startNo = sc.nextInt();  // 1엔터    1.345엔터   똘똘이엔터
				sc.nextLine();
				
				System.out.print("▷끝 자연수: ");
				endNo = sc.nextInt();     // 20엔터    2.345엔터   이순신엔터
				sc.nextLine();
				
		  	  //if(!(startNo >= 1 && endNo >=1) ) { // 둘중 단 하나라도 1 이상이 아닌 경우 
			  //또는
				if(!(startNo <1 || endNo >=1)) { // 둘중 하나라도 1보다 작으면
				System.out.println(">> 입력 하시는 값은 모두 자연수 이어야 합니다!! << \n");
				}
				
				else if(startNo >=  endNo) {
					System.out.println(">> 두번째 입력한 숫자가 첫번째 입력한 숫자보다 커야 합니다!! << \n");
				}
				
				else {  // 모두 옳게 입력이 되었을 경우 else로 온다.
					break;
				}
	
				
			}catch(InputMismatchException e) {
				System.out.println(">>> 자연수만 입력하세요!! <<\n");
				sc.nextLine();  // sc.nextInt를 사용했기 때문에 int 변경이 안되고
				                // 계속 버퍼에 남아있어서 무한루프가 발생한다. 그렇기에 여기서 한번 비워줘야함.
				
			}
												
		
		}while(true);
		
		// 위에 까지는 유효성 검사였다 (올바른 데이터를 받아왔는가)
		////////////////////////////////////////////////////////////////////
			
		
		// startNo ==> 1      5
		// endNo   ==> 20     20   
		//             이라면
		// 1 부터 20까지의 소수를 구해야 한다.
	    // 소수란? 1과 자기 자신의 수로만 나누었을때 나머지가 0인 1이외의 정수를 말한다.
		
		
		
		String resultStr = "";
		int cnt = 0, sum=0;
		
		for(int i=startNo; i<=endNo; i++) {
			
			if(i==1)   // i 가 소수인지 아닌지를 검사할 대상이다.
			continue;  // 1은 소수가 아니므로 검사할 필요가 없다. 그러므로 continue; 를 한다.
					   
			
			
		  /*
		            나누기를 했을때 나머지가 얼마가 되는지 일일이 검사를 한다. 
		            만약에 i 가 2 이라면  ==> 2는 소수이다.
		            만약에 i 가 3 이라면  ==> 3%2 3는 소수이다.
		            만약에 i 가 4 이라면  ==> 4%2 == 0  4%3(검사할 필요가 없다)  4는 소수가 아니다.    
		            만약에 i 가 5 이라면  ==> 5%2 5%3 5%4  5는 소수이다. 
		            만약에 i 가 9 이라면  ==> 9%2 9%3 == 0  9%4(검사할 필요가 없다) 9는 소수가 아니다.       
	      */
			
			
			boolean isSosu = true;
			
			for(int j=2; j<i; j++) { // j가 분모에 들어갈 값이다.
				if(i%j == 0) {  // 검사대상인 i는 소수가 아닌 경우, 자신 이외로 나눠지는 수가 없어야 하기 때문에 나눠지면 false이다.
					isSosu = false;
					break;
				}

				
			}//end of for--------------------------
			
			
			if(isSosu) { // 검사대상인 i가 소수이라면
				cnt++;   // 소수의 개수
				sum+=i;
				
				String comma =(cnt > 1)?",":"";  // 참이라면 콤마를 주고, 아니라면 공백을 준다.
				                                 // 두번째 부터 나오는 소수부터는 소수 앞에 ,를 붙인다.
				resultStr += comma+i;
			}
			
			
			
		}// end of for----------------------------
		
		System.out.println(startNo+" 부터"+endNo+" 까지의 소수는?\n"+resultStr+"\n");
		System.out.println(startNo+" 부터"+endNo+" 까지의 소수의 개수?"+cnt+"개");
		System.out.println(startNo+" 부터"+endNo+" 까지의 소문자?"+sum+"\n");
		

		
		sc.close();
		System.out.println("=== 프로그램 종료 ===");
		
		
		
	
	}//end of main(String[] args)------------------------

}
