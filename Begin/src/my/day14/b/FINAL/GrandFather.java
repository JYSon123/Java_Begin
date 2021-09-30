package my.day14.b.FINAL;

public class GrandFather {

	String id = "father";
	final String FIRSTNAME = "김";  //final 변수를 상수변수라고도 부른다. 
	//자식class에서 이걸 못바꾸게 하고 싶을 때 final을 써준다. 무조건 마지막이 "김" 이라는 뜻이다.
	// 관행적으로 final 변수 만큼은 대문자로 써준다.
	
	void test() {
		System.out.println(">> 이것은 test 메소드 입니다. <<");
	}
	
	final void exam() {
		System.out.println(">> 이것은 exam 메소드 입니다. <<");
	}
	
	
}
