package my.day11.a.abstraction;

public class Gu {
	
	
	
	
	void search(String gender, Gujikja[] guArr) {
		
		for(int i=0; i<Gujikja.count; i++) {
			
			String n_gender = guArr[i].jubun.substring(6);
			
			if("남".equals(gender)) {
				if("2".equals(n_gender) || "4".equals(n_gender)) {
					continue;
				}
				else {
					System.out.println(guArr[i].showInfo());
				}
			}
			else {
				if("여".equals(gender)) {
					if("1".equals(n_gender) || "3".equals(n_gender)){
						continue;
					}
				}
			}
			
			
			
		}// end of for
		
		
	}// end of void search(String gender, Gujikja[] guArr)

}
