package my.day09.a.array;

public class TwoDimensionArrayMain {

	public static void main(String[] args) {
		
		// === 1차원 배열 === //
		
		int[] subjectArr= new int[5];    //1행 5열
		
		/*
		  		   -------------------
		  데이터값 ==>| 0 | 0 | 0 | 0 | 0 |   //1행 5열
		           -------------------
		          
	     index ==>  0   1   2   3   4        
		 
		 */
		
		
		// === 2차원 배열 === //
		int[][] pointArr = new int[4][3];   // 4행3열
		
		
		
		/* 
		    4행 3열
		 	----------------------------
		0 	| [0][0] | [0][1] | [0][2] |
		 	----------------------------
		1 	| [1][0] | [1][1] | [1][2] |		 	
		 	----------------------------
		2 	| [2][0] | [2][1] | [2][2] |		 	
		 	----------------------------
		3 	| [3][0] | [3][1] | [3][2] |		 	
		 	----------------------------
		        0         1        2       */
		
		  pointArr[0][0] = 10;
		  pointArr[0][1] = 20;
		  pointArr[0][2] = 30;
		
		
		  pointArr[1][0] = 40;
		  pointArr[1][1] = 50;
	   // pointArr[1][2] = 60;
		  
		  
		  pointArr[2][0] = 70;
		  pointArr[2][1] = 80;
		  pointArr[2][2] = 90;
		  
		/*  
		  pointArr[3][0] = 100;
		  pointArr[3][1] = 110;
		  pointArr[3][2] = 120;
         */
		  
		  
		  System.out.println("pintArr.length => " + pointArr.length);
		  // pointArr.length => 4
		  // 이차원배열명.length => 행의 길이가 나온다.
		  
		  
		  System.out.println("pintArr[0].length => " + pointArr[0].length);
		  // pointArr[0].length => 3
		  // 이차원배열명[행의 인덱스].length => 그 행에 존재하는 열의 길이다 나온다.
		  
		  
		  System.out.println("pintArr[1].length => " + pointArr[1].length);
		  // pointArr[1].length => 3
		  // 이차원배열명[행의 인덱스].length => 그 행에 존재하는 열의 길이다 나온다.
		  
		
		  System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		  
		  for(int i=0; i<pointArr.length; i++) {  //행
			  
			  for(int j=0; j<pointArr[i].length; j++) { //열
				  String str = (j<pointArr[i].length-1)?",":"\n";
				  System.out.printf("%2d%s",pointArr[i][j], str);

				  
			  }// end of for-----------------
			  
			  
			  
		  }// end of for-----------------------
		  
		  
		  System.out.println("\n========== 성적결과 ===========\n");
		  
		  
		                     // 국어 영어 수학 
		  int[][]  jumsuArr = {{90,80,70},  //이순신
				               {80,85,76},  //엄정화
				               {85,70,90},  //서강준
				               {60,80,50}   //이혜리
				                };  
		  
		
		  
		  /*
		   ===============
		       국어  영어  수학   총점
		   ===============
		  	90 80 70  240
		  	80 85 76  241
		  	85 70 90  245
		  	60 80 50  190
		 */
		  
		  System.out.println("===================");
		  System.out.println("국어 영어 수학 총점  평균     ");
		  System.out.println("===================");
		  
		  int korSum = 0, engSum = 0, mathSum=0;
		  //국어 = 0열, 영어 = 1열, 수학 = 2열
		  
		  int[] sumArr = new int[jumsuArr.length]; // new int[4];와 같다.
		  float[] avgArr = new float[jumsuArr.length]; // new float[4]; 이다.
		  
		  
		  for(int i=0; i<jumsuArr.length; i++) { //
			  
			  
			  int sum = 0;
			  for(int j=0; j<jumsuArr[i].length; j++) {
				  sum += jumsuArr[i][j];
				  
				  if(j==0) {  // 국어점수의 평균을 구하기 위해서 총합을 구하는것.
					  korSum += jumsuArr[i][j];
				  
				  }
				  else if(j==1) { //영어점수
					  engSum += jumsuArr[i][j];
				  }
				  else if(j==2) { // 수학점수
					  mathSum += jumsuArr[i][j];
				  }	  
				  System.out.printf("%3d%s", jumsuArr[i][j], " ");  //%3d = 3자리를 확보한다
			
			  
			  }// end of for---------------
			  
			  //day 04 math를 참조하자!
			float avg = Math.round((float)sum/jumsuArr[i].length * 10)/10.0F;
			 

			  System.out.println(sum + "  " + avg);
			  
			  
			  sumArr[i] = sum; //위에서 나온 개인별 합계를 쌓아준다.
			  avgArr[i] = avg;
			   
		  }// end of for---------------
		  
		  System.out.println("\n=== 평균  ===");
		  
		  
		  
		  
		  System.out.println("--------------------------");  // 각 과목별 평균, 평균의 평균을 구하자!
		  
		  int count = jumsuArr.length; //행의 수가 사람수이다. 그렇기에 분모가 되어준다.
		      
		     float korAvg = Math.round((float)korSum/count*10)/10.F;   
		     float engAvg = Math.round((float)engSum/count*10)/10.F;
		     float mathAvg = Math.round((float)mathSum/count*10)/10.F;
		     
		     

		     
		     int sumOfsum = 0;
		     for(int i=0; i<sumArr.length; i++) {
		    	 sumOfsum += sumArr[i];  //총점을 하나하나 가지고와서 합해준다.
		    }// end of for------------------
		     
		     float sumOfsumAvg = Math.round((float)sumOfsum/count*10)/10.F; //전체평균 총합
		     
		     float sumOfavg = 0.0F; //여기에 점수를 쌓아두겠다.
		     for(int i=0; i<avgArr.length; i++) {
		    	 sumOfavg += avgArr[i]; 
		     }// end of for------------------
		     
		     float sumOfabgAvg = Math.round(sumOfavg/count*10)/10.F;  //전체 평균의 평균
		     
			     
			  System.out.println("합계  "+korSum+"  "+engSum+"  "+mathSum+" "+sumOfsum+" "+sumOfavg);
			  System.out.println("평균  "+korAvg+"  "+engAvg+"  "+mathAvg+" "+sumOfsumAvg+" "+sumOfabgAvg);
			  
			  System.out.println("--------------------------");
			  
			  System.out.println("\n============================");
			  
			  
			  int[][] numArr = new int[4][]; // 4행 null열
			  
			  
			  /*
			  numArr[0][0] = 10; //열의 크기를 설정하지 않았으므로 NullPointerException 발생
			  numArr[0][1] = 20;
			  numArr[0][2] = 30;
			  */
			 
			  // 각각의 행매다 몇열을 쓸것인지를 잡아준것.
			  numArr[0] = new int[3]; // 3열  
			  numArr[1] = new int[2]; // 2열
			  numArr[2] = new int[4]; // 4열
			  numArr[3] = new int[3]; // 3열
			  
			  numArr[0][0] = 10;
			  numArr[0][1] = 20;
			  numArr[0][2] = 30;
			  
			  numArr[1][0] = 40;
			  numArr[1][1] = 50;
		  //  numArr[1][2] = 60; //java.lang.ArrayIndexOutOfBoundsException 배열의 크기를 오버했다
			  
			  numArr[2][0] = 70;
			  numArr[2][1] = 90;
			  
			  
			  
			  for(int i=0; i<numArr.length; i++) {  //행
				  
					  for(int j=0; j<numArr[i].length; j++) { //열
						  String str = (j<numArr[i].length-1)?",":"\n";
						  System.out.printf("%2d%s",numArr[i][j], str);
					  }// end of for-----------------
					
				  }// end of for-----------------------
			  
			  
			  System.out.println("\n============================");
			  
			  int[][] numArr2= {{10,20,30},
			  				   {40,50},
			  				   {70,0,90,0},
			  				   {0,0,0}
			  				   };
			 
			  
			  for(int i=0; i<numArr2.length; i++) {  //행
				  
				  for(int j=0; j<numArr2[i].length; j++) { //열
					  String str = (j<numArr2[i].length-1)?",":"\n";
					  System.out.printf("%2d%s",numArr2[i][j], str);
				  }// end of for-----------------
				
			  }// end of for-----------------------
		  
			  
			  
			  
			  
			  
			  
		  
	}// end of main(String[] args)------------------------

}
