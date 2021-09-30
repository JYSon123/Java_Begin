package my.day05.a.SWITCH;

public class Sungjuk {
	
	
	// === field, attribute, property, 속성 === //
	String hakbun; // "091234" , int는 맨 앞 0 생략이라 String으로
	String name;
	byte kor;      // byte -128 ~ 127 , 0점에서 100점으로 제한을 둔다
	byte eng;      // byte -128 ~ 127 , 0점에서 100점으로 제한을 둔다
	byte math;     // byte -128 ~ 127 , 0점에서 100점으로 제한을 둔다
	short age;     // short -32768 ~ 32767   20 ~ 50 제한 
	
	// public Sungjuk() {}// 기본생정자
	
	
	
	
	
	
	
	// >>> operator, method, 기능, 행위 <<< //
	
	// === *** 유효성 검사하기(입력받은 데이터값이 올바른 값인지 틀린값인지를 검사하는 것) *** ===
	// 국어, 영어, 수학은 최저 점수가 0 부터 최대 점수가 100 이어야 한다.
	// 그 이외의 값은 받으면 안된다.
	boolean checkJumsu(byte jumsu) {   //checkJumsu는 인스턴스 메소드
		
		if( 0 <= jumsu && jumsu <= 100 ) {
			return true;
			
		}
		
		else {
			System.out.println("## 점수 입력은 0 이상 100 까지만 가능합니다. ##");
			return false;
		}
		
	}
		
	
	// === *** 유효성 검사하기(입력받은 데이터값이 올바른 값인지 틀린값인지를 검사하는 것) *** ===
	// 나이는 20 부터 50 까지만 가능하다.
	
	
		boolean checkAge(short age) {   
			
			
			
			
			if( 20 <= age && age <= 50 ) {
				return true;
				
			}
			
			else {
				System.out.println(" ## 나이 입력은 20 에서 50 까지만 가능합니다. ## ");
				return false;
		

		
				
				
		
		
	}// end of boolean checkAge(short age)----------------
	
		
	
		}
		


		 void showInfo() {
			 
			 short total = (short)(kor + eng + math);
			 
			 float avg = total/3.0F;
			 //float avg = Math.round(total/3.0F*10)/10.F; 이렇게도 가능하다
			 
			 
			 
			 String hakjum = "";
			 
			 
			 switch ((int)avg/10) {   
			 
			 
			 /*switch( ) 에서 ()속에 들어올 수 있는 타입은
			   long을 제외한 정수인 byte, short, int만 가능하다.  
			      또한 문자열은 char와 String만 가능하다 .
			 */
			
			 
			 // avg ==> 100.0  98.7   92.3   == "A"
			 // avg ==> 88.7  82.3   80.0    == "B"
			 // avg ==> 78.7  72.3   70.0    == "C"
			 // avg ==> 69.3  68.7   62.3    == "D"
			 // 그외 ==> "F"
			 
			 // Switch문에 넣기 위해서 int를 사용하여 소수부는 절삭하여 잘라버리자.
			 // avg ==> (int)100.0  (int)98.7   (int)92.3   == "A"
			 // avg ==>  100          98          92
			 // avg ==>  100/10       98/10       92/10
		     // avg ==>  10           9            9 
			 
			 
			 case 10:
			 case  9:  //case를 두개 쓰고, 그 사이에 break가 없으면 or 역할이라고 보면 된다.
				 hakjum = "A";
					break;
	
			 case 8:
				 hakjum = "B";
				  break;
				  
			 case 7:
				 hakjum = "C";
				  break;	  
		
			 case 6:
				 hakjum = "D";
				  break;	  
		  
			default:
				hakjum = "F";
			      break;
				
				
				} // end of switch() ---------------------------------
				/*
			  학점이 "A" 이라면 상품 : "놀이공원이용권, 치킨, 피자, 아이스크림"
		          학점이 "B" 이라면 상품 : "치킨, 피자, 아이스크림"
		          학점이 "C" 이라면 상품 : "피자, 아이스크림"
		          학점이 "D" 이라면 상품 : "아이스크림"
		          학점이 "F" 이라면 상품 : "꿀밤3대"
		    */
			 
		        	  
			 String gift = "";  // gift = gift + "놀이공원이용권,";
			                    // gift =  " " + "놀이공원이용권,";
			                    // gift = gift + "놀이공원이용권,";
			 
			 
			 switch (hakjum) {
			
			 case "A":
			     	gift += "놀이공원이용권,";
				
				
			 case "B":
					gift += "치킨,";
					
					
			 case "C":
					gift += "피자,";
					
					
			 case "D":
					gift += "아이스크림";
					break;	//break;를 만나야만 switch case 문을 빠져나간다.
		
			default:
				gift += "꿀밤3대";
				break;
				
				
			} // end of switch()--------------------------------------
			 
			 
			 

			System.out.println("\n=== "+ name +"님의 성적결과 ===\n"
			        +"1. 학번 : "+ hakbun +" \n"
			        +"2. 성명 : "+ name +" \n"
			        +"3. 국어: "+ kor +" \n"
			        +"4. 영어: "+ eng +" \n"
			        +"5. 수학: "+ math +" \n"
			        +"6. 총점: "+ total +"\n"
			        +"7. 평균: "+ Math.round(avg*10)/10.0 +"\n"
			        +"8. 학점: "+ hakjum +"\n"
			        +"9. 나이: "+ age+ "세 \n"  
			        +"10. 상품: "+ gift +"\n");
			 
	          
			
			
			
			
	      
		}// end of  void showInfo()

			
		}
	


