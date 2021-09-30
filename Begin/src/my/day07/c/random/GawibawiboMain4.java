package my.day07.c.random;

import java.util.Random;
import java.util.Scanner;

public class GawibawiboMain4 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		String str_userNum = "";
		
		do {
			System.out.println("========= 메뉴 ========= ");
			System.out.println("1.가위\t2.바위\t3.보\t.4게임종료");
			System.out.println("====================== ");
			System.out.println(">> 선택하세요 => ");
			
			str_userNum = sc.nextLine();


		if(!"1".equals(str_userNum) &&
		   !"2".equals(str_userNum) &&
		   !"3".equals(str_userNum) &&
		   !"4".equals(str_userNum) ){
			System.out.println("▷메뉴에 존재하지 않는 번호 입니다.\n");
			continue; //여기는 continue를 해도 그만, 안해도 그만이다.
		}
		else if(!"4".equals(str_userNum)){ 
		// 사용자가 1 또는 2 또는 3을 낸 경우
			
			//PC도 1 또는 2 또는 3중에 하나를 랜덤하게 내도록 한다.
			int pcNum = rnd.nextInt(3 - 1 + 1)+1;
			
			String msg="";	
			int userpcNum= Integer.parseInt(str_userNum);
			
			// 사용자가 이긴 경우
			if((pcNum==1 && userpcNum==2)  ||
			   (pcNum==2 && userpcNum==3)  ||
			   (pcNum==3 && userpcNum==1))  {
			   msg =">>> 사용자님이 이겼습니다!!\n";
			}
			// 사용자가 진 경우
			else if((pcNum==1 && userpcNum==3)  ||
				    (pcNum==2 && userpcNum==1)  ||
				    (pcNum==3 && userpcNum==2))  {
			   msg =">>> 사용자님이 졌습니다!!\n";
			        		
			}
			else {
				 msg =">>>비겼습니다!!!\n";
			}
		
			System.out.println(msg);
		
		}
		
		} while(!("4".equals(str_userNum)));
		// userNum 값이 "4" 일때만 do~ while을 빠져나온다.
		//end of do~while----
		
		
		sc.close();
		System.out.println("\n~~~~~~~~~ 프로그램 종료 ~~~~~~~~~~");
	
	}// end of main(String[] args)----------------------

}
