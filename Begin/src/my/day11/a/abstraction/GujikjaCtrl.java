package my.day11.a.abstraction;

import java.util.Scanner;

import my.util.MyUtil;

public class GujikjaCtrl {
	
		
		// == 구직자(Gujikja) 신규 회원가입을 해주는 메소드 생성하기 ==  
		boolean register(Scanner sc, Gujikja[] guArr) {
			
			boolean result = false;
			
				if(Gujikja.count < guArr.length) {
				
				
				Gujikja gu = new Gujikja();
				
				
				
				//== 아이디 중복 검사 하기 == //
				
				do {
					System.out.print("1. 아이디 :");  //youks leess
					String userid  = sc.nextLine(); 
					// 그냥엔터 ""    "          " 이런식의 아이디도 걸러줘야한다.
					
					
					if(userid != null && userid.trim().isEmpty()) {
						System.out.println("\n>> 아이디는 공백만으로는 될 수가 없습니다. <<\n ");
						continue;
						
						
					}
						
					boolean isDuplicate = false; // if문이 빠져나온 후 깃발이 어떻게 되어있는지를 본다.
					
					for(int i=0; i<Gujikja.count; i++) {
						
						if(guArr[i].userid.equals(userid) ) {  
							isDuplicate = true;
							break;
						}
						
					}// end of for-----------------------
					
					
					if(isDuplicate) {
						System.out.println("\n>>"+userid+"는 이미 사용중 입니다. 새로운 아이디를 입력하세요!! \n");
					}
					else {
						gu.userid = userid;
						break;
						
					}
				
				}while(true);
				
				
			
			do {
				System.out.print("2. 암호 :");
				String passwd  = sc.nextLine();
							
				if(!MyUtil.isCheckPasswd(passwd)) {
					System.out.println("\n>> 암호는 8글자 이상 15글자 이하의 대문자,소문자,숫자, 특수기호가 혼합되어야만 합니다. <<\n");
				}
				
				else { 
					gu.passwd = passwd;
					break;
				}	
			}while(true);
			
			
			
			do {
				System.out.print("3. 성명 :");
				String name  = sc.nextLine();
				
				if(name != null && name.trim().isEmpty()){ // null이 아니면서 공백을 모두 제거하고 빈것이 아닌지
					System.out.println("\n>> 성명은 공백만으로 될 수가 없습니다. <<\n");
				}
				else {
					gu.name = name;
					break;
				}
			} while(true);
	
			
			
			do { // do while을 통해서, 바른 주민번호가 입력이 된 다음에 빠져나온다. 아니라면 제대로 입력할 때 까지 계속 돌아준다.
				System.out.print("4. 주민번호 앞의 7자리만 : "); // 아까 만든 주민번호 판독기 객체 사용
				String jubun  = sc.nextLine();
				
				if(gu.isCheckJubun(jubun)) { // 확인 후 올바른 주민번호라면 넣어준다.
					gu.jubun = jubun;
					break;
				}
				else {
					System.out.println(">>> "+jubun+"은 잘못된 주민번호 7자리 앞자리 입니다. <<<");
				}
			}while(true);
					
			//회원가입이 완료가 된 다음에는 배열속에 집어넣어줘야한다.
			
			guArr[Gujikja.count++] = gu;  // 생성 되어진 객체를 gu에 넣어준다. 
			// 5가 맥시멈이기 때문에 
			result = true; // 성공을 하면 ture를 넣어준다.
			
			
			
			
			
			}// end of if
	
			else {
				System.out.println("\n>>> 구직자 정원 마감으로 신규 회원 가입은 불가합니다. <<<\n");
			}
			
				return result;
				
				
		}

		// === 구직자 모두 보기 ===
		void showAll(Gujikja[] guArr) {
			
			for(int i=0; i<Gujikja.count; i++) {
				System.out.println(guArr[i].showInfo());
			}
			
			
			

		}
		
		// === 연령대에 해당하는 구직자 찾아보기 ===
		void search(int ageline, Gujikja[] guArr) {

			boolean isExists = false; // 찾는 연령대가 없는 경우에

			for(int i=0; i<Gujikja.count; i++) {            // 이런식으로 나이대를 추출해준다.
				if( guArr[i].getAge()/10*10 == ageline ) {  // 20          24           29          ==> 20
									  	                    // 20/10*10    24/10*10     29/10*10    ==> 20
					isExists = true;
					
				System.out.println(guArr[i].showInfo());
		
				}
			}// end of for---------------
	
			
			if(!isExists) {
				System.out.println("\n>> 검색하신 연령대"+ageline+"대는 없습니다.<<\n");
			}
			
			
		}
		
		
		// !!! === method 의 overloading (메소드의 오버로딩)==== !!!! //
		// ==> method 의 이름이 같더라도
		//     파라미터의 개수나 또는 파라미터의 순서나 파라미터의 타입이 다르면
		//     서로 다른 method로 인식한다.
		
		// === 성별로 구직자 찾아보기 ===
		   void search(String gender, Gujikja[] guArr) {
		      
		      for(int i=0; i<Gujikja.count; i++) {
		      
		         String n_gender = guArr[i].jubun.substring(6);
		         //     "1"   "2"   "3"   "4"
		         
		         if("남".equals(gender)) {
		            if("2".equals(n_gender) || "4".equals(n_gender)) {
		               continue;
		            }
		            else {
		               System.out.println(guArr[i].showInfo());
		            }
		         }
		         else {
		            if("1".equals(n_gender) || "3".equals(n_gender)) {
		               continue;
		            }
		            else {
		               System.out.println(guArr[i].showInfo());
		            }
		         }
		         


				
			}// end of for-------------

			
		}// end of void search (String gender, Gujikja[] guArr)

		   
		   // === 특정 연령대에 해당하는 회원중 특정 성별 회원만 출력해주는 메소드 생성하기 === //
		 void search(int ageline, String gender, Gujikja[] guArr) {
			 
			 // 20대인지~30대인지를 뽑아온다.
			 // 그 후 남자인지, 여자인지를 알아온다. &&을 써준다.
			 
			 for(int i=0; i<Gujikja.count; i++) {
				 											// 저장되어진 곳에서 가장 먼저 하나를 까보고(i), 연령대를 맞춰본다.
				 if( ageline != guArr[i].getAge()/10*10 ) { //연령대가 맞지 않으면 그 다음으로 넘어가면 된다.
				
					 continue;
				 }
				 else {
					 String n_gender = guArr[i].jubun.substring(6); 
					 //     "1"  "2"  "3"  "4"  
					 
					 if("남".equals(gender)) {
						 if("1".equals(n_gender) || "3".equals(n_gender)) {
							System.out.println(guArr[i].showInfo()); 
							 
						 }
					 }
					 else {
						 if("2".equals(n_gender) || "4".equals(n_gender)) {
								System.out.println(guArr[i].showInfo()); 
						 
						 }
					 }
				 }
				 
				 
			 } // end of for-----------------
			 
			
			 
			 
			
		}// end of  void search(int ageline, String gender, Gujikja[] guArr)
	
}
