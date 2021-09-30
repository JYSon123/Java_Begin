package my.day03.d.scanner;

import java.util.Scanner;

public class Scanner3Main {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
        String str_num = "";

        try {
        
        
				System.out.print("첫번째 정수를 입력하세요 => "); 
				str_num = sc.nextLine(); // "이순신" "10" , 찌꺼기 다 비우는 용도
				int num1 = Integer.parseInt(str_num); //
				// str_num 문자열 (String)을 int 타입으로 형변환 시켜주는 static 메소드이다.
				
				
				
				System.out.print("두번째 정수를 입력하세요 => "); 
				str_num = sc.nextLine(); //"20" "똘똘이:
				int num2 = Integer.parseInt(str_num);//20
				// str_num2 문자열 (String)을 int 타입으로 형변환 시켜주는 static 메소드이다.
				
				
		
				System.out.println(num1 + "+" +  num2 +  "=" + (num1 + num2)); //30

				System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

				
				System.out.print("첫번째 실수를 입력하세요 => "); 
				str_num = sc.nextLine(); // "이순신" "10.5" , 찌꺼기 다 비우는 용도
				double db1 = Double.parseDouble(str_num);
				// str_num 문자열 (String)을 double 타입으로 형변환 시켜주는 static 메소드이다.
				
				System.out.print("두번째 실수를 입력하세요 => "); 
				str_num = sc.nextLine(); // "똘똘이" "20.4"
				double db2 = Double.parseDouble(str_num);
				// str_num 문자열 (String)을 double 타입으로 형변환 시켜주는 static 메소드이다.
				
				
				System.out.println(db1 + "+" +  db2 +  "=" + (db1 + db2)); //30.9

				
				
        } catch(NumberFormatException e) {
				System.out.println(str_num + "은(는) 올바른 숫자가 아닙니다.");
       
        } 


		sc.close();
		
		
		
		
		
		
		
		

	}// end of main(String[] args)----------------------------

}
