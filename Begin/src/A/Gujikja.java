package A;

import java.text.DecimalFormat;
import java.util.Calendar;

public class Gujikja extends Member {

	
	private String jubun;
	private int hopeMoney;


	
	public String getJubun() {
		return jubun;
	}

	
	public void setJubun(String jubun) {
		
		if(isCheckJubun(jubun)) 
			this.jubun = jubun;
	
		else {
			System.out.println("\n>> " + jubun + "은 사용할 수 없는 주민등록번호 7자리 입니다.<< \n");
			this.jubun = null;
		}
	}


	public int getHopeMoney() {
		return hopeMoney;
	}


	public void setHopeMoney(int hopeMoney) {
		
		if(1000 <= hopeMoney && hopeMoney <= 9999) {
			this.hopeMoney = hopeMoney;
		}
		else {
			System.out.println(" >> 희망급여는 1000 이상 9999 이내이어야 합니다.");
			this.hopeMoney = 0;
		}
		
		
	}

	private boolean isCheckJubun(String jubun) {
		
		
		if(jubun == null)
			return false;
		
		char[] chArr = jubun.toCharArray();
		
		if(chArr.length != 7)
			return false;
		
		for(int i=0; i<7; i++) {
			
			if(!Character.isDigit(chArr[i]))
				return false;
			
		}// end of for -------------------
		
		
		int month = Integer.parseInt(jubun.substring(2,4));
		
		
		if( !(1 <= month && month <= 12))
			return false;
		
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
		
		
		if(!('1' <= chArr[6] && chArr[6] <= '4'))
			return false;
		
		
		return true;
	
	}// end of private boolean isCheckJubun(String jubun)--
	
	
	
	
	
	

	@Override
	public String showInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}





