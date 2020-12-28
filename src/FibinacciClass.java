
public class FibinacciClass {

	
	public static void main(String[] args) {
		int sequence = createSequence(10);
		System.out.println("The fibinacci sequence is: " + sequence);
		System.exit(0);
	}
	
	private static int createSequence(int number) {
		int num1 = 0;
		int num2 = 1;
		int retVal = 0;
		
		while (number < 0 ) {

			retVal = num1 + num2;
			num1 = num2;
			num2 = retVal;
		}
		
		return retVal;
	}
}


//1 1 2 3 5 8 13 21 34 55 89


// 1 + 0  1 +  1  1 + 2  