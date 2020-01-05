
public class PrintZFigure {
public static void main(String[] args) {

		int number = 5;
		 for (int i = 0; i < number; i++) {
		        System.out.print("*");
		    }
		    System.out.println();
		    for (int i = 0; i < number - 2; i++) {
		        System.out.print("*");
		        for (int j = 0; j < number - 2; j++) {
		            System.out.print(" ");
		        }
		        System.out.println("*");
		    }
		    for (int i = 0; i < number ; i++) {
		        System.out.print("*");
		    }
		    System.out.println();
}

}


