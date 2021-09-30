package my.day17.a.recuritment;

import java.util.*;

public class RecuritmentMian {

	public static void main(String[] args) {
		
		  // 아이디      실제회사
		Map<String, Company> compMap = new HashMap<>();
		
		  // 채용정보가 모두 올것이다.
		List<Recuritment> recuritList = new ArrayList<>();
		// Recuritment 만 들어온다.
		
		// 구인회사로 회원가입
		Company comp1 = new Company();
		comp1.setId("samsung");
		comp1.setName("삼성");
		comp1.setEmail("samsungman@gmail.com");
		
		compMap.put("Samsung", comp1); // compMap에 .put을 이용해서 넣어준다.
		
		// 구인회사로 회원가입
		Company comp2 = new Company();
		comp2.setId("LG");
		comp2.setName("엘지");
		comp2.setEmail("lgman@gmail.com");
		
		compMap.put("lg", comp2); 
		
		// 구인회사로 회원가입한 samsung 이 채용공고 내기
		Recuritment rcmt1 = new Recuritment();
		rcmt1.setComp(compMap.get("samsung"));  // Map에서 끄집어낸다. 키값만 넣어주면 valu값이 나온다.
		rcmt1.setTitle("삼성 프로그래머 신입직원 채용합니다.");
		rcmt1.setHireCount(10); // recuritList에 다 넣어준다.
		
		recuritList.add(rcmt1); 
		
		// 구인회사로 회원가입한 lg 이 채용공고 내기
		Recuritment rcmt2 = new Recuritment();
		rcmt2.setComp(compMap.get("lg"));  // Map에서 끄집어낸다. 키값만 넣어주면 valu값이 나온다.
		rcmt2.setTitle("엘지에서 일할 경영신입직원 채용합니다.");
		rcmt2.setHireCount(5); 
		
		recuritList.add(rcmt2);
		
		// 구인회사로 회원가입한 samsung 이 채용공고 내기
		Recuritment rcmt3 = new Recuritment();
		rcmt3.setComp(compMap.get("samsung"));  
		rcmt3.setTitle("삼성에서 일할 회계 신입직원 채용합니다.");
		rcmt3.setHireCount(2);
		
		recuritList.add(rcmt3);
		
		
		System.out.println("==== 모든 채용공고 조회하기 ====\n");
		
		for(int i=0; i<recuritList.size(); i++){
			System.out.println(recuritList.get(i).recuritInfo()); // 이 자체가 Recuritment이다.
		}// end of for-------------------------
		
		
		
	} // end of main(String[] args)

}
