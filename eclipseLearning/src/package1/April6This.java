package package1;

public class April6This {
	public April6This(int a,int b,int c) {
		System.out.println("three parameterized constructor");
	}
	public April6This() {
		this(100,90,87);
		System.out.println("default constructor");
	}
	public April6This(int q,int r, float p,int y) {
		this();
		System.out.println("four parameterized constructor");
	}
	public April6This(int h) {
		this(23,45,67,90);
		System.out.println("one parametrized constructor");
	}
	public April6This(int z,int o) {
		this(23);
		System.out.println("two parameterized constructor");
	}
	public static void main(String[] args) {
		April6This obj= new April6This(90,87);
	}
}
