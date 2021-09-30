package my.day03.a.constructor;

public class MemberMain {

	public static void main(String[] args) {
		
		Member eomjhMbr = new Member("eomjh","qwer1234","엄정화",35,100);
		//객체를 만듦과 동시에 바로 값을 넣어주고 싶으면, 위의 부분과 같은 생성자가 필요하다. (Member.java)
		
		
		Member IssMbr = new Member(); 
		// (1)
		
		IssMbr.userid = "leess";
		IssMbr.passwd = "abcd";
		IssMbr.name = "이순신";
		IssMbr.age = 25;
		IssMbr.point = 200;
		
		
		eomjhMbr.showInfo();
		IssMbr.showInfo();
		
		
		System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n");
		
		
		eomjhMbr.updateInfo("abcd0070","EomJeongHwa", 29, 300);
		
		
		System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n");
		
		
		//return 타입은 String
		String newInfo = IssMbr.changeInfo("qwer","순신이", 22, 500);
		System.out.println(newInfo);
		
		
		
	
		
		

	} // end of main(String[] args)-------------

}
