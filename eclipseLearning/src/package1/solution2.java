// create 5 variables, assign the value to those variables,
//and need to print the values to those variables
package package1;

public class solution2 {
		int a,b,c,d,e;
		public void method1(int x1,int x2,int x3,int x4,int x5) {
			a=x1;
			b=x2;
			c=x3;
			d=x4;
			e=x5;
		}
		public static void main(String[] args) {
			solution2 obj= new solution2();
			obj.method1(12, 120, 105, 1110, 50);// assigning the value
			System.out.println("value of a:"+obj.a);// printing the calls
			System.out.println("value of b:"+obj.b);
			System.out.println("value of c:"+obj.c);
			System.out.println("value of d:"+obj.d);
			System.out.println("value of e:"+obj.e);
		}
}
//here we created the method(method1),
//in this scenario total calls are 6(1 for assigning and 5 for printing) 