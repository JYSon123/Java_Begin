package my.day17.t.subject;

import java.text.DecimalFormat;
import java.util.Calendar;

/*
	 ===== **** 객체지향 프로그래밍(Object Oriented Programming) 이란? *** ==== 
	
	  ※ OOP 의 4가지 특징(!!!!필수암기!!!!)
	  --> 1. 상속성(Inheritance) : 클래스의 재사용과 소스 코드의 중복제거를 목적으로 하는 기술 
	  --> 2. 추상화(Abstraction) : 프로그램이 필요로 하는 실제 데이터들을 모델링하는 기술 
	  --> 3. 캡슐화(EnCapsulation == 은닉화) : 객체지향의 가장 중요한 데이터 보호 기술   
	  --> 4. 다형성(Polymorphism) : 상속을 이용하여 여러 클래스 타입을 하나의 클래스 타입으로 다루는 기술 
	 
	   구인구직 어플리케이션 프로그래밍 제작시 
	   필요한 요소(부품)가 무엇이 있는지 생각해보자.
	   아주 다양하고, 많은 요소들이 필요할 것이다.
	
	   예를 들어,
	   구직자, 구인회사, 채용.... 등등등 많이 있다.
	   이러한 요소(부품)들이 바로 객체인데 이 객체를 만드는 설계도면이 클래스이다.
	
	   위와(구인구직 어플리케이션 프로그래밍 제작) 같이 현실세계에 존재하는
	   다양한  객체들을 각각 하나하나 추상화 시켜서 클래스로 옮기는 것을
	   객체지향 프로그래밍(OOP)이라고 한다.
	
	  여기서 추상화(abstraction)란?
	 --> 일반적인 의미의 추상화란 어떤 물체(object)에서 주된
	          특징을 부각시켜 표현하고, 나머지 부분은 과감하게 생략하는것을 말한다.
	          추상화의 반대는 아주 시시콜콜한것(세세한 것)까지 전부 몽땅
	          다 묘사하는 것을 말하는데 이것을 정밀화 라고 말한다.
	  객체지향 프로그래밍(OOP)에서 사용되는 추상화도 이와 비슷하다.
	  어떤 하나의 물체를 대표하는 속성(명사, 멤버변수)과 기능(동사, 메소드)을 추출해내는 것을 
	  객체지향 프로그래밍(OOP)에서 "추상화" 라고 한다. 
	
	>>> 예를 들어, 구인구직 어플리케이션 프로그래밍 제작시
	     필요한 부품(요소)중 하나인 "구직자" 에 대해서 알아보자.
	  "구직자" 가 가지고 있는 속성(명사, 멤버변수)과 행동양식(기능, 동사, 메소드)을 뽑아보자.
	1). 속성(property, attribute, field)은 멤버변수가 되고,
	2). 행동양식(기능)은 메소드가 되는 것이다.
	
	Gujikja(클래스)
	  |
	  |-- 속성(property, attribute, field) : 아이디, 암호, 성명, 연락처, 이메일, 주소, 학력, 희망구직직종, 희망연봉.....  
	  |-- 행동양식(기능, 메소드) : 구직자로 접속(로그인)할수 있는 기능, 구직자정보를 조회해주는 기능, 구직자정보를 변경해주는 기능, ....... 

*/

public class Gujikja extends Member {
//   Gujikja 클래스는  Member 클래스에 선언되어진 필드와 메소드를 상속받아서 쓰겠다는 말이다.       
//   public class 자식클래스명 extends 부모클래스명 
	
/*
    -----------------------------------------------------------------------------------------------------------------------
	접근제한자(접근지정자, accessmodifier)   자기자신클래스내부      동일패키지에있는다른클래스      다른패키지에있는하위(자식)클래스        그외의영역  
	----------------------------------------------------------------------------------------------------------------------- 
	public                                    O                    O                         O                 O  
	protected                                 O                    O                         O                 X
	default                                   O                    O                         X                 X
	private                                   O                    X                         X                 X
*/	
	
	// field 생성
	private String jubun;      // 주민번호 앞의 7자리 까지만   
	                           // 예: "9501151"  남자   "0105103"  남자
	                           // 예: "9501152"  여자   "0105104"  여자
	         
	private int hopeMoney;  // 희망급여 
	
	
	
	
	// method 생성(==> field(속성)를 어떤 방식으로 처리하고자 할때 메소드를 생성)
	// === getter, setter === 
	public String getJubun() {
		return jubun;
	}


