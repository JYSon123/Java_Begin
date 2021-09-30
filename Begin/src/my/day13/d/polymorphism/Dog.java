package my.day13.d.polymorphism;

public class Dog extends Animal {

	// Dog 만 가지는 field 를 정의(추상화)
	private int weight;
	
	
	
	
	// 생성자(contructor)
	
	
	public Dog() { //항상 부모클래스의 생성자 super();가 제일 위에 와야한다.
		super(); // 부모클래스인 Animal의 기본생성자를 말한다.
				 // super(); 을 없애더라도 생략되어져 있으므로 super(); 을 실행해준다. 
		
	
		//System.out.println("\n>> 자식 클래스인 Dog 클래스의 기본생성자를 호출함<<\n");
		//super();
		// 이렇겐 안된다. 왜냐하면 자바에서는 부모클래스의 기본생성자가 맨처음에 호출 되어져야 하기 때문이다.

	
	}

	// Dog 만 가지는 method 를 정의(추상화)
	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		if(weight > 0)
		this.weight = weight;
	}
	
	
	//=====================================//
	// === 강아지의 정보를 출력해주는 메소드 === //
	// @XXX 을 애노테이션 (어노테이션)이라고 부른다.
    // Override 애노테이션 (어노테이션)은 메소드의 재정의를 할 때 쓰이는 것이다.
	// 메소드의 재정의를 메소드의 오바라이딩 이라고 부른다.
	// 메소드의 오버라이딩 이라 함은 부모클래스에서 정의해둔 메소드를 자식클래스에서 새롭게 정의해주는 것을 말한다.
	// 조심할 것은 메소드의 오버라이딩시 접근제한자는 부모에서 정의해둔 접근제한자 보다 크든지 또는 같아야만 하고
	// 내용물 {}을 제외한 껍데기는 같아야 한다.
	
	// 메소드의 오버로딩, 오버라이딩 차이점을 체크하자!
    // 실수로 이름을 잘못 썻을때를 대비한다. 부모 클래스에 반드시 존재를 하는 메소드여야함.
	
	
	// 메소드의 재정의(오버라이딩)
	@Override
    public void showInfo() { // 부모 클래스에 있는것 보다, 메소드가 같던지 더 커야만한다. 
		System.out.println("=== 강아지정보 ===\n"
							+"1. 성명 : " + this.getName() +"\n"  //그런데 상속을 받았기 때문에 this도 가능하다. 그리고 그냥 this 또한 가능하다.
							+"2. 생년 : " + super.getbirthYear() + "년\n" // super을 통해서 부모클래스에서 가져온다. this도 가능
							+"3. 몸무게 : " + weight + "kg");
		}
    @Override
    public void cry() {
    	System.out.println(">>> "+getName()+"는 멍멍 <<<");
    }
		
	// Dog 만 가지는 메소드
    public void run() {
		System.out.println("== 강아지는 빠르게 달립니다. ==\n");
	}
	
	
	
	
	
	
}
