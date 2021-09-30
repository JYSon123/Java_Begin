package my.day07.b.DOWHILE;

import java.util.Scanner;

public class FactorialMain2 {	
	
	// === 입사문제 === //
	
    /*
     >> 알고 싶은 팩토리얼 수 입력 => 5엔터
     >> 5! = 120
     
     5! ==> 5*4*3*2*1
     7! ==> 7*6*5*4*3*2*1
   */
	
	public static void main(String[] args) {	
		
	Scanner sc = new Scanner(System.in);
	
	    outer:
		do {
		try {
			System.out.print(">> 알고 싶은 팩토리얼 수 입력 =>");
			int num = Integer.parseInt(sc.nextLine());
			
			if(num <= 0) {
				System.out.println(">> 자연수만 입력하세요!! <<");
				continue; //continue; 를 만나면 아래로 떨어지지 않고 do~while(조건식); 의 조건식으로 들어간다.
			}
			
			
			int result = 1; //곱하기이기 때문에 1이 되어야 한다.

			for(int i=num; i>0; i--) {  //5*4*3*2*1   1씩 줄어든다
				
				result *= i;  // result = result*i; 
							  // result = 1*5;
				              // result = 5*4;
	                          // result = 5*4*3*2;
                              // result = 5*4*3*2*1;				

			}// end of for------------------------

			System.out.println(num+"! = "+ result);
			
			do {
				System.out.print(">> 또 할래?[Y/N] =>");
				String yn = sc.nextLine();
				
				if("Y".equalsIgnoreCase(yn)) {
					break;
				}
				
				else if("N".equalsIgnoreCase(yn)) {
					break outer;
				}
				
				else {
					System.out.println(">> Y 또는 N 만 입력하세요 !! <<");
				}
					

			} while (true);
			// end of do~while---------------------
			
			

			
			/*   ===강사님 과제===
			for(;;) {
				System.out.print(">> 또 할래?[Y/N] => ");
				String yn = sc.nextLine();
				
				if("N".equalsIgnoreCase(yn)){
					sc.close();
					break outer;
				}
				else if("Y".equalsIgnoreCase(yn)) {
					break;
				}
				
				else
					System.out.println(">>> Y 또는 N만 입력해주세요! <<<");
			
				
				
			}// end of for----------------*/
			
			
			
		  }catch(NumberFormatException e)	{
				System.out.println(">> 정수만 입력하세요!! <<");      
		  }
			
		
		
		}while(true);
		// end of do~while-----------------

	
		sc.close();

		System.out.println("\n~~~~ 프로그램 종료 ~~~~");
		
		
		
		
		
	}// end of main(String[] args)-------------

}
