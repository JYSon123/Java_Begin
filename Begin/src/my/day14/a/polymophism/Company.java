package my.day14.a.polymophism;

import java.text.DecimalFormat;

public class Company extends Member {
//  Gujikja 클래스는 Member 클래스에 선언되어진 필드와 메소드를 상속받아서 쓰겠다는 말이다.
//	public class 자식클래스명 extends 부모클래스명
	
	
	// field 생성
 	private String jobType; // 회사직종타입(제조업, 서비스업, IT, ....)
	private long seedMoney;  // 자본금
	
	
	 

	//getter, setter 하기 
	public String getJobType() {
		return jobType;
	}


	public void setJobType(String jobType) {
		  
		// 회사직종타입은 null도 아니고  ""도 아니고 "     "도 아니어야 한다.
		if(jobType != null && !jobType.trim().isEmpty() ) {
			this.jobType = jobType;
	 }
		else {
			System.out.println("\n >> 직종타입명을 반드시 입력하셔야 합니다. <<\n");
			this.jobType = null;
		}
		
  }

	public long getSeedMoney() {
		return seedMoney;
	}


	public void setSeedMoney(long seedMoney) {
		
		if(seedMoney >0){
		
		// 자본금 0보다 커야한다.
		this.seedMoney = seedMoney;
	
		}
		else {
			System.out.println("\n >> 자본금은 0보다 커야합니다. <<\n");
			this.seedMoney = 0;
		}
		
	}
	
	// === 메소드 오버라이딩(== 메소드 재정의) 구인회사 정보 보여주기 === //
		@Override  //접근 제한자가 같아야한다.
		public String showInfo() {
	      
	      DecimalFormat df = new DecimalFormat("#,###");
	      
	      return "1. 아이디 : " + super.getId() +"\n"
	          + "2. 암호 : " + super.getPasswd() +"\n"
	          + "3. 회사명 : " + super.getName() +"\n"
	          + "4. 업종 : " + jobType +"\n"
	          + "5. 자본금 : " + df.format(seedMoney) +"원\n"
	           + "6. 담당자연락처 : " + super.getMobile()+"\n";
	      
	   }   
	
	
	

	
	
}
