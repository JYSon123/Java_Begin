package my.day01;

public class Member {

/*
   만약에 쇼핑몰 프로그램을 작성하고자 한다라면
   회원, 제품, 장바구니, 주문내역 등등 여러가지 부품이 필요할 것이다.
   여기서 필요로 하는 부품의 설계도면을 "클래스"라고 보면 된다. 
   이러한 "클래스" 들이 실행되기 위해서 메모리(RAM)에 로딩된 상태를 object(객체)라고 부른다.
   또한 메모리(RAM)에 로딩된 상태를 object(객체)를 instance(인스턴스)라고도 부른다.
*/
	
	
	// 객체 지향[중심] 프로그래밍(Object Oriented programming) //
	/*
	   == OOP(Object Oriented programming)의 4가지 특징
 	   == > 상추캡다  <== 
	   1. 추상화 : 필요한 속성 및 기능만 뽑아내는 것을 말한다.
	   2. 상속 : 
	   3. 캡슐화
	   4. 다형성
	 
	 
	   >> 추상화에 대해서 알아봅니다. << 
	      회원가입(병원)   ==> 신장, 몸무게, 혈액형, 혈압등  
	      회원가입(쇼핑몰)  ==> 아이디, 비밀번호, 성명, 이메일, 전화번호, 주소, 마일리지(포인트)
	      이런식으로 필요한것만 뽑는것
	      회원가입시 필요한 항목들을  field == attribute == property == 속성 이라고 부른다.
	
	 */
	
	
  // 1). instance(인스턴스)변수 
  //  instance(인스턴스)변수를 다른말로 non static 변수라고도 한다.
  //  instance(인스턴스)변수는 서로 다른 instance 끼리 공유하지 못하고 각자 자기의 instance 내에서만 사용하는 것이다.   
  //  instance 는 클래스가 메모리(RAM)에 올라가서 실제 사용가능한 객체로 되어진 상태를 말한다.
	
	
	
	
	String id;    // String 은 문자열을 뜻하는 클래스(자료형)이다.
	              // id 라는 변수(변하는 수)에는 문자열이 들어온다는 뜻이다.
	
	String pwd;   // 비밀번호 
	String name;  // 성명
	String email; // 이메일
	
	// id, pwd, name, email 은 공유할 수 없는 변수 이므로 instance(인스턴스) 변수라고 부른다.
	
	
	
  // 2). static 변수
  //     static 변수는 동일한 클래스로 생성되어진 서로 다른 instance 들 끼리 공유하는 변수이다. 
	static String address;
	
	
	
	
	
	//// === 생성자(constructor) === ////
	public Member() {
		System.out.println("Member 클래스의 생성자 호출함");
		} 
	
	
	
	
	///////////////////////////////////////////////////////
	
	// behavior == 행위 == 기능 == operation == method(메소드)
	
	/*
	   자바에서  소괄호() 가 나오는 것은 오로지 2개 밖에 없다.
	   첫번째는 생성자(constructor)에서 ()가 사용되고, 
	   두번째로 메소드 method(메소드)에서 ()가 사용된다.
   */
	
	
	
	
	
	
	// === 회원의 정보를 출력해주는 기능을 만들어 봅니다. === //
	
	void showInfo() { //인스턴스 method(메소드)
		// void 는 return 타입이 없다라는 말이다.
		
		System.out.println("==== 회원정보 ==== \n"
				         + "1. 아이디 :" + id + "\n"
				         + "2. 비밀번호 :" + pwd + "\n"
				         + "3. 성명 :" + name + "\n"
				         + "4. 이메일 :" + email + "\n"
				         + "5. 주소 :" + address + "\n" );
		// \n 은 줄바꿈을 말하는 것이다.
		// 문자열 사이의 + 는 문자열 결합을 뜻하는 것이다.
	}
	
	
	
}
