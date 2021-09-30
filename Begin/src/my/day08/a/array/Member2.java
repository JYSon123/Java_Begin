package my.day08.a.array;

public class Member2 {
	
	
	// field
	String id;
	String passwd;
	String name;
	static int count;  //멤버의 갯수를 뜻한다. 스테틱 변수기 때문에 삐뚤하다. 인수에 국한되어있는것이 아님
	int point;
	
	
	// 기본생성자
	public Member2() {  //그래서 새 멤버를 생성을 할 때마다 숫자가 하나씩 오른다.
		count++;
		
	}
	
	
	
	
	// method
	String showInfo() {
		return    "1.아이디 :"+id+"\n"
				+ "2.비밀번호 :"+passwd+"\n"
				+ "3.성명 :"+name;
	}
	
	

}
