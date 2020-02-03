import java.util.StringTokenizer;

class RaindropConverter {


	String convert(int number) {
		String converted = "";
		String factorString = "";
		for (int i = 1; i<= number; i++) {
			if (number % i == 0) {
				factorString += i + " ";
			}	
		}
		String[] splitFactors = factorString.split("\\s+");

		for (String factor : splitFactors) {
			switch (factor){
				case "3":
					converted += "Pling";
					continue;
				case "5":
					converted += "Plang";
					continue;
				case "7":
					converted += "Plong";
			}	
		}	

		return converted == "" ? Integer.toString(number) : converted;
	}

}
