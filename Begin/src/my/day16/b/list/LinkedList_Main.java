package my.day16.b.list;

import java.util.*;
	

/*
	== LinkedList == 
	1. 출력시 저장된 순서대로 나온다.
	2. 중복된 데이터를 저장할 수 있다.
	3. 데이터를 읽어오는 속도는 LinkedList 가 ArrayList 보다 상대적으로 느리다.
	4. 순차적으로 데이터를 추가/삭제하는 경우에는 LinkedList 가  ArrayList 보다 상대적으로 느리다.
	5. 일반적인 데이터 추가/삭제는 데이터 중간 중간마다 발생하므로 이러한 경우에는 LinkedList 가 ArrayList 보다 상대적으로 빠르다.    
	6. 결과값은 ArrayList 를 사용하든지 LinkedList 를 사용하든지 동일한 결과값을 가진다.
	7. LinkedList 보다는 ArrayList 를 사용하도록 하자. 
	
	== LinkedList (저장소) ==  5번에 대한 설명문
	
	          유재석(자신의 메모리주소 1372)----(앞서존재하던객체의 메모리주소 1372)엄정화(자신의 메모리주소 3236)----(앞서존재하던객체의 메모리주소 3236)강호동(자신의 메모리주소 1034)----(앞서존재하던객체의 메모리주소 1034)이순신(자신의 메모리주소 2340)---(앞서존재하던객체의 메모리주소 2340)김태희(자신의 메모리주소 5236)   
	
	== 엄정화 를 삭제할 경우
	          유재석(자신의 메모리주소 1372)----(앞서존재하던객체의 메모리주소 1372)강호동(자신의 메모리주소 1034)----(앞서존재하던객체의 메모리주소 1034)이순신(자신의 메모리주소 2340)---(앞서존재하던객체의 메모리주소 2340)김태희(자신의 메모리주소 5236)
	    
	== 엄정화 를 특정 위치에 추가할 경우
	          엄정화(자신의 메모리주소 7876)를 유재석 다음에 추가하고자 한다.
	          유재석(자신의 메모리주소 1372)----(앞서존재하던객체의 메모리주소 1372)엄정화(자신의 메모리주소 7876)----(앞서존재하던객체의 메모리주소 7876)강호동(자신의 메모리주소 1034)----(앞서존재하던객체의 메모리주소 1034)이순신(자신의 메모리주소 2340)---(앞서존재하던객체의 메모리주소 2340)김태희(자신의 메모리주소 5236)
	           
*/



public class LinkedList_Main {

