interface xyz{
	class abc{
		public int display() {
			System.out.println("I am inner class");
			return 1;
		}
	}
}


public class Test {
	public static void main(String[] args) {
		String str="true";
		if(str)
			System.out.println(1);
		else {
			System.out.println(2);
		}
		xyz.abc obj=new xyz.abc();
		obj.display();
		String s="Computer";
		String s2="mputer";
		String s4="mputer";
		String s3=s.substring(2);
		System.out.println(s3);
		if(s4==s2)
			System.out.println("Two strings are equal");
		else
			System.out.println("Two strings are different");
	}
}
