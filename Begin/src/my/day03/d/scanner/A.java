package my.day03.d.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
	
		
		

		Scanner A = new Scanner(System.in);
		
		System.out.print("대머리는 과연 누구인가? : ");
		
		
		
		String demori = A.nextLine();
		
		
		
		System.out.println("대머리는" + "\"" + demori + "\"" + "이다!");
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		try {
		
		System.out.print(demori + "의 남은 머리카락 갯수는?");
		int mobal = A.nextInt();
		System.out.println(demori +"의 머리카락 갯수는 " + mobal + "개 이다!");
		A.nextLine();
		
		} catch(InputMismatchException e) {
			System.out.println(">>> 오로지 숫자만 입력해주세요! <<<");
			
		}
		
		
		
		
		
		
		
		
		
		
		A.close();
		

	}

}
