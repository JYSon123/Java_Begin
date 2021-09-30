package my.day09.a.array;

public class zTwoDimensionArrayMain {

	public static void main(String[] args) {
		
		// === 1차원 배열 === //
		int[] subjectArr = new int[5];  // 1행5열
		
	 /*
		            ---------------------
		 데이터값  ==> | 0 | 0 | 0 | 0 | 0 |    1행5열
		            ---------------------
		 index  ==>   0   1   2   3   4            
		      
	  */
		
		// === 2차원 배열 === //
		int[][] pointArr = new int[4][3];  // 4행3열 
		
		/*
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
	//	pointArr[1][2] = 60;
		
		pointArr[2][0] = 70;
		pointArr[2][1] = 80;
		pointArr[2][2] = 90;
		
	/*
		pointArr[3][0] = 100;
		pointArr[3][1] = 110;
		pointArr[3][2] = 120;
	*/
		
		System.out.println("pointArr.length => " + pointArr.length); 
		// pointArr.length => 4
		// 이차원배열명.length => 행의길이가 나온다.
		
		System.out.println("pointArr[0].length => " + pointArr[0].length); 
		// pointArr[0].length => 3
		// 이차원배열명[행의인덱스].length => 그 행에 존재하는 열의 길이가 나온다.
		
		System.out.println("pointArr[1].length => " + pointArr[1].length); 
		// pointArr[1].length => 3
		// 이차원배열명[행의인덱스].length => 그 행에 존재하는 열의 길이가 나온다.
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~\n");
		
		for(int i=0; i<pointArr.length; i++) { // 행 
			
			for(int j=0; j<pointArr[i].length; j++) { // 열
				String str = (j<pointArr[i].length-1)?",":"\n";
				System.out.printf("%2d%s", pointArr[i][j], str);
			}// end of for-----------------
			
		}// end of for----------------------
		
		
		System.out.println("\n========== 성적결과 ==========\n");
		
		                   // 국어 영어 수학 
		int[][] jumsuArr = {{90,80,70},   // 이순신
				            {80,85,76},   // 엄정화 
				            {85,70,90},   // 서강준
				            {60,80,50}    // 이혜리
				           }; 
		
		/*
		   =================   
		      국어  영어  수학   총점
		   =================    
		   90   80  70  240
		   80   85  76  241
		   85   70  90  245
		   60   80  50  190
		*/
		
		System.out.println("=====================");
		System.out.println("국어  영어  수학  총점  평균");
		System.out.println("=====================");
		
		int korSum=0, engSum=0, mathSum=0;
		int[] sumArr = new int[jumsuArr.length];     // new int[4]; 
		float[] avgArr = new float[jumsuArr.length]; // new float[4]; 
		
		for(int i=0; i<jumsuArr.length; i++) {
			
			int sum = 0;
			for(int j=0; j<jumsuArr[i].length; j++) {
				sum += jumsuArr[i][j];
				
				if(j==0) { // 국어점수
					korSum += jumsuArr[i][j];
				}
				else if(j==1) { // 영어점수
					engSum += jumsuArr[i][j];
				}
				else if(j==2) { // 수학점수
					mathSum += jumsuArr[i][j];
				}
				
				System.out.printf("%3d%s", jumsuArr[i][j], " ");
			}// end of for-------------------
			
			float avg = Math.round((float)sum/jumsuArr[i].length * 10)/10.0F;  
			
			System.out.println(sum + "  " + avg);
			
			sumArr[i] = sum;
			avgArr[i] = avg;
			
		}// end of for------------------------------
		
		
		System.out.println("----------------------------------------");
		
		int count = jumsuArr.length;  // 4명 
		
		float korAvg = Math.round((float)korSum/count * 10)/10.F;
		float engAvg = Math.round((float)engSum/count * 10)/10.F;
		float mathAvg = Math.round((float)mathSum/count * 10)/10.F;
		
		int sumOfsum = 0;
		for(int i=0; i<sumArr.length; i++) {
			sumOfsum += sumArr[i];
		}// end of for--------------------
		
		float sumOfsumAvg = Math.round((float)sumOfsum/count * 10)/10.F;
		
		float sumOfavg = 0.0F;
		for(int i=0; i<avgArr.length; i++) {
			sumOfavg += avgArr[i];
		}// end of for--------------------
		
		float sumOfavgAvg = Math.round(sumOfavg/count * 10)/10.F;
		
		System.out.println("합계   "+ korSum+"  "+engSum+"  "+mathSum+"  "+sumOfsum+"  "+sumOfavg); 
		System.out.println("평균   "+ korAvg+"  "+engAvg+"  "+mathAvg+"  "+sumOfsumAvg+"  "+sumOfavgAvg); 
		
		System.out.println("----------------------------------------");

	}// end of main(String[] args)-------------------------

}
