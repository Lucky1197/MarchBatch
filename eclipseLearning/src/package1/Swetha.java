package package1;

public class Swetha
	{
		public Swetha() {
			System.out.println("Default constructor");
		}
		public Swetha(int a) {
			System.out.println("one parameterized constructor");
		}
		public Swetha(int x, int y) {
			System.out.println("two parameterized constructor");
		}
		public static void main(String[] args) {
			Swetha obj= new Swetha(12,567);
			Swetha obj1= new Swetha(12);
			Swetha obj2= new Swetha();
		}
}
