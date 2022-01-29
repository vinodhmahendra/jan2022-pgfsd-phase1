
public class NumericLiterals {

	public static void main(String[] args) {
		long creditCardNumber = 1234_5678_9012_3456L; //readability
		long socialSecurityNumber = 999_99_9999L;
		long hexBytes =  0XFF_EC_DE_5E;

		int x = 1_2;
		
		System.out.println(hexBytes);
		
		
//		byte ,what is the range ?
		
		float  f;
		f = Float.MIN_VALUE;
		System.out.println(f);
		f = Float.MAX_VALUE;
		System.out.println(f);
		
		
		System.out.println(Character.MAX_VALUE  + "  to "  + Character.MIN_VALUE);
	}

}
