package my.day11.b.encapsulation;

import java.util.Scanner;


public class GujikjaCtrl {

	// == 구직자(Gujikja) 신규 회원가입을 해주는 메소드 생성하기 == 
	boolean register(Scanner sc, Gujikja[] guArr) {
		
		boolean result = false;
		
		if( Gujikja.count < guArr.length) {
		
			Gujikja gu = new Gujikja();
			
			// == 아이디 중복검사 하기 == //
			do {
				System.out.print("1. 아이디 : ");  
				String userid = sc.nextLine(); 
				// 그냥엔터 ""     "      "
				// "youks"  "eomjh"  "leess"   "seokj"    "kang#$"
				
				gu.setUserid(userid);
				
				if(gu.getUserid() == null) {
					continue;
				}
								
				
				boolean isDuplicate = false; 
				
			    for(int i=0; i<Gujikja.count; i++) {
			    	
			    	if(guArr[i].getUserid().equals(userid)) {
			    		isDuplicate = true;
			    		break;
			    	}
			    	
			    }// end of for-------------------
			    
			    if(isDuplicate) {
			    	System.out.println("\n>> "+userid+"는 이미 사용중 입니다. 새로운 아이디를 입력하세요!! <<\n");     
			    }
			    else {
			    	gu.setUserid(userid);
			    	break;
			    }
		    
			} while(true);
		    
			
			do {
				System.out.print("2. 암호 : ");
				String passwd = sc.nextLine();
				
				gu.setPasswd(passwd);
				
				if(gu.getPasswd() != null) {
					break;
				}
								
			} while(true);
						
			
			do {
				System.out.print("3. 성명 : ");
				String name = sc.nextLine();
				// 그냥엔터 ""   "          "
				
				gu.setName(name);
				
				if(gu.getName() != null) {
					break;
				}
				
			} while(true);
			
			
			do {
				System.out.print("4. 주민번호 앞의 7자리만 : ");
				String jubun = sc.nextLine();
				
				gu.setJubun(jubun);
				
				if(gu.getJubun() != null) {
					break;
				}	
				
			} while(true);
			
			
			do {
				System.out.print("5. 연락처 : ");
				String mobile = sc.nextLine();
				
				gu.setMobile(mobile);
				
				if(gu.getMobile() != null) {
					break;
				}	
				
			} while(true);
			
			
			do {
				System.out.print("6. 희망급여 : ");
				String str_hopeMoney = sc.nextLine();
				
				try {
					gu.setHopeMoney(Integer.parseInt(str_hopeMoney));
					
					if( 1000 <= gu.getHopeMoney() && gu.getHopeMoney() <= 9999 ) {
						break;
					}
					
				} catch(NumberFormatException e) {
					System.out.println("\n>> 정수만 입력 가능합니다.!! <<\n");
				}
				
			} while(true);
			
			
			
			if(checkGujikja(gu)) {
				guArr[Gujikja.count++] = gu;
			    result = true;
			}
			
		} // end of if-----------------------
		
		else {
			System.out.println("\n>>> 구직자 정원마감으로 신규회원 가입은 불가합니다. <<<\n");
		}
		
		return result;
		
	}

	
	// === 구직자 모두 보기 ===
	void showAll(Gujikja[] guArr) {
		
		for(int i=0; i<Gujikja.count; i++) {
			System.out.println(guArr[i].showInfo()); 
		}
		
	}


	// === 연령대에 해당하는 구직자 찾아보기 ===
	void search(int ageline, Gujikja[] guArr) {
		
		boolean isExists = false;
		
		for(int i=0; i<Gujikja.count; i++) {
			if( guArr[i].getAge()/10*10 == ageline) { // 20        24        29        ==> 20
				                                      // 20/10*10  24/10*10  29/10*10  ==> 20
				isExists = true;
				System.out.println(guArr[i].showInfo()); 
			}
		}// end of for-------------------------
		
		if(!isExists) {
			System.out.println("\n>> 검색하신 연령대  "+ageline+"대는 없습니다. <</n");
		}
		
	}// end of void search(int ageline, Gujikja[] guArr)------------------

	
	// !!!! ==== method 의 overloading(메소드의 오버로딩) ===== !!!! //
	//  ==> method 의 이름이 같더라도
	//      파라미터의 개수나 또는 파라미터의 순서나 파라미터의 타입이 다르면 
	//      서로 다른 method 로 인식한다.
	
	// === 성별로 구직자 찾아보기 ===
	void search(String gender, Gujikja[] guArr) {
		
		for(int i=0; i<Gujikja.count; i++) {
		
			String n_gender = guArr[i].getJubun().substring(6);
			//     "1"   "2"   "3"   "4"
			
			if("남".equals(gender)) {
				if("2".equals(n_gender) || "4".equals(n_gender)) {
					continue;
				}
				else {
					System.out.println(guArr[i].showInfo());
				}
			}
			else {
				if("1".equals(n_gender) || "3".equals(n_gender)) {
					continue;
				}
				else {
					System.out.println(guArr[i].showInfo());
				}
			}
			
		}// end of for----------------------
				
	}// end of void search(String gender , Gujikja[] guArr)------------

	

	// === 특정 연령대에 해당하는 회원중 특정 성별 회원만 출력해주는 메소드 생성하기 === //
	void search(int ageline, String gender, Gujikja[] guArr) {
		
		for(int i=0; i<Gujikja.count; i++) {
			
			if(ageline != guArr[i].getAge()/10*10) {
				continue;
			}
			else {
				String n_gender = guArr[i].getJubun().substring(6);
				//     "1"  "2"  "3"  "4"
				
				if("남".equals(gender)) {
					if("1".equals(n_gender) || "3".equals(n_gender)) {
						System.out.println(guArr[i].showInfo()); 
					}
				}
				else {
					if("2".equals(n_gender) || "4".equals(n_gender)) {
						System.out.println(guArr[i].showInfo()); 
					}
				}
			}
			
		}// end of for--------------------------
		
	}// end of void search(int ageline, String gender, Gujikja[] guArr)-----------


	// 모든 구직자 희망급여보기
	public void showAllHopeMoney(Gujikja[] guArr) {
		
		/*
		   -----------------
		        구직자명    희망급여
		   -----------------
		         엄정화     5,000만원
		         이순신     7,000만원
		         유관순     8,000만원         
		*/
		
		System.out.println("-------------------");
		System.out.println("구직자명     희망급여");
		System.out.println("-------------------");
		
		for(int i=0; i<Gujikja.count; i++) {
			System.out.println(guArr[i].getName()+"     "+guArr[i].strHopeMoney() ); 
		}// end of for----------------
		
	}
	
	 
	// == Gujikja 인스턴스가 제대로 생성되었는지 확인 시켜주는 메소드 생성 == //
	public boolean checkGujikja(Gujikja gu) {
		
		if(gu.getUserid() != null &&
		   gu.getPasswd() != null &&
		   gu.getName() != null &&
		   gu.getJubun() != null &&
		   gu.getMobile() != null &&
		   gu.getHopeMoney() > 0) {
			
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
	
}
