package package1;

public class ABC {
	public ABC()
	{
		System.out.println("default constructor");
	}
	public ABC(int x1,int x2)
	{ 
		this();
		System.out.println("two parametrized constructor");
	}
	public ABC(int w)
	{
		this(22,55);
		System.out.println("one parametrized constructor");
	}
	public static void main(String[] args) {
		ABC obj=new ABC(22);
	}
}
