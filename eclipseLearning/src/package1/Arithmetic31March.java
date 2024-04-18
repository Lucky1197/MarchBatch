package package1;

public class Arithmetic31March {
	public int sum(int a,int b) {
		 int c=a+b;
		 System.out.println("Addition of two values:"+c);
		return c;
	}
	public int sub(int x,int y) {
		int z=x-y;
		System.out.println("Minus of two values:"+z);
		return z;
	}
	public void multi(int d,int e) {
		int result;
		result=d*e;
		System.out.println("final result is:"+result);
		}
	public static void main(String[] args) {
		Arithmetic31March obj= new Arithmetic31March();
		int sumResult=obj.sum(10,20);
		int subResult=obj.sub(10, 3);
		obj.multi(sumResult, subResult);
	
	}
	
}
