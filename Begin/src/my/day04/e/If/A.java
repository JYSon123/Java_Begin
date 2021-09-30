package my.day04.e.If;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String result = "";
		outer:
		try{
		do {
			System.out.println("첫번째 정수 입력 => ");
			int num1 = Integer.parseInt(sc.nextLine());
			
			System.out.println("두번째 정수 입력 => ");
			int num2 = Integer.parseInt(sc.nextLine());
			
			System.out.println("사칙연산자 선택 => ");
			String operator = sc.nextLine();
			
			
			
			if("+".equals(operator)) {
				result = String.valueOf(num1 + num2);
			}
			else if("-".equals(operator)) {
				result = String.valueOf(num1 - num2) ;
			}
			else if("*".equals(operator)) {
				result = String.valueOf(num1 - num2);
			}
			else if("/".equals(operator)){ 
				if(num2 ==0)
					result = "분모는 0이 될 수 없습니다.";
				
				else
				result = String.valueOf((int)num1 / num2);
			}
			
			
			else {
				System.out.println(">> 사칙연산은 +, -, *, /만 선택하세요!");
				sc.close();
				break;
			}
			
			
		}while(true);
			
			System.out.println(result);
			
		}catch (NumberFormatException e) {
			System.out.println("오로지 정수만 입력해주세요!");
			 break outer;
		}
		
		
		sc.close();
		
	}// end of public static void main(String[] args)------

}
