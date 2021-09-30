package my.day08.a.array;

public class SpaceDeleteMain4 {

	public static void main(String[] args) {
		
		// === 문자열 중 공백을 제거하기 ===//
		
		String str = "  korea   seou l 쌍용 강북 교육센터  ";
		System.out.println(str);
		
		char[] chArr = str.toCharArray();
		
		
		/*
	       --------------------------------------------------------------------------------------------------------------------------
	       |' '|' '|'k'|'o'|'r'|'e'|'a'|' '|' '|' '|'s'|'e'|'o'|'u'|' '|'l'|' '|'쌍'|'용'|' '|'강'|'북'|' '|'교'|'육'|'센'|'터'|' '|' '|         
	       --------------------------------------------------------------------------------------------------------------------------    
	    */
		
		int len = 0;
		for(int i=0; i<chArr.length; i++) { //공백이 아닌 글자가 몇개인지를 뽑아올것이다.
		
			if(chArr[i] !=' ') { // 공백이 아닌것만 배열에 넣어줄것이다.
				len++;
			}
			
			
		}// end of for---------------------------
		
		
		System.out.println(len);
		
		
		char[] resultchArr = new char[len];
		
		/*   char은 기본으로 공백이 들어온다. 그렇기에 모두 공백상태
		  ----------------------------------------------
		  | ' ' | 1 | 2 | 3 |~~~~~~~~~~~~~~~~~~~| 16 | 17 |
		  ----------------------------------------------
		
		  공백이 아닌 글자만 차곡차곡 쌓아줄것이다.
	      ------------------------------------------------------------------------------
	      |'k'|'o'|'r'|'e'|'a'|'s'|'e'|'o'|'u'|'l'|'쌍'|'용'|'강'|'북'|'교'|'육'|'센'|'터'|  
	      ------------------------------------------------------------------------------
		*/
		
		for(int i=0, j=0; i<chArr.length; i++,j++) { // chArr.length ==> 29
			
			if(chArr[i] != ' ') { //공백이 아니라면
			resultchArr[j] = chArr[i];
			
			
			///////////// ==잘못된 케이스==  /////////////////
			// resultchArr[0]
			// resultchArr[1]
			// resultchArr[2] = 'k'
			//................
			// resultchArr[17] ==> 마지막 인덱스번호
			// resultchArr[18] ==> 배열의 크기를 오버했으므로 오류가 뜬다.
			// 					   java.lang.ArrayIndexOutOfBoundsException
			
			
			
			////////////// ==올바른 케이스== ////////////////
			// resultchArr[0] = 'k'
			}
			
			else { //
				j--; // j 를 문자가 나올때 까지 0으로 유지시켜주는 장치이다. 
				
			}
			
			
		} // end of for----------------------------------------
		
		String result = "";
		
		for(char ch : resultchArr) {  // 18번 반복하면서 찍어준다
			result += ch;
		}
			System.out.println(result);
			// "koreaseol쌍용강북교육센터 ";
			
			//또는
			
			System.out.println(String.valueOf(resultchArr)); // char 타입의 배열을 valueOf String 타입으로 만들어줘 버린것.
		
		
		
		
		
		

	}// end of main(String[] args)------------------------------

}
