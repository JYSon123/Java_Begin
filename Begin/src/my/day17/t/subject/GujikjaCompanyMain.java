package my.day17.t.subject;

import java.util.*;


public class GujikjaCompanyMain {

	public static void main(String[] args) { 
		
		InterGujikjaCompanyCtrl ctrl = new GujikjaCompanyCtrl(); // 첫번째 팀원이 만든것
	
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
		
		
		//////////////////////////////////////////////
		
		Gujikja gu2 = new Gujikja();
		gu2.setId("leess");
		gu2.setPasswd("qwer1234$A");
		gu2.setName("이순신");
		gu2.setMobile("01067890070");
	    gu2.setJubun("9407011");
		gu2.setHopeMoney(7000);
				
		guMap.put("leess", gu2);
		
		
		//////////////////////////////////////
		
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
	    
	    ////////////////////////////////////////////////////////
	    
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
		String smenuNo = "";
		
		Gujikja loginGu   = null; // 구직자로    로그인 되어지면 로그인 되어진 구직자 인스턴스를 저장해주는 용도임. 
		Company loginComp = null; // 구인회사로 로그인 되어지면 로그인 되어진 구인회사 인스턴스를 저장해주는 용도임. 
				
		do {
			
			System.out.println("\n >>> === 메인메뉴 === <<< \n"
			         + "1.구직자 회원가입     2.구인회사 회원가입 \n"
			         + "3.구직자 로그인        4.구인회사 로그인 \n"
			         + "5.프로그램 종료 \n");
	
			System.out.print("▷ 메뉴번호 선택 => "); 
			smenuNo = sc.nextLine();
			
			switch (smenuNo) {
				case "1": // 구직자 회원가입
					boolean result = ctrl.registerGujikja(sc, guMap); 
					
					if(result) {
						System.out.println(">> 구직자 회원가입 성공!! \n");
					}
					
					break;   // switch 의 break; 이다	
					
					
				case "2": // 구인회사 회원가입
					result = ctrl.registerCompany(sc, compMap); 
					
					if(result) {
						System.out.println(">> 구인회사 회원가입 성공!! \n");
					}
					
					break;   // switch 의 break; 이다	
				
				
				case "3": // 구직자 로그인
					
					loginGu = ctrl.login(sc, guMap);
					
					if(loginGu == null) {
						System.out.println("\n>> 로그인 실패!! <<\n");
					}
					else {
						loginGu = gujikjaMenu(sc, ctrl, loginGu, compMap, recuritList);
					}
					
					break;   // switch 의 break; 이다		
					
					
				case "4": // 구인회사 로그인
					
					loginComp = ctrl.login(compMap, sc);
					
					if(loginComp == null) {
						System.out.println("\n>> 로그인 실패!! <<\n");
					}
					else {
						loginComp = companyMenu(sc, ctrl, loginComp, guMap, recuritList);
					}
					
					break;   // switch 의 break; 이다		
			
					
				case "5": // 프로그램 종료
					
					break;	 // switch 의 break; 이다			
	
				default:  
					System.out.println("\n>> 메뉴에 없는 번호 입니다. <<\n");
					break;   // switch 의 break; 이다	
			}// end of switch-----------------------
		
		} while (!("5".equals(smenuNo)));
		
		sc.close();
		
		System.out.println("\n~~~~~ 프로그램 종료 ~~~~~~");

	}// end of main(String[] args)------------------------
	
	
	