	public static void main(String[] args) {
		
		
		// 1. Member 클래스의 객체만을 저장할 수 있는 ArrayList 객체 mbrList 를 생성하시오.
		List<Member> mbrList = new LinkedList<>();
		
		// 2. Member 클래스의 객체 6개를 생성하여 mbrList 에 저장하세요.
		mbrList.add(new Member("youjs","qwer1234$","유재석"));
		mbrList.add(new Member("eom","qwer1234$","엄정화"));
	    mbrList.add(new Member("kanghd","qwer1234$","강호동"));
	    mbrList.add(new Member("leess","qwer1234$","이순신"));
	    mbrList.add(new Member("kimth","qwer1234$","김태희"));
	    mbrList.add(new Member("kangkc","qwer1234$","강감찬"));
		
	    // 3. mbrList 에 저장되어진 모든 회원들의 정보를 출력하도록  
	    //    Member 클래스에 정의된 mInfo() 메소드를 실행하세요.
		
	    for(Member mbr : mbrList) {
	    	System.out.println(mbr.minfo());
	    }
	
	    System.out.println("\n====== 또는 ======");
	   
	    
	    for(int i=0; i<mbrList.size(); i++) {
	    	System.out.println(mbrList.get(i).minfo());
	    }
	    
	    mbrList.add(new Member());
	    mbrList.add(new Member("leess","qwer1234$","이순신"));
	    // ArrayList 는 데이터값이 동일한 객체를 저장할 수 있다. <<암기!!>>
	    
	    mbrList.add(new Member("leemh","qwer1234$","이민호"));
	     
	    System.out.println("\n~~~~~~~~~~~[퀴즈1]~~~~~~~~~~~~\n");
	    
	    /*
        [퀴즈1]
        mbrList 에 저장되어진 Member 객체들 중에서
        id 값이 "leess" 인 회원만 그 회원의 정보를 출력하세요.   
      */
	    
	    for(int i=0; i<mbrList.size(); i++) {
	    	if("leess".equals(mbrList.get(i).getId())){
	    		System.out.println(mbrList.get(i));
	    	}
	    }
	    	
	    System.out.println("\n====== 또는 ======\n");
	    
	    for(Member mbr : mbrList) {
	    	if("leess".equals(mbr.getId())) {
	    		System.out.println(mbr.minfo());
	    	}
	    }
	    
	    System.out.println("\n~~~~~~~~~~~[퀴즈2]~~~~~~~~~~~~\n");
	    /*
        [퀴즈2]
        mbrList 에 저장되어진 Member 객체들 중에서
        name 이  "이" 씨인 회원만 그 회원의 정보를 출력하세요.
        
        name 이  "서" 씨인 회원만 그 회원의 정보를 출력하세요.
        >> 회원중 "서"씨는 없습니다. <<   
      */
	    
	    boolean flag = false;
//			    String firstName = "서";
	    String firstName = "이";
//			    
//			    for(int i=0; i<mbrList.size(); i++) {
//			    	String name = mbrList.get(i).getName();
//			    	
//			    	if(name != null && name.startsWith(firstName)) {  // 시작부분이 "이"여야 하기 때문에, equals는 사용이 힘들다.
//			    		flag = true;
//			    		System.out.println(mbrList.get(i).minfo());
//			    	}
//
//			    }// end of for---------------------
//			    
	    // ~~~ 또는 ~~~~
	    
	    for(Member mbr : mbrList) {
	    	String name = mbr.getName();
	    	
	    	if(name != null && name.startsWith(firstName)) {  // 시작부분이 "이"여야 하기 때문에, equals는 사용이 힘들다.
	    		flag = true;
	    		System.out.println(mbr.minfo());
	    	}

	    }// end of for---------------------
	    
	    
	    if(!flag) {
	    	System.out.println(">> 회원중 \""+firstName+"\"씨는 없습니다. <<");
	    }
	    
	    // *** ArrayList 타입인 mbrList 에 새로운 Member 객체 추가시 
	    //     특정  index(위치)에 들어가도록 할 수 있다.
	    
	    System.out.println("\n ~~~ mbrList 에 새로운 Member 객체 추가하기 ~~~ "); // 객체를 그냥 넣어주면, 맨 뒤에 넣어지게 된다.
	    
	    mbrList.add(new Member("seolh","qwer1234$","설현"));
	    // index 값이 없으면 mbrList 의 맨뒤에 추가된다.
	    
	    mbrList.add(3, new Member("chaew","qwer1234$","차은우"));
	    //    3이 특정인덱스이다.
	    // 유재석(0) 엄정화(1) 강호동(2) 이순신(3) 으로 되어 있는데
	    // 유재석(0) 엄정화(1) 강호동(2) 차은우(3) 이순신(4) 으로 된다. 중간에 끼어버린다.
	     
	    System.out.println(mbrList.get(3).minfo()); // 차은우
	    
	    System.out.println("~~~~~~~~~~~~~~~~~~~~");
	    
	    
	    for(Member mbr : mbrList) {
	    	System.out.println(mbr.minfo());
	    }
	    
	 // *** ArrayList 타입인 mbrList 에 저장된 Member 객체 삭제(회원탈퇴) 하기 ***
	    
	    System.out.println("\n ~~~ ArrayList 타입인 mbrList 에 저장된 Member 객체 삭제(회원탈퇴) 하기 ~~~ "); // 객체를 그냥 넣어주면, 맨 뒤에 넣어지게 된다.
	    
	    System.out.println(">> 삭제하기 전 mbrList.size() => " + mbrList.size());
	    // >> 삭제하기 전 mbrList.size() => 11
	    
	    mbrList.remove(3); // mbrList.remove(삭제할 Member 객체의 인덱스번호);
	    
	    System.out.println(">> 삭제한 후  mbrList.size() => " + mbrList.size());
	    // >> 삭제한 후  mbrList.size() => 10
	   
	    // 유재석(0) 엄정화(1) 강호동(2) 차은우(3) 이순신(4) 으로 되어 있는데 
	    // mbrList.remove(3); 을 했으므로
	    // 유재석(0) 엄정화(1) 강호동(2) 이순신(3)으로 된다.
	    
	    
	    System.out.println(mbrList.get(3).minfo()); // 이순신
	    
	    System.out.println("~~~~~~~~~~~~~~~~~~~~");
	    
	    for(Member mbr : mbrList) {
	    	System.out.println(mbr.minfo());
	    }
	    
	    System.out.println("\n~~~~~~~~~~~[퀴즈3]~~~~~~~~~~~~\n");
	   
	  /*
        [퀴즈3]
        mbrList 에 저장되어진 Member 객체들 중에서
        name 이  "이" 씨인 회원들은 삭제하고
                삭제한 후 mbrList 에 저장되어진 Member 객체들의 정보를 출력하세요
      */
	   
	    String fName = "이";
	    /* 
	    // == 아래의 것은 틀린 풀이 !!!!!  (내풀이.....)
	    for(int i=0; i<mbrList.size(); i++) { //  for(int i=0; i<10; i++) {
	    	
	    	String name = mbrList.get(i).getName();  // i=> 0   i=>1   i=>2   i=>3  i=>4   i=>5   i=>6   i=>7
	    	
	    	if(name != null && name.startsWith(fName)) { 
	    		
	    		System.out.println("i => "+i); // 0(유재석) 1(엄정화) 2(강호동) 3(이순신) 4(김태희) 5(강감찬) 6(null) 7(이순신) 8(이민호) 9(설현)
	    		mbrList.remove(i);             // 0(유재석) 1(엄정화) 2(강호동) 3(김태희) 4(강감찬) 5(null) 6(이순신) 7(이민호) 8(설현)
	    									   // 0(유재석) 1(엄정화) 2(강호동) 3(김태희) 4(강감찬) 5(null) 6(이순신) 7(이민호) 8(설현)
	    	                                   // 6(이순신) 을 삭제함.
	    		                               // 0(유재석) 1(엄정화) 2(강호동) 3(김태희) 4(강감찬) 5(null) 6(이민호) 7(설현)
	    	
	    	}	
 
	    }// end of for---------------------
	    
	    for(Member mbr : mbrList) {
	    	System.out.println(mbr.minfo());
	    }
	    */
	    
	    System.out.println("\n~~~~~~~~~~~[퀴즈3 올바른 풀이]~~~~~~~~~~~~\n");
	    
	    System.out.println(">> 삭제하기전  mbrList.size() => " + mbrList.size());
	    
	    // == 아래의 것은 맞는 풀이 !!!!! 
	    
	   	for(int i=mbrList.size()-1; i>=0; i--) {    // for(int i=9; i>0; i--) {
	    	                                        // i => 9	i => 8	 i=> 7 
	    	String name = mbrList.get(i).getName(); // 9(설현)   8(이민호)   7(이순신) 6(null) 5(강감찬) 4(김태희) 3(이순신) 2(강호동)  1(엄정화)  0(유재석) 
	    	
	    	if(name != null && name.startsWith(fName)) { 
	    		
	    		System.out.println("i => "+i);  // i=> 8    i=> 7  i=> 3  이런식으로 하나씩 지워나가도 남은 수에 대한 변동이 없다.
	    		mbrList.remove(i);              // 0(유재석) 1(엄정화) 2(강호동) 3(김태희) 4(강감찬) 5(null)  6(설현)
	    	}	
 
	    }// end of for---------------------
	    
	   	for(Member mbr : mbrList) {
	    	System.out.println(mbr.minfo());
	   	}
	   	
	   	System.out.println(">> 삭제한 후  mbrList.size() => " + mbrList.size());
	   	
	   	System.out.println("\n~~~~~~~~~~~[퀴즈4]~~~~~~~~~~~~\n");
	   	
	    /*
        [퀴즈4]
        mbrList 에 저장되어진 Member 객체들 중에서
               특정한 조건(id 가 null 인 것)에 만족하는 Member 객체를 하나를 삭제하고
               삭제되어진 그 인덱스(위치)자리에 새로운 Member 객체를 넣어주기
               그런데 만약에 id 가 null 인 것이 없다라면 새로운 Member 객체는 맨 뒤에 넣어주기
     */
	    
	    	flag = false;
	    
	    	for(int i=mbrList.size()-1; i>=0; i-- ) {
	    		
	    		if(mbrList.get(i).getId() == null) {
	    			mbrList.remove(i);
	    			mbrList.add(i, new Member("seokj","qwer1234$","서강준"));
	    			flag = true;
	    			break;
	    		}
	    		
	    	} // end of for
	    	
	    	if(!flag) {
	    		mbrList.add(new Member("seokj","qwer1234$","서강준"));
	    	}
	
	    	for(Member mbr : mbrList) {
		    	System.out.println(mbr.minfo());
		    }
	  
	    	
	    	
	    	System.out.println("\n ===== mbrList 에 저장된 모든 객체 삭제하기 ====\n");
	    	mbrList.clear();  // clear가 몽땅 다 지운다는 말이다.
	    	
	    	System.out.println(">> 삭제한 후  mbrList.size() => " + mbrList.size());
	    	// >> 삭제한 후  mbrList.size() => 0
	    	
	    	for(Member mbr : mbrList) {  // 아무것도 없기 때문에 출력되지 않는다.
		    	System.out.println(mbr.minfo());
		    }




	}// end of main(String[] args)---------------------

}
