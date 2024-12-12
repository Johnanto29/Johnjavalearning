package assignment09dec2024;

public class palindrome {
	public String palindromecheck() {
	String str;str="hello";
	String palindrome;palindrome="";

	for(
	int i = str.length() - 1;i>=0;i--)palindrome+=str.charAt(i);
	System.out.println(palindrome);

	if(palindrome ==str)
	{

		System.out.println("The input is a palindrome");

	}else
	{
		System.out.println("The input is a not palindrome");
		
	}
return palindrome;
	} 

	public static void main(String[] args) {
		palindrome str = new palindrome();
				str.palindromecheck();
				
	}
}