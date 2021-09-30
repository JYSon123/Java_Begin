package my.day05.b.FOR;

import java.util.Scanner;

public class Member {

	
	// === field ===
	String id;     
	String pwd;   
	String name;  


	
	
	// === method ===
	// 회원가입 Method
	void register(Scanner sc) {   //회원가입, 여기서 스캐너를 받아와줘야 Main 에서도 쓸 수 있다.
		System.out.println(" >>> 회원가입 <<< ");
		
		System.out.print("1.아이디: ");
		id = sc.nextLine(); // sc.nextLine();를 통해서 키보드에서 받아준다.

		for(;;) { //for을 통해서 비밀번호의 규격에 맞지 않으면 무한루프로 다시 입력하게 한다.
			System.out.print("2.비밀번호(8글자 이상, 15글자 이하 영문자, 숫자, 특수기호가 혼합되어야 함) : ");
			String pwd = sc.nextLine();
			
			if (isCheckpwd(pwd) ) { // 이 결과물 값이 무엇입니까? , 내가 입력한 값이 기준에 맞으면 true
				this.pwd = pwd;
				break;
			}
		else {
			System.out.print("\n>>> 암호는 8글자 이상, 15글자 이하 영문자, 숫자, 특수기호가 혼합되어야 합니다. <<< \n");
		}
		}

			System.out.print("3.회원명: ");
			name = sc.nextLine();
			
			System.out.println("");
			
			showInfo();
		
		
		
	}// end of void register()-------------------------------------
	
	
	
	 // 비밀번호 정책에 맞는지 틀리는지 검사해주는 메소드
	 // 패스워드를 받아와야 체크를 할 수 있기 때문에 파라미터가 필요하다. 
	 // 이때 pwd는 지역변수이다.
	 //8글자 이상, 15글자 이하 영문자, 숫자, 특수기호가 혼합되어야 함
	 boolean isCheckpwd(String pwd) {
	         	//null   "aB34$"   "aBcdef1234556$"     "qwer1234$"     
		boolean result = false; //boolean은 디폴트값이 false이다.
		
		if(pwd != null) {
				
			boolean flagAlphabetic = false, flagNum = false, flagSpecial=false;
					
			int len = pwd.length(); //.length 글자수를 알아내준다
					
			if (8 <= len && len <= 15) {
					
				for(int i = 0; i<len; i++)  {  // 검사 횟수는 글자길이 (len)번 반복해주면 된다
					// "qwer1234$"  ==> "qwer1234$".charAt(0) ==> 'q'
					//              ==> "qwer1234$".charAt(1) ==> 'w'
					//              ==> "qwer1234$".charAt(4) ==> '1'
//	                //              ==> "qwer1234$".charAt(8) ==> '$'
					
					char ch = pwd.charAt(i); //charAt , 지정한 자리의 문자열이 어떤것인지를 알 수 있게 해줌.
					
					
					//Character를 통해서 원하는 유형의 문자열인지 본다.
					//.isAlphabetic(int)로 들어오는데
					// ch는 char이기 때문에  int로 바꿔주기 위해 +0를 해준다. (사칙연산을 만나면 int로 바뀌기 때문) 
					if(Character.isAlphabetic(ch +0))  { // isAlphabetic 알파벳인지 아닌지를 체크해준다.
						flagAlphabetic = true;
					}
			    	
					else if( Character.isDigit(ch) ) { // isDigit 숫자인지 아닌지를 알아봐준다.
						flagNum = true;
					}
					
					else {
						flagSpecial = true;
					}	
					
				}// end of for-----------------------------------	
						
				if (flagAlphabetic && flagNum && flagSpecial) {
					result = true;
				}				
		 }	
			
	}// end of if 
			
	return result;
		
		
 }//end of boolean isCheckpwd(String pwd) {} ----------------------------------
	
	
	void showInfo() { 
		
		System.out.println("==== 회원정보 ==== \n"
				         + "1. 아이디 :" + id + "\n"
				         + "2. 비밀번호 :" + pwd + "\n"
				         + "3. 성명 :" + name + "\n");
		
	
	
		
		
	}	
}
