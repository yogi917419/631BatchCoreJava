package corejava_basics;

import java.util.Scanner;

public class JavaTableUsingScanner {

	public static void main(String[] args) {
		int tableNum;
		//user will give tableNum value at run time
		//CLASSname reference name=new CLASSname();
		//System.in: console
		
		Scanner S = new Scanner(System.in);
		tableNum = S.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(tableNum + "*"+ i + "="+tableNum * i);
		}

	}

}
