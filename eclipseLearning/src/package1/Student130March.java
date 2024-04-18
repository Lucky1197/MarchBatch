package package1;

public class Student130March {
	int rollno;
	int age;
public void method() {
	System.out.println("welcome to all of you");
	System.out.println("Automation is very easy");
}
public static void main(String[] args) {
	Student130March ref_var= new Student130March();
	ref_var.rollno=123;
	System.out.println("value of rollno variable:"+ref_var.rollno);
	ref_var.age=26;
	System.out.println("value of age variable:"+ref_var.age);
	ref_var.method();
}
}
