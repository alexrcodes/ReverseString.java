
public class ReverseString {

	public static void main(String[] args) {			// Set String r = to the result of the reverse method and the string connected

		String r = reverse("Alex is a great programmer!");
		System.out.println(r);
	}
	
	public static String reverse(String s) {			
		char[] letters = new char[s.length()];
														// Took the last character of String r and put it in the first index of String s
		int letterIndex = 0;							
		for(int i = s.length() - 1; i >= 0; i--) {
			letters[letterIndex] =  s.charAt(i);
			letterIndex++;
		}
		
		String reverse = "";							// Went 1 character at a time out of String s array to reverse the String characters of String r
		for(int i = 0; i < s.length(); i++) {
			reverse = reverse + letters[i];
		}
		
		return reverse;									// Returned the final reverse string back to the original method call(String r)
	}
}
