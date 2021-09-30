package my.day11.a.abstraction;

import java.util.Scanner;

public class GujikjaMain {

	public static void main(String[] args) {
		
		Gujikja[] guArr = new Gujikja[5];
		
		Gujikja gu1 = new Gujikja();
		gu1.userid = "eomjh";
		gu1.passwd = "qwer1234$A";
		gu1.name = "엄정화";
		
		String jubun = "9506302"; // null, "9506", "9506302234567", "abc30fg", "9513302", "9506312", "9506308" 
		                          // "9506301"  "9506302"
		
		if(gu1.isCheckJubun(jubun)) {
			gu1.jubun = jubun;
			
			guArr[Gujikja.count++] = gu1;
		}
		else {
			System.out.println(">>> "+jubun+"은 잘못된 주민번호 7자리 앞자리 입니다. <<<");
		}
		
		
		Gujikja gu2 = new Gujikja();
		gu2.userid = "leess";
		gu2.passwd = "qwer1234$A";
		gu2.name = "이순신";
		
		jubun = "9407011"; 
		
		if(gu2.isCheckJubun(jubun)) {
			gu2.jubun = jubun;
			
			guArr[Gujikja.count++] = gu2;
		}
		else {
			System.out.println(">>> "+jubun+"은 잘못된 주민번호 7자리 앞자리 입니다. <<<");
		}
		
		
		Gujikja gu3 = new Gujikja();
		gu3.userid = "youks";
		gu3.passwd = "qwer1234$A";
		gu3.name = "유관순";
		
		jubun = "8603012"; 
		
		if(gu3.isCheckJubun(jubun)) {
			gu3.jubun = jubun;
			
			guArr[Gujikja.count++] = gu3;
		}
		else {
			System.out.println(">>> "+jubun+"은 잘못된 주민번호 7자리 앞자리 입니다. <<<");
		}
		
		////////////////////////////////////////////////////////
		
		Scanner sc = new Scanner(System.in);
		String smenuNo = "";
		
		GujikjaCtrl ctrl = new GujikjaCtrl();
		
		do {
			
			System.out.println("\n >>> === 메인메뉴 === <<< \n"
			         + "1.구직자 회원가입   2.구직자 모두 보기  3.검색   4.프로그램 종료 \n");
	
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
					
				case "4": // 프로그램 종료
					
					break;	 // switch 의 break; 이다			
	
				default:  
					System.out.println("\n>> 메뉴에 없는 번호 입니다. <<\n");
					break;   // switch 의 break; 이다	
			}// end of switch-----------------------
			
		} while (!("4".equals(smenuNo)));
				
		
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
					//정상 gender ==> 남 여
					// 비정상 gernder ==> 남 또는 여를 제외한 나머지
					
					
					if("남".equals(gender.trim()) || "여".equals(gender.trim())){
						 ctrl.search(gender, guArr);
						 break; 
					}
					else {
						System.out.println("\n>> 남 또는 여 만 입력하세요!! \n");
					}
					
				} while(true);
			
					break; // switch 문의 break; 이다. 
					
					
				case "3":  // 연령대및성별검색
					
					String gender = "";
					
					do {
						try {
							System.out.print("▷ 연령대 => ");
	
						 	String sAgeline = sc.nextLine();  // 연령대를 입력을 하라고 했다.
						 	int ageline = Integer.parseInt(sAgeline);  // 숫자가 아닌 문자등을 넣으면 catch로 빠진다.
						 	
						 	if( ageline%10 == 0 && (0 <= ageline && ageline <= 70) ) {
						 
						 		do {
								System.out.print("▷ 성별[남/여] => ");
								gender = sc.nextLine();
						 		
								gender = gender.trim();
								
								if("남".equals(gender) || "여".equals(gender)){
									break; // 가장 가까운 do ~ while 문을 빠져나가는 break; 이다.
								}
								else {
									System.out.println("\n>> 남 또는 여 만 입력하세요!! \n");
								} 
						 	}while(true);
						
						 	ctrl.search(ageline, gender, guArr);  // 다 맞게 입력되었으면 이제 찾을것이다. guArr에 저장되어있음.
						 	break; // 가장 가까운(바깥)  do while 문을 빠져나가게 해줌
						 	}
						 	else { 
						 		
						 		System.out.println("\n>> 검색할 수 없는 연령대 입니다.!! \n");
						 	}
					 	
						} catch(NumberFormatException e) {
							System.out.println("\n>> 정수만 입력하세요 !! << \n");
						}
						
					}while(true);
					
					
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
