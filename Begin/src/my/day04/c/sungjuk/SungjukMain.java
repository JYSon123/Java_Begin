package my.day04.c.sungjuk;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SungjukMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Sungjuk sj = new Sungjuk(); // 기본생성자
		
		
		int inputType = 0;
		
		
		try {
		
			System.out.print("1. 학번 : ");
			sj.hakbun = sc.nextLine(); // "091234"
			
			System.out.print("2. 성명 : ");
			sj.name = sc.nextLine(); //"이순신"
		
			
			inputType = 1;  // inputType 값이 1 이라면 국어, 영어, 수학을 입력하는 중이다 라고 본다.
			
			
				
			System.out.print("3. 국어 : ");
			byte kor = Byte.parseByte(sc.nextLine());
			// "90"  ==> 90 
			// nextLine()이 문자열 타입이기 때문에 숫자열로 바꿔줘야함
			// Byte.parseByte() 를 통해서 바꿔준다.
			// byte 타입으로 변경을 할 수 없는 "200"이나 "똘똘이"를 입력해주면
			// NumberFormatException 익셉션(오류) 발생된다.
			
			
			
	    	/*/// 첫번째 방법 (1점~100점 사이로 하기)
		  * boolean bool = sj.checkJumsu(kor);
			// kor 값이 0 ~ 100 이라면 true
			// kor 값이 0 미만 또는 100보다 크다라면 false
			
			
			if(!bool) {
				sc.close(); // 스캐너를 닫아주고 끝내지 않으면, 메모리 누수가 뜸
				return; 
				// main()메소드내에서  return; 은  main()메소드에서 작업중인 것을 종료해라는 말이다. 
	            // 즉, 프로그램을 종료해라는 말이다.
				
			} */
			
			
				
		
			// 두번째 방법  (1점~100점 사이로 하기)
			if(!sj.checkJumsu(kor)) {
				sc.close(); // 스캐너를 닫아주고 끝내지 않으면, 메모리 누수가 뜸
				return; 
				// main()메소드내에서  return; 은  main()메소드에서 작업중인 것을 종료해라는 말이다. 
	            // 즉, 프로그램을 종료해라는 말이다.
			}
			
			else {
				sj.kor = kor;
			}
			
			
			
			
			System.out.print("4. 영어 : ");
			byte eng = Byte.parseByte(sc.nextLine());
			
			
			if(!sj.checkJumsu(eng)) {
				sc.close(); // 스캐너를 닫아주고 끝내지 않으면, 메모리 누수가 뜸
				return; 
				// main()메소드내에서  return; 은  main()메소드에서 작업중인 것을 종료해라는 말이다. 
	            // 즉, 프로그램을 종료해라는 말이다.
			}
			
			else {
				sj.eng = eng;
			}
			
			
			
			
			
			
			System.out.print("5. 수학 : ");
			byte math = Byte.parseByte(sc.nextLine());
			
			
			if(!sj.checkJumsu(math)) {
				sc.close(); 
				return; 
				
			}
			
			else {
				sj.math = math;
			}
			
			
			
			inputType = 2; // inputType 값이 2 이라면 나이를 입력하는 중이다 라고 본다.
			
			System.out.print("6. 나이 : ");
			short age = Short.parseShort(sc.nextLine());  
					// "25"
			        // "10" 또는 "60" 
			
		
			
			if(!sj.checkAge(age)) {
				sc.close(); // 스캐너를 닫아주고 끝내지 않으면, 메모리 누수가 뜸
				return; 
				// main()메소드내에서  return; 은  main()메소드에서 작업중인 것을 종료해라는 말이다. 
	            // 즉, 프로그램을 종료해라는 말이다.
			}
			
			else {
				sj.age = age;
			
			}
			
			
			sj.showInfo();
			
			/*
	          === 이순신님의 성적결과 ===
	          1. 학번 : 091234
	          2. 성명 : 이순신
	          3. 국어: 90
	          4. 영어: 80
	          5. 수학: 78
	          6. 총점: 248
	          7. 평균: 82.666664  ==> 82.7
	          8. 학점: B 
	          9. 나이: 20세    
	       */
					
			

			
			
			
		} catch(NumberFormatException e) {
			if(inputType ==1) {
			System.out.println(">> == 점수 입력은 0 이상 100 까지만 가능합니다. == <<");
			}
			
			else if(inputType ==2) {
			System.out.println(">> == 나이 입력은 20 이상 50 까지만 가능합니다. == <<");
			}
			
		}
			
		
		
		sc.close();
		
		
	}// end of main(String[] args)-----------------------------

}
