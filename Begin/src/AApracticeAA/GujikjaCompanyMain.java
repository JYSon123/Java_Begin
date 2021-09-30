package AApracticeAA;

import java.util.*;

public class GujikjaCompanyMain {

	public static void main(String[] args) {
		
		InterGujikjaCompanyCtrl ctrl = new GujikjaCompanyCtrl();  
	

		// Member[] mbrArr = new Member[10]; 
		ArrayList<Member> mbrArr = new ArrayList<Member>();
		List<Recuritment> recuritList = new ArrayList<>();
		Map<String,Company> compMap = new HashMap<>();
		Map<String,Member> mbrMap = new HashMap<>();
		Map<String,Recuritment> reMap = new HashMap<>();
		
		
		Gujikja gu1 = new Gujikja();
		gu1.setId("eomjh");
		gu1.setPasswd("qwer1234$A");
		gu1.setName("엄정화");
		gu1.setMobile("01098761234"); // 이까지가 부모클래스에서 가져왔다.
		
		gu1.setJubun("9506302");
		gu1.setHopeMoney(5000);
		
		
		
		if( ctrl.checkGujikja(gu1) ) {
		//	mbrArr[Member.count++] = gu1;
			mbrArr.add(gu1);
			Member.count++;
		}
		
			mbrMap.put("엄정화", gu1);
			
			
		
		
		
		
		//////////////////////////////////////////////
		
		Gujikja gu2 = new Gujikja();
		gu2.setId("leess");
		gu2.setPasswd("qwer1234$A");
		gu2.setName("이순신");
		gu2.setMobile("01067890070");
		
		gu2.setJubun("9407011");
		gu2.setHopeMoney(7000);
		
		
		if( ctrl.checkGujikja(gu2) ) {
		//	mbrArr[Member.count++] = gu1;
			mbrArr.add(gu2);
			Member.count++;
		}
		
		mbrMap.put("이순신", gu2);
		
		//////////////////////////////////////
		
		Gujikja gu3 = new Gujikja();
		gu3.setId("youks");
		gu3.setPasswd("qwer1234$A");
		gu3.setName("유관순");
		gu3.setMobile("01056785432");
		
		gu3.setJubun("8603012");
	    gu3.setHopeMoney(8000);
	    
		
	    if( ctrl.checkGujikja(gu3) ) {
		//	mbrArr[Member.count++] = gu1;
			mbrArr.add(gu3);
			Member.count++;
		}
	
	    mbrMap.put("유관순", gu3);
	    
	    
		////////////////////////////////////////////////////////
		
	     	    
	    Company comp1 = new Company();
	    comp1.setId("LG");
	    comp1.setPasswd("qwer1234$A");
	    comp1.setName("엘지");
	    comp1.setMobile("01034567890");
	    
	    
	    comp1.setJobType("전자");
	    comp1.setSeedMoney(500000000000L);
	    
	    
	    if( ctrl.checkCompany(comp1) ) {
	      //mbrArr[Member.count++] = comp1;
	    	mbrArr.add(comp1);
			Member.count++;
		}
	    
	    compMap.put("엘지", comp1);
	    	
	  
	    
	    
	    Company comp2 = new Company();
	    comp2.setId("samsung");
	    comp2.setPasswd("qwer1234$A");
	    comp2.setName("삼성");
	    comp2.setMobile("01079795678");
	    
	    comp2.setJobType("반도체");
	    comp2.setSeedMoney(500000000000L);
	    
	    if( ctrl.checkCompany(comp2) ) {
	    	//mbrArr[Member.count++] = comp1;
	    	mbrArr.add(comp2);
			Member.count++;
		}
	    
	    compMap.put("삼성", comp2);
	    
	    
        System.out.println("Member.count : " + Member.count); // 5가 출력된다.
	    
        
        
		
        ////////////////////////////////////////////////////////
	    
	    	   	    
	    
		Scanner sc = new Scanner(System.in);
		String smenuNo = "";
		
		Gujikja loginGu   = null; // 구직자로 로그인 되어지면, 로그인 되어진 구직자 인스턴스를 저장해주는 용도임.
		Company loginComp = null; // 구직회사로 로그인 되어지면, 로그인 되어진 구인회사 인스턴스를 저장해주는 용도임.
		String title = "";
		
		
		
		do {
			
			
			
			if(loginGu == null && loginComp == null)
	            title = "\n >>> === 메인메뉴 === <<< \n";
	        

			System.out.println(title
			         + "1.구직자 회원가입     2.구인회사 회원가입\n"
					 + "3.구직자 로그인        4.구인회사 로그인\n"
					 + "5.프로그램 종료 \n");
	
			System.out.print("▷ 메뉴번호 선택 => "); 
			smenuNo = sc.nextLine();
			Recuritment re = new Recuritment();
			
			switch (smenuNo) {
				
			case "1": // 구직자 회원가입
								
					boolean result = ctrl.registerGujikja(sc, mbrArr); 
					
//					boolean result = false;
					if(result) {
						System.out.println(">> 구직자 회원가입 성공!! \n");
					}
					
					break;   // switch 의 break; 이다	
					
				
				case "2": // 구인회사 회원가입
				    result = ctrl.registerCompany(sc, mbrArr);  //result = ctrl.register 로 쓰게되면, 공유하는 Main으로 가는데, 이게 구직자로 빠져버린다. 그래서 구분자를 넣어줘야한다. 아니면 이름을 달리해줘야한다
					
					if(result) {
						System.out.println(">> 구인회사 회원가입 성공!! \n");
					}
					
					break;   // switch 의 break; 이다
				
					
				case "3": // 구직자 로그인
				   
					loginGu	= ctrl.login(sc, mbrArr);
					String guNo = "";
					
					if(loginGu == null) {
						System.out.println("\n>> 로그인 실패!! <<\n");
						break;
					}
						do {
						    System.out.println("\n >>> === 메인메뉴[구직자 "+loginGu.getName()+" 로그인중..] === <<< \n"
												  + "1.모든 구인회사 보기   2.모든 채용공고 보기   3.내정보 변경하기   4.검색(채용정보, 회사정보)\n"
											      + "5. 메인메뉴로 가기   6. 로그아웃");
							
						
							System.out.print("▷ 메뉴번호 선택 => ");
							
							guNo = sc.nextLine();
							
							
							switch(guNo) {
								case "1" :
									
									if(loginComp == null && loginGu != null) {
										ctrl.showAll(mbrArr, 2);  
									} 
									else {
										System.out.println("\n>> 먼저 구직자 계정으로 로그인 하세요!! <<\n");
									}
									
								case "2" :  // 모든 채용공고 보기
									
								
									
									
									break;
									
								case "3" :  // 내정보 변경하기
									
									
									if(loginGu == null && loginComp == null){
										
									}
									else if(loginGu != null && loginComp == null) {
									
										loginGu = ctrl.update(sc, loginGu);  // update 메소드를 만들어주자, 로그인 되어진 그사람의 정보를 넘기고, 업데이트를 해준다.
										
										System.out.println("\n>>=== 변경 후 구직자 나의 정보===<<");
										
										System.out.println(loginGu.showInfo());
										
										continue;
									}
																		
								case "4" : //검색(채용정보, 회사정보)     
									
									
									System.out.print("검색하실 회사 이름을 한국어로 입력해주세요 ==> ");
									String cname = sc.nextLine();
									
									Company comp = compMap.get(cname);
									
										System.out.println(
												  "====== 회사정보 ======" + 
												  "1. 회사명 : "+comp.getName()+"\n"
												+ "2. 직종타입 : "+comp.getJobType()+"\n"
												+ "3. 자본금 : "+comp.getSeedMoney());
									break;
												
								case "5" : // 메인메뉴로 가기
									
									System.out.println("채용공고를 보려고 하는 회사의 이름을 입력해주세요 ==> ");
									
									Recuritment re1 = reMap.get(sc.nextLine());
									
									System.out.println("1. 채용공고문 : " + re1.getTitle()+"\n"
									          		  +"2. 채용인원수 : " + re1.getHireCount()+ "명\n"
											          +"3. 회사명 : " + re1.getName()+ "\n"
											          +"4. 담당자 이메일 : " + re1.getEmail());
									
									
									break;
										
								case "6" :  // 로그아웃
									
									loginGu = null;
									loginComp = null;
									
									System.out.println("\n>> 로그아웃 되었습니다. <<\n");
									
									break;
									
								}// end of switch
									
						  
						}while(!(5 == Integer.parseInt(guNo)));
						
						
					case "4": // 구인회사 로그인
				   
					loginComp = ctrl.login(mbrArr, sc); // 오버로딩 꼼수를 썻다. 위의 3번의 메소드의 파라미터 순서만 바꿔줬다.
					
					String coNo = "";
					String 	ricuritComp = "";
					
					
					if(loginComp == null)
						System.out.println("\n>> 로그인 실패!! <<\n");
	
					do {
					    System.out.println("\n >>> === 메인메뉴[구인회사 "+loginComp.getName()+" 로그인중..] === <<< \n"
											  + "1.모든 구직자 보기   2.채용공고등록   3.우리회사채용공고 보기   4.우리회사정보 변경하기\n"
										      + "5.검색(구직자)  6. 모든 구직자 희망급여보기  7.메인메뉴로 가기  8.로그아웃   ");
						
					
						System.out.print("▷ 메뉴번호 선택 => ");
						
						coNo = sc.nextLine();
						
						switch(coNo) {  //모든 구직자 보기
							case "1" :
								
								if(loginComp != null && loginGu == null) {
									ctrl.showAll(mbrArr,1 ); 
								} 
								else {
									System.out.println("\n>> 먼저 구인회사 계정으로 로그인 하세요!! <<\n");
								}
								break;
															
							case "2" :  // 채용공고등록
								
								re = ctrl.recruit(sc, recuritList);								
								
								re.setName(loginComp.getName());

								reMap.put(re.getName(), re);
								
								
								break;		
								
								
							case "3" :  // 우리회사 채용공고보기
								
								System.out.println("1. 채용공고문 : " + re.getTitle()+"\n"
										          +"2. 채용인원수 : " + re.getHireCount()+ "명\n"
												  +"3. 회사명 : " + re.getName()+ "\n"
												  +"4. 담당자 이메일 : " + re.getEmail());
												  
								break;
		
								
								
							case "4" : //우리회사정보 변경하기      
								
								if(loginGu == null && loginComp != null) {
									
									loginComp = ctrl.update(sc, loginComp);
									System.out.println("\n>>=== 변경 후 구인회사 나의 정보 ===<<");
									System.out.println(loginComp.showInfo());
									
								}
								
								break;
								
								
							case "5" : // 5.검색(구직자) 
								
								searchMenu(sc,ctrl,mbrArr);
								
								break; 
		
								
							case "6" :  // 모든 구직자 희망급여보기  
								
								
									ctrl.showAllHopeMoney(mbrArr);
									
									break;
								
								
								
							case "7" : // 메인메뉴로 가기
								
								
								break;
		
								
								
							case "8" : // 로그아웃
								
								loginGu = null;
								loginComp = null;
								
								System.out.println("\n>> 로그아웃 되었습니다. <<\n");

								break;
			
								
								
							}// end of switch
								
						
					  
					}while(!(7 == Integer.parseInt(coNo)));
					
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
	
	
	
	
		
		
		
		
		
	
	
	
	
	
	
	

	
	static void searchMenu(Scanner sc, InterGujikjaCompanyCtrl ctrl, ArrayList<Member> mbrArr) {
		
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
						 		
						 		ctrl.search(ageline, mbrArr); 
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
					 		ctrl.search(gender, mbrArr);
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
						 		
						 		ctrl.search(ageline, gender, mbrArr);
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
		
		}while(!("4".equals(sMenuNo)));  // end of do---
		
		
	} // end of static void searchMenu()----------------------
	
 
}


