class Parent{
	private int doWork() {
		System.out.println("Do-Work");
		return 1;
	}
}

class child extends Parent{
	//@Override
	public int doWork() {
		System.out.println("Child");
		return 0;
	}
}

public class practice {
	static {
		System.out.println(2);
	}
	public static void main(String[] args) {
		new child().doWork();
		//		int meal = 5;
		//		int tip = 2;
		//		int total = meal + (meal>6 ? tip++ : tip--);
		//		System.out.println(total+" "+tip);

		//		Integer i=new Integer(257);
		//		System.out.println(i.byteValue());
		//		int i1=new Integer(4);
		//		System.out.println(i.byteValue());
		//		float f=5.0;

		Super ob=new ThisUse(10);
		// this wil not work ob can accesss only overridden methods and parent class methods
//		ob.Show();
		ThisUse ans=(ThisUse)ob;
		ans.get();
//		ans.Show();
//		ThisUse ob=new ThisUse(10);
//		ob.get();

	}
}
class Super{
	int num=20;
	public void display() {
		System.out.println("Super class method");
	}

	public void get() {
		System.out.println("Personal method");
		display();
	}
}

class ThisUse extends Super{
	int num;
	public ThisUse(int num) {
		this.num=num;
	}

	@Override
	public void display() {
		System.out.println("Display Method");
	}

	public void Show() {
		this.display();
		super.display();
		display();
	}
}
