package corejava_basics;

public class SwitchBlockSample {

	public static void main(String[] args) {
		int daynumber = 5;
		switch(daynumber) {
		case 0 :
			System.out.println("sunday");
			break;
		case 1 :
			System.out.println("monday");
			break;
		case 2 :
			System.out.println("tuesday");
			break;
		case 3 :
			System.out.println("wednesday");
			break;
		case 4 :
			System.out.println("thursday");
			break;
		case 5 :
			System.out.println("friday");
			break;
		case 6 :
			System.out.println("saturday");
			break;
		case 7 :
			System.out.println("sunday");
			break;
		
		default :
			System.out.println("give the number range between 0 to 7");
			break;
		}
	}

}
