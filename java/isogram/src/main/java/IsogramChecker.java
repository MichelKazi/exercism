import java.util.HashMap;
class IsogramChecker {

	boolean isIsogram(String phrase) {
		phrase = phrase.toLowerCase();
		char[] charPhrase = phrase.toCharArray(); // Turn string to array of chars for easy iteration
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char i : charPhrase){
			if (i == ' ' || i == '-'){
				continue;
			} // This really could've been regex'd
			if (!map.containsKey(i)){
				map.put(i, 1);
			}
			else {
				map.put(i, map.get(i) + 1);
			}
		}
		Integer[] values = map.values().toArray(new Integer[0]);

		for (int i : values){
			if (i>1) return false;
		}
		return true;	
	}

}
