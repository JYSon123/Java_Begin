package my.day02.dataType;

public class sungjuk {
	
	/*
	   === *** 자료형 *** ===
	
	       ※ 자료형의 종류
	
	   1. 원시형 타입(Primitive Type)
	
	   1.1  정수형(byte, short, int, long)
	    -- 자바에서 정수형의 기본타입은 int 이다.
	    -- 그러므로 정수형의 값이 -2,147,483,648 ~ 2,147,483,647 범위를 벗어난 것이라면 반드시 숫자뒤에 소문자 l 또는 대문자  L 을 붙여야 한다.  
	            
	      byte (1byte == 8bit)  : -2^7  ~ 2^7-1  ==> -128 ~ 127 
	      short(2byte == 16bit) : -2^15 ~ 2^15-1 ==> -32,768 ~ 32,767
	      int  (4byte == 32bit) : -2^31 ~ 2^31-1 ==> -2,147,483,648 ~ 2,147,483,647  
	      long (8byte == 64bit) : -2^63 ~ 2^63-1 ==> -9,223,372,036,854,775,808 ~  9,223,372,036,854,775,807         
	            
	   
	   1.2 실수형(float, double) 
	       float(4byte)  : 단정밀도   소수점이하 7자리까지 표현됨.   135.3246235
	       double(8byte) : 배정밀도   소수점이하 15~16자리까지 표현됨. 135.3246234502345642
	    -- 자바에서 실수형의 기본타입은 double 이다. 
	              그러므로 실수값을 float 형태로 나타내기 위해서는 실수뒤에 반드시 소문자 f 또는 대문자 F를 붙여야 한다. 
	            
	        
	   1.3 문자형(char)
	      char : 자바는 유니코드 체계를 사용하므로
	                          문자형 타입인 char 는 2byte 이며, 범위는 0 ~ 65535 이다.
	                          그래서 char 타입에는 문자 1개 또는 숫자(0~65535)도 올 수 있다.              
	                               
	           UNICODE 표 참조 
	           http://www.tamasoft.co.jp/en/general-info/unicode.html                     
	        
	        === !!! 꼭 기억합시다 !!! ===
	        int(4byte) 아래의 크기인  byte(1byte), short(2byte), char(2byte) 타입이 
	                사칙연산(+ - * /)을 만나면 자동적으로 int 타입으로 자동 형변환이 발생된다.
	        
	        'A' => 65     'a' => 97
	        'B' => 66     'b' => 98
	        'C' => 67     'c' => 99
	        
	        '대문자' + 32 => 소문자에 해당하는 숫자
	        '소문자' - 32 => 대문자에 해당하는 숫자
	        
	        '0' => 48
	        '1' => 49
	        '2' => 50
	        '9' => 57
	        ' ' => 32
	        
	        
	   1.4 참(true) 또는 거짓(false)을 담아주는 boolean 타입 
	   -- 크기가 1byte 이다.
	       
	        
	    ==============================================================================================
	        
	           
	   2. 참조형 타입(Reference Type)
	      --> 클래스 객체(==object ==instance) 타입   
	      --> 메모리상에 저장되어진 객체의 메모리 주소를 참조하는 것이다.
	      --> 참조형 타입(Reference Type) 메모리상에 크기는 4byte 를 차지한다.  
	
	
	
	           
	 */
	   
	   // === 속성, property, attribute, field === 
	   
	 /*   
	   ※ === 변수의 명명규칙 ===
	    1. 변수명의 길이에는 제한이 없다. 
	    2. 대,소문자 구분이 있다.
	    3. 첫글자가 숫자는 안된다. 
	    4. 특수문자는 '_' 와 '$' 만 사용이 가능하다.
	    5. 예약어(예 package, import, public, class, String, int, float ....)는 변수명으로 사용불가하다.  
	    6.<권장사항이지 규칙은 아니다> 첫글자는 소문자로 시작하고 단어와 단어가 결합된 경우이라면 두번째 단어는 대문자로 시작하는것이 일반적이다.
	 */
	

	String hakbun; // null 학번 12345 20191234 
	String name;   // null 학생명 String2
	byte kor;    // 0  국어 (0~100) 숫자(정수) -128 ~ 127
	byte eng;    // 0  영어 (0~100) 숫자(정수) -128 ~ 127
	byte math;   // 0  수학 (0~100) 숫자(정수) -128 ~ 127
	char hakjum; // ' ' 32 (디폴트값 공백)  학점 'A' 'B' 'C' 'D' 'F'
	
	
	
	
	
	// ======= static에 대해서(공유변수) ======
	
	
	// static viod  aaa() {  // 여기는 인스턴스 변수를 못넣는다. static은 변수 없이 쓰는것이기 때문
		
		//int a = kor;  // kor에 빨간줄이 그어지는 이유는 인스턴스 변수이기 때문이기 때문이다. 쓰고 싶다면 static byte kor;을 사용해야함
		
		
		//static 변수는 지역변수나, static 변수만 들어온다.
		
	
	
	
	
	
	

	 // === 기능, 행위, behavior, method ===
	
	void showSungjuk() {  // static을 넣지 않는 이유는 인스턴스 변수가 존재하고 있기 떄문. 그래서 오류가 뜬다.
		
	short total = (short)(kor + eng + math); // 0 ~ 300
	// 자바에서 그 데이터 타입이 byte 또는 short 또는 char 인 변수가 사칙연산(+ - * /)을 만나면 
    // 자동적으로 그 변수의 데이터 타입은 int 로 변하게 되어있다.!!!!
    // kor + eng + math ==> 자동적으로 int 타입으로 형변환(casting)됨.
    // (short)(kor + eng + math) ==> 강제 형변환(casting)
	
	float avg1 = (float)(total/3.0);
	float avg2 = total/3.0f;
	double avg3 = total/3.0; 
	
	
	int money = 0;  // money가 지역변수로 쓰이지 않게 밖으로 꺼내주는게 중요함
	
	
	if (avg1 >= 90) {
		money = 1000000;
	}
	
	
	else if(avg1 >= 80) {
		money = 600000;
	}
	
	


	
	
	
	if(avg2 >= 90) {
		hakjum = 'A';  // char 타입이기 때문에 쌍따옴표는 쓰지 않는다
	}
			
	else if(avg2 >= 80) {
		hakjum = 'B';
		
	}
	
	else if(avg2 >= 70) {
		hakjum = 'C';
	
	}
	
	else if(avg2 >= 60) {
		hakjum = 'D';
	
	}
	
	else {
		hakjum = 'F';
	}
	

	
	System.out.println("=== 성적결과 === \n"
			           + "1.  학번 :" + hakbun +"\n"
			           + "2.  성명 :" + name +"\n"
			           + "3.  국어 :" + kor +"\n"
			           + "4.  영어 :" + eng +"\n"
			           + "5.  수학 :" + math +"\n"
			           + "6.  총점 :" + total +"\n"
			           + "7.  평균1 :" + avg1 +"\n"
			           + "8.  평균2 :" + avg2 +"\n"
			           + "9.  평균3 :" + avg3 +"\n"
			           + "10. 장학금 : " + money +"원\n"
			           + "11. 학점 : " + hakjum +"\n"
		           );
	
	
	
	
	
 } // end of void showSungjuk
	
	
}
	
	
