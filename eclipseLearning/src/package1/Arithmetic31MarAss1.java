package package1;

public class Arithmetic31MarAss1 {
	public int sum(int a,int b) {
		int c=a+b;
		System.out.println("value of an sum:"+c);
		return c;
		}
	public int sub(int c, int d) {
		int e=c-d;
		System.out.println("value of an minus:"+e);
		return e;
	}
	public int multi(int e, int f) {
		int g=e*f;
		System.out.println("value of an multiplication:"+g);
		return g;
	}
	public int div(int g,int h) {
		int i=g/h;
		System.out.println("value of an division:"+i);
		return i;
	}
public static void main(String[] args) {
	Arithmetic31MarAss1 obj=new Arithmetic31MarAss1();
	int sumResults=obj.sum(10,2);
	int sumResults2=obj.sum(sumResults, 2);
	int subResult=obj.sub(sumResults2, 2);
	int multiResult=obj.multi(subResult, 2);
	obj.div(multiResult, 2);
}


}


