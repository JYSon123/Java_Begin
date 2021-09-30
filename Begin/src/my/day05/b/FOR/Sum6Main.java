package my.day05.b.FOR;

//// ==== 모범답안 ==== ////


//=== 실행결과 ===
//
//>> 누적해야할 시작 정수 => 1엔터 그냥엔터 똘똘이엔터 2.567 엔터
//### 정수만 입력하세요!! ###
//
//>> 누적해야할 시작 정수 => 1엔터
//
//>> 누적해야할 마지막 정수 => 1엔터 그냥엔터 똘똘이엔터 2.567 엔터
//### 정수만 입력하세요!! ###
//
//>> 누적해야할 마지막 정수 => 10엔터
//
//>>> 실행결과 : 1 부터 10 까지의 누적의 합은 55 입니다. <<<


import java.util.Scanner;

public class Sum6Main {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int startNo = 0;
	int endNo = 0;
	int sum = 0;
	String str = "";
	
	
	
	
	
	for(;;) {
		
		try {
			System.out.print(">> 누적해야할 시작 정수 => ");
			startNo = Integer.parseInt(sc.nextLine());
			// 2  1  3
			
			
			System.out.print(">> 누적해야할 마지막 정수 => ");
			endNo = Integer.parseInt(sc.nextLine());
			// 9  10  5
		     
			// 반복해야할 회수 9-2+1 => 8번
			// 반복해야할 회수 10-1+1 => 10번
			// 반복해야할 회수 5-3+1 => 3번
			
			int cnt = endNo - startNo + 1;  //반복할 회수를 구해주는 식
			
			sum = 0; //합계
			
			for(int i=0, j=startNo; i<cnt; i++, j++) {
				
				
				if(i < cnt-1) 
					str += j+"+";
				
				else 
					
					
				sum += j;

				
				
			}//end of for -------
			
			break; // 합계를 다 구한 뒤 끝낸다.  
	
		} catch (NumberFormatException e ) {
			System.out.println("### 정수만 입력하세요 !! ###\n");
		}

		
		
		
		//>>> 실행결과 : 1 부터 10 까지의 누적의 합은 55 입니다. <<<

		
	}//end of for(;;)
	
	
	System.out.println(">>> 실행결과 : " + startNo + "부터 "+ endNo +"까지의 누적의 합은 " + sum + "입니다.");
	
	
	
	System.out.println(str+"="+sum);
	
	// 1+2+3+4+5+6+7+8+9+10 = 55
	// 2+3+4+5+6+7+8+9 = 44
	
	
	sc.close();
	
	
}  
	
	
}



