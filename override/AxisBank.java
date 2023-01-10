package override;

public class AxisBank extends BankInfo {

	public void DepositAmount() {
		System.out.println("Deposit amount");
	}
	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
		obj.DepositAmount();
		
		
	}
}
