package my.day05.a.SWITCH;

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

		public class SwitchMain {
		
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);

		
		
		try {
	
					
		    System.out.print("첫번째 정수 입력 => "); // 10엔터 똘똘이 엔터
			int num1 = Integer.parseInt(sc.nextLine());
		
			System.out.print("두번째 정수 입력 => "); // 10엔터 똘똘이 엔터
			int num2 = Integer.parseInt(sc.nextLine());
			// str_num2 문자열 (String)을 int 타입으로 형변환 시켜주는 static 메소드이다.
		
			
			System.out.print("사칙연산자 선택(+ - * /) => "); // +엔터  -엔터  *엔터 /엔터
			String operator = sc.nextLine();
			
			String result = "";   
			
			
			
		/*	
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
			
			
			
			else {
				System.out.println(">> 사칙연산 (+ - * /)만 선택하세요!! <<"); // 그냥 엔터나 공백의 경우
			
				
				sc.close();
				return;
			}
			
			*/
			
			// === switch 문 === //
			switch (operator) { 
			case "+": // operator 값이 "+"와 같다라면
				result =  String.valueOf(num1 + num2) ;
				break; //  switch (operator) {} 부분을 빠져나가라는 말이다.

				
			case "-": // operator 값이 "-"와 같다라면
				result =  String.valueOf(num1 - num2) ;
				break; //  switch (operator) {}
				
				
			case "*": // operator 값이 "*"와 같다라면
				result =  String.valueOf(num1 * num2) ;
				break; //  switch (operator) {}
				
				
			case "/": // operator 값이 "/"와 같다라면
				
				if(num2 == 0)
					result = "분모에는 0이 올 수 없습니다.";
				
				else
				result =  String.valueOf((double)num1 / num2) ;
				break; //  switch (operator) {}
				
				
			
			default: // operator 값이 "+" 도 아니고 "-" 도 아니고 "*" 도 아니고 "/" 도 아닌 것이라면 
				System.out.println(">> 사칙연산 (+ - * /)만 선택하세요!! <<"); // 그냥 엔터나 공백의 경우
				sc.close();
				
				
				return;
				 // break; 있었지만, 도달할 수 없는 코드기 때문에 버려준다.
				
				
				
				
				
			} // end of switch (operator) {} -------------
			
			
			
			
			// 삼항연산자를 통해서 
			result =("/".equals(operator) && num2==0)? result :  num1 + operator + num2 + "=" + result;  
			// 나누셈의 분모는 0이 될 수 없다
			
				 
			System.out.println(result);
			
			
		} catch(NumberFormatException e) {
		
			System.out.println(">>> 정수만 입력하세요!! <<<");
		
			sc.nextLine();

		}
		


		sc.close();
			

		
		
	}

}
