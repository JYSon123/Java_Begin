package my.day13.c.accessModifier;

import my.day13.b.accessModifier.Parent;

public class Child_2 extends Parent {
	
	void viewInfo() {
		super.id = "leess";            // public      동그라미(초록색) 접근가능
		super.passwd = "qwer1234$A";   // protected   마름모(노랑색)   접근가능
		// protected는 다른 클래스에 있는 자식클래스에도 쓸 수 있다.
		
	  //super.name					   // default     삼각형(파랑색)   접근불가(아예 다른 클래스이기 때문이다)  
	  //super.jubun 				   // private     사각형(빨강색)   접근불가
		
	}
	

	
}
