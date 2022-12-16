package corejava_basics;

public class Assignment1_FindAgeGroup {
	
				
	public static void main(String[] args) {
		//Assignment-1
				//===============
						//Find the Age group based on the given number By using if-else block
						//int age = 19;
						// 0<=2 infant
						// 2<=12 Child
						// 12<=25 youth
						// 25<=59 adult
						// 59<=100  senior citizen
				
				
				int age = -10;
				if(age>0 && age<=2){
					System.out.println("person comes under infant group");
				}else if(age>2 && age<=12){
					System.out.println("person comes under child group");
				}else if(age>12 && age<=25){
					System.out.println("person comes under youth group");
				}else if(age>25 && age<=59){
						System.out.println("person comes under adult group");
				}else if(age>59 && age<=100){
					System.out.println("person comes under senior citizen group");
				}else {
					System.out.println("please give a age value in between 0 to 100");
				}
					
		

	}

}
