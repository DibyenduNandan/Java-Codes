import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bank Name");
		
		//fill code here
		String a=sc.nextLine();
		Bank obj=Bank.getBankInstance();
		obj.setBankName(a);
		System.out.println("Bank nameis "+obj.getBankName());

	}

}
