package corejava_basics;

public class LoopingStatementsSample {

	public static void main(String[] args) {
		//print 1 to 10 numbers
				for (int i=1; i<=10; i++) 
				{
					System.out.println(i);
				}
				System.out.println("===============");
				
				for(int i=10; i>=1; i--) {
					System.out.println(i);
				}
				System.out.println("===============");
				
				//nested for loop
				
				for(int i=1; i<5; i++) {
					for(int j=1; j<=i; j++) {
						System.out.println(i+" ,"+j);
					}
				}
	}

}
