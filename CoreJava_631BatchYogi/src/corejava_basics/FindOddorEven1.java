package corejava_basics;

public class FindOddorEven1 {

	public static void main(String[] args) {
		int number = -1;
		if(number % 2==0) {
			System.out.println("the number is even");
		}
		else if(number % 2==1){
			System.out.println("the number is odd");
		}
		else {
			System.out.println("enter a valid number format");
		}

	}

}
