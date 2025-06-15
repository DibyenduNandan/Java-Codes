import java.util.Scanner;
public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Fill the code here 
		System.out.println("Enter the user details");
		User ob=new User();
		String st=sc.nextLine();
		String ans=ob.calculateUserRating(st);
		System.out.println(ans);
		
	}
}
