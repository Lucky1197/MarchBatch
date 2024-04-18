package package1; 

public class Arithmetic31MarAss2 {
	public int multi(int a,int b) {
		int c=a*b;
		System.out.println("value of multiplication:"+c);
		return c;
	}
	public int add(int c,int d) {
		int e=c+d;
		System.out.println("value of addition:"+e);
		return e;
	}
	public int sub(int e,int f) {
		int g=e-f;
		System.out.println("value of subtraction:"+g);
		return g;
	}
	public int div(int h, int i) {
		int j=h/i;
		System.out.println("value of division:"+j);
		return j;
	}
	public static void main(String[] args) {
		Arithmetic31MarAss2 obj=new Arithmetic31MarAss2();
		int multiResult=obj.multi(10,2);
		int sumResult=obj.add(multiResult,2);
		int subResult=obj.sub(sumResult, 2);
		int multiResult2=obj.multi(subResult,2);
		obj.div(multiResult2, 2);
	}


}

