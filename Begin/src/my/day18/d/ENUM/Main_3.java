package my.day18.d.ENUM;

public class Main_3 {

	public static void main(String[] args) {
		
		  Member_1 mbr1 = new Member_1();
	      mbr1.setName("어린이");
	      mbr1.setJubun("1910203");
	      
	      Member_1 mbr2 = new Member_1();
	      mbr2.setName("청소년");
	      mbr2.setJubun("0910204");
	      
	      Member_1 mbr3 = new Member_1();
	      mbr3.setName("성년");
	      mbr3.setJubun("9410201");

	      Member_1 mbr4 = new Member_1();
	      mbr4.setName("어르신");
	      mbr4.setJubun("4510202");
		
		  Member_1[] mbrArr = {mbr1, mbr2, mbr3, mbr4};
	      
		  
		  //   구성요소 : 배열명
		  for( Member_1 mbr: mbrArr) {
			 
			  System.out.println(mbr);
		//  또는
		//	  System.out.println(mbr.toString());
			  
			  int age = mbr.getAge();
			  
			  EntranceFee_2 entFee = null;  // entFee 객체의 인스턴스이다
			  
			  if(age < 10){
				  entFee = EntranceFee_2.CHILD;
			  }
			  else if( 10 <= age && age < 20){
				  entFee = EntranceFee_2.TEENAGER;
			  }
			  else if( 20 <= age && age < 70){
				  entFee = EntranceFee_2.ADULT;
			  }
			  else {
				  entFee = EntranceFee_2.OLD;
			  }
			  
			  System.out.println("4. 입장료 : " + entFee.getFee()+"원"); // 위에서 준 값이 나올것이다. 접근제한자가 getFee가 퍼블릭이니 이걸 통해 값을 가져온다.
			  System.out.println("");
		 
		  }// end of for----------------------------	   
		
	} // end of main(String[] args)

}
