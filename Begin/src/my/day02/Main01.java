package my.day02;

//  === 지역변수, instance 변수의 차이점에 대해서 알아본다. === //

public class Main01 {

	String id; // String 은 문자열 타입
	String pwd; 
	String name;
	String email;
	int age; // int 는 정수형 타입
	double height;
		
	/*
	    멤버변수 => instance 변수 와 static 변수를 합친것을 멤버변수라고 부른다.
	  instance 변수 및 static 변수는 초기화를 하지 않더라도 자동적으로 초기화가 되어진다.
	    정수형인 데이터타입(byte, short, int, long)은 자동적으로 0 으로 초기화가 되고,
	    실수형인 데이터타입(float, double)은 자동적으로 0.0 으로 초기화가 되고, 
	    문자형인 데이터타입(char)는 자동적으로 ' ' 으로 초기화가 되고,
	  String 을 포함한 클래스 타입은 자동적으로 null 로 초기화가 된다.
	*/
	
	void showInfo1() {
		// 지역변수는 { } 내에서만 사용되는 것으로 { } 을 벗어나는 순간 
		// 지역변수는 자동적으로 메모리(RAM)에서 삭제가 되어진다.
		// 중요한 것은 지역변수는 반드시 초기화(== 값을 부여하는것)를 해주어야 한다.!!! 
		
		int hopeMoney = 5000;
		String shopeMoney = "오천만원";
		
		System.out.println("=== 회원정보[showInfo1()] === \n"
				         + "1. 아이디 : " + id + "\n"
				         + "2. 암호 : " + pwd + "\n"
				         + "3. 성명 : " + name + "\n"
				         + "4. 이메일 : " + email + "\n"
				         + "5. 나이 : " + age + "세 \n"
				         + "6. 신장 : " + height + "cm \n"
				         + "7. 희망급여 : " + hopeMoney + "\n"
				         + "8. 희망연봉 : " + shopeMoney + "\n"
				        );
		
		// 문자열 과 문자열 사이의 + 는 문자열결합을 뜻하는 것이고,
		// 숫자 와 숫자 사이의 + 는 더하기(plus)를 뜻하는 것이고,
		// 문자열 과 숫자 사이의 + 는 문자열결합을 뜻하는 것이다.
		
		// "안녕하세요" + " 반갑습니다" ==> "안녕하세요 반갑습니다"
		// "안녕하세요" + 25 ==> "안녕하세요25"
		// 20 + 30 ==> 50 
		// "20" + 30 ==> "2030"
		// 20 + 30 + "안녕" ==> 50 + "안녕" ==> "50안녕"
		
	}
	
	
	String showInfo2() {
		// 지역변수는 { } 내에서만 사용되는 것으로 { } 을 벗어나는 순간 
		// 지역변수는 자동적으로 메모리(RAM)에서 삭제가 되어진다.
		// 중요한 것은 지역변수는 반드시 초기화(== 값을 부여하는것)를 해주어야 한다.!!! 
		
		int hopeMoney = 6000;
		String shopeMoney = "육천만원";
				
		return "=== 회원정보[showInfo2()] === \n"
		         + "1. 아이디 : " + id + "\n"
		         + "2. 암호 : " + pwd + "\n"
		         + "3. 성명 : " + name + "\n"
		         + "4. 이메일 : " + email + "\n"
		         + "5. 나이 : " + age + "세\n"
		         + "6. 신장 : " + height + "cm\n"
		         + "7. 희망급여 : " + hopeMoney + "\n"
		         + "8. 희망연봉 : " + shopeMoney + "\n";
	}
	
	
	public static void main(String[] args) {
		
		Main01 ma1 = new Main01(); // 인스턴스화(== 객체생성)
		
		ma1.id = "leess";
		ma1.pwd = "qwer1234";
		ma1.name = "이순신";
	    ma1.email = "leess@naver.com";
	    ma1.age = 25;
	    ma1.height = 183.5;
	    
	    ma1.showInfo1();
	    /*
	     === 회원정보[showInfo1()] === 
		 1. 아이디 : leess
		 2. 암호 : qwer1234
		 3. 성명 : 이순신
		 4. 이메일 : leess@naver.com
		 5. 나이 : 25세 
		 6. 신장 : 183.5cm 
		 7. 희망급여 : 5000
		 8. 희망연봉 : 오천만원
 	    */
	    
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	    
	    String info2 = ma1.showInfo2();
	    
	    System.out.println(info2);
	    /*
	     === 회원정보[showInfo2()] === 
		 1. 아이디 : leess
		 2. 암호 : qwer1234
		 3. 성명 : 이순신
		 4. 이메일 : leess@naver.com
		 5. 나이 : 25세
		 6. 신장 : 183.5cm
		 7. 희망급여 : 6000
		 8. 희망연봉 : 육천만원
	    */
	    
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	    
	    Main01 ma2 = new Main01(); // 인스턴스화(== 객체생성)
	    
	    ma2.showInfo1();
	  /*
	    === 회원정보[showInfo1()] === 
		1. 아이디 : null
		2. 암호 : null
		3. 성명 : null
		4. 이메일 : null
		5. 나이 : 0세 
		6. 신장 : 0.0cm 
		7. 희망급여 : 5000
		8. 희망연봉 : 오천만원   
	  */
	    
	}// end of main(String[] args)------------------------

}
