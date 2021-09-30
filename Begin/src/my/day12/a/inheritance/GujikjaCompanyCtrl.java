package my.day12.a.inheritance;

import java.text.DecimalFormat;
import java.util.Scanner;


public class GujikjaCompanyCtrl {

	// == 구직자(Gujikja) 신규 회원가입을 해주는 메소드 생성하기 == 
	boolean register(Scanner sc, Gujikja[] guArr) {
		
		boolean result = false;
		
		if( Gujikja.count < guArr.length) {
		
			Gujikja gu = new Gujikja();
			
			// == 아이디 중복검사 하기 == //
			do {
				System.out.print("1. 아이디 : ");  
				String id = sc.nextLine(); 
				// 그냥엔터 ""     "      "
				// "youks"  "eomjh"  "leess"   "seokj"    "kang#$"
				
				gu.setId(id);
				
				if(gu.getId() == null) {
					continue;
				}
								
				
				boolean isDuplicate = false; 
				
			    for(int i=0; i<Gujikja.count; i++) {
			    	
			    	if(guArr[i].getId().equals(id)) {
			    		isDuplicate = true;
			    		break;
			    	}
			    	
			    }// end of for-------------------
			    
			    if(isDuplicate) {
			    	System.out.println("\n>> "+id+"는 이미 사용중 입니다. 새로운 아이디를 입력하세요!! <<\n");     
			    }
			    else {
			    	gu.setId(id);
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

	// == 구인회사(Company) 신규 회원가입을 해주는 메소드 생성하기 == 
	public boolean register(Scanner sc, Company[] compArr) {
		
			
			boolean result = false;
			
			if( Company.count < compArr.length) {
			
				Company comp = new Company();
				
				// == 아이디 중복검사 하기 == //
				do {
					System.out.print("1. 아이디 : ");  
					String id = sc.nextLine(); 
					// 그냥엔터 ""     "      "
					// "LG"  "SAMSUNG"  "SK" 
					
					comp.setId(id);
					
					if(comp.getId() == null) {
						continue;
					}
									
					
					boolean isDuplicate = false; 
					
				    for(int i=0; i<Company.count; i++) {
				    	
				    	if(compArr[i].getId().equals(id)) {
				    		isDuplicate = true;
				    		break;
				    	}
				    	
				    }// end of for-------------------
				    
				    if(isDuplicate) {
				    	System.out.println("\n>> "+id+"는 이미 사용중 입니다. 새로운 아이디를 입력하세요!! <<\n");     
				    }
				    else {
				    	comp.setId(id);
				    	break;
				    }
			    
				} while(true);
			    
				
				do {
					System.out.print("2. 암호 : ");
					String passwd = sc.nextLine();
					
					comp.setPasswd(passwd);
					
					if(comp.getPasswd() != null) {
						break;
					}
									
				} while(true);
							
				
				do {
					System.out.print("3. 회사명 : ");
					String name = sc.nextLine();
					// 그냥엔터 ""   "          "
					
					comp.setName(name);
					
					if(comp.getName() != null) {
						break;
					}
					
				} while(true);
				
				
				
				do {
					System.out.print("4. 인사 담당자 연락처 : ");
					String mobile = sc.nextLine();
					
					comp.setMobile(mobile);
					
					if(comp.getMobile() != null) {
						break;
					}	
					
				} while(true);
				
				
				do {
					System.out.print("5. 회사직종타입(서비스,제조업,IT,...) : ");
					String jopType = sc.nextLine();
					
					comp.setJobType(jopType);
					
					if(comp.getJobType() != null) {
						break;
					}	
					
				} while(true);
				
				do {
					System.out.print("6. 자본금 : ");
					String str_seedMoney = sc.nextLine();
					
					try {
						comp.setSeedMoney(Long.parseLong(str_seedMoney));
						
						if( comp.getSeedMoney() > 0 ) {
							break;
						}
						
					} catch(NumberFormatException e) {
						System.out.println("\n>> 정수만 입력 가능합니다.!! <<\n");
					}
					
				} while(true);
				
				
				
				if(checkCompany(comp)) {
					compArr[Company.count++] = comp;
				    result = true;
				}
				
			} // end of if-----------------------
			
			else {
				System.out.println("\n>>> 구인회사 정원마감으로 신규회원 가입은 불가합니다. <<<\n");
			}
			
			return result;
			
		


	
	}// end of boolean register(Scanner sc, Company[] compArr)

	
	
	
	
	
	
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
		
		if(gu.getId() != null &&
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
	
	
	// == Company 인스턴스가 제대로 생성되었는지 확인 시켜주는 메소드 생성 == //
	public boolean checkCompany(Company comp) {
		
		if(comp.getId() != null &&
		   comp.getPasswd() != null &&
		   comp.getName() != null &&
		   comp.getMobile() != null &&
		   comp.getJobType() != null &&
		   comp.getSeedMoney() >0){
			
			return true;
		}
		else {
			return false;
		}
		
	}

	
	// === 구직자 로그인 ===
	public Gujikja login(Scanner sc, Gujikja[] guArr) {
		
		Gujikja loginGu = null;
		
		System.out.print("▷ 구직자 ID : ");
		String input_id = sc.nextLine();
		
		System.out.print("▷ 비밀번호 : ");
		String input_passwd = sc.nextLine();
		
		for(int i=0; i<Gujikja.count; i++) {
			String id =	guArr[i].getId();          // 이 값은 절대 null이 아니다. 가입 시점에서 null은 이미 걸러졌기 때문이다.
			String passwd = guArr[i].getPasswd();  // 이 값은 절대 null이 아니다. 가입 시점에서 null은 이미 걸러졌기 때문이다.
		
		
			if(id.equals(input_id) && passwd.equals(input_passwd)) {
				
				// 로그인 성공이라면
				
				loginGu = guArr[i];  //아이디와 패스워드가 일치한다면 loginGu로 리턴시켜준다.
				break;
			}
		}// end of for-----------------------

		return loginGu;
	}// end of public Gujikja login(Scanner sc, Gujikja[] guArr)-----

		
	
	
	// === 구인회사 로그인 ===
	public Company login(Scanner sc, Company[] compArr) {
		
		Company loginComp = null;
		
		System.out.print("▷ 구인회사 ID : ");
		String input_compid = sc.nextLine();
		
		System.out.print("▷ 비밀번호 : ");
		String input_comppasswd = sc.nextLine();
		
		for(int i=0; i<Company.count; i++) {
			String id =	compArr[i].getId();          
			String passwd = compArr[i].getPasswd();  
		
		
			if(id.equals(input_compid) && passwd.equals(input_comppasswd)) {
				
				// 로그인 성공이라면
				
				loginComp = compArr[i];  
				break;
			}
			

		}// end of for-----------------------
		

		return loginComp;
		
	}// end of public Company login(Scanner sc, Company[] compArr)-----

	
	public void showAll(Company[] compArr) { // 만약 회사 정보가 없을 경우도 고려를 해야한다.
		
		
		if(compArr != null) {
			System.out.println("\n====================================");
			System.out.println("회사명     직종    자본금    담당자연락처");
			System.out.println("--------------------------------------");
			
			DecimalFormat df = new DecimalFormat("#,###"); // 자본금을 보기 좋게 데시말포맷을 사용해주자!
			
			for(int i=0; i<Company.count; i++) { // 개선된 for문을 통해 배열의 크기대로 돌리면, null로 인해 오류가 발생한다.그렇기에 count 만큼 돌려야한다.
				System.out.println(compArr[i].getName()+"    "+compArr[i].getJobType()+"    "+ df.format(compArr[i].getSeedMoney()) +"원    "+compArr[i].getMobile());
				
			}// end of for----------
			
			System.out.println("====================================");
		}
		
		else {
			System.out.println("\n>> 가입된 구인회사가 없습니다.!! <<\n");
			
		}
		
		
		
	} // end of public void showAll(Company[] compArr)

	
	// 구직자 나의 정보 변경해주는 메소드
	public Gujikja update(Scanner sc, Gujikja loginGu) {
		
		// 2. 넘겨준 정보를 아래에서 보여준다.
		System.out.println("\n>>=== 변경전 구직자 나의 정보 ===<<");  
		System.out.println(loginGu.showInfo()); // 내 정보를 보여주는것이 먼저.
		
		String original_passwd = loginGu.getPasswd();
		String original_name = loginGu.getName();
		int original_hopeMoney = loginGu.getHopeMoney(); //처음부터 아예 정보들을 밖으로 빼버린다.
		
		
		
		
		do { //이 서식을 위에서 가져와준다. 정책에 맞는 비밀번호를 입력해야하기 때문.
			System.out.print("▷암호변경 [변경하지 않으려면 그냥 엔터하세요] : ");
			String passwd = sc.nextLine();

			// setPasswd로 가면, check어쩌구가 검사하고있는데, 엔터는 정해진게 없다. 그래서 아래에서 만들어준다.
			if("".equals(passwd)) {
			//System.out.println("엔터이군요!!");
				passwd = original_passwd; // 엔터는 원래 암호를 그대로 유지시키겠다는 뜻이다.
			}
				// 로그인 할 때 가지고왔던 그 비밀번호를 넣어주면, 엔터 때문에 null로 바뀌기 때문에 위에 빼놓은 기존의 비밀번호를 넣어준다. 

			loginGu.setPasswd(passwd);  // 엔터가 아니라면 검사를 시작해준다.
	
			if(loginGu.getPasswd() != null) {
				break;
			}
							
		} while(true);
		

		do {
			System.out.print("▷성명변경  [변경하지 않으려면 그냥 엔터하세요] : ");
			String name = sc.nextLine();
			
			if("".equals(name)) {
				name = original_name;  //위의 비밀번호와 같은 원리이다.
				}

			loginGu.setName(name);
			
			if(loginGu.getName() != null) {
				break;
			}
			
		} while(true);
		
		
		do {
			System.out.print("▷희망급여변경  [변경하지 않으려면 그냥 엔터하세요] : ");
			String str_hopeMoney = sc.nextLine();
			
			if("".equals(str_hopeMoney)) {
				str_hopeMoney = String.valueOf(original_hopeMoney);    //original_hopeMoney는 int 이기 때문에 오류가 난다. 그래서 String.valueOf로 바꿔준다.
			}
			
			try {
				loginGu.setHopeMoney(Integer.parseInt(str_hopeMoney));
				
				if( 1000 <=loginGu.getHopeMoney() && loginGu.getHopeMoney() <= 9999 ) {
					break;
				}
				
			} catch(NumberFormatException e) {
				System.out.println("\n>> 정수만 입력 가능합니다.!! <<\n");
			}
			
		} while(true);
		
		/* 굳이 변경되어진 정보를 배열속에 넣을 필요 없다. 맨 처음에 로그인을 할 때 배열속에서 가져온것이기 때문에 
		 * case8 에서 배열속에 가지고 온것을 바꿔줬기 때문에 이미 끝난것을 아래쪽 처럼 다시 넣어줄 필요가 없는것이다. 이미 바뀌어있다.
		for(int i=0; i<Gujikja.count; i++) { 
				//변경하고자 하는 사람의 아이디 
			if(guArr[i].getId().equals(loginGu.getId())) {  // 변경을 하려는 사람의 id와, 배열의 id를 비교해서 같을 경우 변경된 정보들을 넣어준다. 
				guArr[i].setPasswd(passwd); //위의 passwd는 지역변수라 바로 가져오지를 못한다. 그래서 밖으로 빼줘야한다.
				guArr[i].setName(name);
				guArr[i].setHopeMoney(hopeMoney);
			}
			
		}// end of for------------------------
*/
		
		return loginGu;  // 변경되어진rjtdmf sjaruwnsek.
		
		
		
		
	}// end of public boolean update(Scanner sc, Gujikja loginGu, Gujikja[] guArr)

	
		// 구인회사 나의 정보 변경해주는 메소드 
	   public Company update(Scanner sc, Company loginComp) {

	      System.out.println("\n>>=== 변경전 구인회사 나의 정보 ===<<");
	      System.out.println(loginComp.showInfo());
	      
	      String original_passwd = loginComp.getPasswd();
	      String original_jobType = loginComp.getJobType();
	      long original_seedMoney = loginComp.getSeedMoney();
	      
	      
	      do {
	         System.out.print("▷암호변경[변경하지 않으려면 그냥 엔터하세요] : ");
	         String passwd = sc.nextLine();
	         
	         if("".equals(passwd)) {
	         //   System.out.println("엔터이군요!!");
	            passwd = original_passwd;
	         }
	         
	         loginComp.setPasswd(passwd);
	         
	         if(loginComp.getPasswd() != null) {
	            break;
	         }
	                     
	      } while(true);
	      
	      
	      
	      do {
	         System.out.print("▷회사직종타입(서비스,제조업,IT,...) : ");
	         String jobType = sc.nextLine();
	         
	         if("".equals(jobType)) {
	            //   System.out.println("엔터이군요!!");
	            jobType = original_jobType;
	         }
	         
	         loginComp.setJobType(jobType);
	         
	         if(loginComp.getJobType() != null) {
	            break;
	         }   
	         
	      } while(true);
	      
	      
	      
	      do {
	         System.out.print("▷자본금 : ");
	         String str_seedMoney = sc.nextLine();
	         
	         if("".equals(str_seedMoney)) {
	            //   System.out.println("엔터이군요!!");
	            str_seedMoney = String.valueOf(original_seedMoney);
	         }
	         
	         try {
	            loginComp.setSeedMoney(Long.parseLong(str_seedMoney));
	            
	            if( loginComp.getSeedMoney() > 0 ) {
	               break;
	            }
	            
	         } catch(NumberFormatException e) {
	            System.out.println("\n>> 정수만 입력 가능합니다.!! <<\n");
	         }
	         
	      } while(true);
	   
	      
	      return loginComp;      
	      


		
	}// end of public Company update(Scanner sc, Company loginComp)

	
	
}
