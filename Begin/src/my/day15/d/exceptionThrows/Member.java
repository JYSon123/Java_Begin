package my.day15.d.exceptionThrows;

public class Member {
	
	// filed
	String name;
	String kor;
	String eng;
	String math;
	
	
	// method
	void info() throws NumberFormatException {
		
		// 원래는 info() 메소드내에서 익셉션 처리를 해야 하지만
		// 여기서는 info() 메소드 다음에 throws NumberFormatException 을 썼으므로
		// info() 메소드내에서 익셉션 처리를 하지 않고 
		// info() 메소드를 호출하는 쪽에서  NumberFormatException 을 처리해라는 뜻이다.
		
		int nkor = Integer.parseInt(kor);
		int neng = Integer.parseInt(eng);
		int nmath = Integer.parseInt(math);
	
		int total = nkor + neng + nmath;
		
		String info = "1.  학생명 : " + name + "\n"
					+ "2.  국어 : " + kor + "점\n"
					+ "3.  영어 : " + eng + "점\n"
					+ "4.  수학 : " + math + "점\n"
					+ "5.  총점 : " + total + "점\n";
		
		System.out.println(info);
		
	
	}
	
	

}
