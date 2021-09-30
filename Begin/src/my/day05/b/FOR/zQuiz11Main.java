package my.day05.b.FOR;

import java.util.Scanner;

public class zQuiz11Main {

	public static void main(String[] args) {
		
	/*	
		 첫번째 정수 : 2엔터    3엔터     그냥엔터    "똘똘이"엔터     2.45엔터
		 두번째 정수 : 10엔터  10엔터   그냥엔터    "똘똘이"엔터     2.45엔터
		
		>> 결과 <<
		2 부터 10까지의 홀수의 합은 : 24    3 부터 10까지의 홀수의 합은 : 24
		2 부터 10까지의 짝수의 합은 : 30    3 부터 10까지의 짝수의 합은 : 28 
	*/
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			
			try {
				System.out.print("첫번째 정수 : ");
				String strFirstNo = sc.nextLine();
				int firstNo = Integer.parseInt(strFirstNo);
				
				System.out.print("두번째 정수 : ");
				String strSecondNo = sc.nextLine();
				int secondNo = Integer.parseInt(strSecondNo);
			
				int holSum = 0;  // 홀수의 누적의 합계를 저장하는 변수 
				int jjakSum = 0; // 짝수의 누적의 합계를 저장하는 변수
				
				// == 홀수의 합을 구한다. == //
				for(;;) {
					// 홀수의 합을 구하는데 첫번째로 입력한 첫번째 정수의 값이 2(짝수) 이라면  firstNo 는 1을 더한후 (즉, 3) 2씩 증가시켜주면 된다.          
					
					// 홀수의 합을 구하는데 첫번째로 입력한 첫번째 정수의 값이 3(홀수) 이라면 2씩 증가시켜주면 된다.
					
					if(firstNo%2 == 0) { // 첫번째 정수의 값이 짝수 이라면
						firstNo = firstNo + 1;  // firstNo 가 홀수가 된다.
					}
					
					if(firstNo <= secondNo) {
						holSum += firstNo;
					}
					else {
						break;
					}
										
					firstNo += 2;
					
				}// end of for-----------------------------
				
				
				firstNo = Integer.parseInt(strFirstNo);
				// == 짝수의 합을 구한다. == //
				for(;;) {
					// 짝수의 합을 구하는데 첫번째로 입력한 첫번째 정수의 값이 3(홀수) 이라면  firstNo 는 1을 더한후 (즉, 4) 2씩 증가시켜주면 된다.          
					
					// 짝수의 합을 구하는데 첫번째로 입력한 첫번째 정수의 값이 2(짝수) 이라면 2씩 증가시켜주면 된다.
					
					if(firstNo%2 != 0) { // 첫번째 정수의 값이 홀수 이라면
						firstNo = firstNo + 1;  // firstNo 가 짝수가 된다.
					}
					
					if(firstNo <= secondNo) {
						jjakSum += firstNo;
					}
					else {
						break;
					}
										
					firstNo += 2;
					
				}// end of for-----------------------------
				
				System.out.println(strFirstNo +" 부터 "+strSecondNo+" 까지의 홀수의 합은 : "+holSum+"\n"
						          +strFirstNo +" 부터 "+strSecondNo+" 까지의 짝수의 합은 : "+jjakSum+"\n");
				
				sc.close();
				break;
			} catch(NumberFormatException e) {
				System.out.println(">> 정수만 입력하세요!! <<");
			}
			
		}// end of for----------------------------
		
	}// end of main(String[] args)----------------------

}
