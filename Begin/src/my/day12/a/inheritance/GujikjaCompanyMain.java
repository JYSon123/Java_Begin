package my.day12.a.inheritance;

import java.util.Scanner;

public class GujikjaCompanyMain {

	public static void main(String[] args) {
		
		GujikjaCompanyCtrl ctrl = new GujikjaCompanyCtrl();
		
		Gujikja[] guArr = new Gujikja[5]; // 저장장소
		
		Gujikja gu1 = new Gujikja();
		
		
		gu1.setId("eomjh");
		gu1.setPasswd("qwer1234$A");
		gu1.setName("엄정화");
		gu1.setMobile("01098761234"); // 이까지가 부모클래스에서 가져왔다.
		
		gu1.setJubun("9506302");
		gu1.setHopeMoney(5000);
		
		
		
		if( ctrl.checkGujikja(gu1) ) {
			guArr[Gujikja.count++] = gu1;
		}
		
		
		
		//////////////////////////////////////////////
		
		Gujikja gu2 = new Gujikja();
		gu2.setId("leess");
		gu2.setPasswd("qwer1234$A");
		gu2.setName("이순신");
		gu2.setMobile("01067890070");
		
		gu2.setJubun("9407011");
		gu2.setHopeMoney(7000);
		
		
		if( ctrl.checkGujikja(gu2) ) {
			guArr[Gujikja.count++] = gu2;
		}
		
		
		
		//////////////////////////////////////
		
		Gujikja gu3 = new Gujikja();
		gu3.setId("youks");
		gu3.setPasswd("qwer1234$A");
		gu3.setName("유관순");
		gu3.setMobile("01056785432");
		
		gu3.setJubun("8603012");
	    gu3.setHopeMoney(8000);
	    
		
	    if( ctrl.checkGujikja(gu3) ) {
			guArr[Gujikja.count++] = gu3;
		}
	    	
		
	    System.out.println("Gujikja.count : " + Gujikja.count);
	    
		////////////////////////////////////////////////////////
		
	    Company[] compArr = new Company[3]; // Company[0] = comp1;   Company[1] = comp2;  Company[2] = null1;  
	    
	    Company comp1 = new Company();
	    comp1.setId("LG");
	    comp1.setPasswd("qwer1234$A");
	    comp1.setName("엘지");
	    comp1.setMobile("01034567890");
	    
	    comp1.setJobType("전자");
	    comp1.setSeedMoney(500000000000L);
	    
	    if( ctrl.checkCompany(comp1) ) {
			compArr[Company.count++] = comp1;
		}
	    
	    
	    
	    
	    Company comp2 = new Company();
	    comp2.setId("samsung");
	    comp2.setPasswd("qwer1234$A");
	    comp2.setName("삼성");
	    comp2.setMobile("01079795678");
	    
	    comp2.setJobType("반도체");
	    comp2.setSeedMoney(500000000000L);
	    
        if( ctrl.checkCompany(comp2) ) {
        	compArr[Company.count++] = comp2;
		}
	    
        System.out.println("company.count : " + Company.count);
	    ////////////////////////////////////////////////////////
	    
	    
	    
	    
	    

		Scanner sc = new Scanner(System.in);
		String smenuNo = "";
		
		Gujikja loginGu   = null; // 구직자로 로그인 되어지면, 로그인 되어진 구직자 인스턴스를 저장해주는 용도임.
		Company loginComp = null; // 구직회사로 로그인 되어지면, 로그인 되어진 구인회사 인스턴스를 저장해주는 용도임.
		String title = "";
		
		
		
		do {
			
			
			
			if(loginGu == null && loginComp == null)
	            title = "\n >>> === 메인메뉴 === <<< \n";
	         
	         else if(loginGu != null && loginComp == null)
	            title = "\n >>> === 메인메뉴[구직자 "+loginGu.getName()+" 로그인중..] === <<< \n";
	         
	         else 
	            title = "\n >>> === 메인메뉴[구인회사 "+loginComp.getName()+" 로그인중..] === <<< \n";
			
			

			
			
			System.out.println(title
			         + "1.구직자 회원가입     2.구인회사 회원가입\n"
					 + "3.구직자 로그인        4.구인회사 로그인\n"
					 + "5.모든 구직자 보기    6.모든 구인회사 보기\n"
					 + "7.로그아웃              8.내정보 변경하기\n"
					 + "9.검색                   10.모든 구직자 희망급여보기\n"
					 + "11.프로그램 종료 \n");
	
			System.out.print("▷ 메뉴번호 선택 => "); 
			smenuNo = sc.nextLine();
			
			switch (smenuNo) {
				case "1": // 구직자 회원가입
					boolean result = ctrl.register(sc, guArr); 
					
					if(result) {
						System.out.println(">> 구직자 회원가입 성공!! \n");
					}
					
					break;   // switch 의 break; 이다	
					
					
				case "2": // 구인회사 회원가입
				    result = ctrl.register(sc, compArr); // 회사이기 때문에 compArr를 써준다.
					
					if(result) {
						System.out.println(">> 구인회사 회원가입 성공!! \n");
					}
					
					break;   // switch 의 break; 이다
				
					
				case "3": // 구직자 로그인
				   
					loginGu	= ctrl.login(sc, guArr); // 입력을 받아야 하니 sc, 정보를 받아야 하니 guArr을 넣어준다.
					
					if(loginGu == null)
						System.out.println("\n>> 로그인 실패!! <<\n");
					
					
					break;   // switch 의 break; 이다
					
					
				case "4": // 구인회사 로그인
				   
					loginComp = ctrl.login(sc, compArr); // 오버로딩
					
					if(loginComp == null)
						System.out.println("\n>> 로그인 실패!! <<\n");
					
					break;   // switch 의 break; 이다
					
					
				case "5": // 모든 구직자 보기 , 구직자가 아니라 구인회사로 들어왔을때만 보여지게 하자.
					
					if(loginComp != null && loginGu == null) {
						ctrl.showAll(guArr); // 무조건 메소드를 실행하지만, 로그인 했을때만 보여보자!
					} // 구인 회사로 로그인 했을 경우에만 보여주도록 한다.
					else {
						System.out.println("\n>> 먼저 구인회사 계정으로 로그인 하세요!! <<\n");
					}
					break;
					
					
				case "6": // 모든 구직회사 보기
					
					if(loginComp == null && loginGu != null) {
						ctrl.showAll(compArr);  //showAll과 겹치기 때문에, 메소드를 하나 더 만들어준다.
					} // 구직자로 로그인 했을 경우에만 보여주도록 한다.
					else {
						System.out.println("\n>> 먼저 구직자 계정으로 로그인 하세요!! <<\n");
					}

					break;	 // switch 의 break; 이다	
					
					
				case "7": // 로그아웃
					loginGu = null;
					loginComp = null;
					
					System.out.println("\n>> 로그아웃 되었습니다. <<\n");
					
					
					break;	 // switch 의 break; 이다	
		
					
				case "8": // 내정보 변경하기
					
					
					if(loginGu == null && loginComp == null) {
					//	System.out.println("\n>> 먼저 로그인 부터 하세요!! <<");  확인용 멘트
					}
					else if(loginGu != null && loginComp == null) {
					
						
						/* 먼저 이렇게 설계를 해주고, 컨트롤러에서 짜준다.
						System.out.println("\n>>=== 구직자 나의 정보 ===<<"); 
						System.out.println(loginGu.showInfo()); // 내 정보를 보여주는것이 먼저.
						
						System.out.print("▷암호변경 [변경하지 않으려면 그냥 엔터하세요] : ");
						String passwd = sc.nextLine();
						
						System.out.print("▷성명변경  [변경하지 않으려면 그냥 엔터하세요] : ");
						String name = sc.nextLine();
						
						System.out.print("▷희망급여변경  [변경하지 않으려면 그냥 엔터하세요] : ");
						String str_hopeMoney = sc.nextLine();
						
						//-------------------------------------------여기까지 짯으면, 이제 이것을 바꿔주는 메소드가 필요하다. (어떠한 인스턴스의 필드 값을 바꾼다.)
						// 그렇기에 구직자 클래스에 가서 바꿔줘야한다. 
						// 그리고 값을 넣기 전, 유효성 검사를 통해 제대로 값이 들어왔는지를 파악해 줘야한다.
						*/
								//1. 정보 변경이 들어오면, 컨트롤에 아래의 세개를 넘겨준다.
						
						loginGu = ctrl.update(sc, loginGu);  // update 메소드를 만들어주자, 로그인 되어진 그사람의 정보를 넘기고, 업데이트를 해준다.
						
						System.out.println("\n>>=== 변경 후 구직자 나의 정보===<<");
						
						System.out.println(loginGu.showInfo());
						
		
					}
					else if(loginGu == null && loginComp != null) {
						
						loginComp = ctrl.update(sc, loginComp); //update도 ctrl에 만들어줘야한다.
						
						System.out.println("\n>>=== 변경 후 구인회사 나의 정보===<<");
						System.out.println(loginComp.showInfo()); // company 에서도  showInfo()를 만들어준다.
						
						
				
					//암호, 업종, 자본금
					
					}

					break;
	
					
				case "9": // 검색
					searchMenu(sc,ctrl,guArr);
					
					break;   // switch 의 break; 이다	
					
				case "10": // 모든 구직자 희망급여보기
					ctrl.showAllHopeMoney(guArr);
					
					break;   // switch 의 break; 이다		
					
				case "11": // 프로그램 종료
					
					break;	 // switch 의 break; 이다			
	
				default:  
					System.out.println("\n>> 메뉴에 없는 번호 입니다. <<\n");
					break;   // switch 의 break; 이다	
			}// end of switch-----------------------
			
		} while (!("11".equals(smenuNo)));  
				
		
		sc.close();
		
		System.out.println("\n~~~~~ 프로그램 종료 ~~~~~~");

	}// end of main(String[] args)------------------------
	
	
	
	
	static void searchMenu(Scanner sc, GujikjaCompanyCtrl ctrl, Gujikja[] guArr) {
		
		String sMenuNo = "";
		
		do {
		
			System.out.println("\n ==== *** 검색메뉴 *** ==== \n"
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
						 		
						 		ctrl.search(ageline, guArr); 
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
					 		ctrl.search(gender, guArr);
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
						 		
						 		ctrl.search(ageline, gender, guArr);
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
		
		
	} // end of static void searchMenu()----------------------
	

}
