package my.day08.a.array;

import java.util.Scanner;

import my.util.MyUtil;

public class QMemberMain3 {

	public static void main(String[] args) {
		
		//3개 까지만 넣을 수 있는 배열을 만들었다.
		Member2[] mbrArr = new Member2[3];

		/*
		for(int i=0; i<mbrArr.length; i++) {
			System.out.println(mbrArr[i]);
		}
		
		 /*
		  null
		  null
		  null
		 */
		
		
		/*
		for(int i=0; i<mbrArr.length; i++) {
			System.out.println(mbrArr[i].id);
			//java.lang.NullPointerException 이 발생한다.
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int menuNo = 0;
		do {
	
			System.out.println("\n=====================  >> 메 뉴 <<  =====================");
	        System.out.println("1.회원가입 2.모든회원조회 3.모든회원조회 4.특정아이디 회원조회 5.프로그램종료");
	        System.out.print("▷ 선택하세요 => ");
		        
		    try {  
		       menuNo = Integer.parseInt(sc.nextLine());
		       
		       
		       //  체크!!
		        if(!(1 <= menuNo && menuNo <= 5)){
				   System.out.println("메뉴에 없는 번호입니다!");
				   continue;
				}

		        switch (menuNo) {
				case 1: // 회원가입
					
								if(Member2.count < mbrArr.length) { // 카운트된 횟수와 배열의 크기를 비교해서 회원 자리가 꽉 찻으면 
									// 배열에 저장할 여유공간이 있다라면 
								
									Member2 mbr = new Member2();
									System.out.println(">> 확인용 count : " + Member2.count);
									
									System.out.print("\n1.아이디 : ");
									mbr.id = sc.nextLine();
									
									
									do {
										System.out.print("2.비밀번호 : ");
										String passwd = sc.nextLine(); // 그냥엔터 "aB12$" "adfsSd32323#232!!!"  "qwer12345"  "qwEr1234$"
										
										
										if(MyUtil.isCheckPasswd(passwd)){  // 가지고온 비밀번호가 양식에 맞다면 넣어준다
											mbr.passwd = passwd; //지역변수에 넣어준다
											break; // do ~ while 문의 break 이다.
										}
										else {
											System.out.println(">> 암호는 8글자 이상 15글자 이하의 영문 대,소문자 및 숫자 및 특수문자가 혼합되어야 합니다!!<<\n ");
										}
									}while(true); // 비밀번호를 잘못 입력하면 맨 처음으로 돌아가게 하지 않기 위해  do while을 써준다
				
									
									
									System.out.print("3.성명 : ");
									mbr.name = sc.nextLine();  // 값 입력이 끝났으면 값들을 배열에 넣어준다.
									
									for(int i=0; i<mbrArr.length; i++) {
										if(mbrArr[i] == null) {  // i번째 방이 비었나, 안비었나를 본다.
											mbrArr[i] = mbr;
											break; // for문의 break이다.  break가 없다면 빈곳에 모두 데이터값을 넣어버리게 된다.
										}
									}// end of for----------------------
				
									break;    // switch의 break 이다. 비밀번호를 맞게 입력했으면 멈춘다.
									
									
					} 
					else{ // 배열에 저장할 여유공간이 없다면 즉, 정원마감이라는 뜻이다.
						System.out.println(">> 더이상 회원을 저장할 공간이 없습니다. 정원마감!!!");
					}
					
					break;			// switch의 break 이다.
					
					
					
				case 2: // 3. 모든회원조회
					
					int nullCount = 0;
					
					for(int i=0; i<mbrArr.length; i++) {
						if(mbrArr[i] != null) {
							System.out.println(mbrArr[i].showInfo()+"\n"); //비어있어서 null인 경우에 오류가 뜬다.
						}
						else {
							nullCount++;
						}
						
					}// end of for-------------------------
						
					if(nullCount == mbrArr.length ) { // 배열의 길이와 비교해서, 값이 같으면 아무도 가입을 하지 않은것이다.
					System.out.println(">> 가입된 회원이 0명 입니다. <<");
					}
					
					
					
					
						
					break; // switch의 break 이다.

					
				
				
				case 3: // 4. 모든회원조회
					if( Member2.count > 0)  
						
						for(int i=0; i<Member2.count; i++) {
						System.out.println(mbrArr[i].showInfo()+"\n");
						}
						else {
						System.out.println(">> 가입된 회원이 0명 입니다. <<");
						}

					
					break; // switch의 break 이다.

				
				case 4://4.특정아이디 회원조회 

					
				/* 
					if(0 == Member2.count) {
						System.out.println("생성된 아이디가 없습니다!");
					}
					
					System.out.print("▷ 조회 하고자 하는 아이디 :");
					
					String name1 = sc.nextLine();
					
					for(int i=0; i<=Member2.count;) {   내가 하던 코드...
					if(mbrArr[i].equals(name1))	{
						 i++;
						System.out.println(showInfo(i));*/
					
					
					if(Member2.count > 0) {  // 0보다 커야 회원에 가입한 경우이다
						
						System.out.print("▷ 조회 하고자 하는 아이디 :");
						String searchID = sc.nextLine(); // 여기서 아이디를 받아오자
						
						
						boolean isExists = false; // 존재하는 아이디입니까?
						for(int i=0; i<Member2.count; i++) { // 저장되어진 갯수만큼 알아본다.
						
							if(mbrArr[i].id.equals(searchID)) { //내가 쓴 아이디와 인스턴스가 같냐?
								System.out.println(mbrArr[i].showInfo());
								isExists = true;
								break;
							}
	
							
						}// end of for
						
						if(!isExists) {
							System.out.println(">>>저장되어진 회원중 아이디가 " + searchID + "인 회원은 없습니다.<<<\n");
							 // for을 빠져나간 후 작성해준다.
						}

						}
						else { // 회원가입된 아이디가 없는 경우
							System.out.println(">>> 가입된 회원이 없으므로 특정 아이디로 검색이 불가합니다. <<<\n");
						}
							
					
					
					
					
					
					
					
					
					
					
					

					
					
					break;
					
					
				}// end of switch--------------------------------------
		        
		        
  
		     }catch(NumberFormatException e) {
				System.out.println(">> 정수만 입력하세요!! <<\n");
			 }
	       

		    
		}while(!(menuNo == 5)); // 4번을 치면 빠져나간다.
		
		
		sc.close();
		
		System.out.println(">> 프로그램 종료 <<");
		

	}// end of main(String[] args)-------------------------------

}
