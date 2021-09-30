package my.day15.d.exceptionThrows;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			Member mbr1 = new Member();
	        
	        mbr1.name = "이순신";
	        mbr1.kor = "90";
	        mbr1.eng = "80";
	        mbr1.math = "70";
			
	        mbr1.info();
	        
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	        
			
			
			Member mbr2 = new Member();
	        
	        mbr2.name = "엄정화";
	        mbr2.kor = "90";
	        mbr2.eng = "팔십";
	        mbr2.math = "70";
			
	        mbr2.info();
		
		}catch(NumberFormatException e) {
			//System.out.println(">> 오류 메시지 내용 : " + e.getMessage());
			e.printStackTrace();
		}
        
        
		
	}// end of main(String[] args)
	

}
