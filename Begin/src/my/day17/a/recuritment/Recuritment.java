package my.day17.a.recuritment;

public class Recuritment {

	
	
	// field
	private String title;       // 모집공고문
	private int    hireCount;   // 모집인원수
	
	private Company comp;       // 채용회사 

	
	// method 
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
	
	public Company getComp() {
		return comp;
	}
	
	public void setComp(Company comp) {
		this.comp = comp;
	}
	
	// 채용정보를 알려주는 메소드
	public String recuritInfo() {
		
		return "1. 채용공고문 : " + title + "\n"
			  +"2. 인원수 : " + hireCount + "명\n"
			  +"3. 회사명 : " + comp.getName()+ "\n"
			  +"4. 담당자이메일 : " + comp.getEmail() + "\n";
	}
	
	
}
