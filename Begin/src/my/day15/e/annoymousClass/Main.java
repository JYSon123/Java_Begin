package my.day15.e.annoymousClass;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\n==== 1. 일반 클래스 사용시 ====");
		
		InterArea area1 = new Area();
		double areaSize1 = area1.area(10, 5);
		System.out.println("가로 10, 세로5 인 면적은 " + areaSize1);
		
		InterArea area2 = new Area();
		double areaSize2 = area2.area(20, 10);
		System.out.println("가로 20, 세로10 인 면적은 " + areaSize2);

		System.out.println("\n==== 2. 익명(==무명, annoymous) 클래스 사용시 ====");
		
	/*
	        익명(무명) 클래스는 말 그대로 이름이 없는 클래스이다.
	        인터페이스를 구현한 클래스가 특정한 한곳에서만 사용되고 다른 곳에서는 재사용되지 않는 경우이라면
	        이럴 경우에는 굳이 클래스 파일로 만들 필요 없이 익명(무명) 클래스로 사용하면 된다.
	  
	        익명(무명) 클래스의 객체는 반드시 부모 클래스를 상속받는 클래스 이거나 인터페이스를 구현한 클래스이어야 한다.
	        왜냐하면 클래스의 이름은 없지만 저장받는 타입은 존재해야 하기 때문이다.
	        그래서 익명(무명) 클래스의 객체는 부모 클래스 또는 인터페이스로 받게 되어있다.   
	            
	        익명(무명) 클래스를 사용하는 가장 큰 목적은 
	        부모 클래스를 상속받는 자식 클래스를 생성하지 않고도  객체를 만들어서 부모 클래스에 정의된 메소드를 재정의 할 수 있다는 것이다. 
	        익명(무명) 클래스는 일반적으로 Graphic 프로그래밍(GUI 프로그래밍)을 할 때 리스너 인터페이스를 만들 때 주로 사용한다.
	        익명(무명) 클래스는 추상클래스와 인터페이스로부터 만들 수 있다.    
	*/
			
		
		 InterArea triArea = new InterArea() {

			@Override
			public double area(double x, double y) {
			
				return x*y*0.5;
			}
		
		 };
		
		 double triAreaSize = triArea.area(10,5);
		 
		 System.out.println("밑변 10, 높이 5인 삼각형 면적은 : " + triAreaSize);
		 //밑변 10, 높이 5인 삼각형 면적은 : 25.0
		
		 
		 
		 InterArea rectArea = new InterArea() {  //항상 new 옆에 인터페이스 이름을 써주면 된다.

			@Override
			public double area(double x, double y) {
			
				return x*y;
			}
		
		 };
		 
		 
		 double rectAreaSize = rectArea.area(10,5);
		 
		 System.out.println("가로 10, 세로 5인 삼각형 면적은 : " + rectAreaSize);
		 // 가로 10, 세로 5인 삼각형 면적은 : 25.0
		
		 
		 
		 
		 InterArea cirArea = new InterArea() {  

				@Override
				public double area(double x, double y) {
				
					return PI*x*y;
				}
			
			 };
			
			 
			 double cirAreaSize = cirArea.area(10,5);
			 
			 System.out.println("가로축 반지름 10, 세로축 반지름 5인 타원형 면적은 : " + cirAreaSize);
			 // 가로축 반지름 10, 세로축 반지름 5인 타원형 면적은 : 157.0796
			
			 
			 
		 
		 
		
	}// end of main(String[] args)------------

}
