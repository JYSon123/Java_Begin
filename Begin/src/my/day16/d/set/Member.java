package my.day16.d.set;

public class Member {
	
	
	// field
	private String id;
	private String passwd;
	private String name;
	
	
	
	// constructor
	public Member() {}
	
	public Member(String id, String passwd, String name) {
		this.id = id;
		this.passwd = passwd;
		this.name = name;
	}

	// method
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String minfo() {
		return "== "+name+"님의 회원정보 ==\n"
			  + "1. 아이디 : "+id+"\n"
			  + "2. 암호 : "+passwd+"\n"
			  + "3. 성명 : "+name+"\n";
	}
	
	
	// 메소드의 오버라이딩(==재정의)
	@Override		
	public String toString() {
		return "== "+name+"님의 회원정보 ==\n"
				  + "1. 아이디 : "+id+"\n"
				  + "2. 암호 : "+passwd+"\n"
				  + "3. 성명 : "+name+"\n";
		
	}
	
	
	
	
}