	public void setJubun(String jubun) {
		
		if(isCheckJubun(jubun))
		   this.jubun = jubun;
		else {
		   System.out.println("\n>> "+jubun+" 은 사용할 수 없는 주민번호 7자리 입니다. <<\n");
		   this.jubun = null;
		}   
	}

	
	public void setHopeMoney(int hopeMoney) {
		
		if( 1000 <= hopeMoney && hopeMoney <= 9999 ) {
			this.hopeMoney = hopeMoney;
		}
		else {
			System.out.println(">> 희망급여는 1000 이상 9999 이내이어야 합니다. <<");
		    this.hopeMoney = 0;
		}
		
	}
	
	
	public int getHopeMoney() {
		return hopeMoney;
	}
	
	
	public String strHopeMoney() {
		
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(hopeMoney)+"만원";
	}
	
	
	// == 주민번호 7자리를 입력받아서 올바른 데이터 인지 검사해주는 메소드 생성 == //
	private boolean isCheckJubun(String jubun) {
		// 비정상 jubun ==> null , "9506", "9506302234567", "abc30fg", "9513302", "9506312",  "9506308"
		// 정상    jubun ==> "9506301"  "9506302"
		
		if(jubun == null)
			return false;
		
		char[] chArr = jubun.toCharArray();
		
		if(chArr.length != 7) 
			return false;
		
		for(int i=0; i<7; i++) {
			
			if(!Character.isDigit(chArr[i]))  
			    return false;
		}// end of for----------------
		
		// 월 => "01" ~ "12"
		//        1 ~ 12
		
		int month = Integer.parseInt(jubun.substring(2, 4)); 
		// 1 ~ 12
		
		if( !(1<=month && month<=12) )
			return false;
		
		
		// 일 => "01" ~ "31"
		//     1월 3월 5월 7월 8월 10월 12월은  1 ~ 31
		//     2월                                           1 ~ 29
		//     4월 6월 9월 11월                        1 ~ 30 
		
		int day = Integer.parseInt(jubun.substring(4, 6)); 
		
		if( (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) &&
			!(1 <= day && day <= 31) )
			return false;
		
		if( (month==2) &&
			!(1 <= day && day <= 29) )
			return false;
		
		if( (month==4 || month==6 || month==9 || month==11) &&
			!(1 <= day && day <= 30) )
			return false;
		
		
		// 성별을 나타내는 숫자는 1 ~ 4 까지만 가능하다.
		if( !('1' <= chArr[6] && chArr[6] <= '4') )
			return false;
		
		
		return true;
		
	}// end of boolean isCheckJubun(String jubun)------------------
	
	
	// === 메소드 오버라이딩(== 메소드 재정의) 구직자 정보 보여주기 === //
	@Override
	public String showInfo() {
		// jubun ==> "9710201"   "0105104"
		//            1900+97     2000+01
		//            1997        2001 
		
		String genderFlag = jubun.substring(6);
		//     "1" "2" "3" "4"
				
		String gender = ("1".equals(genderFlag) || "3".equals(genderFlag))?"남":"여";
		
		DecimalFormat df = new DecimalFormat("#,###");
		
		return "1. 아이디 : " + super.getId() +"\n"
			 + "2. 암호 : " + super.getPasswd() +"\n"
			 + "3. 성명 : " + super.getName() +"\n"
			 + "4. 현재나이 : " + getAge() +"\n"
			 + "5. 성별 : " + gender +"\n"
		     + "6. 희망급여 : " + df.format(hopeMoney) +"만원\n";
		
	}
	
	
	// == 나이 알려주는 메소드 생성하기 == //
	int getAge() {
		
		String genderFlag = jubun.substring(6);
		//     "1" "2" "3" "4"
		
		int birthYear = 0;
		
		if( "1".equals(genderFlag) || "2".equals(genderFlag) ) {
			birthYear = 1900 + Integer.parseInt(jubun.substring(0,2)); 
		}
		else {
			birthYear = 2000 + Integer.parseInt(jubun.substring(0,2)); 
		}
		
		Calendar currentDate = Calendar.getInstance(); 
		// 현재날짜와 시간을 얻어온다.
		int currentYear = currentDate.get(Calendar.YEAR);
		
		int age = currentYear - birthYear + 1;  
		         // 현재년도 - 태어난년도 + 1 
		
		return age;
	}
	
	
}





