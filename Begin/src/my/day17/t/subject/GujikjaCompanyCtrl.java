package my.day17.t.subject;

import java.text.DecimalFormat;
import java.util.*;


public class GujikjaCompanyCtrl implements InterGujikjaCompanyCtrl {

	// == 구직자(Gujikja) 신규 회원가입을 해주는 메소드 생성하기 == 
	@Override
	public boolean registerGujikja(Scanner sc, Map<String, Gujikja> guMap) {
		
		boolean result = false;
		
		Gujikja gu = new Gujikja();
		String id = null; 
		
		// == 아이디 중복검사 하기 == //
		do {
			System.out.print("1. 아이디 : ");  
			id = sc.nextLine(); 
			// 그냥엔터 ""     "      "
			// "youks"  "eomjh"  "leess"   "seokj"    "kang#$"
			
			gu.setId(id);
			
			if(gu.getId() == null) {
				continue;
			}
			
			boolean isDuplicate = false; 
			
			Set<String> keySets = guMap.keySet();
	        
	        for(String key : keySets) {
	        	if(id.equals(key)) {
		    		isDuplicate = true;
		    		break;
		    	}
	        }
			
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
			guMap.put(id, gu);
		    result = true;
		}
		
		return result;
		
	}// end of boolean register(Scanner sc, Map<String, Gujikja> guMap)---------

	
	
	// == 구인회사(Company) 신규 회원가입을 해주는 메소드 생성하기 == 
	@Override
	public boolean registerCompany(Scanner sc, Map<String, Company> compMap) {
		
		boolean result = false;
		
		Company comp = new Company();
		String id = null;
		
		// == 아이디 중복검사 하기 == //
		do {
			System.out.print("1. 아이디 : ");  
			id = sc.nextLine(); 
			// 그냥엔터 ""     "      "
			// "LG"  "samsung"  "SK" 
			
			comp.setId(id);
			
			if(comp.getId() == null) {
				continue;
			}
							
			
			boolean isDuplicate = false; 
			
			Set<String> keySets = compMap.keySet();
	        
	        for(String key : keySets) {
	        	if(id.equals(key)) {
		    		isDuplicate = true;
		    		break;
		    	}
	        }
		    
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
			String jobType = sc.nextLine();
			
			comp.setJobType(jobType);
			
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
			compMap.put(id, comp);
		    result = true;
		}
		
		return result;
		
	}// end of public boolean register(Scanner sc, Map<String, Company> compMap)----------------------
	
	


	// === 연령대에 해당하는 구직자 찾아보기 ===
	@Override
	public void search(int ageline, Map<String, Gujikja> guMap) {
		
		Set<String> keySets = guMap.keySet();
        
		if(keySets != null) {
			
			boolean isExists = false;
			
			for(String key : keySets) {
				Gujikja gu = guMap.get(key);
				
				if(	gu.getAge()/10*10 == ageline) { // 20        24        29        ==> 20
						                            // 20/10*10  24/10*10  29/10*10  ==> 20
					isExists = true;
					System.out.println(gu.showInfo()); 
				}
	        }// end of for-----------------------------------
			
			if(!isExists) {
				System.out.println("\n>> 검색하신 연령대  "+ageline+"대는 없습니다. <</n");
			}
			
		}
		else {
			System.out.println("\n>> 가입된 구직자가 없습니다.!! <<\n");
		}
		
	}// end of void search(int ageline, Map<String, Gujikja> guMap)------------------

	
	// !!!! ==== method 의 overloading(메소드의 오버로딩) ===== !!!! //
	//  ==> method 의 이름이 같더라도
	//      파라미터의 개수나 또는 파라미터의 순서나 파라미터의 타입이 다르면 
	//      서로 다른 method 로 인식한다.
	

	// === 성별로 구직자 찾아보기 ===
	@Override
	public void search(String gender, Map<String, Gujikja> guMap) {
		
		Set<String> keySets = guMap.keySet();
        
		if(keySets != null) {
			
			for(String key : keySets) {
				Gujikja gu = guMap.get(key);
				
				String n_gender = gu.getJubun().substring(6);
				//     "1"   "2"   "3"   "4"
				
				if("남".equals(gender)) {
					if("2".equals(n_gender) || "4".equals(n_gender)) {
						continue;
					}
					else {
						System.out.println(gu.showInfo());
					}
				}
				else {
					if("1".equals(n_gender) || "3".equals(n_gender)) {
						continue;
					}
					else {
						System.out.println(gu.showInfo());
					}
				}
				
	        }// end of for-----------------------------------
			
		}
		else {
			System.out.println("\n>> 가입된 구직자가 없습니다.!! <<\n");
		}
				
	}// end of void search(String gender, Map<String, Gujikja> guMap)------------

	


