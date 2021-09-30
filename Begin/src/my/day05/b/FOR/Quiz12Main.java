package my.day05.b.FOR;

import java.util.Scanner;

public class Quiz12Main {

	public static void main(String[] args) {
		
		
	/*	
 
	// 첫번째 정수 : 2엔터    3엔터  그냥엔터   "똘똘이"엔터    2.45엔터
	// 두번째 정수 : 10엔터  10엔터  그냥엔터   "똘똘이"엔터    2.45엔터
	
	>> 결과 <<
	2 부터 10까지의 홀수의 합은 : 24    3 부터 10까지의 홀수의 합은 : 24
	2 부터 10까지의 짝수의 합은 : 30    3 부터 10까지의 짝수의 합은 : 28
	 
*/	

		Scanner sc = new Scanner(System.in);
	
		
		
		
		
		for(;;) {
		
			try {
			
				
				System.out.print("첫번째 정수 : ");
				String strFirstNo = sc.nextLine(); //고정된 값을 만들어둬야 출력을 할 때 활용을 할 수 있다.
				int firstNo = Integer.parseInt((strFirstNo)); // 입력받은 값을 Integer.parseInt로 인트 타입으로 바꾼다
				
				
				System.out.print("두번째 정수 : ");
				String strSecondNo = sc.nextLine();
				int secondNo = Integer.parseInt(strSecondNo);


				
				//올바르게 되었을 경우에 숫자가 떨어질곳
				int holsum = 0;  // 홀수의 누적의 합계를 저장하는 변수
				int jjaksum = 0; // 짝수의 누적의 합계를 저장하는 변수
				
				
				
				int holsu = 0, jjaksu = 0;				
				
				if(firstNo%2 == 0) {  // 첫번째로 입력받은 값이 짝수라면
									  // 예 > 2
					
					 holsu = firstNo + 1; // 예 > holsu = 3
					 jjaksu = firstNo;    // 예 > jjaksu = 2
					
				}
				else {  // 첫번째로 입력받은 값이 홀수라면
					    // 예 > 3
					holsu = firstNo;         // 예> holsu = 3
					jjaksu = firstNo + 1;    // 예> jjaksu = 4
				}
				// == 초기치를 주는 부분이다 == //
				
				
				
				// == 한번에 홀수 및 짝수의 합을 구한다. ==//
				
				for(;;) {
					
					if(holsu <= secondNo)
					holsum += holsu;
				
					
					if(jjaksu <= secondNo)
					jjaksum +=  jjaksu;
					
					
					holsu +=2;
					jjaksu +=2;
					
					
					if(holsu > secondNo &&
					   jjaksu > secondNo) {
						break;
					}
					
				}//end of for-----------------------
				
				
				
	
				System.out.println(strFirstNo +" 부터" + strSecondNo + "까지의 홀수의 합은 :" + holsum +  "\n"
								  +strFirstNo +" 부터" + strSecondNo + "까지의 짝수의 합은 :" + jjaksum + "\n" );
								
					break; 	
				
			}catch(NumberFormatException e) {  // 뭔가 잘못됐을 때 숫자가 떨어질곳
				System.out.println(">> 정수만 입력하세요!! <<");
			}
			

				
			
		}//end of for----------------------------------
	
	
			sc.close();
			


}// end of main(String[] args)-------------

}
