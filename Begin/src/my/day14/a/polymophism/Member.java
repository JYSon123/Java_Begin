package my.day14.a.polymophism;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import my.util.MyUtil;

public abstract class Member {
	
		// Company,Gujikja 클래스가 공통 필드를 가질 수 있게 해줄것이다.
		
		// field 생성
		private String id;         // 아이디
		private String passwd;     // 암호
		private String name;       // 성명
		private String mobile;     // 연락처 
		
		
		static int count; // Gujikja 객체 (인스턴스) 및  Company(인스턴스)의 개수를 알아오려는 용도 
		
		
	// === getter, setter === 
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		
		// 5글자 이상 10글자 이하의 영문자 또는 숫자로 이루어져야 한다.
		
		// 정규표현식(Regular Expression)이란?
		// ==> 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰이는 형식언어
				
		// == 1. 정규표현식(Regular Expression) 패턴을 작성한다. == //
		//	Pattern p = Pattern.compile("^[A-Za-z0-9]{2,10}$");
		//  ^ 은 시작을 의미한다.
		//  $ 는 끝을 의미한다.
		//  [] 는 글자 1개가 들어오는 것을 의미한다.
		//  [A-Za-z0-9] 은 영문대문자 또는 영문소문자 또는 숫자가 들어온다는 뜻이다.
		//  [A-Za-z0-9]{2,10} 은 [A-Za-z0-9] 이 연속해서 2번 부터 10번 나온다는 뜻이다.
		
		Pattern p = Pattern.compile("^[A-Za-z0-9]{2,10}$");
				
		// == 2. 문자열이 주어진 정규식 패턴과 일치하는지 판별하는 객체를 생성한다. == //
		Matcher m = p.matcher(id);
		
		// == 3. 판별하도록 한다. == //
		// 주어진 정규식 패턴과 일치하면  true, 일치하지 않으면 false 를 리턴시켜준다.
		boolean bool = m.matches();
		
		if(bool)
			this.id = id;
		else {
			System.out.println("\n>> 아이디는 영문자 또는 숫자로 이루어진 5글자 이상 10글자 이하이어야 합니다. <<\n"); 
			this.id = null;
			
			
		}
	}

	public String getPasswd() {
		return passwd;
	}


	public void setPasswd(String passwd) {
		
		if(MyUtil.isCheckPasswd(passwd))
			this.passwd = passwd;
		else {
			System.out.println("\n>> 암호는 8글자 이상 15글자 이하의 영문대문자,소문자,숫자, 특수기호가 혼합되어야 합니다. <<\n");
			this.passwd = null;
		
		}
		}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		
		// 성명은 공백없이 한글로만 2글자 이상 5글자 이하까지만 이루어져야 한다.
		
		// 정규표현식(Regular Expression)이란?
		// ==> 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰이는 형식언어
				
		// == 1. 정규표현식(Regular Expression) 패턴을 작성한다. == //
		//	Pattern p = Pattern.compile("^[가-힣]{2,5}$");
		//  ^ 은 시작을 의미한다.
		//  $ 는 끝을 의미한다.
		//  [] 는 글자 1개가 들어오는 것을 의미한다.
		//  [가-힣] 은 한글만 들어온다는 뜻이다.
		//  [가-힣]{2,5} 은 [가-힣] 이 연속해서 2번 부터 5번 나온다는 뜻이다.
		
		Pattern p = Pattern.compile("^[가-힣]{2,5}$");
				
		// == 2. 문자열이 주어진 정규식 패턴과 일치하는지 판별하는 객체를 생성한다. == //
		Matcher m = p.matcher(name);
		
		// == 3. 판별하도록 한다. == //
		// 주어진 정규식 패턴과 일치하면  true, 일치하지 않으면 false 를 리턴시켜준다.
		boolean bool = m.matches();		
		
		if(bool)
			this.name = name;
		else {
			System.out.println("\n>> 성명은 공백없이 한글로만 2글자 이상 5글자 까지만 가능합니다. <<\n");
			this.name = null;
		
		}
	}
		
	public void setMobile(String mobile) {
			
			// 정규표현식(Regular Expression)이란?
			// ==> 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰이는 형식언어
					
			// == 1. 정규표현식(Regular Expression) 패턴을 작성한다. == //
			//	Pattern p = Pattern.compile("^[0123456789][0-9][01][0-9]{3}[1-4]$");
			//  ^ 은 시작을 의미한다.
			//  $ 는 끝을 의미한다.
			//  [] 는 글자 1개가 들어오는 것을 의미한다.
			//  [0123456789] 은 0 또는 1 또는 2 또는 ..... 8또는 9만 들어온다는 뜻이다.
			//  [0123456789] 은 [0-9] 와 같다.
			//  [0-9]{3} 은 [0-9] 이 연속해서 3번 나온다는 뜻이다.
			
			Pattern p = Pattern.compile("^[0][1][0][1-9]\\d{7}$");
			// [0-9] 와 \\d 는 같은 것이다.
			
			// == 2. 문자열이 주어진 정규식 패턴과 일치하는지 판별하는 객체를 생성한다. == //
			Matcher m = p.matcher(mobile);
			
			// == 3. 판별하도록 한다. == //
			// 주어진 정규식 패턴과 일치하면  true, 일치하지 않으면 false 를 리턴시켜준다.
			boolean bool = m.matches();
			
			if(bool) {
				this.mobile = mobile;
			}
			else {
				System.out.println("\n>> "+mobile+" 는 휴대폰 형식에 맞지 않습니다. <<\n");
				this.mobile = null;
			}
			
		}
	
		
		public String getMobile() {
			return mobile;
		}
		
		
		/////////////////////////////////////////////////////////////////////////////
		
		
		public abstract String showInfo(); // 추상메소드(==미완성메소드)
		
		
}
