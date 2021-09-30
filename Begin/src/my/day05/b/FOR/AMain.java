package my.day05.b.FOR;

import java.util.Scanner;

public class AMain {

	public static void main(String[] args) {
		
		//이곳이 실행을 시켜줄 메인이다.
		
		
		Scanner sc = new Scanner(System.in);  //스캐너를 호출해주고
		
		Member mbr = new Member();  // 멤버 객체를 만들어주고
		
		mbr.register(sc); //회원가입을 하게 해주는 메소드이다.

		System.out.println(">> 프로그램 종료 <<");  //프로그램을 종료할 경우
		sc.close();   //스캐너를 닫아준다
		
		
		
		
		
	} // end of main(String[] args)-------------
	
	
}
