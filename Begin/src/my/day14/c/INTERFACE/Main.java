package my.day14.c.INTERFACE;

public class Main {

	public static void main(String[] args) {
		
		
		Triangle tri = new Triangle();
		tri.x = 5;
		tri.y = 4;
		System.out.println("1. 밑변이 5, 높이가 4인 삼각형의 넓이 = " + tri.area());
		
		// 1. 밑변이 5, 높이가 4인 삼각형의 넓이 = 10.0
		
		
		Rectangle rect = new Rectangle();
		rect.x = 5;
		rect.y = 4;
		System.out.println("2. 가로가 5, 세로가 4인 사각형의 넓이 = " + rect.area());
		// 2. 가로가 5, 세로가 4인 사각형의 넓이 = 20.0
		
		
		Circle cir = new Circle();
		cir.x = 5;
		cir.y = 4;
		System.out.println("3. 장축이 5, 단축 4인 타원형의 넓이 = " + cir.area());
		// 3. 장축이 5, 단축 4인 타원형의 넓이 = 62.83184
		
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		// == 다형성(Polymorphism) == //
        // ==> 자식클래스로 생성되어진 객체를 부모클래스의 타입으로 받을 수 가 있다.
        // ==> 특정한 인터페이스로 구현된 클래스의 객체를 특정한 인터페이스의 타입으로 받을 수 가 있다. 
		
		
		Figure figure1 = new Triangle();
		figure1.x = 5;
		figure1.y = 4;
		System.out.println("1. 밑변이 5, 높이가 4인 삼각형의 넓이 = " + figure1.area());
		// 1. 밑변이 5, 높이가 4인 삼각형의 넓이 = 10.0
		
		
		Figure figure2 = new Rectangle();
		figure2.x = 5;
		figure2.y = 4;
		
		System.out.println("2. 가로가 5, 세로가 4인 사각형의 넓이 = " + figure2.area());
		// 2. 가로가 5, 세로가 4인 사각형의 넓이 = 20.0
		
		
		Figure figure3 = new Circle();
		figure3.x = 5;
		figure3.y = 4;
		
		System.out.println("3. 장축이 5, 단축 4인 타원형의 넓이 = " + figure3.area());
		// 3. 장축이 5, 단축 4인 타원형의 넓이 = 62.83184
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
			// InterFigure[] interFigArr = new Figure[3];  
			// 또는
			InterFigure[] interFigArr = new InterFigure[3]; 
			
			
			interFigArr[0] = new Triangle(5,4);
			interFigArr[1] = new Rectangle(5,4);
			interFigArr[2] = new Circle(5,4);
			
			
			for(int i=0; i<interFigArr.length; i++) {
				System.out.println(interFigArr[i].area());
	
			}

			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			for(int i=0; i<interFigArr.length; i++) {
				
				String str = "";
				
				if(interFigArr[i] instanceof Triangle) {
					str =  "밑변이"+((Triangle)interFigArr[i]).x+", 높이가"+((Figure)interFigArr[i]).y+"인 삼각형의 넓이 => ";
				}
				else if(interFigArr[i] instanceof Rectangle) {
					str =  "밑변이"+((Rectangle)interFigArr[i]).x+", 높이가 "+((Figure)interFigArr[i]).y+"인 사각형의 넓이 => ";
				}
				else if(interFigArr[i] instanceof Circle) {
					str =  "장축이"+((Circle)interFigArr[i]).x+", 단축이 "+((Figure)interFigArr[i]).y+"인 타원형의 넓이 => ";
				}
				
				System.out.println(str + interFigArr[i].area());
			
			} // end of for -------------------------------------
			
			
	}// end of main(String[] args)

}
