package Practice;

public class C extends B {
public static void main(String[] args) {
	C b =new C(10,"stya");
	b.test1();
	b.test2();
	b.test3();
	
}
	public C(int a, String b) {
		super(a, b);
		
	}
	@Override
	public void test1() {
		System.out.println("test1");
		
	}

}
