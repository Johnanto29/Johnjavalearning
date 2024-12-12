package assignment09dec2024;

public class reversestring {
	public static void main(String[] args) {
	String str;
	str = "hello";
	String reverse;
	reverse = "";

	for (int i = str.length() - 1; i >= 0; i--)
		reverse += str.charAt(i);
	System.out.println(reverse);

}
}