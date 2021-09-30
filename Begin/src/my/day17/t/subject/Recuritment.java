package my.day17.t.subject;

public class Recuritment {

	// field
	private String title;     // 채용제목
	private int    hireCount; // 채용인원수 
	private String gender;    // 성별
	
	private Company comp;     // 채용회사 

	
	// method 
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		// 채용공고 제목은 반드시 입력해야 한다.
		
		if(title != null && !title.trim().isEmpty() ) {
			this.title = title;	
		}
		else {
			System.out.println("\n>> 채용공고 제목을 반드시 입력하셔야 합니다. <<\n");
			this.title = null;
		}

	}

	public String getGender() {
		return gender;
	}


	public int getHireCount() {
		return hireCount;
	}

	public void setHireCount(int hireCount) {
		// 채용인원수는 0 보다 커야 한다.
		if(hireCount > 0) {
			this.hireCount = hireCount;
		}
		else {
			System.out.println("\n>> 채용인원수는 0 보다 커야  합니다. <<\n");
			this.hireCount = 0;
		}
		
	}	
	
	public void setGender(String gender) {
		// 성별은 "남" 또는 "여" 또는 "무관" 만 가능하다.
		
		gender = gender.trim();
		if(!"남".equals(gender) && !"여".equals(gender) && !"무관".equals(gender)) {
			System.out.println("\n>> 성별은 \"남\" 또는 \"여\" 또는 \"무관\" 만 가능합니다. <<\n");
			this.gender = null;
		}
		else {
			this.gender = gender;
		}
	}
	
	public Company getComp() {
		return comp;
	}

	public void setComp(Company comp) {
		this.comp = comp;
	}
	
	
	// 채용정보를 알려주는 메소드 
	public String recuritInfo() {
		
		return "1. 채용제목 : " + title + "\n"
			 + "2. 회사명 : " + comp.getName() +"\n"
			 + "3. 성별 : " + gender + "\n"
			 + "4. 인원수 : " + hireCount + "명\n"
			 + "5. 담당자연락처 : " + comp.getMobile() +"\n" ;
	}
	
}
