import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class User {
	public String calculateUserRating(String userDetails) {
		//Fill the code here 
		String a[]=userDetails.split(":",-1);
		try {
			DateFormat obj=new SimpleDateFormat("dd/MM/yyyy");
			obj.setLenient(false);
			obj.parse(a[1]);
		}
		catch(ParseException e) {
			return "Error:Invalid date format. Thanks for using the application";
		}
		try {
			int userId=Integer.parseInt(a[2]);
		}catch(NumberFormatException e) {
			return "Error:Invalid Input. Thanks for using the application";
		}
		if(a.length<4)
			return "Error:No Ratings Provided leads to division By Zero. Thanks for using the application";
		String ans="";
		double count=0;
		for(int i=3;i<a.length;i++)
			count+=Double.parseDouble(a[i]);
		count=count/(a.length-3);
		count=count*10;
		double ans2=(int)count/10.0;
		ans+="Overall rating of the user "+ans2+" Thanks for using the application";
//		ans+="Error: Invalid date format.";
		return ans;
	}

}