	static Gujikja gujikjaMenu(Scanner sc, InterGujikjaCompanyCtrl ctrl, Gujikja loginGu, 
			                   Map<String, Company> compMap, List<Recuritment> recuritList) { 
		
		String sMenuNo = "";
		
		do {
		
			System.out.println("\n >>> === 구직자메뉴("+loginGu.getName()+" 로그인중..) === <<< \n"
			                + "1.모든 구인회사 보기   2.모든채용공고 보기\n"
			                + "3.내정보 변경하기       4.검색(채용정보, 회사정보)\n"
			                + "5.로그아웃 \n");
			
			System.out.print("▷ 메뉴번호 선택 => ");
			sMenuNo = sc.nextLine();
			
			switch (sMenuNo) {
				case "1":  // 모든 구인회사 보기
					
					ctrl.showAllCompany(compMap);
					
					break; // switch 문의 break; 이다.
					
					
				case "2":  // 모든채용공고 보기
					
					ctrl.showAllRecurit(recuritList);
					
					break; // switch 문의 break; 이다. 
					
					
				case "3":  // 구직자 내정보 변경하기 
					
					loginGu = ctrl.update(sc, loginGu); 
						
					System.out.println("\n>>=== 변경 후 구직자 나의 정보 ===<<");
					System.out.println(loginGu.showInfo());
					
					break; // switch 문의 break; 이다.
					
					
				case "4":  // 검색(채용정보, 회사정보)
					
					searchMenu(sc, ctrl, compMap, recuritList);
					
					break;	// switch 문의 break; 이다.
					
					
				case "5":  // 로그아웃
					System.out.println("\n~~~ 로그아웃 되었습니다!! ~~~\n");
					break;	// switch 문의 break; 이다.	
		
				default:
					System.out.println("\n>> 메뉴에 없는 번호 입니다. <<\n");
					break; // switch 문의 break; 이다.
			}// end of switch (sMenuNo)--------------
		
		} while(!("5".equals(sMenuNo)));
		
		return null;
		
	} // end of static Gujikja gujikjaMenu(Scanner sc, InterGujikjaCompanyCtrl ctrl, Gujikja loginGu)----------------------	


	
	// 채용정보, 구인회사를 대상으로 검색하는 메소드  	
	static void searchMenu(Scanner sc, InterGujikjaCompanyCtrl ctrl, Map<String, Company> compMap, 
			               List<Recuritment> recuritList) {
		
		String sMenuNo = "";
		
		do {
		
			System.out.println("\n ==== *** 채용정보, 구인회사 검색메뉴 *** ==== \n"
			                + "1.채용제목검색   2.채용성별검색   3.구인회사업종검색   4.메인으로 돌아가기\n");
			
			System.out.print("▷ 검색메뉴번호 선택 => ");
			sMenuNo = sc.nextLine();
			
			switch (sMenuNo) {
				case "1":  // 채용제목검색
					
					do {
						 System.out.print("▷ 채용제목 => ");
						 String searchTitle = sc.nextLine();
						 searchTitle = searchTitle.trim();
						 
						 if(!searchTitle.isEmpty()) {
							 
							 ctrl.searchRecuritByTitle(searchTitle, recuritList);
							 
							 break;	 
						 }
						 else {
							 System.out.println("\n >> 채용제목을 입력하세요!! << \n");
						 }
						 
					} while(true);
				 	
					
					break; // switch 문의 break; 이다.
					
					
				case "2":  // 채용성별검색
					
					do {
						 System.out.print("▷ 채용성별검색[남/여/무관] => ");
													
					 	 String gender = sc.nextLine(); 
					 	 // 정상    gender ==> "남" "여" "남 " " 여 "  " 무관 "
					 	 // 비정상 gender ==> "남" 또는 "여" 를 제외한 나머지
					 	
					 	 gender = gender.trim();
					 	
					 	 if("남".equals(gender) || "여".equals(gender) || "무관".equals(gender)) {
					 		
					 		 ctrl.searchRecuritByGender(gender, recuritList);
					 		 
					 		 break;
					 	 }
					 	 else {
					 		System.out.println("\n>> 남 또는 여 또는 무관 만 입력하세요!! << \n");
					 	 }
					 		 	
					} while(true);
					
					break; // switch 문의 break; 이다. 
					
					
				case "3":  // 구인회사업종검색
					
					do {
						 System.out.print("▷ 구인회사업종 => ");

						 String searchJobType = sc.nextLine();
						 
						 searchJobType = searchJobType.trim();
						 
						 if(!searchJobType.isEmpty()) {
							 
							 ctrl.searchRecuritByJobType(searchJobType, compMap);
							 
							 break;	 
						 }
						 else {
							 System.out.println("\n >> 구인회사업종을 입력하세요!! << \n");
						 }
					
					} while(true);
					
					
					break; // switch 문의 break; 이다.
					
					
				case "4":  // 메인으로 돌아가기
					
					break;	// switch 문의 break; 이다.
		
				default:
					System.out.println("\n>> 메뉴에 없는 번호 입니다. <<\n");
					break; // switch 문의 break; 이다.
			}// end of switch (sMenuNo)--------------
		
		} while(!("4".equals(sMenuNo)));
		
		
	} // end of static void searchMenu(Scanner sc, InterGujikjaCompanyCtrl ctrl, Map<String, Gujikja> guMap)--------------	
	
	
	
