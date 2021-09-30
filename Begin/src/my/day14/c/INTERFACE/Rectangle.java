package my.day14.c.INTERFACE;

public class Rectangle extends Figure {
	// Rectangle 이라는 클래스는 interFigure라는 인터페이스를 implements(구현)한다는 말이다.
	// 미완성 메소드를 재정의 하겠다는 뜻이다.
	
	// 기본생성자
		public Rectangle() {}
		
		
		// 파라미터가 있는 생성자
		// 이걸 만드는 순간, 기본 생성자는 사라져 버리기 때문에 기본 생성자를 하나 만들어둔다.
		public Rectangle(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
	// 원래 부모클래스에서 재정의를 해야했지만, 여기서 한다.
	@Override
	public double area() {
		
		return x*y;
	}
	
	
}
