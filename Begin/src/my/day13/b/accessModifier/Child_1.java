package my.day13.b.accessModifier;

public class Child_1 extends Parent {
	
	
	void viewInfo() {
		super.id = "leess";          // public      동그라미(초록색)   접근가능
		super.passwd = "qwer1234$A"; // protected   마름모(노랑색)    접근가능
		super.name = "이순신";         // default     삼각형(파랑색)    접근가능
	 // super.junun					 // private     사각형(빨강색)    접근불가                     
	}
	

}
