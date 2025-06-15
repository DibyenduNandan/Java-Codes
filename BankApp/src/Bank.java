
public class Bank {

	//A private non parameterized constructor.
	private Bank() {

	}

	//A private String instance variable named bankName
	private String bankName;

	//A private static reference variable for the class Bank - bankObj 
	private static Bank bankObj;

	//A public static method getBankInstance that returns the single instance of the Singleton class, Bank	
	public static Bank getBankInstance() {
		if(bankObj==null) {
			bankObj=new Bank();
			}
		return bankObj;
	}
	// public setter and getter methods for bankName - public void setBankName(String bankName) and public String getBankName().

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public static Bank getBankObj() {
		return bankObj;
	}

	public static void setBankObj(Bank bankObj) {
		Bank.bankObj = bankObj;
	}
	
	


}
