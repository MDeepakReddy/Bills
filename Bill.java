package bill;

public class Bill {
	private int billId;
	private String billType;
	private String billStatus;
	private double billAmount;
	
	public Bill(int billId,String billType,String billStatus,double billAmount) {
		this.billId = billId;
		this.billType = billType;
		this.billStatus = billStatus;
		this.billAmount = billAmount;
	}
	
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public String getBillType() {
		return billType;
	}
	public String getBillStatus() {
		return billStatus;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

}