	static Company companyMenu(Scanner sc, InterGujikjaCompanyCtrl ctrl, Company loginComp,
			                   Map<String, Gujikja> guMap, List<Recuritment> recuritList) {
		
		String sMenuNo = "";
		
		do {
		
			System.out.println("\n >>> === 구인회사메뉴("+loginComp.getName()+" 로그인중..) === <<< \n"
			                + "1.모든 구직자 보기               2.채용공고 등록하기 \n"
			                + "3.우리회사채용공고 보기       4.우리회사정보 변경하기 \n"
			                + "5.검색(구직자)         6.모든 구직자 희망급여보기  \n"
			                + "7.로그아웃  \n");
			
			System.out.print("▷ 메뉴번호 선택 => ");
			sMenuNo = sc.nextLine();
			
			switch (sMenuNo) {
				case "1":  // 모든 구직자 보기
					
					ctrl.showAllGujikja(guMap);
					
					break; // switch 문의 break; 이다.
					
					
				case "2":  // 채용공고 등록하기
					
					boolean result = ctrl.registerRecurit(sc, loginComp, recuritList); 
					
					if(result) {
						System.out.println(">> 채용공고 등록 성공!! \n");
					}
					
					
					break; // switch 문의 break; 이다. 
					
					
				case "3":  // 우리회사채용공고 보기
					
					ctrl.showMyCompanyRecurit(loginComp, recuritList);
					
					break; // switch 문의 break; 이다.
					
					
				case "4":  // 우리회사정보 변경하기
					
					loginComp = ctrl.update(sc, loginComp);
					
					System.out.println("\n>>=== 변경 후 구인회사의 회사정보 ===<<");
					System.out.println(loginComp.showInfo());
					
					break;	// switch 문의 break; 이다.
					
				
				case "5":  // 검색(구직자)
					
					searchMenu(sc,ctrl,guMap);
					
					break;	// switch 문의 break; 이다.
					
					
				case "6":  // 모든 구직자 희망급여보기
	
					ctrl.showAllHopeMoney(guMap); 
					
					break;	// switch 문의 break; 이다.	
					
					
				case "7":  // 로그아웃
					System.out.println("\n~~~ 로그아웃 되었습니다!! ~~~\n");
					break;	// switch 문의 break; 이다.	
		
				default:
					System.out.println("\n>> 메뉴에 없는 번호 입니다. <<\n");
					break; // switch 문의 break; 이다.
			}// end of switch (sMenuNo)--------------
		
		} while(!("7".equals(sMenuNo)));
		
		return null;
		
	} // end of static Company companyMenu(Scanner sc, InterGujikjaCompanyCtrl ctrl, Company loginComp)-----------------------

	
	
