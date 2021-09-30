package my.day10.a.Stringbuilder;

public class StringBuilderMain {

	public static void main(String[] args) {
		
		// == 메모리의 낭비를 줄여보자! ==
		
		// String은 변수 같아 보이지만 클래스 객체이다.
		String name = "일순신"; // 메모리상에 name 1개 소모  
		
		name +=",이순신";		// 메모리상에 name 1개 소모 
		name +=",삼순신"; 	// 메모리상에 name 1개 소모 
		name +=",사순신"; 	// 메모리상에 name 1개 소모 
		name +=",오순신"; 	// 메모리상에 name 1개 소모 
		name +=",육순신"; 	// 메모리상에 name 1개 소모 
		name +=",칠순신"; 	// 메모리상에 name 1개 소모 
		name +=",팔순신"; 	// 메모리상에 name 1개 소모 
		name +=",구순신"; 	// 메모리상에 name 1개 소모 
	
							// 누적되어진 메모리상의 name은 9개가 소모된다고 합니다.
		
		
		System.out.println(name);
		// 일순신,이순신,삼순신,사순신,오순신,육순신,칠순신,팔순신,구순신

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
	//	StringBuffer sb = new StringBuffer();
	//또는
		StringBuilder sb = new StringBuilder();
	//	StringBuilder 와 StringBuffer 는 이름은 다르지만 사용하는 방법은 똑같다.
	//  StringBuffer 는 multi thread 를 지원해주므로 주로 게임프로그래밍 및 웹프로그래밍 에서 사용하고	
	//  StringBuilder 는 	multi thread 를 지원해주지 않기에 주로 웹프로그래밍에서 사용한다.
	//  그런데 StringBuffer 는 StringBuilder 보다 무거우므로 빨리 동작하지 못한다.
	//  그래서 웹프로그래밍이라면 StringBuilder 를 더 선호한다. 
		
		
	    sb.append("일순신");	
	    sb.append(",이순신");
	    sb.append(",삼순신");
	    sb.append(",사순신");
	    sb.append(",오순신");
	    sb.append(",육순신");
	    sb.append(",칠순신");
	    sb.append(",팔순신");
	    sb.append(",구순신");
	    
	    
	    //toString StringBuilder에 쌓여있던것을 string 타입으로 바꿔준다.
	    System.out.println(sb.toString());  
	    //일순신,이순신,삼순신,사순신,오순신,육순신,칠순신,팔순신,구순신
	    
	    
	    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	    
	    // StringBuilder sb 의 초기화  위에 쌓여있는 순신이들을 지우고싶다면?
	    
	   // sb = new StringBuilder();  // 1. 가장 쉬운 방법이다. 새롭게 new를 해준다.
	   // 또는 
	    sb.setLength(0); // 2. setLength를 통해서 길이를 0으로 만들어준다.
	    
	    
	    sb.append("한정화");
	    sb.append(",두정화");
	    sb.append(",세정화");
	    sb.append(",네정화");
	    sb.append(",오정화");
	    
	    
	    System.out.println(sb.toString());  
	    //한정화,두정화,세정화,네정화,오정화
	    
	    
	    
	}// end of main(String[] args)

}
