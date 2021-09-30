package my.day03.d.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner2Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 => ");
		
		
		
		try {
			
			int inputNum = sc.nextInt(); //123
			 							 // 안녕하세요
										 // 23454534524324523435534234	
			
			sc.nextLine();
			
			
			System.out.println("입력한 정수: " + inputNum);
		} catch (InputMismatchException e) {
			System.out.println(" >>> int 범위에 맞는 정수만 입력하세요 !! <<<");	 // 안녕하세요
			
			
			e.printStackTrace();
			
		}
		

		
		sc.close();
		
	}// end of (String[] args)

}
