import javax.swing.JOptionPane;

public class IfElseIf {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Enter the month number: ");
		int monthNumber = Integer.parseInt(input);
		
//		Scanner keyboardScanner = new Scanner(System.in);
//		
//		System.out.println("Enter the month  number : ");
//		int monthNumber = keyboardScanner.nextInt();
		
		if ( monthNumber >= 1 && monthNumber <= 3 ) {
			System.out.println("You're in Quater 1");
		}else if ( monthNumber >= 4 && monthNumber <= 6) {
			System.out.println("You're in Quater 2");
		}else {
			System.out.println("You're not in the first half of the year!");
		}
	}
	
	
}
