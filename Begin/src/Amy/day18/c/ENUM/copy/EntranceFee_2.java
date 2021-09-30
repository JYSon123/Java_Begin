package Amy.day18.c.ENUM.copy;

public class EntranceFee_2 {
	
	public static final EntranceFee_2 CHILD = new EntranceFee_2(0);
	public static final EntranceFee_2 TEENAGER = new EntranceFee_2(150);
	public static final EntranceFee_2 ADULT = new EntranceFee_2(300);
	public static final EntranceFee_2 OLD = new EntranceFee_2(100);
	

	private final int FEE;
	

	private EntranceFee_2(int fee) {
		
		this.FEE = fee;
		
	}
	
	public int getFee() {
		
		return FEE;
	
	}
	
	
		
}
	
	

