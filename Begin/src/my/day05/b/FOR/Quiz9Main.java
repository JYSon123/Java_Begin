package my.day05.b.FOR;

public class Quiz9Main {

	public static void main(String[] args) {
		
		String word = "super007Man";
	//	String word = "superMan";
		
		String str = "";
		int cnt=0;
		
		boolean flagDigit = false;
		
		for(int i=0;i<word.length(); i++) {
			char ch = word.charAt(i);
			
			if(Character.isDigit(ch)) {
				flagDigit = true;
			}
		}// end of for--------------------------------
		
		/*
		    String word = "super007Man"; 이라면  
		    flagDigit = true; 가 될 것이다.
		    
		    String word = "superMan"; 이라면  
		    flagDigit = false; 가 될 것이다.
		*/
		
		
		if(flagDigit) {  // String word = "super007Man"; 된 경우 
			
			for(int i=0; i<word.length(); i++) {
				
				char ch = word.charAt(i);
				
				if( !Character.isDigit(ch) ) {  // 숫자가 아니라면 
					str += ch;  // str = str + ch;
					            // str = "" + 's';   "s"
					            // str = "s"+'u';    "su" 
					            // ......
					            // str = "super"
					cnt++;
				}
				else { // '0'
					break;
				}
				
			}// end of for-------------------------	
			
		}
		
		System.out.println("1.최초로 숫자가 나오는 곳의 앞까지 문자열 출력 ==> " + str);
		System.out.println("1.최초로 숫자가 나오는 곳의 앞까지 문자열의 길이 ==> " + cnt);
		
		// 1.최초로 숫자가 나오는 곳의 앞까지 문자열 출력 ==> super
		// 1.최초로 숫자가 나오는 곳의 앞까지 문자열의 길이 ==> 5
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"); 
	
		str="";
		cnt=0;
		
		if(flagDigit) {  // String word = "super007Man"; 된 경우 
			
			for(int i=0;;) {
				char ch = word.charAt(i++); // word.charAt(0) 's'  i=>1 
				                            // word.charAt(1) 'u'  i=>2
				                            // word.charAt(2) 'p'  i=>3
				                            // word.charAt(3) 'e'  i=>4
				                            // word.charAt(4) 'r'  i=>5
				                            // word.charAt(5) '0'  i=>6
				if( !Character.isDigit(ch) ) {  // 숫자가 아니라면 
					str += ch;  // str = str + ch;
					            // str = "" + 's';   "s"
					            // str = "s"+'u';    "su" 
					            // ......
					            // str = "super"
					     
					cnt++;
				}
				else { // '0'
					break;
				}
			}// end of for----------------------	
			
		}
		
		System.out.println("2.최초로 숫자가 나오는 곳의 앞까지 문자열 출력 ==> " + str);
		System.out.println("2.최초로 숫자가 나오는 곳의 앞까지 문자열의 길이 ==> " + cnt);   
		
	}// end of main(String[] args)------------------------

}
