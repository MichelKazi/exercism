class ReverseString {

    String reverse(String inputString) {
			String rev = "";
			for (int i = inputString.length(); i > 0; i--) {
				rev += inputString.charAt(i-1);	
			}
			return rev;
    }
  
}
