package my.day05.b.FOR;

public class Quiz10Main {

	public static void main(String[] args) {
		
		
		/*
		    알파벳 소문자를 아래처럼 출력하세요.
		    a,b,c,d,e,.......,x,y,z
		*/
		
		// 자동적으로 int로 바뀐다.
		for(int i=0; i<'z'-'a'+1; i++) {
			char ch = (char)('a'+ i);  // 97+0 => 'a'
			                           // 97+1 => 'b'
			                           // 97+2 => 'c'
			
			
			
			//삼항연산자
			String str =(i<'z'-'a')?",":"";
			System.out.print(ch+str); //콤마를 넣어주기 위해서, 또한 z 다음에는 콤마가 있으면 안된다
		
		}// end of for---------------------
		

		
		
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		/*
	          알파벳 소문자를 아래처럼 출력하세요.
	     a,c,e,g,i,k,m,o,q,s,u,w,y 
		 */
		
		int cnt = 'z' - 'a' + 1;
		for(int i=0; i<cnt; i++) {
			char ch = (char)('a'+i);
			
			
			if( (ch+0)%2 == 0 )     // 짝수인 경우에는 continue로 다시 증감식으로 올라가버린다.
				continue;
				

			String str = (i<cnt-2)?",":"";  //cnt는 z까지 이기 때문에 2를 빼서 y 뒤에 ,이 붙지않게 한다.
			System.out.print(ch+str);
		}// end of for-------------------------------------
			
		

		
		

	} // end of main (String[] args)-----------------------

}
