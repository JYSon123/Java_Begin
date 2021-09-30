package my.day17.t.subject;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface InterGujikjaCompanyCtrl { 

	// == 구직자(Gujikja) 신규 회원가입을 해주는 메소드 생성하기 == 
	boolean registerGujikja(Scanner sc, Map<String, Gujikja> guMap);
	
	// == 구인회사(Company) 신규 회원가입을 해주는 메소드 생성하기 == 
	boolean registerCompany(Scanner sc, Map<String, Company> compMap);
	
	// === 연령대에 해당하는 구직자 찾아보기 ===
	void search(int ageline, Map<String, Gujikja> guMap);
	
	// === 성별로 구직자 찾아보기 ===
	void search(String gender, Map<String, Gujikja> guMap);
	
	// === 특정 연령대에 해당하는 회원중 특정 성별 회원만 출력해주는 메소드 생성하기 === //
	void search(int ageline, String gender, Map<String, Gujikja> guMap);
	
	// 모든 구직자 희망급여보기
	void showAllHopeMoney(Map<String, Gujikja> guMap);
		
	// == Gujikja 인스턴스가 제대로 생성되었는지 확인 시켜주는 메소드 생성 == //
	boolean checkGujikja(Gujikja gu);
	
	// == Company 인스턴스가 제대로 생성되었는지 확인 시켜주는 메소드 생성 == //
	boolean checkCompany(Company comp);
	
	// === 구직자 로그인 ===
	Gujikja login(Scanner sc, Map<String, Gujikja> guMap);
	
	// === 구인회사 로그인 ===
	Company login(Map<String, Company> compMap, Scanner sc);
	
	// 모든 구직자 보기 
	void showAllGujikja(Map<String, Gujikja> guMap);
	
	// 모든 구인회사 보기 
	void showAllCompany(Map<String, Company> compMap);
	
	// 채용공고 등록하기
	boolean registerRecurit(Scanner sc, Company loginComp, List<Recuritment> recuritList); 
	
	// 모든채용공고 보기
	void showAllRecurit(List<Recuritment> recuritList);
	
	// 우리회사채용공고 보기
	void showMyCompanyRecurit(Company loginComp, List<Recuritment> recuritList);
	
	// 구직자 나의 정보 변경해주는 메소드 
	Gujikja update(Scanner sc, Gujikja loginGu);
	
	// 구인회사의 정보를 변경해주는 메소드 
	Company update(Scanner sc, Company loginComp);
	
	// 채용제목으로 채용정보를 검색하기
	void searchRecuritByTitle(String searchTitle, List<Recuritment> recuritList);
	
	// 성별로 채용정보를 검색하기
	void searchRecuritByGender(String gender, List<Recuritment> recuritList);
	
	// 직종별로 구인회사를 검색하기
	void searchRecuritByJobType(String searchJobType, Map<String, Company> compMap);
	
}
