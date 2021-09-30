package A;

import java.util.*;

public class GujikjaCompanyMain {

	public static void main(String[] args) { 
		
		
		InterGujikjaCompanyCtrl ctrl = new GujikjaCompanyCtrl();		
		
		Map<String, Gujikja> guMap = new HashMap<>();
		Map<String, Company> compMap = new HashMap<>();
		List<Recuritment> recuritList = new ArrayList<>();
		
		Gujikja gu1 = new Gujikja();
		gu1.setId("eomjh");
		gu1.setPasswd("qwer1234$A");
		gu1.setName("엄정화");
		gu1.setMobile("01098761234");
		gu1.setJubun("9506302");
		gu1.setHopeMoney(5000);
		
		guMap.put("eomjh", gu1);
		
		
		Gujikja gu2 = new Gujikja();
		gu2.setId("leess");
		gu2.setPasswd("qwer1234$A");
		gu2.setName("이순신");
		gu2.setMobile("01067890070");
	    gu2.setJubun("9407011");
		gu2.setHopeMoney(7000);
				
		guMap.put("leess", gu2);
		
		
		Gujikja gu3 = new Gujikja();
		gu3.setId("youks");
		gu3.setPasswd("qwer1234$A");
		gu3.setName("유관순");
		gu3.setMobile("01056785432");
		gu3.setJubun("8603012");
	    gu3.setHopeMoney(8000);
	    
	    guMap.put("youks", gu3);
		
		 
		
		////////////////////////////////////////////////////////
			    
			    
		Company comp1 = new Company();
		comp1.setId("LG");
		comp1.setPasswd("qwer1234$A");
		comp1.setName("엘지");
		comp1.setMobile("01034567890");
		comp1.setJobType("전자");
		comp1.setSeedMoney(500000000000L);
		
		compMap.put("LG", comp1);
		
		
		
		Company comp2 = new Company();
	    comp2.setId("samsung");
	    comp2.setPasswd("qwer1234$A");
	    comp2.setName("삼성");
	    comp2.setMobile("01079795678");
	    comp2.setJobType("반도체");
	    comp2.setSeedMoney(500000000000L);
	    
	    compMap.put("samsung", comp2);
		
		
	    Recuritment rcrmt1 = new Recuritment();
	    rcrmt1.setTitle("Web 프로그래머 채용");
	    rcrmt1.setComp(compMap.get("samsung"));
	    rcrmt1.setGender("무관");
	    rcrmt1.setHireCount(30);
	    
	    recuritList.add(rcrmt1);
	    
	    
	    Recuritment rcrmt2 = new Recuritment();
	    rcrmt2.setTitle("신입경영직원 채용");
	    rcrmt2.setComp(compMap.get("LG"));
	    rcrmt2.setGender("여");
	    rcrmt2.setHireCount(20);
	    
	    recuritList.add(rcrmt2);
	    
	    
	    Recuritment rcrmt3 = new Recuritment();
	    rcrmt3.setTitle("신입회계직원 채용");
	    rcrmt3.setComp(compMap.get("samsung"));
	    rcrmt3.setGender("남");
	    rcrmt3.setHireCount(15);
	    
	    recuritList.add(rcrmt3);
		
	    ////////////////////////////////////////////////////////
	    
	    
	    Scanner sc = new Scanner(System.in);
	    String menuNo = "";
	    
	    
		System.out.println("\n >>>=== 채용사이트 메인메뉴 ===<<< \n"
						 + "1.구직자 회원가입         2.구직회사 회원가입 \n"
						 + "3.구직자 로그인            4.구인회사 로그인 \n"
						 + "5. 프로그램 종료\n");
	    
		System.out.print(" ◎ 메뉴 번호를 입력해주세요  → ");
	    menuNo = sc.nextLine();
	    
	    switch (menuNo) {
		case "1": 
			
			boolean result = ctrl.registerGujikja(sc, guMap);
			
			
			if(result) {
				System.out.println(">> 구직자 회원가입 성공!! \n");
			}
			
			break;

	    case "2":
	    	
	    
	    	break;
	    
	    }// end of switch
	    
	}// end of public static void main(String[] args)
}
