package my.day02.dataType;

public class MainSungjuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// == 문자형 타입 == //
	    // 자바는 char 타입을 표현할 때 unicode 를 사용한다.
		
	 char son = 49552;
	 
	 
	 System.out.println(son);
	 System.out.println((int) son);
	 
	 
	 
	 char ch1 = 65;  // int가 아니라 char의 경우에는 호환이되어, 유니코드 65에 해당하는 A가 출력이 된다.
	 System.out.println("ch1 : " + ch1);
	 
	 char ch2 = 'a' + 1; // char가 사칙연산을 만나면 자동으로 int 타입으로 변환, 출력되는 답은 98에 해당하는 b
	 System.out.println("ch2 : " + ch2);
	 
	 char ch3 = (char)(ch2 - 1);  // 자동으로 int로 변환  98 - 1 ==> 97, 그리고 int 상태이기 때문에 형변환 시켜준다.
	 System.out.println("ch3 : " + ch3);
	 
	 char ch4 = '\u2665';
	 System.out.println("ch4 : " + ch4);
	 
	 
	 
	 
	 
	 String hakbun1 = "0012345";
	 System.out.println(hakbun1);
	 
	 int hakbun2 = 0012345;
	 System.out.println(hakbun2);
	 
	 
	 long money = 50000000000L;
   	 // 자바에서 정수는 기본적으로 int 타입을 취하므로 long 타입으로 나타내려면
     // 숫자 뒤에 L 또는 l 을 쓰면된다.
	 
	 
	 System.out.println(money);
	 
	 
	 
	 
	 short jumsu = (short)30000;
	 System.out.println(jumsu);
	 
	 
	 System.out.println("10/4 = " + (10/4));
	 // 10/4 = 2
	 
	 
	 System.out.println("10.0/4 = " + (10.0/4));
	 
	 
	 
	 System.out.println("10.0/4.0 = " + (10/4.0));
	 
	 
	 System.out.println("283/3 = " +(283/3));
	 // 283/3 = 94
	 
	 System.out.println("283/3.0 = " +(283/3.0));
	 // 283/3.0 = 94.33333333333333
	 
	 
	 System.out.println("(float)283/3.0 = " +(float)(283/3.0));
	 // (float)283/3.0 = 94.333336 
	 
	 System.out.println("283/3.0F = " +(283/3.0F));
	 // 283/3.0F = 94.333336   float 타입으로 보겠다는 뜻.
	 
	 System.out.println("283/3.0f = " +(283/3.0f));
	 // 283/3.0f = 94.333336   float 타입으로 보겠다는 뜻.
	 
	 
	 
	 
	 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	 
	 
	 
	 int point = 80;  //지역변수
 	 
	 if(point >= 90) {
		 System.out.println(point + "는 90보다 같거나 큽니다.");
	 }
	 
	 else if(point >= 70) {
		 System.out.println(point + "는 90보다 같거나 큽니다.");
	 }
	 
	 else {
		 System.out.println(point + "는 70보다 작습니다.");
     }
	 
	 
	 boolean bool1 = true;
	 
	 
	 
	 if(!bool1) {
		 System.out.println("bool1 => " + bool1);
	 }
	 
	 
	 boolean bool2 = false;
	 
	 if(!bool2) {  // !는 반대,not이다. 그렇기에  "만약 false 라면" 이라는 뜻이다.
		 System.out.println("bool2 => " + bool2);
	 }
	 
	 else {
		 System.out.println("false");
	 }
	 
	 
	 
	 
	 System.out.println("\n==============================================\n");
	 
	 
	 sungjuk IssSj = new sungjuk();
	 IssSj.hakbun = "091234";    // "091234"
	 IssSj.name = "이순신";        // "이순신"
	 IssSj.kor = 68;             // 68 (bite)
	 IssSj.eng = 95;             // 95
	 IssSj.math = 10;           // 100
	 
	 
	 sungjuk eomSj = new sungjuk();
	 eomSj.hakbun = "109876";    // "109876"
	 eomSj.name = "엄정화";        // "엄정화"
	 eomSj.kor = 98;             // 98
	 eomSj.eng = 88;             // 88
	 eomSj.math = 95;            // 95
	 
	 
	 
	 IssSj.showSungjuk();
	 
	 eomSj.showSungjuk();
	 
	 
	 
	 System.out.println("\n ############################################################\n");
	 
	 
	 sungjuk hondkdSj = new sungjuk();
	 
	 System.out.println("IssSj : " + IssSj);
	 // IssSj : my.day02.dataType.sungjuk@15db9742
	 
	 
	 System.out.println("eomSj : " + eomSj);
	 // eomSj : my.day02.dataType.sungjuk@6d06d69c
	 
	 
	 System.out.println("hondkdSj : " + hondkdSj);
	 // hondkdSj : my.day02.dataType.sungjuk@7852e922
	 
	 
	 hondkdSj =  eomSj;  // 엄정화의 메모리상의 주소를 홍길동한테 넣어줌. (같은 인스턴스를 가진다)
	 System.out.println("hondkdSj : " + hondkdSj);
	 // hondkdSj : my.day02.dataType.sungjuk@6d06d69c
	 
	 
	 
	 hondkdSj.showSungjuk();
	 
	 
	 
	 /*=== 성적결과 === 
    1.  학번 :109876
    2.  성명 :엄정화
    3.  국어 :98
    4.  영어 :88
    5.  수학 :95
    6.  총점 :281
    7.  평균1 :93.666664
    8.  평균2 :93.666664
    9.  평균3 :93.66666666666667
    10. 장학금 : 1000000원
    11. 학점 : A
*/
	 
	 
	 hondkdSj.name = "홍길동";  // 참조형타입, 이론 한번 더 읽어보기!
	 
	 
	 hondkdSj.showSungjuk();
	 eomSj.showSungjuk();
	 
	                                                                                                                                       
	 
	 
	 
	 
	 
	 
  }
}