	// === 특정 연령대에 해당하는 회원중 특정 성별 회원만 출력해주는 메소드 생성하기 === //
	@Override
	public void search(int ageline, String gender, Map<String, Gujikja> guMap) {
		
		Set<String> keySets = guMap.keySet();
        
		if(keySets != null) {
			
			boolean isExists = false;
			
			for(String key : keySets) {
				
				Gujikja gu = guMap.get(key);
				
				if(ageline != (gu.getAge()/10*10)){
					continue;
				}
				else {
					String n_gender = gu.getJubun().substring(6);
					//     "1"  "2"  "3"  "4"
					
					if("남".equals(gender)) {
						if("1".equals(n_gender) || "3".equals(n_gender)) {
							System.out.println(gu.showInfo()); 
							isExists = true;
						}
					}
					else {
						if("2".equals(n_gender) || "4".equals(n_gender)) {
							System.out.println(gu.showInfo()); 
							isExists = true;
						}
					}
				}
				
	        }// end of for-----------------------------------
			
			if(!isExists) {
				System.out.println("\n>> 검색하신 연령대  "+ageline+"대의 "+gender+"성은 없습니다. <</n");
			}
			
		}
		else {
			System.out.println("\n>> 가입된 구직자가 없습니다.!! <<\n");
		}	
		
	}// end of void search(int ageline, String gender, Map<String, Gujikja> guMap)-----------



	// 모든 구직자 희망급여보기
	@Override
	public void showAllHopeMoney(Map<String, Gujikja> guMap) {
		
		/*
		   -----------------
		        구직자명    희망급여
		   -----------------
		         엄정화     5,000만원
		         이순신     7,000만원
		         유관순     8,000만원         
		*/
		
		Set<String> keySets = guMap.keySet();
        
		if(keySets != null) {
			
			System.out.println("-------------------");
			System.out.println("구직자명     희망급여");
			System.out.println("-------------------");
			
			for(String key : keySets) {
				Gujikja gu = guMap.get(key);
				
				System.out.println(gu.getName()+"     "+gu.strHopeMoney());  
	        }
		}
		else {
			System.out.println("\n>> 가입된 구직자가 없습니다.!! <<\n");
		}
		
	}// end of public void showAllHopeMoney(Map<String, Gujikja> guMap)-------------------
	
	 
	// == Gujikja 인스턴스가 제대로 생성되었는지 확인 시켜주는 메소드 생성 == //
	@Override
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
	@Override
	public boolean checkCompany(Company comp) {
		
		if(comp.getId() != null &&
		   comp.getPasswd() != null &&
		   comp.getName() != null &&
		   comp.getMobile() != null &&
		   comp.getJobType() != null &&
		   comp.getSeedMoney() > 0) {
			
			return true;
		}
		else {
			return false;
		}
		
	}


    // === 구직자 로그인 ===
	@Override
	public Gujikja login(Scanner sc, Map<String, Gujikja> guMap) {
		
		System.out.print("▷ 구직자 ID : ");
		String input_id = sc.nextLine();
		
		System.out.print("▷ 비밀번호 : ");
		String input_passwd = sc.nextLine();
		
		Gujikja loginGu = guMap.get(input_id);
		
		if(loginGu != null && loginGu.getPasswd().equals(input_passwd) ) {
			return loginGu;
		}
		else {
			return null;
		}
		
	}// end of public Gujikja login(Scanner sc, Map<String, Gujikja> guMap)--------

	

