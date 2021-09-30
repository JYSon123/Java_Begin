package my.day18.c.ENUM;

public class EntranceFee_2 {
	
	
	// 어린이는 무조건 0원이다. 따로 바뀌지 않을 것이기에 final을 붙여준다.
	// 또한 public을 써서 다른곳에서도 쓸 수 있게 해준다.
	// 객체를 만들 지 않더라도 쓸 수 있게 하기 때문에 static을 붙여준다.
	public static final EntranceFee_2 CHILD    = new EntranceFee_2(0); 
	public static final EntranceFee_2 TEENAGER = new EntranceFee_2(150);  // 10대는 150원
	public static final EntranceFee_2 ADULT    = new EntranceFee_2(300); // 성인은대는 300원
	public static final EntranceFee_2 OLD      = new EntranceFee_2(100); // 객체를 만들어준것이다.
	// 대문자인 이유는 파이널 변수라는 뜻이다.
	
	private final int FEE;
	// 외부에서 FEE에 접근하지 못하도록 접근제한자에  final을 붙임
	
	
	// 파라미터가 있는 생성자, 그래서 기본생성자가 사라졌다. 
	private EntranceFee_2(int fee) { // private 을 하는 이유 = 외부에서는 EntranceFee_2 객체를 만들 수 없다.
	// 생성자의 접근제한자에 private 을 주어서 외부에서 객체 생성을 하지 못하도록 막아버린다. (기본생성자도 없다)
	
		
		this.FEE = fee;
		
	}
	
	public int getFee() {
		// 외부에서 FEE 값을 읽을 수 있도록 접근제한자를 public 으로 준다.
		
		
		return FEE;
		
	}
	
	
}
