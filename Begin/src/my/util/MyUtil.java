// 다 같이 쓸거기 때문에 별도의 패키지에 만든것, 그렇기에 인스턴스를 굳이 만들 필요 없음. 쉐어개념

package my.util;


import java.text.SimpleDateFormat;
//import.java.lang.*;  생략이 되어있는것
import java.util.Date;


public class MyUtil {

	//  === 현재시각을 출력해주는 static 메소드 생성하기 === //
	public static void cuurentTime() {  // static = 공유개념 
		
		
		Date now = new Date(); // 현재시각, 눌러서 until 패키지를 가져와야함
		
		SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  //import 해줘야함 
		String str_now = sdfrmt.format(now);

		 
		
		
		
		System.out.println(">> 현재시각 : " + str_now);
		

		
	}// end of public static void cuurentTime()
	
	
	
	
	
    	// === 비밀번호가 규칙에 맞는지 틀리는지 알려주는 static 메소드 생성하기 === // 
	    // 비밀번호 규칙은 비밀번호의 길이는 8글자 이상 15글자 이하이어야 하고,
	    // 또한 비밀번호는 영문대문자, 영문소문자, 숫자, 특수기호가 혼합되어야만 한다.
	    // 우리는 규칙에 맞으면 true , 규칙에 틀리면  false 를 리턴해주도록 만든다. 그렇기에 boolean으로 만들어진다.
		public static boolean isCheckPasswd(String passwd) {
			
			//null 값의 경우에는 검사를 해줄필요가 없기 때문에 이 항목을 넣어준다.
			if(passwd == null)
				return false;
			
			// 예를 들어서 passwd 값이 ab123cd#S 이라면
		    // "ab123cd#S".toCharArray(); 을 하면
		    // {'a','b','1','2','3','c','d','#','S'} 으로 변환된다.
			
			char[] chArr = passwd.toCharArray(); // passwd를 Char 타입의 배열로 바꿔주는것. return false; 때문에 null 타입음 존재할 수 없다.
			
			/*
			-------------------------------------------------------------------------
			| a | b | 1 | 2 | 3 | c | d | # | $ |
			-------------------------------------------------------------------------
			*/
			
			if(8 < chArr.length && chArr.length <= 15) {
				
				 boolean flagUpper   = false; // 영문대문자 표식을 위한 용도 
		         boolean flagLower   = false; // 영문소문자 표식을 위한 용도
		         boolean flagNumber  = false; // 숫자 표식을 위한 용도
		         boolean flagSpecial = false; // 특수문자 표식을 위한 용도
				
		         
		         
				// 일반 for문
		        /* 
		        for(int i=0; i<chArr.length; i++) {
		        	char ch = chArr[i]; //글자 하나하나를 가지고온다
		        	
		        	if(Character.isUpperCase(ch)) { // 영문대문자인 경우
		        		 flagUpper   = true;
		        	}
		        	else if(Character.isLowerCase(ch)) { // 영문소문자인 경우
		        		flagLower   = true;
		        	}
		        	else if(Character.isDigit(ch)) { // 숫자인 경우
		        		flagNumber   = true;
		        	}
		        	else { // 특수문자인 경우
		        		flagSpecial = true;
		        	
		        	}

		        	//4개의 깃발이 다 올라가야 for문을 빠져나올 수 있다
		        	
		        	
		        }// end of for
 
		      */   
		         // 개선된 for문
		         
		         for(char ch : chArr) { // 값을 하나하나 다 넣어주는것이다.
		        	 
				        	
				        	if(Character.isUpperCase(ch)) { // 영문대문자인 경우
				        		 flagUpper   = true;
				        	}
				        	else if(Character.isLowerCase(ch)) { // 영문소문자인 경우
				        		flagLower   = true;
				        	}
				        	else if(Character.isDigit(ch)) { // 숫자인 경우
				        		flagNumber   = true;
				        	}
				        	else { // 특수문자인 경우
				        		flagSpecial = true;
				        	}
		        			
				        	
		         }// end of for---------------------------------
		         		 
		         
		        if(flagUpper && flagLower && flagNumber && flagSpecial) {
		        	return true;
		        }
		        else {
		        	return false;
		        }
		        
		         
		        
			}
			else { // 비밀번호의 길이가 8글자 미만 이거나 15글자 보다 큰 경우이다.
				return false;
			}
		}// end of public static boolean isCheckPasswd(String passwd)

		
		
		// === ,가 들어있는 숫자로 되어진 문자열을 ,를 제거해서 정수로 리턴시켜주는 메소드 생성하기 === //
		
		public static long deleteComma(String str) {
			                     // " 2,000,000 " 
			                     // "700"
			
			
			str = str.trim(); // "2,000,000"  공백이 들어오면 오류가 나기 때문에 trim()을 사용해준다.
			
			
			
			do {
				int commaIndex = str.indexOf(","); //최초로 나오는 콤마의 위치값을 찾는다.
				
				if(commaIndex == -1) { //콤마가 없다면, 콤마 제거 자체가 필요없다.
					break;
				}
				else {
					str = str.substring(0, commaIndex) + str.substring(commaIndex+1); // 0 부터(첫글자) commaIndex앞까지, 그리고 끝까지     
					// str = "2" + "000,000"
					// str = "2000,000"
					
					// str = "2000" + "000"
					// str = "2000000"
					
				}
	
				
			} while (true);
			
			return Long.parseLong(str);  // parseLong으로 바꿔준 다음에 넘겨준다.
			
			
		}// end of public static long deleteComma(String str)---------------
		
		
		
}
