package my.day17.b.subject;

import java.util.*;

public interface InterGujikjaCompanyCtrl {
	
	
	// == 채용공고 등록
	Recuritment recruit (Scanner sc, List<Recuritment> recuritList);


	// == 구직자(Gujikja) 신규 회원가입을 해주는 메소드 생성하기 == 
	boolean registerGujikja(Scanner sc, ArrayList<Member> mbrArr);	
	
	// == 구인회사(Company) 신규 회원가입을 해주는 메소드 생성하기 == 
	boolean registerCompany(Scanner sc, ArrayList<Member> mbrArr);
	
	
	// === 연령대에 해당하는 구직자 찾아보기 ===
	void search(int ageline, ArrayList<Member> mbrArr);
	
	
	// === 성별로 구직자 찾아보기 ===
	void search(String gender, ArrayList<Member> mbrArr);
	
	
	// === 특정 연령대에 해당하는 회원중 특정 성별 회원만 출력해주는 메소드 생성하기 === //
	void search(int ageline, String gender, ArrayList<Member> mbrArr);
	
	
	// 모든 구직자 희망급여보기
	void showAllHopeMoney(ArrayList<Member> mbrArr);



	// == Gujikja 인스턴스가 제대로 생성되었는지 확인 시켜주는 메소드 생성 == //
	boolean checkGujikja(Gujikja gu);
	
	
	// == Company 인스턴스가 제대로 생성되었는지 확인 시켜주는 메소드 생성 == //
	boolean checkCompany(Company comp);
	
	
	// === 구직자 로그인 ===
	Gujikja login(Scanner sc, ArrayList<Member> mbrArr);
	
	
	// === 구인회사 로그인 ===
	Company login(ArrayList<Member> mbrArr ,Scanner sc);
	
	
	// === 구직자 또는 구인회사 모두 보기 ===
	void showAll(ArrayList<Member> mbrArr, int no);
	
	
	//== 구인회사 모두보기
	void showAll(ArrayList<Member>mbrArr);



	// 구직자 나의 정보 변경해주는 메소드
	Gujikja update(Scanner sc, Gujikja loginGu);
	
	// 구인회사 나의 정보 변경해주는 메소드 
	Company update(Scanner sc, Company loginComp);
	
	
	
	
}
