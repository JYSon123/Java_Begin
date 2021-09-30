package my.day14.c.INTERFACE;

public class Triangle extends Figure {
	// Triangle 이라는 클래스는 interFigure라는 인터페이스를 implements(구현)한다는 말이다.
		// 미완성 메소드를 재정의 하겠다는 뜻이다.
	
	// 기본생성자
	public Triangle() {}
	
	
	// 파라미터가 있는 생성자
	// 이걸 만드는 순간, 기본 생성자는 사라져 버리기 때문에 기본 생성자를 하나 만들어둔다.
	public Triangle(int x, int y) {
		this.x = x;
		super.y = y;
		
	}
	
	
	@Override
	public double area() {
		
		return x*y*0.5;
	}

	
	
	
	
	
	
	
	
	
	
}
