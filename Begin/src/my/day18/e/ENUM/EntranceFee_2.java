package my.day18.e.ENUM;


// 아래는 조금전 my.day18.c.ENUM.EnteranceFee_2 클래스를 enum을 사용하여 변경한 것이다.

//>> === enum(열거형)에 멤버(field, method)추가하기 === << //
//모든 enum(열거형)은 추상 클래스 Enum 의 자손이다. 그러므로 field 및  생성자와 method 를 만들 수 있는 것이다.

public enum EntranceFee_2 {
	
	// abstract int getRealFee(int inwonsu); 의 재정의이다.
	
	CHILD(0) {
		@Override
		int getRealFee(int inwonsu) {
			return 0; // 어린이는 단체요금에 할인이 없다! 어짜피 0원이니까!
		}
	},
	
	
	TEENAGER(150) {
		@Override
		int getRealFee(int inwonsu) {
			
			if(inwonsu >= 20) // 20명 이상이면 20% 할인
				return(int)(DEFAULT_FEE * inwonsu*0.8);  // 소수부분을 자르겠다.
			
			else
				return DEFAULT_FEE * inwonsu;
		}
	},
	
	ADULT(300) {
		@Override
		int getRealFee(int inwonsu) {
			
			if(inwonsu >= 20) 
				return(int)(DEFAULT_FEE * inwonsu*0.9);  
			
			else
				return DEFAULT_FEE * inwonsu;
			
			
			
		}
	},
	
	OLD(100) { // 100은 default_fee이다.
		@Override
		int getRealFee(int inwonsu) {
			
			if(inwonsu >= 20) 
				return(int)(DEFAULT_FEE * inwonsu*0.7);  
			
			else
				return DEFAULT_FEE * inwonsu;
			
			
			
		}
	};
	
	// 끝에 ; 을 붙여야 한다.
	// !!! 사실은 열거형 상수  CHILD, TEENAGER, ADULT, OLD 하나 하나가 EntranceFee_2 객체라는 것이다.
	// 단체관람시 각 연령대별 할인금액(추상메소드로 만들어서 객체 생성시 반드시 재정의 하도록 강제하는 것임) 을 달리 적용하여 실제 입장료 금액을 계산하도록 한다.
	
	
	// Enum의 filed 이다.
	protected final int DEFAULT_FEE;
	// !!! private 으로 하면 위의 열거형 상수에서 DEFAULT_FEE 으로 접근이 불가능해진다. !!! (원래 class면 동일 class에서 사용 가능하나, Enum은 사용이 불가하다)
	// !!! protected 또는 default(final int DEFAULT_FEE;) 또는 public으로 해야만 위의  DEFAULT_FEE 으로 접근이 가능해진다. !!!
	// enum(열거형)의 인스턴스 변수는 반드시 final 이어야 한다는 규칙은 없지만, FEE는 열거형 상수값을 저장하기 위한 용도이므로 fianl을 붙인다.
	
	
	// 파라미터가 있는 생성자, 그래서 기본생성자가 사라졌다. 
	EntranceFee_2(int default_fee) { // private 을 하는 이유 = 외부에서는 EntranceFee_2 객체를 만들 수 없다.
	// 생성자의 접근제한자에 private 을 주어서 외부에서 객체 생성을 하지 못하도록 막아버린다. (기본생성자도 없다)
	// enum(열거형)의 생성자는 접근제한자가 private이 생략되어져 있는 것이다.
		
		this.DEFAULT_FEE = default_fee;
		
	}
	
	public int getFee() {
		// 외부에서 FEE 값을 읽을 수 있도록 접근제한자를 public 으로 준다.
		
		return DEFAULT_FEE;
	}
	
	
	// !!!! 입장 인원수에 따라 할인이 적용된 실제 입장료 금액을 알려주는 추상(미완성)메소드 !!!!
	abstract int getRealFee(int inwonsu);  // abstract는 미완성 메소드란 뜻이다!
	
	
	
}
