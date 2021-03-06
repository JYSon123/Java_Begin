package my.day08.a.array;

public class ArrayMain1 {

	public static void main(String[] args) {
		
		
	 /*
     === 배열(array)이란 ? ===
          동일한 데이터타입을 가지는 여러개의 데이터를 저장할 수 있는 데이터 타입을 말한다.
          그리고 배열 또한 객체라는 것을 꼭 기억하도록 하자!!!  
     */
		
	
		// 1. == 배열의 선언 ==
		 int[] subjectArr;
		// 또는
		// int subjectArr[]; 같은말이다.
		 
		 
		//2. == 선언되어진 배열을 메모리에 할당을 해준다. ==
		
		 subjectArr = new int[7];  // 7개를 저장 시킬 수 있다.
		 
		 
		 
		 /*
         -----------------------------
         | 0 | 1 | 2 | 3 | 4 | 5 | 6 |  
         -----------------------------
	            위의 숫자는  배열의 인덱스(index)를 가리키는 번호로써 0 부터 시작하여 1씩 증가한다.
	            배열의 인덱스(index)를 "배열의 방번호" 라고 흔히 부른다.   
	            
	            배열에 저장된 데이터를 표현할때는 아래와 같이 배열명[인덱스번호]로 나타낸다.
	         subjectArr[0]  
	         subjectArr[1]
	         subjectArr[2]
	         subjectArr[3]
	         subjectArr[4]
	         subjectArr[5]
	         subjectArr[6] 
	         
	         subjectArr[7] ==> 존재하지 않으므로 오류!!
	         
	            배열로 선언된 변수에는 자동적으로 초기값이 들어간다.
	            정수는 0, 실수는 0.0, char는 ' ', String 을 포함한 객체는 null 이 들어간다.  
	      */
		 
		// === 배열의 크기(길이) 는 배열명.length 로 알아온다. ===
		System.out.println("배열 subjectArr의 길이: "  + subjectArr.length);
		//배열 subjectArr의 길이: 7
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		System.out.println("subjectArr[0] => " + subjectArr[0]);
		System.out.println("subjectArr[1] => " + subjectArr[1]);
		System.out.println("subjectArr[2] => " + subjectArr[2]);
		System.out.println("subjectArr[3] => " + subjectArr[3]);
		System.out.println("subjectArr[4] => " + subjectArr[4]);
		System.out.println("subjectArr[5] => " + subjectArr[5]);
		System.out.println("subjectArr[6] => " + subjectArr[6]);
		
	//	System.out.println("subjectArr[7] => " + subjectArr[7]);
		// java.lang.ArrayIndexOutOfBoundsException 배열의 인덱스가 넘어갔다. 7번은 없다 라는 뜻
		// 배열의 크기를 오버한 경우 오류 발생

		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~\n");
		

		for(int i=0; i<subjectArr.length; i++) {
		int val =	subjectArr[i];
		System.out.println("subjectArr["+i+"] => "+val);
		
		}// 반복문을 통해서 배열을 출력해보자!
		
		
		
		
		
		
		// 3. == 데이터 값을 넣어주기 ==
		
		
		  subjectArr[0] = 100; // 국어
	      subjectArr[1] = 90;  // 영어
	      subjectArr[2] = 95;  // 수학
	      subjectArr[3] = 70;  // 과학
	      subjectArr[4] = 98;  // 사회
	      subjectArr[5] = 100; // 음악
	      subjectArr[6] = 90;  // 체육 
		
		
	      System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			
	    int sum = 0;
	     
		for(int i=0; i<subjectArr.length; i++) {
			int val =	subjectArr[i];
			System.out.println("subjectArr["+i+"] => "+val);
			sum += val;
		}// end of for-----------------------------------------------------
		
		 System.out.println("총점 : " + sum);
	      
		

	      
		 System.out.println("\n~~~~~~~~~~~또는~~~~~~~~~~\n");
		 
		 sum = 0;
		 
		 for(int subject : subjectArr) {
			 // 개선된 for문 , 확장 for문 , for each문
			 // 반복회수는 배열 subjectArr의 길이(크기)만큼 반복한다. 즉, 7번 반복함. 
			 
			 System.out.println(subject); 
			 sum += subject;
		 }// end of for------------------------------------------------------
		 
		 System.out.println("총점 : " + sum);
		 
		 System.out.println("\n==========================================\n");
		
	/*
         위의  1. == 배열의 선언 == 과
        2. == 선언되어진 배열을 메모리에 할당을 해준다. == 을
                각각 따로 하지 않고 아래와 같이 동시에 할 수 있다.   
     */
		 
		 int[] subjectArr2 = new int[7];
		 
		 //3. 데이터 값을 넣어주기
		  subjectArr2[0] = 100; // 국어
	      subjectArr2[1] = 90;  // 영어
	      subjectArr2[2] = 95;  // 수학
	      subjectArr2[3] = 70;  // 과학
	      subjectArr2[4] = 98;  // 사회
	      subjectArr2[5] = 100; // 음악
	      subjectArr2[6] = 90;  // 체육 
		
	        sum = 0;
		    for(int i=0; i<subjectArr2.length; i++) {
				int val =	subjectArr2[i];
				System.out.println("subjectArr2["+i+"] => "+val);
				sum += val;
			}// end of for-----------------------------------------------------
	      
			System.out.println("총점 : " + sum);
		
			System.out.println("\n==========================================\n");
			
					/*
		                 위의  1. == 배열의 선언 == 과
		            2. == 선언되어진 배열을 메모리에 할당을 해준다. == 과
		            3. == 데이터값을 넣어주기 == 을
		                       각각 따로 하지 않고 아래와 같이 동시에 할 수 있다.   
		      */
					
			
			int[] subjectArr3 = new int[] {100,90,95,70,98,100,90};
			
			sum = 0;
		    for(int i=0; i<subjectArr3.length; i++) {
				int val =	subjectArr3[i];
				System.out.println("subjectArr3["+i+"] => "+val);
				sum += val;
			}// end of for-----------------------------------------------------
	      
			System.out.println("총점 : " + sum);
			
			
			System.out.println("\n==========================================\n");
			
			/*
                 위의  1. == 배열의 선언 == 과
            2. == 선언되어진 배열을 메모리에 할당을 해준다. == 과
            3. == 데이터값을 넣어주기 == 을
                       각각 따로 하지 않고 아래와 같이 동시에 할 수 있다.   
           new int[] 은 생략 가능하다!!!
      */
			
			
			int[] subjectArr4 = {100,90,95,70,98,100,90};
			
			sum = 0;
		    for(int i=0; i<subjectArr4.length; i++) {
				int val = subjectArr4[i];
				System.out.println("subjectArr4["+i+"] => "+val);
				sum += val;
			}// end of for-----------------------------------------------------
		  
		    
			System.out.println("총점 : " + sum);

			
			
			
	}// end of main(String[] args)--------------
	
}
