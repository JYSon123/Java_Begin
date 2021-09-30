	package my.day16.c.map;

import java.util.*;


public class HashMapMain {

	
		
	/*
	   === Map 계열 ===
	   1. HashMap 과 Hashtable 이 있다.
	   2. Map 계열은 List 계열(Vector, ArrayList, LinkedList)처럼 index 가 사용되어 저장되는 것이 아니라, 
	      Map 계열은 key값과 value값을 쌍으로 사용하여 저장하는데  
	           데이터 저장시 사용되는 메소드는 put(String key, Object value)메소드를 사용한다.
	           이때 key값은 반드시 고유한 값을 가져야 하고, value값은 중복된 값이 와도 괜찮다.
	   3. Map 계열에 저장된 key값들은 순서와는 상관없이 저장된다.  
	   4. Map 계열에 저장된 value값을 추출하려면 key를 이용해서 가져오는데 
	      value 값의 추출은 get(String key) 메소드를 사용한다. 
	*/
	
	
	public static void main(String[] args) {
		
		// HashMap<String, Member> mbrMap = new HashMap<String, Member>(); 
		// 또는
		// HashMap<String, Member> mbrMap = new HashMap<>();
		
		// 또는
		// Map<String, Member> mbrMap = new HashMap<String, Member>();
		   Map<String, Member> mbrMap = new HashMap<>();
		// Map<K,V>
		
		   mbrMap.put("youjs",new Member("youjs","qwer1234$","유재석"));
		// mbrMap 이라는 HashMap 저장소에 new Member("youjs","qwer1234$","유재석")을 저장하는데 
		// 저장된  new Member("youjs","qwer1234$","유재석")을 찾고자 할때는 
		// "youjs" 만 넣어주면 new Member("youjs","qwer1234$","유재석") 이 나오도록 저장하겠다는 말이다. 
		   
		   mbrMap.put("eom",new Member("eom","qwer1234$","엄정화"));
		   mbrMap.put("kanghd",new Member("kanghd","qwer1234$","강호동"));
		   mbrMap.put("leess",new Member("leess","qwer1234$","이순신"));
		   mbrMap.put("kimth",new Member("kimth","qwer1234$","김태희"));
		   mbrMap.put("kangkc",new Member("kangkc","qwer1234$","강감찬"));
		   
		   
		   // == mbrMap 에 저장되어진 Member 객체들중에 key 가 "leess" 인 value값(지금은 Member)을 추출해서
		   //    추출된 회원(Member)의 정보를 출력하세요.
		   String id = "eom";
		   Member mbr= mbrMap.get("eom");
		   
		   if(mbr != null) {
			   System.out.println(mbr.minfo());
		   }
		   else {
			   System.out.println(">> 검색하신 " + id + "에 해당하는 회원은 없습니다.");
		   }
		   
		   // == mbrMap 에 저장되어진 Member 객체들중에 key 가 "superman" 인 value값(지금은 Member)을 추출해서
		   //    추출된 회원(Member)의 정보를 출력하세요.
		   id = "superman";
		   mbr= mbrMap.get(id);
		   
		   // System.out.println(mbr.minfo()); // NullPointerException
		   if(mbr != null) {
			   System.out.println(mbr.minfo());
		   }
		   else {
			   System.out.println(">> 검색하신 " + id + "에 해당하는 회원은 없습니다.");
		   }
		  
		   
		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		   
		   mbrMap.put("leess", new Member("leess","qwer1234$","이삼신"));
		   // key 값 "leess" 이 존재하고 있다라면 기존의 value값인 new Member("leess","qwer1234$","이삼신")은 없어지고 
		   // new Member("leess","qwer1234$","이삼신")로 덮어 씌운다.
		   
		   id = "leesamsin";
		   mbr= mbrMap.get(id);
		   
		   if(mbr != null) {
			   System.out.println(mbr.minfo());
			  
			   /*
			   == 이삼신님의 회원정보 ==
			   1. 아이디 : leess
			   2. 암호 : qwer1234$
			   3. 성명 : 이삼신
			   */
			   
		   }
		   else {
			   System.out.println(">> 검색하신 " + id + "에 해당하는 회원은 없습니다.");
		   }
		   
		   mbrMap.put("leesamsin", new Member("leess","qwer1234$","이삼신"));
		   
		   
		   
		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		  
		   // mbrMap 에 저장되어진 모든 Member 객체들에 대해서 정보를 출력하세요.
		   
		   // == mbrMap 에 저장되어진 모든 key 들을 읽어오는 첫번째 방법
		   Set<String> keySets = mbrMap.keySet();
		   
		   for(String key : keySets) {
			   System.out.println(key);
			}
		   /*
			   eom
			   youjs
			   kimth
			   kangkc
			   leesamsin
			   kanghd
			   leess
		   */
		   
		   for(String key : keySets) {
			   System.out.println(mbrMap.get(key).minfo());
		   }
		   
		   
		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		   
		   
		   id = "kanggc";
		   boolean flag = false;
		   
		   for(String key : keySets) {
			   if(key.equals(id)) {
				   flag = true;
				   break;
			   }
		   }// end of for
		   
		   if(!flag) {
			 mbrMap.put(id, new Member("kanggc","qwer1234$","강금씨"));  
			 System.out.println("\n >>> 회원가입 성공! <<< \n");
		   }
		   else {
			   System.out.println("\n >>> " + id + " 아이디는 이미 사용중 입니다. 다른 아이디로 가입하세요!!");
		   }
		   
		
		   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		   
		// == mbrMap 에 저장되어진 모든 key 들을 읽어오는 첫번째 방법
		 Set<String> keySets2 = mbrMap.keySet();   
		
		 Iterator<String> itrator = keySets2.iterator();
		 // Iterator 는 저장소가 아니라 Collection 에 저장되어진 요소(Element)를 읽어오는 용도로 쓰이는 것이다.
		 
		 while(itrator.hasNext()) {
			 
		 /*
             itrator.hasNext() 는 
             itrator 에서 현재 itrator 가 가지고 있는 여러 String 데이터중
                         하나를 끄집어내서 존재하는지를 알아보는 것이다.
                         존재하면 true , 존재하지 않으면 false 리턴해준다.
                         그러므로 현재는 키의 갯수가 8개 이므로 8번 반복을 할 것이다.
           */   
			 
			 String key = itrator.next(); // hasnext() 는 boolean 값으로 있는지 없는지만 체크한다!
				 
			/*
		            실제로 키값인 String 값을  itrator 에서 끄집어 낸다.
		            그러면 끄집어 낸 String 값은 더 이상 itrator 에는 남아 있지 않게 된다. 
		     */
				 
			 System.out.println(key);
			 
			 
		 }
		 
				 
		 System.out.println("\n~~~~~~~~ 또 한번 더 ~~~~~~~~~");
		 
		 while(itrator.hasNext()) {
			 String key = itrator.next();
			 System.out.println(key);
			/*
	         itrator 에는 더 이상 String 데이터가 존재하지 않으므로
		            처음부터  itrator.hasNext() 은 false 가 되어진다.
		            그래서 아무것도 출력이 되지 않는다.
	       */
		 }
			 
		 System.out.println("\n~~~~~~~~ 다시 처음부터 해본다 ~~~~~~~~~");
		 Iterator<String> itrator2 = keySets2.iterator();  // keySets2에서 새로운걸 하나 더 만들어준다.
		 
		 
		 while(itrator2.hasNext()) {
			 String key = itrator2.next();
			 System.out.println(key); 
		 }
		 
		 
		 System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		 
		  
		   id = "leess";
		   flag = false;
		   
		   Iterator<String> itrator3 = keySets2.iterator();
		   
		   
		   while(itrator3.hasNext()) {
				String key = itrator3.next();
				System.out.println(key); 
				
				if(key.equals(id)) {
					flag = true;
					break;
				}
		   
		   }// end of while ---------------------------

		   if(!flag) {
			 mbrMap.put(id, new Member("leess","qwer1234$","이수성"));  
			 System.out.println("\n >>> 회원가입 성공! <<< \n");
		   }
		   else {
			   System.out.println("\n >>> " + id + " 아이디는 이미 사용중 입니다. 다른 아이디로 가입하세요!!");
		   }
		   
		 
		   
		   System.out.println("\n [퀴즈] mbrMap에 저장되어진 모든 회원들의 정보를 출력 ~~~~~~~~~~~~~\n");
		   
		   	
		   Set<String> keySets1 = mbrMap.keySet();
		   
		   for(String key : keySets1) {
			   System.out.println(mbrMap.get(key).minfo());
			}
		   
		  
		   System.out.println("\n~~~~~~~~~또는~~~~~~~~~~\n");
		   
		   
           Iterator<String> it = keySets1.iterator();
           
           while(it.hasNext()) {
              String key = it.next();
              System.out.println(mbrMap.get(key).minfo()); 
           }// end of while------------------------
		   
		   
           System.out.println("\n ========= key 값이 kangkc 인 Member 를 삭제하기 ========= ");
           
           mbrMap.remove("kangkc");
		   
           keySets1 = mbrMap.keySet();
           
           for(String key : keySets1) {
        	   System.out.println(mbrMap.get(key).minfo());
           }
           
		 
           System.out.println("\n ========= mbrMap에 저장되어진 모든  Member 를 삭제하기 ========= ");
           
           mbrMap.clear();
		   
           keySets1 = mbrMap.keySet();
           
           for(String key : keySets1) {
        	   System.out.println(mbrMap.get(key).minfo());
           }
           
           System.out.println("mbrMap.isEmpty() => "+mbrMap.isEmpty());
           // mbrMap.isEmpty() => true
           
		 
	}// end of  main(String[] args)------------------

}







