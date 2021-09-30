package my.day10.b.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarMain {

	public static void main(String[] args) {
		
		// 자바에서 날짜를 나타낼때는 Date, Calendar 를 사용한다.
	      
	      // === 1. Date 클래스를 사용하여 현재시각 나타내기 === 
	      Date now = new Date(); // 현재시각 
	      
	      SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	      
	      
	      System.out.println("▷  현재시각 1 => " + now);
	      // ▷  현재시각 1 => Wed Jun 30 14:10:10 KST 2021
	      
	      System.out.println("▷  현재시각 2 => " + sdformat.format(now));
	      // ▷  현재시각 2 => 2021-06-30 14:11:13
	      
	      String currentTime = String.format("%tF %tT %tA %tZ", now, now, now, now); 
	      System.out.println("▷  현재시각 3 => " + currentTime);
	      // ▷  현재시각 3 => 2021-06-30 14:14:05 수요일 KST
	      
	      /*
	         <참고>
	                 날짜 타입 format         설명
	        --------------------------------------------------
	         %tF              날짜를 yyyy-mm-dd 형식으로 포맷해주는 것
	         %tT              날짜의 시각을 HH:MM:SS 형식으로 포맷해주는 것  
	         %tp              오전, 오후를 출력
	         %tA              요일명 출력
	         %tY              4자리 년도만 출력
	         %tB              월의 이름(January, February ...)출력
	         %tm              월의 01,02,03 ~~ 10,11,12 로 출력
	         %td              일수를 1~31 로 출력
	         %te              %td와 동일함
	         %tk              시간을 0~23 으로 출력
	         %tl              시간을 1~12 으로 출력
	         %tM              분을 00~59 으로 출력
	         %tS              초를 00~59 으로 출력
	         %tZ              타임존을 출력(한국은 KST로 나옴).
	      */
	   
	   System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");  
		
	   /* 
	      Date 클래스 보다 조금더 향상시켜서 나온 것이 Calendar 클래스이다.
	            간단한 날짜표현에는 Date 클래스를 사용하는 것이 더 나을 수 있으며,
	            두개 날짜사이의 날짜연산을 할 경우에는 메소드기능이 더 많이 추가된 
	      Calendar 클래스를 사용하는 것이 나을 수 있다.
	   */ 
	   
		   Calendar currentDate = Calendar.getInstance(); 
		   // 현재날짜와 시간을 얻어온다.
		   
		   int year = currentDate.get(Calendar.YEAR);
		   
		   int month = currentDate.get(Calendar.MONTH)+1; // 0 ~ 11 
		   
		   String strMonth = (month<10)?"0"+month:String.valueOf(month);
		  
		   /* 
		         주의해야할 것은 get(Calendar.MONTH)로 얻어오는 값의 범위가 1~12가 아닌, 0~11 이라는 것이다. 
		         그래서 get(Calendar.MONTH)로 얻어오는 값이 0이면 1월을 의미하고 11이면 12월을 의미한다.
		         그러므로 현재월을 표현하려면 ( currentDate.get(Calendar.MONTH) + 1 ) 으로 해야한다. 
		         괄호없이 currentDate.get(Calendar.MONTH) + 1로 하면 이상한 값이 나온다. (괄호유무조심!!) 
	       */
		   
		   System.out.println("올 해의 년도 : " + year);
		   System.out.println("월(1~11, 1:1월) : " + strMonth);
		   
		   System.out.println("이 해의 몇 째 주: " + currentDate.get(Calendar.WEEK_OF_YEAR));
		   System.out.println("이 달의 몇 째 주: " + currentDate.get(Calendar.WEEK_OF_MONTH));
		
		   // 아래의 Calendar.DATE 와 Calendar.DAY_OF_MONTH 는 같은 것이다.
		   int day = currentDate.get(Calendar.DATE);
		   String strDay = day<10?"0"+day:String.valueOf(day);
		    
		   System.out.println("이 달의 몇 일: " + currentDate.get(Calendar.DATE));
		   System.out.println("이 달의 몇 일: " + currentDate.get(Calendar.DAY_OF_MONTH));
		   System.out.println("이 달의 몇 일: " + strDay);
		   System.out.println("이 해의 몇 일: " + currentDate.get(Calendar.DAY_OF_YEAR));
		
		   
		   // 1:일요일, 2:월요일, 3:화요일, 4:수요일, 5:목요일, 6:금요일, 7:토요일
		   System.out.println("요일(1~7, 1:일요일): " + currentDate.get(Calendar.DAY_OF_WEEK)); 
		   System.out.println("이 달의 몇 째 요일: " + currentDate.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		   
		   
		   String dayname = "";
		    switch (currentDate.get(Calendar.DAY_OF_WEEK)) {
		         case 1:
		            dayname = "일";
		            break;
		   
		         case 2:
		            dayname = "월";
		            break;
		            
		         case 3:
		            dayname = "화";
		            break;   
		            
		         case 4:
		            dayname = "수";
		            break;   
		            
		         case 5:
		            dayname = "목";
		            break;   
		            
		         case 6:
		            dayname = "금";
		            break;
		            
		         case 7:
		            dayname = "토";
		            break;   
		      }
		    
		    System.out.println("오늘은 " + dayname + "요일 입니다.");
		    // 오늘은 수요일 입니다.
		   
		    
		    
		    System.out.println("오전_오후(0:오전, 1:오후): " + currentDate.get(Calendar.AM_PM));
		    System.out.println("시간(0~11): " + currentDate.get(Calendar.HOUR));
		    System.out.println("시간(0~23): " + currentDate.get(Calendar.HOUR_OF_DAY));
		    System.out.println("분(0~59): " + currentDate.get(Calendar.MINUTE));
		    System.out.println("초(0~59): " + currentDate.get(Calendar.SECOND));
		    System.out.println("1000분의 1초(0~999): " + currentDate.get(Calendar.MILLISECOND));
		    
		    
		    // 천분의 1초를 시간으로 표시하기 위해 3600000으로 나누었다.(1시간 = 60 * 60초)
		    System.out.println("TimeZone(-12~+12): " + (currentDate.get(Calendar.ZONE_OFFSET)/(60*60*1000))); 
		    
		    
		 // 이 달의 마지막 일을 찾는다.
		    System.out.println("이 달의 마지막 날: " + currentDate.getActualMaximum(Calendar.DATE) );
		    
		    System.out.println("");
		      
		    String today = year+"-"+strMonth+"-"+strDay;
		    today += " " + currentDate.get(Calendar.HOUR_OF_DAY) +":"+ ( currentDate.get(Calendar.MINUTE)<10?"0"+currentDate.get(Calendar.MINUTE):currentDate.get(Calendar.MINUTE) ) +":"+ ( currentDate.get(Calendar.SECOND)<10?"0"+currentDate.get(Calendar.SECOND):currentDate.get(Calendar.SECOND) );         
		    
		    switch (currentDate.get(Calendar.DAY_OF_WEEK)) {
		         case 1:
		            today += " 일요일";
		            break;
		         case 2:
		            today += " 월요일";
		            break;   
		         case 3:
		            today += " 화요일";
		            break;
		         case 4:
		            today += " 수요일";
		            break;
		         case 5:
		            today += " 목요일";
		            break;
		         case 6:
		            today += " 금요일";
		            break;   
		         case 7:
		            today += " 토요일";
		            break;
		      }
		    
		    System.out.println("현재는 " + today + " 입니다.");
		    
		    // === 현재시각 나타내기 === //
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    System.out.println("현재시각 => " + dateFormat.format(currentDate.getTime()));
		         
		    // === 내일시각 나타내기 === //
	        currentDate = Calendar.getInstance(); 
	        currentDate.add(Calendar.DATE, 1); 
	        System.out.println("내일시각 => " + dateFormat.format(currentDate.getTime()));
	       
	        // === 어제시각 나타내기 === //
	        currentDate = Calendar.getInstance(); 
	        currentDate.add(Calendar.DATE, -1); 
	        System.out.println("어제시각 => " + dateFormat.format(currentDate.getTime()));
	       
	        // === 1개월 후시각 나타내기 === //
	        currentDate = Calendar.getInstance(); 
	        currentDate.add(Calendar.MONTH, 1); 
	        System.out.println("1개월후 시각 => " + dateFormat.format(currentDate.getTime())); 
	       
	        // === 1시간 후시각 나타내기 === //
	        currentDate = Calendar.getInstance(); 
	        currentDate.add(Calendar.HOUR_OF_DAY, 1); 
	        System.out.println("1시간후 시각 => " + dateFormat.format(currentDate.getTime())); 
	        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	        
	        
	        // === 퀴즈 : 현재시각으로 부터 1년 2개월 3일 4시간 5분 6초 뒤를 나타내세요 === // 
	        currentDate = Calendar.getInstance();
	        System.out.println("현재시각 => " + dateFormat.format(currentDate.getTime()));
	        // 현재시각 => 2021-06-30 15:04:02
	        
	        // 현재시각으로 부터 1년 2개월 3일 4시간 5분 6초 뒤  => 2022-09-02 19:08:09 //
	        	 
	        
	        currentDate.add(Calendar.YEAR, 1);
	        currentDate.add(Calendar.MONTH, 2);
	        currentDate.add(Calendar.DATE, 3);
	        currentDate.add(Calendar.HOUR_OF_DAY, 4);
	        currentDate.add(Calendar.MINUTE, 5);
	        currentDate.add(Calendar.SECOND, 6);
	        
	        
	        
	        System.out.println("현재시각으로 부터 1년 2개월 3일 4시간 뒤 => " + dateFormat.format(currentDate.getTime()));
	        
	        
	        
	        
	        
	        
	}// end of main(String[] args)----------------

}
