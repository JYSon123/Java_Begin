package A;

import java.util.*;


public class GujikjaCompanyCtrl implements InterGujikjaCompanyCtrl {

	
	// 구직자 신규회원가입을 해주는 메소드를 생성해보자.
	@Override
	public boolean registerGujikja(Scanner sc, Map<String, Gujikja> guMap) {
		
		boolean result = false;
		
		Gujikja gu = new Gujikja();
		String id = null;
		
		
		// 아이디가 있는 아이디인지, 없는 아이디인지 중복검사를 하자.
		
		do {
			System.out.print("1. 아이디 : ");
			id = sc.nextLine();
			
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
			}// end of for----------------	
			
			if(isDuplicate) {
				System.out.println("== 이미 사용중인 아이디입니다! ==");
			}
			else {
				gu.setId(id);
				System.out.println(gu.getId());
				
				break;
			}
		
		}while(true); 
		
		
		
		do {
			
			System.out.print("2. 암호 : ");
			String pwd = sc.nextLine();
			
			gu.setPasswd(pwd);
			
			if(gu.getPasswd() != null) {
				System.out.println(gu.getPasswd());
				break;
			}
		
		}while(true);
		
		
		
		do {
			System.out.print("3. 성명 : ");
			String name = sc.nextLine();
			
			gu.setName(name);
			
			if(gu.getName() != null ) {
				System.out.println(gu.getName());
				break;
			}
		
		}while(true);
		
		
		do {
			System.out.print("4. 주민번호 앞의 7자리를 입력하세요 : ");
			String jubun = sc.nextLine();
			
			gu.setJubun(jubun);
			
			if(gu.getJubun() != null) {
				break;
			}
			
		}while(true);
		
		
		 do {
			 System.out.println("5. 연락처 : ");
			 String mobile = sc.nextLine();
			 
			 gu.setMobile(mobile);
			 
			 if(gu.getMobile() != null) {
				 break;
			}
			 
		}while(true);
		
		 
		 do {
			 System.out.println(" 6. 희망급여 : ");
			 String str_hopeMoney = sc.nextLine();
			 try {	 
				 	gu.setHopeMoney(Integer.parseInt(str_hopeMoney));
				 
				 	if( 1000 <= gu.getHopeMoney() && gu.getHopeMoney() <= 9999 ) {
				 		break;
				 	}
			  }catch(NumberFormatException e) {
				  System.out.println("\n >> 정수만 입력 가능합니다. <<< !!! ");
			  }
		
		 }while(true);
		 
			
		 if(checkGujikja(gu)) {
			 guMap.put(id, gu);
			 result = true;
		}
		 
		return result;
		
	
	}// end of public boolean registerGujikja(Scanner sc, Map<String, Gujikja> guMap)


	
	
	
	
	@Override
	public boolean registerCompany(Scanner sc, Map<String, Company> compMap) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void search(int ageline, Map<String, Gujikja> guMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(String gender, Map<String, Gujikja> guMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(int ageline, String gender, Map<String, Gujikja> guMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAllHopeMoney(Map<String, Gujikja> guMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkGujikja(Gujikja gu) {
		
		if(gu.getId()     != null &&
		   gu.getPasswd() != null &&
		   gu.getName()	  != null &&
		   gu.getJubun()  != null &&
		   gu.getMobile() != null &&
		   gu.getHopeMoney() > 0) {
			
			return true;
		}
		else {
			return false;
		}
	}// end of public boolean checkGujikja(Gujikja gu)

	
	@Override
	public boolean checkCompany(Company comp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Gujikja login(Scanner sc, Map<String, Gujikja> guMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company login(Map<String, Company> compMap, Scanner sc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void showAllGujikja(Map<String, Gujikja> guMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAllCompany(Map<String, Company> compMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean registerRecurit(Scanner sc, Company loginComp, List<Recuritment> recuritList) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void showAllRecurit(List<Recuritment> recuritList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showMyCompanyRecurit(Company loginComp, List<Recuritment> recuritList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Gujikja update(Scanner sc, Gujikja loginGu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company update(Scanner sc, Company loginComp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void searchRecuritByTitle(String searchTitle, List<Recuritment> recuritList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchRecuritByGender(String gender, List<Recuritment> recuritList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchRecuritByJobType(String searchJobType, Map<String, Company> compMap) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
