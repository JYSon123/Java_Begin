package my.day13.d.polymorphism;



	/*
	   -----------------------------------------------------------------------------------------------------------------------
	     접근제한자(접근지정자, accessmodifier)   자기자신클래스내부      동일패키지에있는다른클래스      다른패키지에있는하위(자식)클래스        그외의영역  
	   ----------------------------------------------------------------------------------------------------------------------- 
	   public                                 O                 O                         O                 O  
	   protected                              O                 O                         O                 X
	   default                                O                 O                         X                 X
	   private                                O                 X                         X                 X
	*/
		


public class Animal {

	// Dog, Cat, Duck 의 공통 field(속성) (추상화)
	
	private String name;
	private int    birthYear;
	
	static int count; // 디폴트값은 0이다.
	
	
	// 기본생성자
	public Animal() {
	}
	
	//Source Generate Getter and Cerrter을 선택해서 만들어주자! 
	// Dog, Cat, Duck 의 공통 method(기능) (추상화)
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name != null && !name.trim().isEmpty()) // 이름도 공백이지 않아야한다. trim과 isEmpty를 활용해주자.
		this.name = name;
	}
	
	public int getbirthYear() {
		return birthYear;
	}
	
	public void setbirthYear(int birthYear) {
		if(birthYear > 0)
		this.birthYear = birthYear;
	}
	
	
	// === 동물들 (강아지, 고양이, 오리)의 정보를 출력해주는 메소드 === //
	
	protected void showInfo() {
		System.out.println("=== 동물정보 ===\n"
							+"1. 성명 : " + name +"\n"
							+"2. 생년 : " + birthYear + "년");
	}
	
	
	// === 동물들 (강아지, 고양이, 오리)의 소리를 출력해주는 메소드 === //
	public void cry() { 
		System.out.println(">>> 동물이 소리를 냅니다.<<<\n"); // 굳이 쓰이지 않기 때문에 없애버린다. 이것을 추상메소드라 부른다.
	}
	
	
	
}
