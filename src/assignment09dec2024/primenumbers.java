package assignment09dec2024;

public class primenumbers {

	public String findprime(int input) {

		int i,a = 0;
		String value;
		a = input / 2;

		if (a == 0 || a == 1 ) {
			value = "prime number";
		} 
		else 
			for(i=2;i<a;i++ )
			if (a%i==0){
			value = "not prime number";
		}
		 else {
		     value = "not prime number";
		     return value;
		}
		return "prime number";

		
	}

	public static void main(String[] args) {
		primenumbers val = new primenumbers();
		String finalval = val.findprime(2);
		String finalval2 = val.findprime(3);
		String finalval3 = val.findprime(5);
		String finalval4 = val.findprime(9);
		String finalval5 = val.findprime(11);
		System.out.println("the number is "    + finalval);
		System.out.println("the number is "    + finalval2);
		System.out.println("the number is "    + finalval3);
		System.out.println("the number is "    + finalval4);
		System.out.println("the number is "    + finalval5);
		

	}
}