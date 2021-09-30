package AApracticeAA;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GujikjaCompanyCtrl  implements InterGujikjaCompanyCtrl {

	// == 구직자(Gujikja) 신규 회원가입을 해주는 메소드 생성하기 == 
	
	static int MAX_MEMBER = 10;
	
	@Override
	public boolean registerGujikja(Scanner sc, ArrayList<Member> mbrArr) { // 공유를 하기 때문에 기존의 register에서, 구분을 위해 registerGujikja로 바꿔준다.
		
		boolean result = false;
				
		if( Member.count < MAX_MEMBER) {
		
			Gujikja gu = new Gujikja(); // 구직자를 하나 만들어온것이다.
			
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
				
			    for(int i=0; i<Member.count; i++) {
			    	
			    	if(mbrArr.get(i).getId().equals(id)) {
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
			
			
			
			// 구직자 확인한 후 true일 경우 멤버수 증가 & 멤버목록에 추가
			if(checkGujikja(gu)) {			
			  //mbrArr[Member.count++] = gu;
			    mbrArr.add(gu);
			    Member.count++;
				result = true;
			}
			
		} // end of if-----------------------
		
		else {
			System.out.println("\n>>> 구직자 정원마감으로 신규회원 가입은 불가합니다. <<<\n");
		}
		return result;
		
	}// end of boolean register

	// == 구인회사(Company) 신규 회원가입을 해주는 메소드 생성하기 == 
	@Override
	public boolean registerCompany(Scanner sc, ArrayList<Member> mbrArr) {
		
			
			boolean result = false;
			
			if( Member.count < MAX_MEMBER) {
			
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
					
				    for(int i=0; i<Member.count; i++) {
				    	
				    	if(mbrArr.get(i).getId().equals(id)) {
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
				  //mbrArr[Member.count++] = comp;
				    mbrArr.add(comp);
				    Member.count++;
				    result = true;
				
				
				}
				
			} // end of if-----------------------
			
			else {
				System.out.println("\n>>> 구인회사 정원마감으로 신규회원 가입은 불가합니다. <<<\n");
			}
			
			return result;
			
		


	
	}// end of boolean register(Scanner sc, Company[] compArr)

	


	// === 연령대에 해당하는 구직자 찾아보기 ===
	@Override
	public void search(int ageline, ArrayList<Member> mbrArr) {
		
		boolean isExists = false;
		
		for(int i=0; i<Member.count; i++) {
			if( mbrArr.get(i) instanceof Gujikja &&  // 이게 참이라면, 구직자로 형변환을 해서 getAge를 해준다.
					((Gujikja)mbrArr.get(i)).getAge()/10*10 == ageline) { // 20        24        29        ==> 20
				                                      // 20/10*10  24/10*10  29/10*10  ==> 20
				isExists = true;
				System.out.println(mbrArr.get(i).showInfo());  // 부모클래스의 showInfo()는 추상메소드화 되어있다. 그래서 자식 메소드에서 showInfo()를 재정의를 꼭 해야하며, 자식메소드의 showInfo()가 출력이 된다.
			}
		}// end of for-------------------------
		
		if(!isExists) {
			System.out.println("\n>> 검색하신 연령대  "+ageline+"대는 없습니다. <</n");
		}
		
	}// end of void search(int ageline, Company[] compArr)------------------

	
	
	// !!!! ==== method 의 overloading(메소드의 오버로딩) ===== !!!! //
	//  ==> method 의 이름이 같더라도
	//      파라미터의 개수나 또는 파라미터의 순서나 파라미터의 타입이 다르면 
	//      서로 다른 method 로 인식한다.
	
	// === 성별로 구직자 찾아보기 ===
	@Override
	 public void search(String gender, ArrayList<Member> mbrArr) {
		
		for(int i=0; i<Member.count; i++) {
			
			if(mbrArr.get(i) instanceof Gujikja) {

				
				String n_gender = ((Gujikja)mbrArr.get(i)).getJubun().substring(6); // Member에는 getJubun()이 없어서 오류가 난다. 그래서 형변환을 해줘야한다.
				//     "1"   "2"   "3"   "4"
				
				if("남".equals(gender)) {
					if("2".equals(n_gender) || "4".equals(n_gender)) {
						continue;
					}
					else {
						System.out.println(mbrArr.get(i).showInfo()); //showInfo()는 이미 자식 클래스에서 재정의를 해둬서 형변환이 필요없다.
					}
					}
					else {
						if("1".equals(n_gender) || "3".equals(n_gender)) {
							continue;
						}
						else {
							System.out.println(mbrArr.get(i).showInfo()); 
						}
			      }
				
			}
			
			
			
		}// end of for----------------------
				
	}// end of void search(String gender , Member[] mbrArr)------------

	

	// === 특정 연령대에 해당하는 회원중 특정 성별 회원만 출력해주는 메소드 생성하기 === //
	@Override
	public void search(int ageline, String gender, ArrayList<Member> mbrArr) {
		
		for(int i=0; i<Gujikja.count; i++) {
			
			if(mbrArr.get(i) instanceof Gujikja) {

				if(ageline != ((Gujikja)mbrArr.get(i)).getAge()/10*10) {
					continue;
				}
				else {
					String n_gender = ((Gujikja)mbrArr.get(i)).getJubun().substring(6);
					//     "1"  "2"  "3"  "4"
					
					if("남".equals(gender)) {
						if("1".equals(n_gender) || "3".equals(n_gender)) {
							System.out.println(mbrArr.get(i).showInfo()); 
						}
					}
						else {
							if("2".equals(n_gender) || "4".equals(n_gender)) {
								System.out.println(mbrArr.get(i).showInfo()); 
							}
						}
				}
				
			
			}
			
			
			
					}// end of for--------------------------
		
	}// end of void search(int ageline, String gender, Gujikja[] guArr)-----------


	// 모든 구직자 희망급여보기
	@Override
	public void showAllHopeMoney(ArrayList<Member> mbrArr) {
		
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
		
		for(int i=0; i<Member.count; i++) {
			
			if(mbrArr.get(i) instanceof Gujikja) {
				System.out.println(mbrArr.get(i).getName()+"     "+((Gujikja)mbrArr.get(i)).strHopeMoney() );
			}

		}// end of for----------------
		
	}
	
	
	
	 
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
		   comp.getSeedMoney() >0){
			
			return true;
		}
		else {
			return false;
		}
		
	}

	
	// === 구직자 로그인 ===
	@Override
	public Gujikja login(Scanner sc, ArrayList<Member> mbrArr) {
		
		Gujikja loginGu = null;
		
		System.out.print("▷ 구직자 ID : ");
		String input_id = sc.nextLine();
		
		System.out.print("▷ 비밀번호 : ");
		String input_passwd = sc.nextLine();
		
		for(int i=0; i<Member.count; i++) {
			String id =	mbrArr.get(i).getId();          // 이 값은 절대 null이 아니다. 가입 시점에서 null은 이미 걸러졌기 때문이다.
			String passwd = mbrArr.get(i).getPasswd();  // 이 값은 절대 null이 아니다. 가입 시점에서 null은 이미 걸러졌기 때문이다.
		
		
			if(id.equals(input_id) && passwd.equals(input_passwd)) {
				// id 및 암호가 일치했다라면
				
				if(mbrArr.get(i) instanceof Gujikja) { // 실제로 구직자 클래스로 되어진 인스턴스입니까? 라는 뜻이다.
					loginGu = (Gujikja)mbrArr.get(i);  // 실제 구직자에 속한게 맞나 봐야 하기 때문에, 구직자로 형변환을 해준다.
					break;
				}
				
			}
		}// end of for-----------------------

		return loginGu;
	}// end of public public Gujikja login(Scanner sc, Member[] mbrArr)-----

		
	
	
	// === 구인회사 로그인 ===
	@Override
	public Company login(ArrayList<Member> mbrArr ,Scanner sc) { //오버로딩 꼼수!
		
		Company loginComp = null;
		
		System.out.print("▷ 구인회사 ID : ");
		String input_compid = sc.nextLine();
		
		System.out.print("▷ 비밀번호 : ");
		String input_comppasswd = sc.nextLine();
		
		for(int i=0; i<Member.count; i++) {
			String id =	mbrArr.get(i).getId();          
			String passwd = mbrArr.get(i).getPasswd();  
		
		
			if(id.equals(input_compid) && passwd.equals(input_comppasswd)) {
				// id 및 암호가 일치했다라면
				
				if(mbrArr.get(i) instanceof Company) {
					loginComp = (Company)mbrArr.get(i);  
					break;
				}
				
				  
				
			}
			

		}// end of for-----------------------
		

		return loginComp;
		
	}// end of public public Company login(Member[] mbrArr ,Scanner sc)-----

	
	
	
	// === 구직자 또는 구인회사 모두 보기 ===
	@Override
	public void showAll(ArrayList<Member> mbrArr, int no) { // int no는 Main의 구분자가 1이냐, 2냐를 파악해준다.
			
		if(no==1) {
			// 모든 구직자 보여주기가
			
			for(int i=0; i<Member.count; i++) {
				
				if(mbrArr.get(i) instanceof Gujikja) { // 구직자입니까?
					System.out.println(mbrArr.get(i).showInfo());
				}
				
				
			}// end of for-------------------
				
		}
		
		else if(no==2) {
			// 모든 구인회사 보여주기 자르지않고 아래의 showAll을 호출을 하는 방법을 썻다.
			showAll(mbrArr);
		
		}

	}

	
	//== 구인회사 모두보기
	@Override
	public void showAll(ArrayList<Member> mbrArr) { // 만약 회사 정보가 없을 경우도 고려를 해야한다.
		
		
		boolean isExistsCompany = false;
		
		for(int i=0; i<Member.count; i++) {
			if( mbrArr.get(i) instanceof Company) {
				isExistsCompany = true;
				break;
			}
			
		}// end of for--------------
		
		
		if(isExistsCompany) {
			System.out.println("\n====================================");
			System.out.println("회사명     직종    자본금    담당자연락처");
			System.out.println("--------------------------------------");
			
			DecimalFormat df = new DecimalFormat("#,###"); // 자본금을 보기 좋게 데시말포맷을 사용해주자!
			
			for(int i=0; i<Member.count; i++) { // 개선된 for문을 통해 배열의 크기대로 돌리면, null로 인해 오류가 발생한다.그렇기에 count 만큼 돌려야한다.
				if(mbrArr.get(i) instanceof Company) {
					System.out.println(mbrArr.get(i).getName()+"    "+((Company)mbrArr.get(i)).getJobType()+"    "+ df.format(((Company)mbrArr.get(i)).getSeedMoney()) +"원    "+mbrArr.get(i).getMobile());	
				}
			}// end of for----------
			
			System.out.println("====================================");
		}
		
		else {
			System.out.println("\n>> 가입된 구인회사가 없습니다.!! <<\n");
			
		}
	
	} // end of public void showAll(Company[] compArr)

	
	// 구직자 나의 정보 변경해주는 메소드
	@Override
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

	  
	  
	   @Override
	   public Recuritment recruit(Scanner sc, List<Recuritment> recuritList) {
		
		   Recuritment re = new Recuritment();
  
		   String c = "";
		   
		   do {
			   
			   System.out.println("채용 공고 제목을 입력해주세요! => ");
			   
			   c = sc.nextLine();
			   
			   re.setTitle(c);
			   
			   break;
			   
		   }while(true);
		   
		   
		   do {
			   
			   System.out.println("몇명의 인원을 채용하시겠습니까? => ");
			   
			   c=sc.nextLine();
			   
			   re.setHireCount(Integer.parseInt(c));
			   
			   break;
			   
			}while(true);
		   
		   
		   do {
			   System.out.println("담장자 이메일을 입력해주세요! => ");
			   
			   c=sc.nextLine();
			   
			   re.setEmail(c);
			   
			   break;
			   
		   }while(true);
		   
		   recuritList.add(re);
		   
		   
		   return re;
		   
		   
	 }
	   
   
	   
	
}
