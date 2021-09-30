package my.day05.b.FOR;

import java.util.Scanner;

/*

  === 실행결과 ===
  
  >> 누적해야할 시작 정수 => 1엔터 그냥엔터 똘똘이엔터 2.567 엔터
  ### 정수만 입력하세요!! ###
  
  >> 누적해야할 시작 정수 => 1엔터
  
  >> 누적해야할 마지막 정수 => 1엔터 그냥엔터 똘똘이엔터 2.567 엔터
  ### 정수만 입력하세요!! ###
  
  >> 누적해야할 마지막 정수 => 10엔터
  
  >>> 실행결과 : 1 부터 10 까지의 누적의 합은 55 입낟. <<<
  
  

*/

public class zSum6Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0, num2 = 0;
		
		for(;;) {
		System.out.print(">> 누적해야할 시작 정수 =>");
		
		try {
			num1 = Integer.parseInt(sc.nextLine());
			break;
		} catch(NumberFormatException e) {
			System.out.println("### 정수만 입력하세요!! ###");
			
		}
	
		
		
		}// end of for -------------
		
		for(;;) {
		System.out.print(">> 누적해야할 마지막 정수 =>");
		
		try {
			num2 = Integer.parseInt(sc.nextLine());
			break;
		} catch(NumberFormatException e) {
			System.out.println("### 정수만 입력하세요!! ###");
			
		}
	
		}// end of for -------------
		
		
		
		
		
	
//		int z = 0;
//		int i = 0;
//		int j = 0;
//		
//
//		for( i=num1, j=num2; num1 <= num2; i++) {
//			i += 1;
//			
//			System.out.print(">>> 실행결과 : " + i + "부터" + j + "까지의 누적의 합은" + z + "입니다.");   
			
		
		
		}
		
		
		
		
			
		
		
		
		
	}// end of main(String[] args)--------------------------




