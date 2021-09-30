package my.day13.c.accessModifier;

import my.day13.b.accessModifier.Parent;

public class Other {
	
	void test() {
		
		Parent p = new Parent(); // 처음에는 빨간줄이 있지만,  Parent를 import 해주면 된다.
		
		p.id = "leess";
		

	}
	
}
