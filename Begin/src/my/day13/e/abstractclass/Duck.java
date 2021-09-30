package my.day13.e.abstractclass;

public class Duck extends AbstractAnimal {
	
	// Duck 만 가지는 field 를 정의(추상화)
	   private int price;
	
	   
	 // Duck 만 가지는 method 를 정의(추상화)
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price > 0)
		this.price = price;
	}
	  // 메소드의 재정의(오버라이딩)
	 
	
	

	// Duck 만 가지는 메소드
	  public void swim(){
		  System.out.println("== 오리는 물가에서 헤엄을 칩니다. ==\n");
	  }

	@Override
	public void cry() {
		System.out.println(">>> "+getName()+"는 꽥꽥 하고 웁니다.<<<");
	}
	  


}
