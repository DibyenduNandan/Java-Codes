import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CourierServiceMain {

	private Map<String,String> courierMap=new HashMap<String,String>();
	
	public Map<String, String> getCourierMap() {
		return courierMap;
	}

	public void setCourierMap(Map<String, String> courierMap) {
		this.courierMap = courierMap;
	}

	public int findTheCountOfCouriersBasedOnTheCourierType(String courierType) {
		//Fill the code
		Collection <String> a;
		a=courierMap.values();
		int count=0;
		for(String i:a) {
			if(i.equalsIgnoreCase(courierType))
				count+=1;
		}
		if(count==0)
			return -1;
		return count;
	}

	public List<String> findCourierIdsBasedOnTheCourierType(String courierType){
        //Fill the code
		List <String> ans=new ArrayList<String>();
		for(Map.Entry<String, String> i: courierMap.entrySet()) {
			String c=i.getValue();
			if(c.equalsIgnoreCase(courierType)) {
				ans.add(i.getKey());
			}
		}
		
		return ans;

	}

	public static void main(String args[]) {
	    //Fill the code 
		Scanner sc=new Scanner(System.in);
		CourierServiceMain ob=new CourierServiceMain();
		System.out.println("Enter number of records to be added");
		int n=sc.nextInt();
		sc.nextLine();
		Map<String,String> res=new HashMap<String,String>();
		System.out.println("Enter the records (Courier Id: Courier type)");
		while(n!=0) {
			String str=sc.nextLine();
			String a[]=str.split(":",-1);
			res.put(a[0],a[1]);
			n-=1;
		}
		ob.setCourierMap(res);
		System.out.println("Enter the Courier type to be searched");
		String ser=sc.nextLine();
		int ans1=ob.findTheCountOfCouriersBasedOnTheCourierType(ser);
		if(ans1==-1)
			System.out.println("No records were found for "+ser);
		else
			System.out.println("The records based on "+ser+" are "+ans1);
		System.out.println("Enter the Courier type to identify the Courier Ids");
		String id=sc.nextLine();
		List<String> ans2=ob.findCourierIdsBasedOnTheCourierType(id);
		if(ans2.size()==0)
			System.out.println("No Courier Ids were found for the "+id);
		else {
			System.out.println("Records based on the "+id+" are");
			for(String i:ans2)
				System.out.println(i);
			
		}
		
	}

}
