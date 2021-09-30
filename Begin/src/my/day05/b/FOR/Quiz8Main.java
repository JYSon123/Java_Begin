package my.day05.b.FOR;

public class Quiz8Main {

	public static void main(String[] args) {
		
		
		

		String word = "Abz3Sa0#$T";
		
		int upperCnt = 0;
		int lowerCnt = 0;
		int numberCnt = 0;
		int secialCnt = 0;
		

		
		for(int i=0; i<word.length(); i++) { //글자수 만큼 검사 진행
			
			char ch = word.charAt(i);  //지정한 자리의 문자열이 어떤것?
			
			if(Character.isUpperCase(ch)) // 대문자인지 검사
				upperCnt++;
			
			else if(Character.isLowerCase(ch)) // 소문자인지 검사
				lowerCnt++;
			
			else if(Character.isDigit(ch))  // 숫자인지 검사
				numberCnt++;
			
			else
				secialCnt++;
			

			
		}// end of for -------------- 
		
		
		
		
		
		
		
		
		System.out.println(word+"\n"
				+ "대문자 개수 : " + upperCnt + "\n"
				+ "소문자 개수 : " + lowerCnt + "\n"
				+ "숫자 개수 :  " + numberCnt +"\n"
				+ "특수문자 개수 : " + secialCnt + "\n");
		
		
		/*
		 Abz3Sa0#$T
		 대문자 개수 : 2
		 소문자 개수 : 3
		 숫자 개수 : 2
	         특수문자 개수 : 2

		 */
		
		
		
		
		

	}// main(String[] args)------------------

}
