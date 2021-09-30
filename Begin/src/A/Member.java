package A;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import my.util.MyUtil;


public abstract class Member implements InterMember {

	
	private String id; 
	private String passwd;
	private String name; 
	private String mobile;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		
		Pattern p = Pattern.compile("^[A-Za-z0-9]{2,10}$");
		
		Matcher m = p.matcher(id);
		
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
			System.out.println("\n >> 암호는 8글자 이상 15글자 이하의 영문대문자,소문자,숫자, 특수기호가 혼합되어야 합니다. <<\n");
		}
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		
	
	Pattern p = Pattern.compile("^[가-힣]{2,5}$");
	
	Matcher m = p.matcher(name);
	
	boolean bool = m.matches();
	
	if(bool)
		this.name = name;
	else {
		System.out.println("\n>> 성명은 공백없이 한글로만 2글자 이상 5글자 까지만 가능합니다. <<\n");
		this.name = null;
	}
	
	
	}
	
	
	public String getMobile() {
		return mobile;
	}
	
	
	public void setMobile(String mobile) {
		
		Pattern p = Pattern.compile("^[0][1][0][1-9]\\d{7}$");
		
		Matcher m = p.matcher(mobile);
		
		boolean bool = m.matches();
		
		if(bool) {
			this.mobile = mobile;
		}
		else {
			System.out.println("\n>> "+mobile+" 는 휴대폰 형식에 맞지 않습니다. <<\n");
			this.mobile = null;
		}
		

		
	}
	
	
	
	
	
	
}
