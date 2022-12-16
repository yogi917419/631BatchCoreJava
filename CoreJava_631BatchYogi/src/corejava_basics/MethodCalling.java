package corejava_basics;

public class MethodCalling {

		public static void add() {
			int a = 10;
			int b = 21;
			System.out.println(a + b);
		}
		

		public static void main(String[] args) {
			System.out.println("hello");
			MethodCalling g = new MethodCalling();
			g.add();
			
			//add();
		}

	}


