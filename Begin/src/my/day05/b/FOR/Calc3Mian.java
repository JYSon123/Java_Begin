package my.day05.b.FOR;

import java.util.Scanner;






/*
 * 
 *   >> 실행결과 <<
   	첫번째 정수 입력 => 10엔터
   	두번째 정수 입력 => 4엔터
   	사칙연산자 선택(+ - * /) => + 엔터
  
   10 + 4 = 14
   10 - 4 = 6
   10 * 4 = 40
   10 / 4 = 2
  
  */





public class Calc3Mian {

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);

		
		
		try {
	
					
		    System.out.print("첫번째 정수 입력 => "); // 10엔터 똘똘이 엔터
			int num1 = Integer.parseInt(sc.nextLine());
		
			System.out.print("두번째 정수 입력 => "); // 10엔터 똘똘이 엔터
			int num2 = Integer.parseInt(sc.nextLine());
			// str_num2 문자열 (String)을 int 타입으로 형변환 시켜주는 static 메소드이다.
		    
			
			
			
			
			
			/// === 사칙연산이 나올때 까지 계속 출력하기 === //
			
	    	
			// 무한반복을 통해서 연산자가 나올 때 까지 무한반복을 해준다. 그렇다면 브레이크는 언제 걸어줘야하는가?
			// operator가 지역변수로 오류가 나기 때문에, 밖으로 빼줘야한다. (52번줄)
			// 그 후 String result = ""; 줄이 도달 불가로 오류가 나기 때문에 브레이크를 걸어줘야한다. (if문 아래에)
			
		String operator = "";
		for(;;) {
			System.out.print("사칙연산자 선택(+ - * /) => "); // +엔터  -엔터  *엔터 /엔터
			operator = sc.nextLine();
			
			if("+".equals(operator) || "-".equals(operator) ||"%".equals(operator) || "/".equals(operator) )					
					break;  // 연산자가 입력이 될 경우에 "사칙연산자 선택(+ - * /) => "의 출력을 멈춘다. 그리고 아래로 내려간다.
			
			else
				System.out.println(">> 사칙연산 (+ - * /)만 선택하세요!! <<");
			
			} // end of for----------------------------------------------

			
		
		
			
			String result = "";   
			
			if("+".equals(operator)  ) {  //null 일수도 있기 때문에 if(operator.equals("+")  )는 쓰지 않는다
				 result =  String.valueOf(num1 + num2) ;
			}  //String 타입으로 변환
			
			
			else if("-".equals(operator)  ) {  
				 result = String.valueOf(num1 - num2) ;
			}
			else if("*".equals(operator)  ) {  
				 result = String.valueOf(num1 * num2) ;
			}
			else if("/".equals(operator)  ) {  

			if(num2 == 0)
				result = "분모에는 0이 올 수 없습니다.";
			  else
				result = String.valueOf((double)num1 / num2);     
			}
			
		
			// 그렇기에 이 부분도 빼준다. 어짜피 위에서 다 끝나면 프로그램이 끝나기 때문.
			
//			else {
//				System.out.println(">> 사칙연산 (+ - * /)만 선택하세요!! <<"); // 그냥 엔터나 공백의 경우
//			
//				
//				sc.close();
//				return;
			//}
			
			// 삼항연산자를 통해서 
			result =("/".equals(operator) && num2==0)? result :  num1 + operator + num2 + "=" + result;  
			// 나누셈의 분모는 0이 될 수 없다
			
				 
			System.out.println(result);
			
			
		} catch(NumberFormatException e) {
		
			System.out.println(">>> 정수만 입력하세요!! <<<");
		
			sc.nextLine();

		}
		


    sc.close();
		
		
		
	} // end of main(String[] args)------------

}
