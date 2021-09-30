package my.day05.b.FOR;

public class Sum5Main {

	public static void main(String[] args) {
		
		int sum = 0;  // sum 은 누적의 합을 저장시키는 변수
		
		for(int i=1; i<=10; i++ ) {
			sum +=i;  // sum = sum + i;
			          // sum = 0 + 1;          ==> 1번째 반복
					  // sum = 0 + 1 + 2;      ==> 2번째 반복
			          // sum = 0 + 1 + 2 + 3 ; ==> 2번째 반복			
                      //.....................
			          // sum = 0 + 1 + 2 + 3 + 4 + ....... 10;  ==>  10번째 반복
	
		}
		
		System.out.println("1 부터 10 까지의 누적의 합계 : " + sum);
		// 1 부터 10 까지의 누적의 합계 : 55
		
		sum=0; // sum 은 누적의 합을 저장시키는 변수
		String str = "";
		
		for(int i=1; i<=10; i++) {
			
			// string 타입이기 때문에 문자열 결합이다.
			if(i<10)
			str += i+"+";  // str = str + i;  
			else           
			str += i;               // str = ""+1;       1
		                   // str = ""+1+"+"+2;     12
			               // str = ""+1+"+"2+"+"+3;   123

						
			
			sum += i;
			
			
			
		}//end of for----------------
		
		System.out.println(str + "=" + sum);
		
		
		
		//1+2+3+4+5+6+7+8+9+10=55 결과물
		
		
		
		
		
		
			
			
		
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 ==> 55
		
		
		
	}  // end of main(String[] args) 

}
