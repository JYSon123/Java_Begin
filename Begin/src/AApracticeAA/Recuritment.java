package AApracticeAA;

public class Recuritment extends Member  {
	
	// filed
	
	private String title; // 모집공고문
	private int hireCount; // 몇명 모집할것인가?
	private String comp; // 회사이름
	private String email;
	
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getcomp() {
		return comp;
	}

	public void setcomp(String loginComp) {
		this.comp = loginComp;
	
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getHireCount() {
		return hireCount;
	}
	
	public void setHireCount(int hireCount) {
		this.hireCount = hireCount;
	}

	
	
	@Override
	public String showInfo() {
//			System.out.println("1. 채용공고문 : " + re.
			return "";
	
	}
	

	
	
	
	
}
