// create 5 variables, assign the value to those variables,
//and need to print the values to those variables
package package1;

public class solution3{
		int a,b,c,d,e;
		public solution3(int x1,int x2,int x3,int x4,int x5){
			a=x1;
			b=x2;
			c=x3;
			d=x4;
			e=x5;
		}
		public static void main(String[] args) {
			solution3 obj=new solution3(11,22,33,44,554);
			System.out.println("value of a first object:"+obj.a);
			System.out.println("value of a second object:"+obj.b);
			System.out.println("value of a third object:"+obj.c);
			System.out.println("value of a fourth object:"+obj.d);
			System.out.println("value of a fifth object:"+obj.e);
			
}
}

