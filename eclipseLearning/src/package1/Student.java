package package1;

public class Student {
	int rishi;// variable name rishi

public void adc()// method name adc()
{
	System.out.println("welcome to all of you");
}
public static void main(String[] args) {
	Student xyz= new Student();
	xyz.rishi=11;// calling variable in the main method with reference-variable
	System.out.println("value of rishi variable:"+ xyz.rishi);
	xyz.adc();// calling method in the main method using refernce-variable
}
}