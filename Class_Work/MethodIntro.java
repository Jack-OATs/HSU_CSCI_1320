public class MethodIntro {
	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		System.out.println("x = " + x);
		System.out.println("y = " + y);

		x = doubled(x);
		y = doubled(y);
		System.out.println("x = " + x);
		System.out.println("y = " + y);


	}
	
	public static int doubled(int x) {
		return x * 2;
	}
}