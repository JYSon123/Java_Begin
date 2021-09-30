package my.day03.b.casting;


	//=== casting 연산자에 대해서 알아본다. ===

	/*
	  === 데이터형 변환하기 ===
	  1. 자동 형변환(묵시적 형변환)
	  --> 데이터타입의 크기가 작은 것에서 크기가 큰쪽으로는 자동적으로 형변환이 발생된다. 

	   byte(1byte) --> short(2byte) --> int(4byte) --> long(8byte)
	               개미                       병아리                      강아지                    사람   
	              개미집                    병아리집                   강아지집                   안방
	   
	   float(4byte) --> double(8byte) 
	   
	   --> 정수타입은 실수타입으로 자동형변환이 발생한다.
	   
	   char(2byte)
	   --> char타입은 int형으로 자동형변환이 발생한다.


	  2. 강제 형변환(casting)
	  --> 데이터타입의 크기가 큰것을 작은것으로 강제적으로 형변환 시키는 것을 말한다.
	               크기가 큰타입 = (크기가 작은타입)크기가 큰타입
	               
	               
	           정수 = (정수)실수  
	           실수를 정수로 강제적으로 형변환하는 것을 말한다.
	           소수부는 무조건 절삭을 해버리고 정수만 나온다.
	                  
	 
	*/
public class CastingMain {

	public static void main(String[] args) {
		
		byte no1 = 100;
		System.out.println("no1 =>" + no1);
		// no1 => 100
		
		short no2 = 20000;
		System.out.println("no2 => " + no2);
		// no2 = 20000
		
		short no3 = no1; // 자동형변환
		
		//// byte 타입인 no1 을 자동적으로 short 타입으로 형변환이 되어 no3에 대입해준다.
		System.out.println("no3 =>" + no3);
		// no3 => 100
		
		
		System.out.println("\n ~~~~~ 강제형변환 ~~~~~\n");
		
		int no4 = 300;
		short no5 = (short)no4; // 강제형변환. 이때 ()를 casting 연산자 라고 부른다.
		System.out.println("no5 =>" + no5);
		// no5 => 300
		
		float ft1 = 1.234567F; // 기본 타입이 doble이기 때문에 끝에 F를 붙여서 강제형변환을 시켜준다.
		System.out.println("ft1 => " + ft1);
		// ft1 => 1.234567
		
		
		double db1 = ft1; // 자동형변환
		// float 타입인 ft1 을 자동적으로 double 타입으로 형변환이 되어 db1에 대입해준다.
		System.out.println("db1 =>" + db1);
		// db1 =>1.2345670461654663
			
			
		double db2 = 1.234567890123;
		float ft2 = (float)db2; //강제형변환
		System.out.println("ft2 =>" + ft2);
		// ft2 =>1.2345679
			
		
		float ft3 = 1.098767F; // float 4byte
		int n = (int)ft3;   // int 4byte
		System.out.println("n => " + n);
		// n =>1
		
		long ln = (long)ft3; // long 8byte
		System.out.println("ln => " + ln);
		// ln => 1

	}

}
