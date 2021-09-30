package my.day05.b.FOR;

import java.util.Scanner;

public class Member7Main {

	public static void main(String[] args) {
		
		/// 회원가입시 비밀번호등 짜기 ///
		
		
		Scanner sc = new Scanner(System.in);
		
		
		Member mbr = new Member();
		
		mbr.register(sc); //회원가입을 하게 해주는 메소드
		
	
		
//		// length를 통해서 패스워드의 길이를 바로 파악을 할 수 있다.
//		String str1 = "abC123$";
//		String str2 = "abC123sdad$";
//		System.out.println("abC123$! 의 길이: " + str1.length());
//		System.out.println("abC123sdad$ 의 길이: " + str2.length()); 
		
		
		
		System.out.println(">>> 프로그램 종료 <<<");
		sc.close();

		
		

	}// end of main(String[] args)

}
