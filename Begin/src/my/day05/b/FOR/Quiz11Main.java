package my.day05.b.FOR;

import java.util.Scanner;

public class Quiz11Main {

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
				
				
				// == 홀수의 합을 구한다. == //
				for(;;) {
					// 홀수의 합을 구하는데 첫번째로 입력한 첫번째 정수의 값이 2(짝수) 이라면     firstNo는 1을 더한후(즉, 3) 2씩 증가시켜주면 된다.   
					// 홀수의 합을 구하는데 첫번째로 입력한 첫번째 정수의 값이 3(홀수) 이라면      이라면 2씩 증가시켜주면 된다.
					
					if(firstNo%2 == 0) { // 첫번째 정수값이 짝수라면
						firstNo = firstNo + 1; //한개를 건너 뛰어야 한다. 1을 더해주면 홀수가 되어진다.
					}
					if(firstNo <= secondNo) {
						holsum += firstNo; //누적을 해주고 2를 증가시켜준다 (그럼 계속 홀수상태)
					}
					
					
					else {
						break;
					}
					
					
					firstNo += 2;
					
					
				}// end of for-----------------
				
				
				 firstNo = Integer.parseInt(strFirstNo);

				 
				// == 짝수의 합을 구한다. == //
				for(;;) {
					// 짝수의 합을 구하는데 첫번째로 입력한 첫번째 정수의 값이 3(홀수) 이라면     firstNo는 1을 더한후(즉, 2) 2씩 증가시켜주면 된다.   
					
					// 짝수의 합을 구하는데 첫번째로 입력한 첫번째 정수의 값이 4(짝수) 이라면      이라면 2씩 증가시켜주면 된다.
					
					if(firstNo%2 != 0) { // 첫번째 정수값이 홀수라면,
						firstNo = firstNo + 1; // 1을 더해주면 짝수가 되어진다.
					}
					if(firstNo <= secondNo) {
						jjaksum += firstNo; //누적을 해주고 2를 증가시켜준다 (그럼 계속 홀수상태)
					
					}
					else {
						break;
					}
					
					
					firstNo += 2;
					
					sc.close();
					
				}// end of for-----------------	
				
				
				
				System.out.println(strFirstNo +" 부터" + strSecondNo + "까지의 홀수의 합은 :" + holsum +  "\n"
								  +strFirstNo +" 부터" + strSecondNo + "까지의 짝수의 합은 :" + jjaksum + "\n" );
								
					break; 	
				
			}catch(NumberFormatException e) {  // 뭔가 잘못됐을 때 숫자가 떨어질곳
				System.out.println(">> 정수만 입력하세요!! <<");
			}
			

				
			
		}//end of for----------------------------------
	
	
			//sc.close();
			


}// end of main(String[] args)-------------

}
