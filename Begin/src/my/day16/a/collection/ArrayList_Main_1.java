package my.day16.a.collection;

import java.util.*; // *이 유틸 패키지를 다 쓰겠다는 말이다.

public class ArrayList_Main_1 {

	public static void main(String[] args) {
		
		
		Member mbr1 = new Member("leess","qwer1234","이순신");
		Member mbr2 = new Member("eonjh","qwer1234","엄정화");		
		Member mbr3 = new Member("seokj","qwer1234","서강준");
		
		// 자바에서 .toString() 만큼은 생략이 가능하기 때문에, 재정의 후 같은 값이 출력이 된다.
		
		
		System.out.println("mbr1 : \n" + mbr1);
		// mbr1 : my.day16.a.collection.Member@15db9742 
		System.out.println("mbr1.toString() : \n" + mbr1.toString());
		// mbr1 : my.day16.a.collection.Member@15db9742 
		
		
		System.out.println("mbr2 : \n" + mbr2);
		// mbr2 : my.day16.a.collection.Member@6d06d69c    
		System.out.println("mbr2.toString() : \n" + mbr2.toString());
		// mbr2 : my.day16.a.collection.Member@6d06d69c 

		
		System.out.println("mbr3 : \n" + mbr3);
		// mbr3 : my.day16.a.collection.Member@7852e922    
		System.out.println("mbr3.toString() : \n" + mbr3.toString());
		// mbr3 : my.day16.a.collection.Member@7852e922   
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
		
		System.out.println("mbr1.info() : \n" + mbr1.minfo());
//				== 이순신님의 회원정보 ==
//				1. 아이디 : leess
//				2. 암호 : qwer1234
//				3. 성명 : 이순신
		
		
		System.out.println("mbr2.info() : \n" + mbr2.minfo());
//				== 엄정화님의 회원정보 ==
//				1. 아이디 : eonjh
//				2. 암호 : qwer1234
//				3. 성명 : 엄정화

		
		System.out.println("mbr3.info() : \n" + mbr3.minfo());
//				== 서강준님의 회원정보 ==
//				1. 아이디 : seokj
//				2. 암호 : qwer1234
//				3. 성명 : 서강준
		
		
		System.out.println("\n###################################\n");
		
		
		Member[] mbrArr = new Member[3];
		
		
		mbrArr[0]= mbr1;
		mbrArr[1]= mbr2;
	//  mbrArr[2]= "홍길동";			//	mbrArr 은 배열이므로 오로지 Member 클래스의 객체만 저장 될 수 있다.
	//	mbrArr[2]= new Product();	//	mbrArr 은 배열이므로 오로지 Member 클래스의 객체만 저장 될 수 있다.
		mbrArr[2]= mbr3;

		
		for(Member mbr : mbrArr) {
			System.out.println(mbr.minfo());
		}
		
		
		//mbrArr[3] = new Member("iyou","qwer1234","아이유");
		// 오류발생 : java.lang.ArrayIndexOutOfBoundsException
		

		System.out.println("\n###===============================###\n");
		
		
		/*
	    == Array(배열) 와  Collection(자료구조)의 차이점은 ==     
	    
	    1. Array(배열)은 크기가 한정 되어져 있지만
	       Collection(구조체)은 크기가 무한정 이다.
	       
	    2. Array(배열)은 배열에 선언되어진 동일한 타입의 데이터만 입력가능하지만  
	       Collection(구조체)은 입력되어지는 데이터가 객체(Object)이기만 하면
	             어떤것이든지 입력가능하다. 


	    ==== 배열(Array)과 자료구조(Collection)의 차이점 ====

		 1. 배열(Array)은 오로지 동일한 데이터 타입만 들어가는 저장소이다.
		           배열(Array)은 그 크기가 한번 정해지면 크기를 변경할 수 없다.!!!
		     
		 2. 자료구조(Collection)은 동일한 타입의 객체가 아니더라도
		           객체타입이기만 하면 모두 들어가는 저장소이다.
	                자료구조(Collection)은 저장되는 크기가 자동적으로 늘어난다.!!!
	    
	    웹에서 가장 많이 사용하는 대표적인 Collection 타입은 List 계열과 Map 계열이다.

	-------------------------------------------------------------------------
	              Web에서 주로 사용하는 클래스          게임프로그램밍에서 주로 사용하는 클래스
	Interface       (Single Thread 방식)          (Multi Thread 방식)
	-------------------------------------------------------------------------           
	List 계열    --      ArrayList      ,         Vector
	Map  계열    --      HashMap        ,         Hashtable 

	  ArrayList 및 HashMap 은 Multi Thread를 지원안해주므로 가볍다.
	  Vector 및 Hashtable 이 Multi Thread를 지원해주므로 무겁다.

	  Multi Thread를 지원해주는냐 안해주느냐만 차이가 있을 뿐
	       그 나머지 기능은 동일하다.  
	*/

	/*
	  JDK 1.5 부터 제네릭(Generic)타입이 새로 추가되었는데, 제네릭(Generic)을 이용함으로써 잘못된 타입이
	   사용될 수 있는 문제를 컴파일 과정에서 제거할 수 있게 되었다. 
	   프로그램 실행시 타입 에러가 발생하여 작동이 멈추는 것보다는 컴파일시에 타입에러가 발생하도록 하여 
	   프로그램 실행시 에러를 발생하지 않도록 사전에 방지하는 것이 좋기 때문이다.
	   
	     ▷ 제네릭(Generic)은 컬렉션(자료구조) 즉, 쉽게 말해서 객체들을 저장(수집)하는 구조적인 성격을 보강하기 위해 제공하는 것이다.
	     ▷ 간단히 예를 들자면 컵이라는 특정 객체가 있다고 하자. 
	      이 컵은 물만 담을 수 있는 물컵 , 또는 이 컵은 쥬스만 담을 수 있는 쥬스 컵. 이렇게 지정해주도록 하는 것이  제네릭(Generic) 이다.    

	     ▷  JDK 1.5 부터 제네릭(Generic)타입이 새로 추가되면서, 특정 컬렉션(자료구조)에 저장되어질 특정한 객체 타입을 명시하여
	     실행하기전 컴파일 단계에서 특정한 객체 타입이 아니면 에러를 발생토록 하여 저장이 불가능하도록 만들었다.
	     즉, 특정 컬렉션(자료구조)에 저장되어질 객체의 타입을 제한하도록 만든 것이다.

	    ▷   제네릭(Generic)타입을 사용하기 이전에는  컬렉션(자료구조)에 저장되어진 객체들을 하나씩 검출하여 객체 타입을 확인할 수 밖에 없었다.
	  Object 로 부터 상속받은 객체는 모두 저장이 가능했던 이전의 버전들과는 달리 보다 체계적이라 할 수 있다.
	  
	    ▷ 제네릭(Generic)타입을 사용함으로써 별도의 형 변환(Casting)이 필요없이 <> 사이에 선언하였던 객체자료형으로 검출되어 편리하다.       

	    ▷ 제네릭(Generic)타입에 있어서 1개 글자로 된 영문대문자는 영문대문자 아무것이나 사용해도 무관하다.
	 -- 그런데 관습상 객체가 제네릭(Generic)타입으로 사용될때 자료형(Type)이라고 나타내고 싶을때는 <T>라고 쓰고,
	        어떠한 요소(Element)이라고 나타내고 싶을때는 <E>라고 쓰고, 
	    key값이라고 나타내고 싶을때는 <K>라고 쓰고, Value값이라고 나타내고 싶을때는 <V>라고 쓴다.      
	    
	*/
		
		
		
		
		
		
	//	ArrayList arrList =  new ArrayList();
	//	또는
		List arrList =  new ArrayList();
		
		arrList.add(new Member("kang","qwer1234","강감찬"));
		arrList.add(new Product());
		arrList.add(new String("안녕하세요~"));
		arrList.add("건강하세요~~");
		arrList.add(new Integer(100));
		arrList.add(new Member("ohj","qwer1234","오현지"));
		arrList.add(200); // auto boxing  자동으로 arrList.add(Integer(200)); 이 된다.
		arrList.add(new Double(123.456));
		arrList.add(456.789); // auto boxing   arrList.add(new Double(123.456));
		arrList.add(new Product("쿠키",20));
		
		
		System.out.println("arrList.size() : " +  arrList.size());
		// arrList.size() : 8
		
		System.out.println("\n이거뭐냐 \n");
		for(int i=0; i < arrList.size(); i++) {
			Object obj = arrList.get(i); // .get은 꺼내온다는 뜻이다.
			System.out.println(obj);
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	
		
		for(int i=0; i < arrList.size(); i++) {
			Object obj = arrList.get(i); 
			
			if(obj instanceof Member) {
				System.out.println(((Member)obj).minfo());
			}
			else if(obj instanceof Product) {
				((Product)obj).pinfo();
			}
		} // end of for---------------------------------
		
		
		System.out.println("\n##################################\n");
			// 제네릭을 통해서 이런식으로 할 수 있다.
					
			////////////////////////////////////////////
			//     ==== Generic(제네릭) ==== //
			/* 원래 Collection(구조체)은  Object 이기만 하면 모두 입력이 가능하다.
			      그런데 입력은 모두 되지만 꺼내와서 사용할때가 문제가 발생한다.
			      수많은 데이터중에서 특정 데이터타입을 가지는 데이터를 꺼내오기는 정말로
			      귀찮은 작업을 해야만 한다. 
			      그래서 배열처럼 특정한 타입의 데이터만 입력하도록 만든 것이  Generic(제네릭)이다.
			      그래야만 데이터를 꺼내올때 쉽고 명확해진다.
			*/
		

			//ArrayList<Member> mbrList =  new ArrayList<Member>();
			//ArrayList<Member> mbrList =  new ArrayList<>(); // 이런식의 생략 가능하다.
			
			 
			  //또는
			 //List<Member> mbrList =  new ArrayList<Member>();
			   List<Member> mbrList =  new ArrayList<>();
			   
			   mbrList.add(new Member("hongkd","qwer1234","홍길동"));
			   mbrList.add(new Member("kimkd","qwer1234","김길동"));
			   mbrList.add(new Member("leekd","qwer1234","이길동"));
			// mbrList.add(new Product()); // 오류
			// mbrList.add("안녕하세요"); // 오류
			// mbrList.add(new Integer(100)); // 오류
			   
			   List<Product> prodList = new ArrayList<>();  // 개수는 무제한, 제품타입만 들어올 수 있다.
			   
			   prodList.add(new Product());
			 // prodList.add(new Member("hongkd","qwer1234","홍길동")); 오류가 뜬다
			   
			   
			   for(int i=0; i<mbrList.size(); i++) {
				   System.out.println(mbrList.get(i).minfo());
				}
			   
			   
			   System.out.println("\n~~~~~~~~~~~~~~ 또는 ~~~~~~~~~~~~~~\n");
			   
			   // 개선된 for문,    이만큼 돌아간다
			   for(Member mbr : mbrList) {
				   System.out.println(mbr.minfo());
			   }
			   
			   
			   
			   
	}// end of main(String[] args)----------------------

	
}



