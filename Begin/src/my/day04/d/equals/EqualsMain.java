package my.day04.d.equals;

public class EqualsMain {

	public static void main(String[] args) {
		//문자열의 경우에는 어떤식으로 비교를 하는가?
		
		
		int n1 = 10;
		int n2 = 20;
		
		if(n1 == n2) {
			// 원시형(primitive) 데이터 사이에서 == 는 값을 비교하는 것이다.
			System.out.println(n1 + "는(은) " + n2 + "과(와) 값이 같습니다.");	
		}
		
		else {
			System.out.println(n1 + "는(은) " + n2 + "과(와) 값이 같지 같습니다.");
		}
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
		Member mbr1 = new Member();
		mbr1.id = "leess";
		mbr1.pwd = "qwer";
		mbr1.name = "이순신";
		mbr1.email = "leess@naver.com";
		
		
		Member mbr2 = new Member();
		mbr2.id = "leess";
		mbr2.pwd = "qwer";
		mbr2.name = "이순신";
		mbr2.email = "leess@naver.com";
		
		System.out.println("mbr1 => " + mbr1);
		System.out.println("mbr2 => " + mbr2);
		
		
		
		if(mbr1 == mbr2) {
			// 객체 데이터 사이에서 == 는 메모리상에 올라가 있는 주소를 비교하는 것이다.
			System.out.println(mbr1 + "는(은) " + mbr2 + "과(와) 메모리상의 주소가 같습니다.");	
		}
		
		else {
			System.out.println(mbr1 + "는(은) " + mbr2 + "과(와) 메모리상의 주소가 같지 같습니다.");
		}
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
		String name1 = new String("엄정화");
		String name2 = new String("엄정화");
		
		
		if(name1 == name2) {
			System.out.println(name1 + "는(은) " + name2 + "과(와) 메모리상의 주소가 같습니다.");
		}
		else {
			System.out.println(name1 + "는(은) " + name2 + "과(와) 메모리상의 주소가 같지 않습니다.");
		}
		//엄정화는(은) 엄정화과(와) 메모리상의 주소가 같지 같습니다.
		
		
		
		if(name1.equals(name2) ) {  
			// String name1 객체의 값("엄정화")과 String name2 객체의 값("엄정화")이 같으면 true
			// String name1 객체의 값("엄정화")과 String name2 객체의 값("엄정화")이 같지 않으면 false
			System.out.println(name1 + "는(은) " + name2 + "과(와) 값은 같습니다.");
		}
		else {
			System.out.println(name1 + "는(은) " + name2 + "과(와) 값은 같지 같습니다.");
		}
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
		String name3 =  "서강준";
		String name4 =  "서강준";
		//new를 쓰지 않으면 ==로도 비교 가능
		
		if(name3 == name4) { // 권장하지않음
			System.out.println(name3 + "는(은) " + name4 + "과(와) 값은 같습니다.");
		}
		else {
			System.out.println(name3 + "는(은) " + name4 + "과(와) 값은 같지 같습니다.");
		}
		//서강준는(은) 서강준과(와) 값은 같습니다.
		
		
		if(name3.equals(name4)) { // 권장합니다
			System.out.println(name3 + "는(은) " + name4 + "과(와) 값은 같습니다.");
		}
		else {
			System.out.println(name3 + "는(은) " + name4 + "과(와) 값은 같지 같습니다.");
		}
		//서강준는(은) 서강준과(와) 값은 같습니다.
		
		
		// >>> !!! 주의 !!! <<< //
		String name5 = "제니";
		String name6 = null;
		
		
		if(name5.equals(name6)) {
			System.out.println(name5 + "는(은) " + name6 + "과(와) 값은 같습니다.");
		} 
		else {
			System.out.println(name5 + "는(은) " + name6 + "과(와) 값은 같지 같습니다.");
		}
		
		// 제니는(은) null과(와) 값은 같지 같습니다.
		
	
		
		//if(null.equals("차은우")) {\
		//NullPointerException 오류발생
		//}
		
		if("차은우".equals(null)) {
			//위의 주석문 처럼 하면 안되고, 지금처럼 해야한다.
		}
	
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
		//String name7 = new String("강감찬");
		String name7 = null;
		String name8 = "강감찬";
		
		if(name7 != null && name7.equals(name8)) {
			System.out.println(name7 + "는(은) " + name8 + "과(와) 값은 같습니다.");;
		} // dead code ==> 도달할 수 없는 코드를 말한다.
		
		else {
			System.out.println(name7 + "는(은) " + name8 + "과(와) 값은 같지 같습니다.");
		}
	
		
		
		
		
	}
	
}
