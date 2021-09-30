package my.day15.b.exception;

public class ExceptionMain {

	public static void main(String[] args) {
		
		System.out.println("\n 1.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		// 1. ArrayIndexOutOfBoundException
	    // ==> 배열의 크기가 오버가 되어지면 발생하는 익셉션
		
		String[] subjectArr = {"자바", "오라클","JSP"};
		
		try {
		
			for(int i=0; i<=subjectArr.length; i++) {
				
				System.out.println(subjectArr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(">> 배열의 인덱스 범위가 초과되었습니다. \n");
		//	System.out.println(e.getMessage());
			// e.getMessage() 은 오류메세지를 알려주는 것이다.
		
		// e.printStackTrace();  // 오류메시지와 함께 어디가 오류인지를 추적해서 알려준다.	
		}
		
		System.out.println("\n 2.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
		// 2. ArithmeticException 
		// ==> 분모에 0이 들어가는 경우에 발생하는 익셉션이다.
		
		try {
			int num = 10;
			
			for(int i=2; i>=0; i--) {
				System.out.println(num/i);
			}
		}catch(ArithmeticException e) {
			System.out.println(">> 분모에는 0이 올수 없습니다. <<\n");
			//	System.out.println(e.getMessage());
			// e.getMessage() 은 오류메세지를 알려주는 것이다.
			// e.printStackTrace();  // 오류메시지와 함께 어디가 오류인지를 추적해서 알려준다.	
		}
		
		
		System.out.println("\n 3.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		int[] numArr = {10,20,30};
		
		try {
			for(int i=3; i>=0; i--) {
				int val = numArr[i]/i;
				System.out.println(val);
			}// end of for---------------------
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(">> 배열의 인덱스 범위가 초과되었습니다. \n");
		}
		
		
		
		
		System.out.println("\n 4.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		int[] numArr2 = {10,20,30};
		
		for(int i=3; i>=0; i--) {
			try {
				int val = numArr2[i]/i;
				System.out.println(val);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(">> 배열의 인덱스 범위가 초과되었습니다.");
			//System.out.println(e.getMessage());
			// e.getMessage() 은 오류메세지를 알려주는 것이다.
			// e.printStackTrace();  // 오류메시지와 함께 어디가 오류인지를 추적해서 알려준다.	
			
			}catch(ArithmeticException e){
				System.out.println(">> 분모에는 0이 올수 없습니다. <<\n");
			}
		}// end of for----------------------------------
		
		
		System.out.println("\n 5.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		int[] numArr3 = {10,20,30};
		
		for(int i=3; i>=0; i--) {
			try {
				int val = numArr3[i]/i;
				System.out.println(val);
			}catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
					 System.out.println("에러메시지 : " + e.getMessage());
				//e.printStackTrace();
			}
		}// end of for----------------------------------
		
		
		
	
		System.out.println("\n 6.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		int[] numArr4 = {10,20,30};
		
		for(int i=3; i>=0; i--) {
			try {
				int val = numArr4[i]/i;
				System.out.println(val);
			}catch(Exception e) {
					 System.out.println("에러메시지 : " + e.getMessage());
			//	e.printStackTrace();
		
			}
		}// end of for----------------------------------
		
		
		System.out.println("\n 7.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		String[] strArr = {"10","스물","30"}; 
		
				
		for(int i=3; i>=0; i--) {
			try {
				int val = Integer.parseInt(strArr[i])/i;
				System.out.println(val);
			
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(">> 배열의 인덱스 번호" + e.getMessage()+"은 존재하지 않습니다.");
			}catch(ArithmeticException e){
				System.out.println(">> 분모에는 0이 올수 없습니다. <<\n");
			}catch(Exception e) { 
				System.out.println("에러메시지 : " + e.getMessage());
			}
		}// end of for----------------------------------
		
		
		
//		for(int i=3; i>=0; i--) {
//			try {
//				int val = Integer.parseInt(strArr[i])/i;
//				System.out.println(val);
//			}catch(Exception e) { 
//				System.out.println("에러메시지 : " + e.getMessage());
//			}catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println(">> 배열의 인덱스 번호" + e.getMessage()+"은 존재하지 않습니다.");
//			}catch(ArithmeticException e){
//				System.out.println(">> 분모에는 0이 올수 없습니다. <<\n");
//			}
//		   익셉션 처리시 부모클래스의 익셉션이 맨 아래에 나와야 한다.
//		   왜내하면 익셉션 처리는 위에서 처리되면서 위의것이 처리가 안되면
//		   아래로 내려가라는 말인데 부모 클래스이 익셉션이 먼저 나오고 
//		   자식 클래스의 익셉션이 아래에 나오면 부모클래스 익셉션이 처리를 못한것을
//		   자식클래스 익셉션이 처리를 해라는 것은 모순이기 때문이다.
//		}// end of for----------------------------------
		
		
		// 컴파일 오류 (comphile exception)
		//    ==> 자바 문법에 있어서 오류가 발생한 경우. 실행 자체가 아예 안됨!
		
		// 실행 오류 (runtime exception)
		//    ==> 실행시 데이터값 자체에서 오류가  발생한 경우임. 실행은 됨!
			
		
		System.out.println("\n 8.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
		String[] strArr3 = {"10","스물","30"}; 
		
		int count  = 0;
		
		for(int i=3; i>=0; i--) {
			
			try {
				int val = Integer.parseInt(strArr3[i])/i;
				System.out.println(val);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(">> 배열의 인덱스 번호" + e.getMessage()+"은 존재하지 않습니다.");
			}catch(ArithmeticException e){
				System.out.println(">> 분모에는 0이 올수 없습니다. <<\n");
			}finally {
				System.out.println(++count + "~~~ 오류가 발생하든 발생하지 않든 여기는 무조건 실행하고자 합니다.\n");
			}
			

		}// end of for----------------------------------
		
		
		
		
		
	} // end of main(String[] args) 


}



