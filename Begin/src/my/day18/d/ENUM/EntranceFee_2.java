package my.day18.d.ENUM;


// 아래는 조금전 my.day18.c.ENUM.EnteranceFee_2 클래스를 enum을 사용하여 변경한 것이다.

//>> === enum(열거형)에 멤버(field, method)추가하기 === << //
//모든 enum(열거형)은 추상 클래스 Enum 의 자손이다. 그러므로 field 및  생성자와 method 를 만들 수 있는 것이다.

public enum EntranceFee_2 {
	
	
	 
	CHILD(0),TEENAGER(150), ADULT(300), OLD(100); // 끝에 ; 을 붙여야 한다.
	// !!! 사실은 열거형 상수  CHILD, TEENAGER, ADULT, OLD 하나 하나가 EntranceFee_2 객체라는 것이다.

	// Enum의 filed 이다.
	private final int FEE;
	// 외부에서 FEE에 접근하지 못하도록 접근제한자에 private을 붙임
	// enum(열거형)의 인스턴스 변수는 반드시 final 이어야 한다는 규칙은 없지만, FEE는 열거형 상수값을 저장하기 위한 용도이므로 fianl을 붙인다.
	
	
	// 파라미터가 있는 생성자, 그래서 기본생성자가 사라졌다. 
	EntranceFee_2(int fee) { // private 을 하는 이유 = 외부에서는 EntranceFee_2 객체를 만들 수 없다.
	// 생성자의 접근제한자에 private 을 주어서 외부에서 객체 생성을 하지 못하도록 막아버린다. (기본생성자도 없다)
	// enum(열거형)의 생성자는 접근제한자가 private이 생략되어져 있는 것이다.
		
		this.FEE = fee;
		
	}
	
	public int getFee() {
		// 외부에서 FEE 값을 읽을 수 있도록 접근제한자를 public 으로 준다.
		
		
		return FEE;
		
	}
	
	
	
}
