package my.day02.dataType.teacher;

public class MainSungjuk_teacher {

	public static void main(String[] args) {
		
	//	char sung = 49436;
		char sung = '서';

		System.out.println((int) sung);
		// 49436
		
		String hakbun1 = "0012345";
		System.out.println(hakbun1); // 0012345
		
		int hakbun2 = 0012345;
		System.out.println(hakbun2); // 5349
		
		long money = 50000000000L;
		// 자바에서 정수는 기본적으로 int 타입을 취하므로 long 타입으로 나타내려면
		// 숫자 뒤에 L 또는 l 을 쓰면된다.
		System.out.println(money); // 50000000000
		
		
		short jumsu = (short)30000;
		System.out.println(jumsu);
		
		System.out.println("10/4 = " + (10/4));
		// 10/4 = 2
		
		System.out.println("10.0/4 = " + (10.0/4));
		// 10.0/4 = 2.5
		
		System.out.println("10/4.0 = " + (10/4.0));
		// 10/4.0 = 2.5
		
		System.out.println("10.0/4.0 = " + (10.0/4.0));
		// 10.0/4.0 = 2.5
		
		System.out.println("283/3 = " + (283/3));
		// 283/3 = 94
		
		System.out.println("283/3.0 = " + (283/3.0));
		// 283/3.0 = 94.33333333333333
		
		System.out.println("(float)(283/3.0) = " + (float)(283/3.0)); 
		// (float)(283/3.0) = 94.333336
		
		System.out.println("283/3.0F = " + (283/3.0F));
		// 283/3.0F = 94.333336
		
		System.out.println("283/3.0f = " + (283/3.0f));
		// 283/3.0f = 94.333336
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		int point = 60;
		
		if(point >= 90) {
			System.out.println(point + "는 90보다 같거나 큽니다.");
		}
		
		else if(point >= 70) {
			System.out.println(point + "는 70보다 같거나 큽니다.");
		}
		
		else {
			System.out.println(point + "는 70보다 작습니다.");
		}
		
		
		boolean bool1 = true;
		
		if(!bool1) { // !는 not
			System.out.println("bool1 => " + bool1);
		}
		
		boolean bool2 = false;
		
		if(!bool2) { // !는 not
			System.out.println("bool2 => " + bool2);
		}
		
		
		System.out.println("\n ======================== \n");
		
		
		Sungjuk_teacher lssSj = new Sungjuk_teacher(); // lssSj
		lssSj.hakbun = "091234";       // "091234"
		lssSj.name = "이순신";          // "이순신"
		lssSj.kor = 68;                // 68
		lssSj.eng = 95;                // 95
		lssSj.math = 10;              // 100 
		
		
		Sungjuk_teacher eomSj = new Sungjuk_teacher(); // eomSj
		eomSj.hakbun = "109876";       // "109876"
		eomSj.name = "엄정화";          // "엄정화"
		eomSj.kor = 98;                // 98
		eomSj.eng = 88;                // 88
		eomSj.math = 95;               // 95 
		
		
		lssSj.showSungjuk();
		
		eomSj.showSungjuk();
		
		System.out.println("\n ############################## \n"); 
		
		Sungjuk_teacher hongkdSj = new Sungjuk_teacher(); // hongkdSj
		
		System.out.println("lssSj : " + lssSj);
		// lssSj : my.day02.dataType.Sungjuk@15db9742
		
		System.out.println("eomSj : " + eomSj);
		// eomSj : my.day02.dataType.Sungjuk@6d06d69c
		
		System.out.println("hongkdSj : " + hongkdSj);
		// kdSj : my.day02.dataType.Sungjuk@7852e922
		
		hongkdSj = eomSj;
		System.out.println("hongkdSj : " + hongkdSj);
		// hongkdSj : my.day02.dataType.Sungjuk@6d06d69c
		
		hongkdSj.showSungjuk();
		/*
		 ==== 성적결과 ==== 
		 1.  학번 : 109876
		 2.  성명 : 엄정화
		 3.  국어 : 98
		 4.  영어 : 88
		 5.  수학 : 95
		 6.  총점 : 281
		 7.  평균1 : 93.666664
		 8.  평균2 : 93.666664
		 9.  평균3 : 93.66666666666667
		 10. 장학금 : 1000000원
		 11. 학점 : A 
		*/
		
		hongkdSj.name = "홍길동";
		
		hongkdSj.showSungjuk();
		eomSj.showSungjuk();
		
	}

}
