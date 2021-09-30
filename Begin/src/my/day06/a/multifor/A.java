package my.day06.a.multifor;

import java.util.Scanner;

public class A {

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
		
		outer:
		for(;;) {
		try {
		System.out.print(">> 몇단볼래? ==> ");
		String strDan = sc.nextLine();
		int dan = Integer.parseInt(strDan);  // 스캐너에서 구구단을 받아온 다음 int로 형변환
		
		if(2 <= dan && dan <=9); // 구구단은 2단~9단만 출력하기 때문에 숫자를 걸러줄 && 형식이 필요하다    
		
			System.out.println("=== "+dan+" ==="); 
			
			for(int i=0; i<9; i++) {  //for을 이용해서 위에서 입력한 구구단이 나오게 해보자!
				System.out.println(dan+"*"+(i+1)+"="+dan*(i+1));
				
			}// end of for----------------------------
		
		
		for(;;) {
			System.out.print(">> 추가로 보고싶은 구구단이 있습니까? [Y/N] =>");
			String yn=sc.nextLine();
			
			
			if("N".equalsIgnoreCase(yn)) {
				sc.close();
				System.out.println("== 종료되었습니다 ==");
				break outer;
				
			}
			
			
			else if("Y".equalsIgnoreCase(yn)) {
				break;
				
			}
			
			else
				System.out.println(">>> Y나 N만 입력해주세요!! <<<");
			
		}
			
		
		}catch(NumberFormatException e){
			System.out.println(">>> 2에서 9 사이 숫자만 입력해주세요!");
			
			
		}
		
		
		
		
		}//end of for===================
		
		
		
		

	}// end of main(String[] args)------------------------

}