    // === 구인회사 로그인 ===
	@Override
	public Company login(Map<String, Company> compMap, Scanner sc) {
		
		System.out.print("▷ 구인회사 ID : ");
		String input_id = sc.nextLine();
		
		System.out.print("▷ 비밀번호 : ");
		String input_passwd = sc.nextLine();
		
		Company loginComp = compMap.get(input_id);
		
		if(loginComp != null && loginComp.getPasswd().equals(input_passwd) ) {
			return loginComp;
		}
		else {
			return null;
		}
		
	}// end of public Company login(Map<String, Company> compMap, Scanner sc)-------


	
	// 모든 구직자 보기 
	@Override
	public void showAllGujikja(Map<String, Gujikja> guMap) {
		
		Set<String> keySets = guMap.keySet();
        
		if(keySets != null) {
			
			System.out.println("\n==============================================");
			System.out.println("아이디      성명      현재나이     성별        희망급여        연락처");
			System.out.println("==============================================");
				
			DecimalFormat df = new DecimalFormat("#,###");
	        
			for(String key : keySets) {
				Gujikja gu = guMap.get(key);
				
				String genderFlag = gu.getJubun().substring(6);
				String gender = ("1".equals(genderFlag) || "3".equals(genderFlag))?"남":"여";
				
				System.out.println(gu.getId() +"  "+gu.getName()+"     "+gu.getAge()+"      "+gender+"       "+df.format(gu.getHopeMoney()) +"원      "+ gu.getMobile());  
	        }
		}
		else {
			System.out.println("\n>> 가입된 구직자가 없습니다.!! <<\n");
		}
			
	}// end of public void showAllGujikja(Map<String, Gujikja> guMap)----------------------------


	
	// 채용공고 등록하기
	@Override
	public boolean registerRecurit(Scanner sc, Company loginComp, List<Recuritment> recuritList) {
		
		boolean result = false;
		
		Recuritment rcrmt = new Recuritment();
		
		do {
			System.out.print("1. 채용제목 : ");
			String title = sc.nextLine();
			
			rcrmt.setTitle(title);
			
			if(rcrmt.getTitle() != null) {
				break;
			}
							
		} while(true);
					
		
		do {
			System.out.print("2. 채용인원수 : ");
			String str_hireCount = sc.nextLine();
			
			try {
				rcrmt.setHireCount(Integer.parseInt(str_hireCount));
				
				if( rcrmt.getHireCount() > 0 ) {
					break;
				}
								
			} catch(NumberFormatException e) {
				System.out.println("\n>> 정수만 입력 가능합니다.!! <<\n");
			}
			
		} while(true);
		
		
		do {
			System.out.print("3. 성별 : ");
			String gender = sc.nextLine();
			
			rcrmt.setGender(gender);
			
			if(rcrmt.getGender() != null) {
				break;
			}	
			
		} while(true);
		
		
		rcrmt.setComp(loginComp);
		
		int before_size = recuritList.size();
		
		recuritList.add(rcrmt);
		
		int after_size = recuritList.size();
		
		if(after_size > before_size) {
			result = true;
		}
		
		return result;	
		
	}// end of public boolean registerRecurit(Scanner sc, Company loginComp, List<Recuritment> recuritList)---------------
	

	// 모든 구인회사 보기
	@Override
	public void showAllCompany(Map<String, Company> compMap) {
		
		Set<String> keySets = compMap.keySet();
        
		if(keySets != null) {
			
			System.out.println("\n=========================================");
			System.out.println("회사명       직종        자본금      담당자연락처");
			System.out.println("----------------------------------------");
				
			DecimalFormat df = new DecimalFormat("#,###");
	        
			for(String key : keySets) {
				Company comp = compMap.get(key);
				System.out.println(comp.getName()+"    "+ comp.getJobType()+"     "+ df.format( comp.getSeedMoney()) +"원    "+ comp.getMobile());
	        }
		}
		else {
			System.out.println("\n>> 가입된 구인회사가 없습니다.!! <<\n");
		}
		
		
	}// end of public void showAll(Map<String, Company> compMap)------------------

	
	// 모든채용공고 보기
	@Override
	public void showAllRecurit(List<Recuritment> recuritList) {
		
		if(recuritList.size() > 0) {
			for(Recuritment rcrmt : recuritList) {
				System.out.println(rcrmt.recuritInfo()); 
			}// end of for---------------------
		}
		else {
			System.out.println("\n >>> 등록된 채용공고가 없습니다!! <<< \n");
		}
		
	}// end of public void showAll(List<Recuritment> recuritList)---------------------


	// 우리회사채용공고 보기
	@Override
	public void showMyCompanyRecurit(Company loginComp, List<Recuritment> recuritList) {
		
		if(recuritList.size() > 0) {
			boolean flag = false;
			for(Recuritment rcrmt : recuritList) {
				
				if( rcrmt.getComp().getId().equals(loginComp.getId()) ) {
					System.out.println(rcrmt.recuritInfo());
					flag = true;
				}
				 
			}// end of for---------------------
			
			if(!flag) {
				System.out.println("\n >>> "+loginComp.getName()+" 에서 등록한 채용공고는 없습니다!! <<< \n");
			}
			
		}
		else {
			System.out.println("\n >>> 등록된 채용공고가 없습니다!! <<< \n");
		}
		
	}// end of public void showMyCompanyRecurit(Company loginComp, List<Recuritment> recuritList)-------- 
	

