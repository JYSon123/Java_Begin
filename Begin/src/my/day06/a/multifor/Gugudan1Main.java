package my.day06.a.multifor;

import java.util.Scanner;

public class Gugudan1Main {

	//// 코드 체크해서 혼자 쳐보자! ////
		

		/*
	      >> 몇단볼래? => 8엔터
	      
	      === 8단 ===
	      8*1=8
	      8*2=16 
	      8*3=24
	      8*4=32
	      8*5=40
	      8*6=48
	      8*7=56
	      8*8=64
	      8*9=72 
	      
	      >> 또 하시겠습니까?[Y/N] => y엔터 또는 Y엔터
	      
	      >> 몇단볼래? => 1.34엔터 또는 똘똘이엔터
	      >>> 2단부터 9단까지만 가능합니다 <<<
	      
	      >> 몇단볼래? => 345엔터
	      >>> 2단부터 9단까지만 가능합니다 <<<
	      
	      >> 몇단볼래? => 3엔터
	      
	      === 3단 ===
	      3*1=3
	      3*2=6 
	      3*3=9
	      3*4=12
	      3*5=15
	      3*6=18
	      3*7=21
	      3*8=24
	      3*9=27 
	         
	      >> 또 하시겠습니까?[Y/N] => s엔터 또는 S엔터
	      >>> Y 또는 N 만 가능합니다!! <<<
	      
	      >> 또 하시겠습니까?[Y/N] => n엔터 또는 N엔터
	      
	      == 프로그램종료 ==   
	   */
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		/*
	        === 레이블을 사용하여 break; 하기 ===
	                레이블명 뒤에는 : 을 붙이며 반드시 반복문 앞에 써야 한다.  
		*/
		
		
		//몇번 반복을 할지 모르기 때문에  무한반복을 일단 걸어준다

		
		outer: // 바로 아래 for문에 대한 라벨 (레이블)이 된다. 레이블명이 지금은 outer
		for(;;) {
			
			try {
			
				System.out.print(">> 몇단볼래? => ");
			
				String strDan = sc.nextLine();  //스캐너에서 Stirng 타입으로 받을것
				
				int dan = Integer.parseInt(strDan); // String 타입을 int로 변환시켜준다.
		 	
				if(2 <= dan && dan <= 9) { // 입력받은 단이 2 이상 9 이하 
				//해당하는 단을 출력 //
				
					System.out.println("=== "+dan+"단===");
					
					for(int i=0; i<9; i++) {
						System.out.println(dan+"*"+(i+1)+"="+dan*(i+1));	
					}//end of for---------- // 구구단 출력이 끝난다.

					
					for(;;) {   //n,N 그리고 Y,y 대문자 소문자 할것없이 다 받아줘야한다
						System.out.print(">> 또 하시겠습니까?[Y/N] => ");               
						String yn = sc.nextLine();
						
						//yn <== "n" 또는 "N"을 입력했다라면
						
						if("N".equalsIgnoreCase(yn)) { // equalsIgnoreCase은 대문자, 소문자 둘 다 true
							 // N의 경우에는 그만하겠다라는 뜻이기 때문에 프로그램 종료로 가야한다.
							 // 그냥 break를 사용하면 가장 가까운 for문을 빠져나오게 된다.
						     // 바깥 부분의 for문을 빠져나와야 하기 때문에  break outer;을 사용해줌.
						
							sc.close();
							break outer;
						}
					
					
						//yn <== "Y" 또는 "y"을 입력했다라면
						else if("Y".equalsIgnoreCase(yn)) { //계속 하겠다는 뜻이다. 그렇기에 안쪽 for문을 빠져나와야한다.
							break;  // break;와 가장 가까운 반복문 (for)을 빠져나가는것이다.
						}
						
						//yn <== "Y","y","n","N"을 제외한 나머지 값을 입력한 경우는?
						
						else 
							System.out.println(">>> Y 또는 N 만 가능합니다!! <<<");

					
					}// end of for------------ (Y나 N이 나오면 브레이크를 잡아줘야함)
			
				}
				
				
			
				
				}catch(NumberFormatException e) { //문자를 입력한 경우
		 		
					System.out.println(">>> 2단부터 9단까지만 가능합니다 <<<");
				}	
		 		
			
			
		}// end of for--------------------------
		
		
		
		
		System.out.println("\n== 프로그램 종료 ==");

		
		
	}// end of main(String[] args)--------------

}

		