package A;

import java.text.DecimalFormat;

public class Company extends Member {

	
	private String jobType;
	private long seedMoney;

	
	
	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}



	public long getSeedMoney() {
		return seedMoney;
	}

	public void setSeedMoney(long seedMoney) {
		this.seedMoney = seedMoney;
	}



	@Override
	public String showInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
