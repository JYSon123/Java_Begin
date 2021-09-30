package AApracticeAA;

import java.text.DecimalFormat;
import java.util.Calendar;


public class Gujikja extends Member {

	// field 생성
	private String jubun;      // 주민번호 앞의 7자리 까지만   
							   // 예: "9501151"  남자   "0105103"  남자
							   // 예: "9501152"  여자   "0105104"  여자

	private int hopeMoney;  // 희망급여 
	
	 
	
	
	// method 생성(==> field(속성)를 어떤 방식으로 처리하고자 할때 메소드를 생성)
	
	

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
	@Override  //접근 제한자가 같아야한다.
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





