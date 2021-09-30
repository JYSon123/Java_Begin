package my.day03.a.constructor;

public class Member {
	
	
	//field, attribute, property, 속성
	String userid;
    String passwd;
    String name;
    int age;
    int point;
    
    
    // **** 기본 생성자(constructor) **** //
    // parameter 가 없는 생성자를 기본생성자 (constructor) 라고 부른다.
    // 기본생성자 (constructor)를 기술하지 않으면 아래와 같은 기본생성자가 없는 것이 아니라 생략되어져 있다.
    //  !!!! 중요 !!!! parameter가 있는 생성자가 선언되어 있으면 생략되어져 있던 기본 생성자는 자동적으로 삭제가 되어져버린다. !!
     public Member() {}   //눈에 안보이지만 기본적으론 있다!
    // (1) 이 부분처럼 기본생성자를 만들어줘야, MemberMain의 (1)을 쓸 수 있다.
     
     
    
    // **** parameter가 있는 생성자 (constructor) **** //
    // parameter가 있는 생성자 (constructor)의 주 목적은 field를 초기화 하는데 있다.
    
     
     
     public Member(String userid, String passwd, String name, int age, int point) {
        //	() 속에 들어오는 변수를 매개변수 또는 parameter 라고 부른다.
    	
    	// 지역변수명과 멤버변수명(인스턴스변수와  static 변수를 모두 지칭하는것)이
        // 일치할 경우에는 지역변수가 우선된다.
    	
    	this.userid = userid; //Member class의 userid에 넣어주겠다
    	this.passwd = passwd;
    	this.name = name;
    	this.age = age;
    	this.point = point;
    }
    
    
    	// 파라미터가 없고 리턴타입이 없는 메소드 만들기 예제
    	void showInfo() {
    		System.out.println("=== "+ name +" 님의 회원정보 === \n"
    				+ "1. 아이디 : " + userid + "\n"
    				+ "2. 암호 : " + passwd + "\n"
    				+ "3. 성명 : " + name + "\n"
    				+ "4. 나이 : " + age + "\n"
    				+ "5. 포인트 : " + point + "\n"
    				
    				);
    	}


    	// 파라미터가 있고 리턴타입이 없는 메소드 만들기 예제
		 void updateInfo(String passwd, String name, int age, int point) {
			 
			System.out.println("=== 변경전 정보 ===");
			showInfo();
			
			this.passwd = passwd;
			this.name = name;
			this.age = age;
			this.point = point;
			
			
			System.out.println("=== 변경후 정보 ===");
			showInfo();
	
		 }


		// 파라미터가 있고 리턴타입이 있는 메소드 만들기 예제
		 String changeInfo(String passwd, String name, int age, int point) {
			
			 String beforeInfo = ">> " + this.name + "  님의 회원 수정하기전 << \n"
			 		+ "1. 아이디 : " + this.userid + "\n"
			 		+ "2. 암호 : " + this.passwd + "\n"
			 		+ "3. 성명 : " + this.name + "\n"
			 		+ "4. 나이 : " + this.age + "\n"
			 		+ "5. 포인트 : " + this.point + "\n";
			 // 현재 인스턴스의 필드를 보여라. (this의 역할)
			 
			 this.passwd = passwd;
			 this.name = name;
			 this.age = age;
			 this.point = point;
			 
			 // this가 인스턴스이다
			 
			 
			 
			 String afterInfo = ">> " + this.name + "  님의 회원 수정한 후 결과 << \n"
					 		+ "1. 아이디 : " + this.userid + "\n"
					 		+ "2. 암호 : " + this.passwd + "\n"
					 		+ "3. 성명 : " + this.name + "\n"
					 		+ "4. 나이 : " + this.age + "\n"
					 		+ "5. 포인트 : " + this.point + "\n";

			 
			 
			return beforeInfo + "\n" + afterInfo;
		
		 }

	
		
		//
		 
		 
    }
    
    

