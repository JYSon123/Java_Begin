package my.day13.e.abstractclass;

public class Cat extends AbstractAnimal {
	
	// Cat 만 가지는 field 를 정의(추상화)
		private String color;
	
	
	
	
	public Cat() {
		 super(); // 이게 생략이 되어있다.
		// super(); 을 없애더라도 생략되어져 있으므로 super(); 을 실행해준다.
	
		
	}

	// Cat 만 가지는 method 를 정의(추상화)

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(color != null && !color.trim().isEmpty())
			this.color = color;
	}
	 // 메소드의 재정의(오버라이딩)
    @Override
	public void cry() {
    	System.out.println(">>> "+getName()+"는 야옹야옹 웁니다. <<<");
		
	}
	
	  // Cat만 가지는 메소드
	public void jump() {
		System.out.println("== 고양이는 점프를 합니다. ==\n");
		
	}

	  
	  
}
