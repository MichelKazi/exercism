class Hamming {

	char[] left;
	char[] right;

	Hamming(String leftStrand, String rightStrand) {
		if (leftStrand == "" && rightStrand != "")
			throw new IllegalArgumentException("left strand must not be empty.");
		if (rightStrand == "" && leftStrand != "")
			throw new IllegalArgumentException("right strand must not be empty.");
		if (leftStrand.length() != rightStrand.length())
			throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

		left = leftStrand.toCharArray();
		right = rightStrand.toCharArray();
	}

	int getHammingDistance() {
		int distance = 0;
		for (int i = 0; i < left.length; i++) {
			if (left[i] != right[i])
				distance++;
		}
		return distance;
	}

}
