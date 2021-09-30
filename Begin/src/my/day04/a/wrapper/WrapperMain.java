package my.day04.a.wrapper;

import java.util.Scanner;

/*
	=== *** wrapper 클래스 *** ===
	
	------------------------------------------------
	  기본자료형(원시형, primitive)       wrapper 클래스
	------------------------------------------------
	 byte                           Byte 
	 short                          Short
	 int                            Integer  
	 long                           Long
	 char                           Character
	 float                          Float
	 double                         Double
	 boolean                        Boolean 
	 ------------------------------------------------
	 
	  기본자료형(원시형)은 데이터 저장 및 4칙연산 에서만 사용하는 것이고, 
	 wrapper 클래스는  데이터 저장 및 4칙연산 뿐만아니라 
	  아주 다양한 기능의 메소드가 제공되므로 다방면으로 사용되어진다. 
*/


public class WrapperMain {

	public static void main(String[] args) {
		
		char ch = 'a';
	    System.out.println("ch => " + ch); // ch => a
	    System.out.println(ch+1); // (int)ch + 1 => 97+1 => 98
	    System.out.println((char)(ch-32));
	    // (ch-32) ==> (int)(ch - 32) = 97-32 = (char)65 ==> A
	    
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    
	    Character chr = new Character('a'); 
	    System.out.println("ch => " + chr);  // chr => a
	    System.out.println(chr+1);           // 98
	    System.out.println((char)(chr-32));  //A
	    System.out.println((char)('a'-32));  //A
	    System.out.println(Character.toUpperCase('a') ); // A  소문자를 대문자로 바꿔준다.
	    System.out.println(Character.toLowerCase('A'));  // a  대문자를 소문자로 바꿔준다.
	    System.out.println(Character.toUpperCase(97));   // 65  
	    System.out.println(Character.toLowerCase(65));   // 97
	    
	    
	    
	    char ch2 = '3'; // 67
	    
	    if( 65 <= ch2 && ch2 <= 90 ) { //대문자인지 알아본다.
	  	// char 타입은 비교연산자( ==  !=  >  <  >=  <= )를 만나면 자동적으로 int 타입으로 형변환 되어진다.   
	    	System.out.println(ch2+"는 대문자 입니다.");
	    }
	    
	    else if( 97 <= ch2 && ch2 <= 122 ) { //소문자인지 알아본다.
		   	System.out.println(ch2+"는 소문자 입니다.");
	    }
	    else if( 48 <= ch2 && ch2 <= 57 ) { //숫자인지 알아본다.
		   	System.out.println(ch2+"는 숫자 입니다.");
	    }
	    
	    else {
		   	System.out.println(ch2+"는 기타문자 입니다.");
	    }
		    	
	    
	    
	    
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    
	    
	    
	    
	    if(Character.isUpperCase(ch2)  ) { //대문자인지 알아보는것.
	  		System.out.println(ch2+"는 대문자 입니다.");
		    }
		    
		    else if(Character.isLowerCase(ch2) ) { //소문자인지 알아본다.
			   	System.out.println(ch2+"는 소문자 입니다.");
		    }
		    else if(Character.isDigit(ch2) ) { //숫자인지 알아본다.
			   	System.out.println(ch2+"는 숫자 입니다.");
		    }
		    else {
			   	System.out.println(ch2+"는 기타문자 입니다.");
		    }
		    	
		    	
	    
	    ///////////////////////////////////////////////////////////
	    
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    
	    String str ="Baby";
	    char ch1 = str.charAt(0); //'b'  charAt = 문자열의 위치값을 통해서 문자를 출력한다.
	    System.out.println(ch1);
	    
	    ch1 = str.charAt(3); // 'y'
	    System.out.println(ch1); //'y'
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("글자를 입력하세요 => "); // "Baby"
	    									   // "baby"	
		                                       // "7boy"
	                                           // "$boy"
	   
	    
	    
	    
	    ch1 = sc.nextLine().charAt(0);
	    
		 
		    if(Character.isUpperCase(ch1)  ) { //대문자인지 알아본다.
		  		System.out.println("첫글자인 " +ch1+"는 대문자 입니다.");
		    }
		    else if(Character.isLowerCase(ch1) ) { //소문자인지 알아본다.
			   	System.out.println("첫글자인 " +ch1+"는 소문자 입니다.");
		    }
		    else if(Character.isDigit(ch1) ) { //숫자인지 알아본다.
			   	System.out.println("첫글자인 " +ch1+"는 숫자 입니다.");
		    }
		    else {
			   	System.out.println("첫글자인 " +ch1+"는 기타문자 입니다.");
		    }
		    	
	    
	   
	    // 첫글자인 B는 대문자 입니다.
	    // 첫글자인 b는 소문자 입니다.
	    // 첫글자인 7은 소문자 입니다.
	   
	   
	    System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	    
	    System.out.println("=== 오토박싱, 오토언박싱 에 대해서 알아봅니다. ===");
	    
	      // Boxing(박싱, 포장을 하는것) 이란 ?
	      // ==> 기본자료형(boolean, byte, short, int, long, char, float, double)으로 되어진 변수를 
	      //     객체타입인 Wrapper 클래스(Boolean, Byte, Short, Integer, Long, Character, Float, Double)   
	      //     타입의 객체로 만들어주는 것을 말한다.
	     int a1 = 10;
	     Integer a2 = new Integer(a1);  // Boxing(박싱, 포장을 하는것), 수동적인
	     System.out.println("a2 => " + a2); // a2 => 10
	     
	     int b1 = 10;
	     Integer b2 = b1;  // Auto Boxing(박싱, 포장을 하는것), 수동적인
	     System.out.println("b2 => " + b2); // b2 = 10

	    
	      // UnBoxing(언박싱, 포장을 푸는것) 이란?   
	      // ==> Wrapper 클래스(Boolean, Byte, Short, Integer, Long, Character, Float, Double)로 
	      //     되어져 있는 객체를 기본자료형(boolean, byte, short, int, long, char, float, double)으로 
	      //     만들어주는 것을 말한다.

	   Integer a3 = new Integer(20);
	   int a4 = a3.intValue(); // UnBoxing(언박싱, 포장을 푸는것)
	   System.out.println("a4 => " + a4); // a4 => 20
	   
	   int a5 = new Integer(20); // UnBoxing(언박싱, 포장을 푸는것)
	   System.out.println("a5 => " + a5); // a5 => 20
	   
	   Double db1 = new Double(1.234567);
	   double db2 = db1.doubleValue(); 
	   System.out.println("db2 => " + db2); // db2 => 1.234567
	   
	   double db3 = new Double(1.234567);
	   System.out.println("db3 => " + db3); //db2 => 1.234567
	   
	   
	   
	    sc.close();

	}// end of main(String[] args)

}
