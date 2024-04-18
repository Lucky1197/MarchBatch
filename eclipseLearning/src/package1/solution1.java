// create 5 variables, assign the value to those variables,
//and need to print the values to those variables
package package1;

public class solution1 {
	
		int a,b,c,d,e;
		
		public static void main(String[] args) {
			solution1 obj=new solution1();
			obj.a=10;
			obj.b=12;
			obj.c=9;
			obj.d=90;
			obj.e=988;
			System.out.println(obj.a);
			System.out.println(obj.b);
			System.out.println(obj.c);
			System.out.println(obj.d);
			System.out.println(obj.e);
		}
}
// taking 10 calls for 5 objects if i want to take 20 objects 
//it will totally gives 200 calls it is not feasible 