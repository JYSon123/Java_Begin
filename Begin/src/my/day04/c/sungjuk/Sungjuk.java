package my.day04.c.sungjuk;

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
			 if(avg >= 90)        hakjum = "A";	 
			 else if(avg >= 80)   hakjum = "B";	 
			 else if(avg >= 70)   hakjum = "C";	 
			 else if(avg >= 60)   hakjum = "D";
			 else                 hakjum = "F";
			 
			 
			 
			 

			System.out.println("\n=== "+ name +"님의 성적결과 ===\n"
			        +"1. 학번 : "+ hakbun +" \n"
			        +"2. 성명 : "+ name +" \n"
			        +"3. 국어: "+ kor +" \n"
			        +"4. 영어: "+ eng +" \n"
			        +"5. 수학: "+ math +" \n"
			        +"6. 총점: "+ total +"\n"
			        +"7. 평균: "+ Math.round(avg*10)/10.0 +"\n"
			        +"8. 학점: "+ hakjum +"\n"
			        +"9. 나이: "+ age+ "세 \n"  );
			 
	          
			
			
			
			
	      
		}// end of  void showInfo()

			
		}
	


