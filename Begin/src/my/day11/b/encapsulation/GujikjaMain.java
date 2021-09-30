package my.day11.b.encapsulation;

import java.util.Scanner;

public class GujikjaMain {

	public static void main(String[] args) {
		
		GujikjaCtrl ctrl = new GujikjaCtrl();
		
		Gujikja[] guArr = new Gujikja[5];
		
		Gujikja gu1 = new Gujikja();
		gu1.setUserid("eomjh");
		gu1.setPasswd("qwer1234$A");
		gu1.setName("엄정화");
		gu1.setJubun("9506302");
		gu1.setHopeMoney(5000);
		gu1.setMobile("01098761234");
		
		if( ctrl.checkGujikja(gu1) ) {
			guArr[Gujikja.count++] = gu1;
		}
		
		
		
		//////////////////////////////////////////////
		
		Gujikja gu2 = new Gujikja();
		gu2.setUserid("leess");
		gu2.setPasswd("qwer1234$A");
		gu2.setName("이순신");
	    gu2.setJubun("9407011");
		gu2.setHopeMoney(7000);
		gu2.setMobile("01067890070");
		
		if( ctrl.checkGujikja(gu2) ) {
			guArr[Gujikja.count++] = gu2;
		}
		
		
		
		//////////////////////////////////////
		
		Gujikja gu3 = new Gujikja();
		gu3.setUserid("youks");
		gu3.setPasswd("qwer1234$A");
		gu3.setName("유관순");
	    gu3.setJubun("8603012");
	    gu3.setHopeMoney(8000);
	    gu3.setMobile("01056785432");
		
	    if( ctrl.checkGujikja(gu3) ) {
			guArr[Gujikja.count++] = gu3;
		}
	    	
		
	    System.out.println("Gujikja.count : " + Gujikja.count);
	    
		////////////////////////////////////////////////////////
		
		Scanner sc = new Scanner(System.in);
		String smenuNo = "";
		
		
		do {
			
			System.out.println("\n >>> === 메인메뉴 === <<< \n"
			         + "1.구직자 회원가입   2.구직자 모두 보기  3.검색   4.모든 구직자 희망급여보기  5.프로그램 종료 \n");
	
			System.out.print("▷ 메뉴번호 선택 => "); 
			smenuNo = sc.nextLine();
			
			switch (smenuNo) {
				case "1": // 구직자 회원가입
					boolean result = ctrl.register(sc, guArr); 
					
					if(result) {
						System.out.println(">> 회원가입 성공!! \n");
					}
					
					break;   // switch 의 break; 이다	
				
					
				case "2": // 구직자 모두 보기
					ctrl.showAll(guArr);
					
					break;	 // switch 의 break; 이다	
					
				case "3": // 검색
					searchMenu(sc,ctrl,guArr);
					
					break;   // switch 의 break; 이다	
					
				case "4": // 모든 구직자 희망급여보기
					ctrl.showAllHopeMoney(guArr);
					
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
	
	
	
	
	static void searchMenu(Scanner sc, GujikjaCtrl ctrl, Gujikja[] guArr) {
		
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