	// 구직자를 대상으로 검색하는 메소드  	
	static void searchMenu(Scanner sc, InterGujikjaCompanyCtrl ctrl, Map<String, Gujikja> guMap) {
		
		String sMenuNo = "";
		
		do {
		
			System.out.println("\n ==== *** 구직자 검색메뉴 *** ==== \n"
			                + "1.연령대검색   2.성별검색   3.연령대및성별검색   4.메인으로 돌아가기\n");
			
			System.out.print("▷ 검색메뉴번호 선택 => ");
			sMenuNo = sc.nextLine();
			
			switch (sMenuNo) {
				case "1":  // 연령대검색
					
					do {
						try {
							System.out.print("▷ 연령대 => ");
							
							// 20엔터   나이가 20세 부터 29세 까지 모두 보여라
							// 30엔터   나이가 30세 부터 39세 까지 모두 보여라
							
						 	String sAgeline = sc.nextLine(); 
						 	int ageline = Integer.parseInt(sAgeline);  // 정상인 경우     0 10 20 30 40 50 60 70
						 	                                           // 비정상인 경우  7 80 90 100 24 38  
						 	
						 	if( ageline%10 == 0 && (0 <= ageline && ageline <= 70) ) {
						 		// 정상인 경우
						 		
						 		ctrl.search(ageline, guMap); 
						 		// guArr 에서 ageline 연령대에 해당하는 구직자 찾아보기 
						 		
						 		break; // do~while 의 break; 이다.
						 	}
						 	else { 
						 		// 비정상인 경우
						 		System.out.println("\n>> 검색할 수 없는 연령대 입니다.!! \n");
						 	}
					 	
						} catch(NumberFormatException e) {
							System.out.println("\n>> 정수만 입력하세요 !! << \n");
						}
					} while(true);
				 	
					
					break; // switch 문의 break; 이다.
					
					
				case "2":  // 성별검색
					
					do {
						System.out.print("▷ 성별[남/여] => ");
													
					 	String gender = sc.nextLine(); 
					 	// 정상    gender ==> "남" "여" "남 " " 여 "
					 	// 비정상 gender ==> "남" 또는 "여" 를 제외한 나머지
					 	
					 	gender = gender.trim();
					 	
					 	if("남".equals(gender) || "여".equals(gender)) {
					 		ctrl.search(gender, guMap);
					 		break;
					 	}
					 	else {
					 		System.out.println("\n>> 남 또는 여 만 입력하세요!! << \n");
					 	}
					 		 	
					} while(true);
					
					break; // switch 문의 break; 이다. 
					
					
				case "3":  // 연령대및성별검색
					
					do {
						try {
							System.out.print("▷ 연령대 => ");
							
						 	String sAgeline = sc.nextLine(); 
						 	int ageline = Integer.parseInt(sAgeline);  
						 	
						 	if( ageline%10 == 0 && (0 <= ageline && ageline <= 70) ) {
						 		
						 		String gender = "";
						 		
						 		do {
							 		System.out.print("▷ 성별[남/여] => ");
								 	gender = sc.nextLine();
							 		
								 	if("남".equals(gender.trim()) || "여".equals(gender.trim())) {
								 		break; // 가장 가까운 do~while 문을 빠져나가는 break; 이다.
								 	}
								 	else {
								 		System.out.println("\n>> 남 또는 여 만 입력하세요!! << \n");
								 	}
						 		} while(true);
						 		
						 		ctrl.search(ageline, gender, guMap);
							 	break; // 바깥 do~while 문을 빠져나가는 break; 이다.					 		
						 	}
						 	else { 
						 		System.out.println("\n>> 검색할 수 없는 연령대 입니다.!! \n");
						 	}
					 	
						} catch(NumberFormatException e) {
							System.out.println("\n>> 정수만 입력하세요 !! << \n");
						}
					
					} while(true);
					
					
					break; // switch 문의 break; 이다.
					
				case "4":  // 메인으로 돌아가기
					
					break;	// switch 문의 break; 이다.
		
				default:
					System.out.println("\n>> 메뉴에 없는 번호 입니다. <<\n");
					break; // switch 문의 break; 이다.
			}// end of switch (sMenuNo)--------------
		
		} while(!("4".equals(sMenuNo)));
		
		
	} // end of static void searchMenu(Scanner sc, InterGujikjaCompanyCtrl ctrl, Map<String, Gujikja> guMap)--------------
		
	
}
