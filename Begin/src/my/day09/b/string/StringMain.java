package my.day09.b.string;

import java.text.DecimalFormat;

import my.util.MyUtil;

public class StringMain {

	public static void main(String[] args) {
	
	
	// === 1. "문자열".charAt(int index) ===
    //          "안녕하세요".charAt(2) ==> '하'
    // index =>  01234 
	
		char ch = "안녕하세요".charAt(2);
		System.out.println("ch => " + ch);
		// ch => 하
		
		String str = "안녕하세요";
		// index =>  01234 

		String reverse = "";
		
		
		for(int i=str.length()-1; i>=0; i--) { // 5-1
			reverse += str.charAt(i);
		}// end of for-----------------
		
		System.out.println(reverse);
		// 요세하녕안
		
		
		
		// === 2. "문자열".toCharArray() ===
	    // "안녕하세요".toCharArray()  ==> char 타입의 배열로 만들어준다.
	    // ------------------------
	    // |'안'|'녕'|'하'|'세'|'요'|
	    // ------------------------
	    //   0    1    2   3    4   <== index 
		str = "안녕하세요";
		
		char[] chArr = str.toCharArray();
		
		
		reverse = "";
		for(int i=chArr.length-1; i>=0; i--) {
			reverse += chArr[i];
		}// end of for------------------------
		
		
		System.out.println(reverse);
		// 요세하녕안
		
		
		
		// === 3. "문자열".substring(int 시작인덱스, int 끝인덱스) === 
	    // "안녕하세요".substring(1, 4); ==> 1번 인덱스인 "녕" 부터 4번 인덱스 앞에까지인 "세" 까지만 뽑아온다.          
	    // index =>  01234
		
		str = "안녕하세요";
		String substr = str.substring(1, 4);
		System.out.println(substr);
		//녕하세
		
		substr = str.substring(1, str.length()); // str.length() ==> 5
		System.out.println(substr);
		// 녕하세요

		
		
		
		// === 4. "문자열".substring(int 시작인덱스) === 
	    // "안녕하세요".substring(2); ==> 2번 인덱스인 "하" 부터 끝까지 뽑아온다.          
	    //  01234
		
		substr = str.substring(2);
		System.out.println(substr);
		// 하세요
		
		
		
		// === 5. "문자열".indexOf("찾을문자열") ===
	    //        "문자열" 에서 최초로 나오는  "찾을문자열"의 인덱스(int)를 알려준다.
		
		str ="시작하라 안녕하세요 건강하세요";
		int index = str.indexOf("하세요"); // 최초로 나오는 하세요의 값이 출력된다.
		System.out.println(index); // 7
		
	    index = str.indexOf("행복"); 
		System.out.println(index); // 0
		
		
		
		
		// === [퀴즈] === //
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		String[] pathFileNameArr = {"C:/mydocument/resume/나의이력서.hwp",
					                "D:/mymusic.mp3",
					                "C:/photo/내얼굴.jpg"};

			for(int i=0; i<pathFileNameArr.length; i++) {
			System.out.println(pathFileNameArr[i]);
			}// end of for---------------------
			
			/*
			C:/mydocument/resume/나의이력서.hwp
			D:/mymusic.mp3
			C:/photo/내얼굴.jpg
			*/
			
			
			System.out.println("\n=== 파일명만 뽑아온 결과물 ===");
			//글자를 거꾸로 해서 첫번째로 나오는 슬래시 앞까지 출력해주면 된다. 그 후에 다시 거꾸로 돌리면됨.
			
			for(int i=0; i<pathFileNameArr.length; i++) {
			
				char[] chrArr =  pathFileNameArr[i].toCharArray();  //String 타입이기 때문에 toCharArray를 통해서 char로 바꿔준다.      
				
				String strReverse="";
				for(int j=chrArr.length-1; j>=0; j-- ) {  //글자를 하나하나 읽어와준다.
					strReverse += chrArr[j];   // 글자를 거꾸로 해서, 하나씩 차곡차곡 strReberse에 붙인다.
				}// end of for---------------------
			
			//	System.out.println(strReberse); 
				  
				/*
					pwh.서력이의나/emuser/tnemucodym/:C  
					3pm.cisumym/:D
					gpj.굴얼내/otohp/:C
					 
				   */
				
				int idx = strReverse.indexOf("/"); // 최초로 "/"가 나오는 위치값이 idx이다.
				strReverse = strReverse.substring(0, idx); //substring을 통해서 원하는곳에서 부터 글자를 가져와준다.
				
			//  System.out.println(strReberse); 
			/*	
				pwh.서력이의나
				3pm.cisumym  이런식의 결과가 나온다.
				gpj.굴얼내
			*/	
				
			// 이제 strReberse를 배열로 만들어서 거꾸로 돌려주면 끝이 난다.
			
			chrArr	= strReverse.toCharArray();
				
			strReverse = "";
			for(int j=chrArr.length-1; j>=0; j--) {
				
				strReverse += chrArr[j];

			}
			
			System.out.println(strReverse);
			
				
			}// end of for---------------------
			
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			
			
				/*
				나의이력서.hwp
				mymusic.mp3
				내얼굴.jpg
				*/
			
			
			// === 6. "문자열".lastIndexOf("찾을문자열") ===
		    //        "문자열" 에서 마지막으로 나오는  "찾을문자열"의 인덱스(int)를 알려준다.
				
			
			str ="시작하라 안녕하세요 건강하세요";
			
			index = str.lastIndexOf("하"); // 마지막으로 나오는 하세요의 값이 출력된다.
			System.out.println(index); // 13
			
		    index = str.lastIndexOf("하세요"); 
			System.out.println(index); // 13
			
		    index = str.lastIndexOf("행복"); 
			System.out.println(index); // -1
			
			
			// === [퀴즈] === //
			
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
			for(int i=0; i<pathFileNameArr.length; i++) {
			System.out.println(pathFileNameArr[i]);
			}// end of for---------------------
			
			/*
			C:/mydocument/resume/나의이력서.hwp
			D:/mymusic.mp3
			C:/photo/내얼굴.jpg
			*/
			
			
			System.out.println("\n=== 파일명만 뽑아온 결과물 ===");
			
			for(int i=0; i<pathFileNameArr.length; i++) {
				int idx = pathFileNameArr[i].lastIndexOf("/");
				System.out.println(pathFileNameArr[i].substring(idx+1)); // 슬래시를 빼기 위해서 idx+1을 해준다.
			}// end of for---------------------
			
			
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			
			// ======== [퀴즈 콤마 제거하기] ======== //
			// 최초로 콤마가 나오는 부분을 중심으로 해서 문자를 쪼개어버린다. 
			// "2"+"000,000"  = "2000,000"
			// "2000" + "000" = "2000000"
			
			
			
			

			long money1 = MyUtil.deleteComma("2,000,000");
			long money2 = MyUtil.deleteComma("500,000");
			long money3 = MyUtil.deleteComma("700");
			
			
			
			//int n_money1 = Integer.parseInt(money1); //이렇게 하면, 콤마를 제거를 못해서 오류가 뜬다.
			
			long sumMoney = money1+money2+money3;
			
			
			//이 값이 바뀌기 위해서는, 콤마를 빼야 int 타입으로 바뀐다.
			System.out.println(sumMoney);
			// 2500700
			
			// === 숫자에 세자리 마다 콤마(,) 찍어서 String으로 돌려주기 === //
			DecimalFormat df = new DecimalFormat("#,###");  //세 자리마다 콤마를 찍어주겠단 뜻이다.
			String str_sumMoney =  df.format(sumMoney); // 뒤에 format을 넣어줘야한다.
			System.out.println(str_sumMoney);
		
			
			
			// === 7. "문자열".split("구분자") ===
		    //        "문자열"을 "구분자"로 잘라서 String 타입의 배열로 돌려주는 것이다.
			
			System.out.println("\n 1.===================================\n");
			
			String foodes = "파스타,국밥,볶음밥,고구마,계란말이";
			
			String[] foodArr = foodes.split(",");
			// {"파스타","국밥","볶음밥","고구마","계란말이"}
			
			for(int i=0; i<foodArr.length; i++) {
				System.out.println(foodArr[i]);
			}
			
			
			
			System.out.println("\n 2.===================================\n");
			
			foodes = "파스타	국밥	볶음밥	고구마	계란말이";
			
			foodArr = foodes.split("\t"); // 탭을 구분자로 했다.
			// {"파스타","국밥","볶음밥","고구마","계란말이"}
			
			for(int i=0; i<foodArr.length; i++) {
				System.out.println(foodArr[i]);
			}
			
			/*
				파스타
				국밥
				볶음밥
				고구마
				계란말이
			*/
			
			
			System.out.println("\n 3.==== split 사용시 구분자로 . | / 등 특수문자를 사용하려고 하는 경우  ===== \n");
			
			
			foodes = "파스타.국밥.볶음밥.고구마.계란말이";
			//foodArr = foodes.split("\\.");  또는 아래처럼 대괄호로 감싸준다.
			  foodArr = foodes.split("[.]"); 
			
			
			System.out.println("foodArr.length => " + foodArr.length);
			// foodArr.length => 0
			
			// ==> 0 이 나옴. 즉 . 단독만으로는 구분자로 인식을 못함.
		    // split 사용시 구분자로 . | / 등 특수문자를 사용하려고 할 경우에는 구분자로 인식을 못할 경우가 많으므로
		    // 구분자 앞에 \\ 를 붙이거나 구분자를 [] 로 씌워주면 된다. 즉, [구분자] 이렇게 말이다
			
			
			for(int i=0; i<foodArr.length; i++) {
				System.out.println(foodArr[i]); // 안나오는 경우이다.
			}
			
			
			
			
			
			foodArr = foodes.split("\\."); 
			
			
			System.out.println("foodArr.length => " + foodArr.length);
			// foodArr.length => 5
			
			// ==> 0 이 나옴. 즉 . 단독만으로는 구분자로 인식을 못함.
		    // split 사용시 구분자로 . | / 등 특수문자를 사용하려고 할 경우에는 구분자로 인식을 못할 경우가 많으므로
		    // 구분자 앞에 \\ 를 붙이거나 구분자를 [] 로 씌워주면 된다. 즉, [구분자] 이렇게 말이다
			
			
			for(int i=0; i<foodArr.length; i++) {
				System.out.println(foodArr[i]);
			}
			
			

			foodes = "파스타,국밥,볶음밥,고구마,계란말이";
			
			foodArr = foodes.split(",");
			// {"파스타","국밥","볶음밥","고구마","계란말이"}
			
			for(int i=0; i<foodArr.length; i++) {
				System.out.println(foodArr[i]);
			}
			
			
			
			System.out.println("\n 4.===================================\n");
			
			foodes = "파스타,국밥.볶음밥	고구마|계란말이";
			
			//foodArr = foodes.split("\\,|\\.|\\t|\\|"); // \\는 |을 말한다.
			//또는
			foodArr = foodes.split("[,.\t|]");
			// {"파스타","국밥","볶음밥","고구마","계란말이"}
			
			for(int i=0; i<foodArr.length; i++) {
				System.out.println(foodArr[i]);
			}
			
			
			/*
			파스타
			국밥
			볶음밥
			고구마
			계란말이
			*/
			
			
			System.out.println("\n 5.===================================\n");
					
			foodes = "파스타1국밥2볶음밥3고구마4계란말이";
			
			foodArr = foodes.split("\\d"); // 구분선이 숫자라는 뜻 = \\d
		                                   //  \\d 에서  d는 정규표현식의 하나로써 숫자를 의미한다.
                                           //  즉, 숫자가 구분자가 되는 것이다.
			
			// {"파스타","국밥","볶음밥","고구마","계란말이"}
			
			for(int i=0; i<foodArr.length; i++) {
				System.out.println(foodArr[i]);
			}
			
			
			/*
			파스타
			국밥
			볶음밥
			고구마
			계란말이
			*/
			
			
			System.out.println("\n 6.===================================\n");
			
			foodes = "파스타1국밥2볶음밥3고구마4계란말이";
			
			foodArr = foodes.split("\\D"); //  \\D 에서  D는 정규표현식의 하나로써 숫자가 아닌것을 의미한다.
                                           //  즉, 숫자가 아닌것이 구분자가 되는 것이다.
			// {"1","2","3","4"}
			
			for(int i=0; i<foodArr.length; i++) {
				System.out.println(foodArr[i]);
			}
			
			
		/*
			1

			2


			3


			4
		*/
			
			
			System.out.println("\n~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~\n");
			
			// == 참고 : \ 를 escape 문자 라고 부른다. ==
			
			System.out.println("나의 이름은 \"이순신\" 입니다.");
			// 나의 이름은 "이순신" 입니다.
			
			System.out.println("C:\\movie\\koreamovie\\크루엘라.mp4");
			// C:\movie\koreamovie\크루엘라.mp4
			
			
			
			// === 8. String.join("구분자", 문자열배열명) ===
		    //        문자열배열을 "구분자"로 합쳐서 String 타입으로 돌려주는 것이다.
			String[] nameArr = {"한석규","두석규","세석규","네석규","오석규"};
			String names = String.join("-", nameArr);  // (연결고리, 붙일배열명)
			System.out.println(names);
			
			
			// === 9. "문자열".replaceAll("변경대상문자열", "새로이변경될문자열") === 
		    //        "문자열" 에서 "변경대상문자열" 을 모두 "새로이변경될문자열" 로 교체해서 반환.
			names = names.replaceAll("석규", "SK"); // 석규를 찾아서, 모두 SK로 바꾸고 String 타입으로 바꿔준다.
			System.out.println(names);
			// 한SK-두SK-세SK-네SK-오SK
			
			
			// === 10. "문자열".replaceFirst("변경대상문자열", "새로이변경될문자열") === 
		    //       "문자열" 에서 "변경대상문자열" 을 첫번째만 "새로이변경될문자열" 로 교체해서 반환.
			names = names.replaceFirst("SK", "석규"); //  SK를 찾아서, 석규로 바꿔주는데, 맨 처음것만 바꿔준다.
			System.out.println(names);
			//한석규-두SK-세SK-네SK-오SK
			
			
			
			// === 퀴즈 === //
			System.out.println("\n==퀴즈==");
			
			// replaceFirst를 사용하여 첫번째, 두번째, 세번째 "SK"를 석규로 변환하세요
			names = "한SK-두SK-세SK-네SK-오SK";
			
			for(int i=0; i<3; i++) {
			names = names.replaceFirst("SK","석규");
			// names <== "한석규-두SK-세SK-네SK-오SK"
		    // names <== "한석규-두석규-세SK-네SK-오SK"
			// names <== "한석규-두석규-세석규-네SK-오SK"
			}

			System.out.println(names);
			// "한석규-두석규-세석규-네SK-오SK"
			
			
			
			// 내가한것 //
			
			System.out.println("\n==퀴즈== 내가한것");
			names = "한SK-두SK-세SK-네SK-오SK";
			// split 를 사용하여 홀수번째 "SK"를 "석규"로 변환하세요
			
			String[] holenames = names.split("-");
			
			for(int i=0; i<holenames.length; i++) {
				if((i+1)%2 != 0) {
					holenames[i] = holenames[i].replaceAll("SK", "석규");
				}
			
			} // end of for
			
			
			String names1 = String.join("-", holenames);
			System.out.println(names1);
			
			
			
			
			System.out.println("\n==퀴즈==");
			
			names = "한SK-두SK-세SK-네SK-오SK";
			
			nameArr = names.split("\\-");
				//  {"한SK" "두SK", "세SK", "네SK", "오SK"}
			
			for(int i=0; i<nameArr.length; i++) {
				if((i+1) %2 != 0) { //홀수번째
					nameArr[i] = nameArr[i].replaceAll("SK", "석규");
					
				}
				
			}//end of for--------------------------
			
			names = String.join("-", nameArr);
			System.out.println(names);
			// nameArr ==>  {"한석규" "두SK", "세석규", "네SK", "오석규"}
			

		
			
			
			System.out.println("\n===== 퀴즈 ===== \n");
		      
		    String[] contents = {"호호안녕하세요","건강하세요","행복하세요 또봐요","즐겁고 건강한 하루되세요"}; 
			
		    for(int i=0; i<contents.length; i++) { 
		    	
		    	int idx = contents[i].indexOf("건강"); //indexOf으로 찾았을 때, 건강이 포함되어 있으면 -1이 아니다.
		    	if(idx != -1) {
		    		System.out.println(contents[i]);
		    	
		    	}	
		    }// end of for--------------------------------
		    
		    //건강하세요
		    // 즐겁고 건강한 하루 되세요
		    
		    
		    
		    System.out.println("====================");
		    
		    // "건강" 이라는 단어로 시작하는 것만 출력하세요. 건강이라는 단어의 Index가 무조건 0이란 뜻.
		    for(int i=0; i<contents.length; i++) { 
		    	
		    	int idx = contents[i].indexOf("건강"); //indexOf으로 찾았을 때, 건강이 포함되어 있으면 -1이 아니다.
		    	if(idx == 0) {
		    		System.out.println(contents[i]);
		    		// 건강하세요 출력됨!
		    	}	
		    }// end of for--------------------------------
		    
		    
		    
		    
		    System.out.println("====================");
		    
		    // 또는 아래와 같이 할수도 있습니다.
		    // === 11. "문자열".startsWith("찾고자하는문자열")  ===
		    //         "문자열" 에서 "찾고자하는문자열"이 맨첫번째에 나오면 true 를 반환.
		    //         "문자열" 에서 "찾고자하는문자열"이 맨첫번째에 나오지 않으면 false 를 반환.
		    
		    //"건강" 이라도 단어로 시작하는 것만 출력하세요.
		    for(int i=0; i<contents.length; i++) { 
		    	if(contents[i].startsWith("건강")) { //"건강" 으로 시작되어지면 true이다.
		    	System.out.println(contents[i]);
		    	}	
		    }// end of for--------------------------------
		    
		    
		    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		    
		    // === 12. "문자열".endsWith("찾고자하는문자열")  ===
		    //         "문자열" 에서 "찾고자하는문자열"로 끝나면 true 를 반환.
		    //         "문자열" 에서 "찾고자하는문자열"로 끝나지 않으면 false 를 반환.
		    
		    //         "하세요" 라는 단어로 끝나는 것만 출력하세요.
		    
		    for(int i=0; i<contents.length; i++) { 
		    	if(contents[i].endsWith("하세요")) { //"건강" 으로 시작되어지면 true이다.
		    	System.out.println(contents[i]);
		    	}	
		    }// end of for--------------------------------
		    
		    
		    
		    // === 13. "문자열".trim()  === 
		    //       "문자열".trim() 은 "문자열"의  좌,우에 공백이 있으면 공백을 모두 제거하고서 반환.
	        String insa = "          수고        많으셨습니다                ";
	      
	        
	        System.out.println("하하하"+insa+"내일 뵐께요~~");
	        // 하하하          수고        많으셨습니다                내일 뵐께요~~
	        
	        System.out.println("하하하"+insa.trim()+"내일 뵐께요~~");
	        // 하하하          수고        많으셨습니다                내일 뵐께요~~
	        // 하하하수고        많으셨습니다내일 뵐께요~~
	    
	       
	        String money = "   50,000,000   ";
	      //long ln_money = Long.parseLong(" 50000000 ".trim());  // 문자열의 좌우 공백을 제거해준다.
	        long ln_money = MyUtil.deleteComma(money);
	        System.out.println("ln_money => " + ln_money);
	        // ln_money => 50000000

		    
	        // === 14. "문자열".isEmpty()  === 
	        //         "문자열" 이 아무것도 없으면  true 를 반환해주고,
	        //         "문자열" 이 뭔가 있으면  false 를 반환해준다. 
		    
	        String str1="", str2="abc", str3="        ";
	        String str4=null;
	        
	        
	        
	        System.out.println(str1.isEmpty());  // true 
	        System.out.println(str2.isEmpty());  // false
	        System.out.println(str3.isEmpty());  // false
	        System.out.println(str3.trim().isEmpty()); // true
	        //                 "".ixEmpty() 가 되어진다.
	        
	        //System.out.println(str4.isEmpty());   / str4=null;
	        // java.lang.NullPointerException
	        
	        
	        
	        
		    // === 15. "문자열".toUpperCase()  ===
	        //         "문자열"에서 소문자가 있으면 모두 대문자로 변경해서 반환.
	                   String words = "My Name is Tom 입니다.";
	                   System.out.println(words.toUpperCase());
	        //         MY NAME IS TOM 입니다. 
	      
	        
	        	        
	        // === 16. "문자열".toLowerCase()  ===
	        //         "문자열"에서 대문자가 있으면 모두 소문자로 변경해서 반환.
	                    words = "My Name is Tom 입니다.";
	                    System.out.println(words.toLowerCase());
	        //          my name is tom 입니다.
	        
	        
	        
	        // === 17. "문자열".equals("비교대상문자열")  ===
	        //          대문자와 소문자를 구분하면서
	        //         "문자열" 과 "비교대상문자열" 의 값이 일치하면  true 를 반환.
	        //         "문자열" 과 "비교대상문자열" 의 값이 일치하지 않으면  false 를 반환. 
	        
	        
	        	        
	        // === 18. "문자열".equalsIgnoreCase("비교대상문자열")  ===
	        //          대문자와 소문자를 구분하지 않으면서 
	        //         "문자열" 과 "비교대상문자열" 의 값이 대,소문자와 관계없이 일치하면  true 를 반환.
	        //         "문자열" 과 "비교대상문자열" 의 값이 대,소문자와 관계없이 일치하지 않으면  false 를 반환. 
	               
	                    
	        String[] strArr = {"korea", "seoul", " KOREA seoul", "Korea 대한민국", "서울 kOrEA 만세", null}; 
	                    
	        // 검색어를 "korea "
	        for(String s : strArr) {
	        	if("korea ".trim().equals(s)) {
	        		System.out.println(s);	
	        	}
	        	
	        }// end of for-----------------------------
	                  
	       
	        
	        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~\n");
	        		
	     // 검색어를 "korea", "KOREA", " kOReA ", "korea " 와 같이 3개중에 아무거나 입력하면  
	     // "korea"," KOREA seoul", "Korea 대한민국", "서울 kOrEA 만세" 이 출력되도록 하자.		
	      
	        // 검색어를 " kOReA "
	        String search = " kOReA ";
	        
	        search = search.trim().toLowerCase();; 
	     // search <= "korea";
	        
	        for(String s : strArr) {
	        	
	        	if(s != null && s.toLowerCase().indexOf(search) != -1 ) { // null이 아니고, -1이 아니라면 
	        		// s.toLowerCase()은 "korea", "seoul", " korea seoul", "korea 대한민국", "서울 korea 만세" 으로 되어진 상태이다.
	        		// Ctrl + Shitt + y or x = 블락친 부분 모두 대문자 or 소문자로 바꿔준다.
	        	    System.out.println(s);
	        	}
	        	
	        	
	        	
	        }// end of for-----------------------------
	        
	        
		    
	} // end of main(String[] args)------------

	
}







