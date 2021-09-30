package my.day18.e.ENUM;

import java.util.Calendar;

public class Member_1 {
	
	private String name;
	private String jubun;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getJubun() {
		return jubun;
	}
	
	public void setJubun(String jubun) {
		this.jubun = jubun;
	}
	
	
	public int getAge() {
		
		Calendar currentDate = Calendar.getInstance(); // 현재 날짜와 시간을 얻어온다.
		int currentYear = currentDate.get(Calendar.YEAR);		
		
		/*
		"9510201" "9510202"  ==> 95 95 (앞의 2자리만 가지고 와야한다.) ==> 1900 + 95 = 1995
		"0010203" "0010204"  ==> 00 00 (앞의 2자리만 가지고 와야한다.) ==> 2000 + 00 = 2000
		
		*/
	
		String gender = jubun.substring(6);
		
		int birthYear = 0;
		
		switch (gender) {
		case "1": // 1또는 2이라면은 
		case "2":	
			birthYear = 1900 + Integer.parseInt(jubun.substring(0,2));
			
			break;

			
		case "3": // 3또는 4이라면은 
		case "4":	
				birthYear = 2000 + Integer.parseInt(jubun.substring(0,2));
			
		
			break;
		}
	
		return currentYear - birthYear + 1;
	
	}
	
	@Override
	public String toString() { //toString() 원래는 그 객체의 메모리상의 주소를 알려준다.
		return "1. 성명 : " + name + "\n" +
		       "2. 주민번호 : " + jubun + "\n" +
		       "3. 나이 : " + getAge() + "세";
		
	}
	
	
}
