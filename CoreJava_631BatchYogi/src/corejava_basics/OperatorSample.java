package corejava_basics;

public class OperatorSample {

	public static void main(String[] args) {
		int a = 90;
		int b = 80;
		int c = 89;
		if (a > b || b > c) {
			System.out.println("if block ****");
		}else {
			System.out.println("else block ****");
		}
		if(a > b && b > c) {
			System.out.println("if block");
	}	else {
			System.out.println("else block");
	}

	}

}
