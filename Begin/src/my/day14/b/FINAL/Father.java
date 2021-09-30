package my.day14.b.FINAL;

public final class Father extends GrandFather{
	// final 은 상속을 포기하는것.
	
	String email;
	
	public Father() {
		id = "me";
		// FIRSTNAME = "이"; // FIRSTNAME은 fianl 변수이므로 새로운 값을 할당할 수 없다.
		
	
	
	}

	@Override
	void test() {
		System.out.println(">> This if test() method !! <<");
		
		
	
	
	}
	
//	exam() 메소드가 final 메소드로 되어있으므로 오버라이딩(재정의)이 불가하다.!!!
//	@Override
//	void exam() {
//		System.out.println(">> This if test() exam !! <<");
//		
//	}	
	
	
	
	
	
}


