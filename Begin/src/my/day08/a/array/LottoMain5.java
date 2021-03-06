package my.day08.a.array;

import java.util.Random;

public class LottoMain5 {

	public static void main(String[] args) {
	
		
		/*
        int ball ==>   1,   2,   3,   4,   5,   6, .....  43,  44,  45       
                 ==> 101, 102, 103, 104, 105, 106, ..... 143, 144, 145
        
        int[] ballArr = new int[45];    숫자로 생각하지 말고 방의 갯수로 생각!
        ----------------------------------------------------
        | 0 | 1 | 2 | 3 | 4 | 5 | ......... | 42 | 43 | 44 |
        ----------------------------------------------------
		 */
		
		
		int[] ballArr = new int[45];
		int[] tempArr = new int[5];  // 기존에 뽑았던 방번호를 기억시켜두는 저장소
	/*
		  tempArr
		      --------------------------
		 값 =>  | -1 | -1 | -1 | -1 | -1 |
		      --------------------------
		 
	 */
		
		
		for(int i=0; i<ballArr.length; i++) {
			
			ballArr[i] = i+1;  // 배열의 방마다 데이터값 입력하기
	    					   // 데이터 값은 1 ~ 45
			

		} // end of for-------------------------------
		
		
		for(int i=0; i<tempArr.length; i++) {
			tempArr[i] = -1;   // 기본값이 0이기 때문에 
			
		}
		
		/*
	        공을 꺼내어 오면 공의 방번호(index 번호)를 기억하는 곳으로 사용되는데
	        꺼내온 공의 방번호(index 번호)가 0(실제값은 1번볼)이 들어올 수 있으므로
	        데이터값은  방번호(index 번호)로 사용하지 않는 -1 로 모두(5개) 초기화 한다.
       */
		
		
		
		// 공의 방번호(배열의 index)를 꺼내는 작업을 6번 반복 
	    // 0번 방 부터 44번 방 까지 랜덤하게 6번 뽑아야 한다.
	    // 즉, 0 ~ 44 까지 난수를 발생. 
		
		Random rnd = new Random();
		
		String result = "";
		
		
		outer:
		for(int i=0; i<6; i++) {
			
			int idx = rnd.nextInt(44-0+1)+0;  //배열의 방번호(0 ~ 44)를 랜덤으로  뽑아준다.
			
			// 첫번째  두번째  세번째  네번째  다섯번째  여섯번째
			//   9 
			//   9    9   다시 뽑아야한다.          
			//   9    0						//같은걸 뽑을 수 있기 때문에
			//   9    0   12 
		    //   9    0   12    7    34 
	    	//   9    0   12    7    34    20
			
			// int[] tempArr <== 랜덤하게 뽑은 배열의 방번호를 기억하는 저장소 
	     
			/*
	                 --------------------------
	          index  | 0  | 1  | 2  | 3  |  4 |
	                 --------------------------
	                   데이터값    | -1 | -1 | -1 | -1 | -1 |
	                 --------------------------
	                   데이터값    | 9  | 0  | 12 |  7 | 34 |    
	                 --------------------------
	         */
 
			
			
			// 새로이 뽑아온 방번호(idx)가 기존에 뽑은것(tempArr[j])과 같다라면 다시 새로이 뽑아야 한다. 
            // 즉, 0 ~ 44 중에 새로이 또 뽑아야 한다는 말이다.
			for(int j=0; j<tempArr.length; j++) { //5번
				
				if( idx == tempArr[j]) {
					i--;
					continue outer;
			}// if가 false(중복된 숫자가 뽑히지 않았으면)라면 tempArr.length for로 돌아가서 j++을 한 다음, 다시 if로 내려온다
					
			}// end of for-------------------------
			
			
			if(i<5) { //5개를 저장하는 이유는, 마지막 번호는 5개와 겹치지 않는다면 바로 넣으면 되기 때문.
				tempArr[i] = idx;
				// 뽑은 방번호(index 번호)를 저장시켜둔다.
			}
			
			
			
			String comma = (i<5)?",":"";
			result += ballArr[idx] + comma;
			
			
		}// end of for------------------
		
		
		System.out.println("\n로또 1등 당첨번호 : " + result);
		

	}// end of main(String[] args)----------------

}