    // 구직자 나의 정보 변경해주는 메소드 
	@Override
	public Gujikja update(Scanner sc, Gujikja loginGu) {
		
		System.out.println("\n>>=== 변경전 구직자 나의 정보 ===<<");
		System.out.println(loginGu.showInfo());
		
		String original_passwd = loginGu.getPasswd();
		String original_name = loginGu.getName();
		int original_hopeMoney = loginGu.getHopeMoney();
		
		
		do {
			System.out.print("▷암호변경[변경하지 않으려면 그냥 엔터하세요] : ");
			String passwd = sc.nextLine();
			
			if("".equals(passwd)) {
			//	System.out.println("엔터이군요!!");
				passwd = original_passwd;
			}
			
			loginGu.setPasswd(passwd);
			
			if(loginGu.getPasswd() != null) {
				break;
			}
							
		} while(true);
		
		
		do {
			System.out.print("▷성명변경[변경하지 않으려면 그냥 엔터하세요] : ");
			String name = sc.nextLine();
			
			if("".equals(name)) {
				//	System.out.println("엔터이군요!!");
				name = original_name;
			}
			
			loginGu.setName(name);
			
			if(loginGu.getName() != null) {
				break;
			}
			
		} while(true);
		
		
		
		do {
			System.out.print("▷희망급여변경[변경하지 않으려면 그냥 엔터하세요] : ");
			String str_hopeMoney = sc.nextLine();
			
			if("".equals(str_hopeMoney)) {
				//	System.out.println("엔터이군요!!");
				str_hopeMoney = String.valueOf(original_hopeMoney);
			}
			
			try {
				loginGu.setHopeMoney(Integer.parseInt(str_hopeMoney));
				
				if( 1000 <= loginGu.getHopeMoney() && loginGu.getHopeMoney() <= 9999 ) {
					break;
				}
				
			} catch(NumberFormatException e) {
				System.out.println("\n>> 정수만 입력 가능합니다.!! <<\n");
			}
			
		} while(true);
	
		
		return loginGu;
		
    }// end of public Gujikja update(Scanner sc, Gujikja loginGu)------------------------------



	// 구인회사의 정보를 변경해주는 메소드 
	@Override
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
			//	System.out.println("엔터이군요!!");
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
				//	System.out.println("엔터이군요!!");
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
				//	System.out.println("엔터이군요!!");
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
		
	}// end of public Company update(Scanner sc, Company loginComp)------------------------

	
	// 채용제목으로 채용정보를 검색하기
	@Override
	public void searchRecuritByTitle(String searchTitle, List<Recuritment> recuritList) {
		
		if(recuritList != null && recuritList.size() > 0) {
			boolean flag = false;
			
			for(Recuritment rcrmt : recuritList) {
				int index = rcrmt.getTitle().indexOf(searchTitle);
				if(index >= 0) {
					System.out.println(rcrmt.recuritInfo());
					flag = true;
				}
			}// end of for--------------------------
			
			if(!flag) {
				System.out.println("\n >>검색하신 "+searchTitle+" 라는 것이 채용제목으로 등록된 것은 없습니다. << \n");
			}
		}
		
		else {
			System.out.println("\n >> 채용정보가 없습니다.!! << \n");
		}
		
	}// end of public void searchRecuritByTitle(String searchTitle, List<Recuritment> recuritList)--------
	
		
	// 성별로 채용정보를 검색하기
	@Override
	public void searchRecuritByGender(String gender, List<Recuritment> recuritList) {
		
		if(recuritList != null && recuritList.size() > 0) {
			
			for(Recuritment rcrmt : recuritList) {
				if(gender.equals(rcrmt.getGender())) {
					System.out.println(rcrmt.recuritInfo());
				}
			}	
		}
		
		else {
			System.out.println("\n >> 채용정보가 없습니다.!! << \n");
		}
		
	}// end of public void searchRecuritByGender(String gender, List<Recuritment> recuritList)----------
		
	
	// 직종별로 구인회사를 검색하기
	@Override
	public void searchRecuritByJobType(String searchJobType, Map<String, Company> compMap) {
		
		Set<String> keySets = compMap.keySet();
		
		if(keySets != null) {
		
			boolean flag = false;
			
			for(String key : keySets) {
				Company comp = compMap.get(key);
				int index = comp.getJobType().indexOf(searchJobType);
				if( index >= 0 ) {
					System.out.println(comp.showInfo());
					flag = true;
				}
			}// end of for------------------------
		
			if(!flag) {
				System.out.println("\n >> 검색하신 "+searchJobType+" 을 직종으로 하고 있는 구인회사는 없습니다.!! << \n");
			}
			
		}
		
		else {
			System.out.println("\n >> 등록된 구인회사가 없습니다.!! << \n");
		}
		
	}// end of public void searchRecuritByJobType(String searchJobType, Map<String, Company> compMap)------
	
	
}
