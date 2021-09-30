package my.day03.d.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner4Main {

	public static void main(String[] args) {
		
		System.out.println("=== 숫자를 문자열로 형변화 시키기 ===");
		
		Scanner sc = new Scanner(System.in);
		
		
			
		try {
			System.out.print("첫번째 정수를 입력하세요 => ");
			int num1 = sc.nextInt(); // 10
			sc.nextLine(); //비워주는 역할
			
			System.out.print("두번째 정수를 입력하세요 => ");
			int num2 = sc.nextInt(); //20
			sc.nextLine(); //비워주는 역할
			
			// 정수를 문자열로 바꾸는 첫번째 방법
			String str_num1 = Integer.toString(num1);
		
			// 정수를 문자열로 바꾸는 두번째 방법
			String str_num2 = String.valueOf(num2);
			
			
			System.out.println(str_num1+str_num2); //1020
	
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			
			
			System.out.print("첫번째 실수를 입력하세요 => ");
			double db1 = sc.nextDouble();
			sc.nextLine(); //비워주는 역할
			
			System.out.print("두번째 정수를 입력하세요 => ");
			double db2 = sc.nextDouble();
			sc.nextLine(); //비워주는 역할
			
			// 실수를 문자열로 바꾸는 첫번째 방법
			String str_db1 = Double.toString(db1);
		
			// 실수를 문자열로 바꾸는 두번째 방법
			String str_db2 = String.valueOf(db2);
			
			System.out.println(str_db1+str_db2); //"10.520.4"
		
		
		} catch(InputMismatchException e) {
			System.out.println(">>> 입력하신 내용은 올바른 숫자가 아닙니다. <<<");
			e.printStackTrace(); // 오류인 줄을 찍어주고 싶다면
		}
		
		sc.close();
		
	} // end of  main(String[] args) -----------------------------

}
