package my.day07.c.random;

import java.util.Scanner;

public class MathrandomMain1 {

	public static void main(String[] args) {
		
		
		// === 랜덤한 정수를 뽑아낸다 === //
		
		double random = Math.random();
		System.out.println("random => " + random);
		
		
		/*
        java.lang.Math.random() 메소드는 
        0.0 이상 1.0 미만의 실수(double)값을 랜덤하게 나타내어주는 메소드이다. 
                즉,  0.0 <= 임의의 난수(실수) < 1.0 
           
        1 부터 10까지중 랜덤한 정수를 얻어와 본다.
        
               랜덤한 정수 = (int)(Math.random()*구간범위)+시작값;
        
        0.0        (int)(0.0*(10-1+1))+1         ==>  1
        0.23346438 (int)(0.23346438*(10-1+1))+1  ==>  3
        0.67835431 (int)(0.67835431*(10-1+1))+1  ==>  7
        0.99999999 (int)(0.99999999*(10-1+1))+1  ==> 10
        
        3 부터 7까지중 랜덤한 정수를 얻어와 본다.
        
        0.0        (int)(0.0*(7-3+1))+3         ==>  3
        0.23346438 (int)(0.23346438*(7-3+1))+3  ==>  4
        0.67835431 (int)(0.67835431*(7-3+1))+3  ==>  6
        0.99999999 (int)(0.99999999*(7-3+1))+3  ==>  7
        */
		
		
		
		int rand1 = (int)(random*(10-1+1))+1;
		int rand2 = (int)(random*(7-3+1))+3;
		int rand3 = (int)(random*(122-97+1))+97;
		//int rand3 = (int)(random*('z'-'a'+1))+'a'; //자동으로 int 값으로 바뀐다.
		
		
		System.out.println("1 부터 10까지 중 랜덤하게 발생한 값 : " + rand1);
		
		System.out.println("3 부터 7까지 중 랜덤하게 발생한 값 : " + rand2);
		
		System.out.println("a 부터 z까지중 랜덤하게 발생한 소문자 : " + (char)rand3);
		
		
		
		// 인증키는 랜덤한 숫자 3개(0~9) 랜덤한 소문자 4개로 만들어진다.
		// 예>103qdtq 020abat 
		
		
		String key= "";
		
		
		for(int i=0; i<3; i++) {
			int num = (int)(Math.random()*(9-0+1)+0);
			key += num;
		}
		
		for (int i=0; i<4; i++) {
			int num  = (char)(Math.random()*('z'-'a'+1)+'a');
			key += (char)num;
		}
		
		System.out.println("인증키 =>" + key);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		
		/*   //==강사님 답==//
		  
		 for(int i=0; i<3; i++) {
		 	int num = (int)(Math.random()*(9-0+1)+0);
		 	key += num;
		 	}
		 	
		 for(int i=0; i<4; i++) {
		 	int num = (int)(Math.random()*('z'-'a'+1)+'a');
		 	key += num;
		 	}
		 	
		 	System.out.println("인증키 =>" + key);
		 */
		
		
		
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
				   
				   int pcno = (int)(Math.random()*(10-1+1))+1;
				   
				   
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
				 //end of do ~ while ----------------- 
					
				   
			   		} // end of else --------------------
			   
			   
//			   do {
//					System.out.print(">> 또 하시겠습니까? [Y/N] => ");
//					
//					
//					if("Y".equalsIgnoreCase(yn)) {
//						break;
//					}
//					
//					else if ("N".equalsIgnoreCase(yn)) {
//						break outer;
//					}
//					
//					else {
//						System.out.println(">>Y 또는 N만 입력해주세요!<< ");
//					}
//					
//					
//			   }while(true);
				
			   
			   
			   
		   
			}catch(NumberFormatException e) {
				System.out.println(">> 정수만 입력하세요!! <<");
				
			}
			
			
			
		} while(true); //무한루프이다
		

		sc.close();
		System.out.println(">> 프로그램 종료 <<");
		
		

	}// end of main(String[] args)---------------------

}
