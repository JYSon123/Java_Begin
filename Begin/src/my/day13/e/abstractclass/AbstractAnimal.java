package my.day13.e.abstractclass;



	/*
	   -----------------------------------------------------------------------------------------------------------------------
	     접근제한자(접근지정자, accessmodifier)   자기자신클래스내부      동일패키지에있는다른클래스      다른패키지에있는하위(자식)클래스        그외의영역  
	   ----------------------------------------------------------------------------------------------------------------------- 
	   public                                 O                 O                         O                 O  
	   protected                              O                 O                         O                 X
	   default                                O                 O                         X                 X
	   private                                O                 X                         X                 X
	*/
		


public abstract class AbstractAnimal {  //미완성 메소드를 가지고 있다면 abstract를 꼭 넣어줘야한다!
	// abstract은 미완성(추상) class 라는 뜻이다. == 미완성 클래스
	// 추상 클래스란, 추상메소드를 가지고 있는 클래스를 말한다.
	// 추상 클래스(미완성 클래스)를 가지고 바로 인스턴스 생성은 불가하다.
	// 하지만 추상 클래스(미완성 클래스)를 부모클래스로 하는 자식 클래스의 인스턴스로 저장이 가능하다. 
		
	
	
	
	// Dog, Cat, Duck 의 공통 field(속성) (추상화)
	
	private String name;
	private int    birthYear;
	
	static int count; // 디폴트값은 0이다.
	
	
	// 기본생성자
	public AbstractAnimal() {
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
	
	
	
	
	
	// === 추상메소드(미완성 메소드)=== //
	// 추상메소드가 되고 나면, Animal클래스를 부모 메소드로 쓰고 있는 자식 클래스에 cry()의 메소드 재정의(Override)를 해야 할 경우에는
	// 부모클래스인 Animal 클래스에서는 cry()메소드를 추상메소드(미완성 메소드)로 만들면 된다.
	
	public abstract void cry(); //abstract 아직 미완성이라는 뜻이다.
	// abstract은 미완성(추상) class 라는 뜻이다. == 미완성 클래스
	
		
	//	System.out.println(">>> 동물이 소리를 냅니다.<<<\n"); // 굳이 쓰이지 않기 때문에 없애버린다. 이것을 추상메소드라 부른다.
	
	
	
	
}
