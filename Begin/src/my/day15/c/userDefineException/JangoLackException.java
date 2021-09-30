package my.day15.c.userDefineException;


    //== 사용자(개발자)가 정의하는 예외(익셉션)절 클래스 만들기 == //
	/* 
	  1. Exception 클래스를 상속받아야 한다.
	  2. 생성자내에서 예외메시지(오류메시지)를 등록해주면 끝난다. 
	 */

public class JangoLackException extends Exception {

	private static final long serialVersionUID = 1L; // 자동으로 호출이 되는데, 빼도 아무 문제가 없다.
	
	// 기본생성자
	public JangoLackException() {
		super(">> 잔고량이 주문량 보다 적으므로 주문이 불가하다.!! <<"); 
	}
	
	
	// 파라미터가 있는 생성자
	public JangoLackException(String errMsg) {
		super(errMsg);
		}
		
	
	
	
}
