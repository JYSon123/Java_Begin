package my.day07.c.random;

import java.util.Random;
import java.util.Scanner;

public class RandomMain2 {

	public static void main(String[] args) {
		
		
		
		// === 랜덤한 정수를 뽑아본다 === //
	    // 보안상 Math.random() 보다는 new Random(); 을 사용하는 것이 더 안전하다. 
		
		Random rnd = new Random();
		//int rndNum = rnd.nextInt(마지막수 - 처음수 + 1) + 처음수;
		
		
		int rand1 = rnd.nextInt(10 - 1 + 1) + 1;
		int rand2 = rnd.nextInt(7 - 3 + 1) + 3;
		int rand3 = rnd.nextInt('z' - 'a' + 1) + 'a';
		
		
		
		
		System.out.println("1 부터 10까지 중 랜덤하게 발생한 값 : " + rand1);
		System.out.println("3 부터 7까지 중 랜덤하게 발생한 값 : " + rand2);
		System.out.println("a 부터 z까지중 랜덤하게 발생한 소문자 : " + (char)rand3);
		
		
		
		
		
		// 인증키는 랜덤한 숫자 3개(0~9) 랜덤한 소문자 4개로 만들어진다.
		// 예>103qdtq 020abat 
		
		
		String key= "";
		
		
		for(int i=0; i<3; i++) {
			int num = rnd.nextInt(9 - 0 + 1) + 0;
			key += num;
		}

		
		
		for(int i=0; i<4; i++) {
			int num = rnd.nextInt('z' - 'a' + 1) + 'a';
			key += (char)num;
		}
		
		
		System.out.println("인증키 =>" + key);
		

		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		Scanner sc = new Scanner(System.in);
		
		outer:
		do {
		
			try {
			
			System.out.print("선택[1:홀수 / 0:짝수] => ");
			String choice = sc.nextLine();
			
			int userno = Integer.parseInt(choice);
			
			
			// if( !(no==1 || no==0) )  {
			// 또는
			   if( userno!=1 && userno!=0 )  {
				   System.out.println(">> 0또는 1만 입력하세요 !!<<\n");
			   }
			   
			   else {
				   // PC 에서 랜덤하게 1 부터 10까지 중 하나를 만들도록 하자.
				   int pcno = rnd.nextInt(10 - 1 + 1) + 1;
				   
				   String result = "";
				   
				   if(userno == pcno%2) {
					   result = "맞추었습니다.";
				   }
				   else {
					   result = "틀렸습니다.";
				   }
				   
				   System.out.println("컴퓨터가 낸수 : "+pcno+" => "+result);
				   
				   
				   do {
					   System.out.print(">> 또 하시겠습니까? [Y/N] => ");
					   String yn = sc.nextLine();
					   
					   
					   if("Y".equalsIgnoreCase(yn)) {
						   break;
					   }
					   else if ("N".equalsIgnoreCase(yn)) {
						   break outer;  
					   }
					   else {
							System.out.println(">>Y 또는 N만 입력해주세요!<< ");
					   }
					 }while(true);
				   	 //end of do~while----------------- 
				   
			   		}// end of else 
			   				

			}catch(NumberFormatException e) {
				System.out.println(">> 정수만 입력하세요!! <<");
			}
			
			
			
		} while(true); //무한루프이다
		

		sc.close();
		System.out.println(">> 프로그램 종료 <<");
		
		

	}// end of main(String[] args)---------------------

}
