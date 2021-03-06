package my.day06.a.multifor;

public class GuguDan2Main {

	public static void main(String[] args) {
		
		  /*
	      == 구구단 ==
	      2*1=2    3*1=3    4*1=4   ....  9*1=9
	      2*2=4    3*2=6    4*2=8   ....  9*2=18
	      2*3=6    3*3=9    4*3=12  ....  9*3=27
	      2*4=8    3*4=12   4*4=16  ....  9*4=36
	      2*5=10   3*5=15   4*5=20  ....  9*5=45
	      2*6=12   3*6=18   4*6=24  ....  9*6=54
	      2*7=14   3*7=21   4*7=28  ....  9*7=63
	      2*8=16   3*8=24   4*8=32  ....  9*8=72
	      2*9=18   3*9=27   4*9=36  ....  9*9=81
	      */
			
		  //위의 구구단은 9행 8열이다.
		  // row(행) ==> 바깥 for문의 반복회수   => 줄
		  // col(열) ==> 안쪽 for문의 반복회수   => 단
		  
		System.out.printf("정수%d 실수%f 문자열%s입니다.\n",9,1.234,"구구단");
		// f는 포맷, 형식이라는 뜻이다. %s의 s는 string이란 뜻이다. , 문자가 그 자리로 들어감.
		// %d 는 정수라는 뜻이다. 순서대로 값을 넣는것이 중요함.
		
		System.out.println("== 구구단 ==");
		System.out.printf("%30s\n","== 구구단 ==");
		// "%30s\n" << 이건 자리수를 잡아준거다. 30글자의 자리를 잡아준것
		
		
		  for(int row=1; row<=9; row++) { //9행 , row가 참일때 아래의 for문을 반복.
			 
			  for(int col=2; col<=9; col++) { //8열
				  
			 // System.out.print(col+"*"+row+"="+(col*row)+"\t"); //"\t" 탭
				 System.out.printf(col+"*"+row+"=%-4d",(col*row)); 
				 // %-4d 4자리를 -를 통해서 왼쪽에서 부터 확보를 한것이다.

				 
			  }//end of for -----------------------
			  
			  System.out.print("\n");
			  

			  
		   }// end of for----------------------

	}// end of main(String[] args)--------------------------

}
