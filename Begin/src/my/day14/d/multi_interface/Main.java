package my.day14.d.multi_interface;

public class Main {

	public static void main(String[] args) {
		
		
		MeImpl me = new MeImpl();
		me.work();
		me.cook();
		me.play();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		InterMe interme = new MeImpl();
		interme.work();
		interme.cook();
		interme.play();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		InterFather interfa = new MeImpl();  // 저장장소가 interfa이다.
		interfa.work();  // 그렇기에 work만 나온다.
		((InterMe)interfa).cook();
		((InterMe)interfa).play();  //형변환을 통해서 InterMe의 메소드들도 다 가져와준다.
		
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		InterMother intermo = new MeImpl();
		((InterMe)intermo).work();
		intermo.cook();
		((InterMe)intermo).play();
		
		
	} // end of main(String[] args) 

}
