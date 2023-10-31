public class ex_2
{ 

	public static void main (String[] args) {
		System.out.println(passwordValida("12345678"));
	}

	public static boolean passwordValida(String s) {
		if (s.length() == 8 && isAlphanumeric(s) && countNums(s)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean countNums(String s) {
		int i = 0;
		for (int j = 0; j < s.length(); j++) {
			if (Character.isDigit(s.charAt(j))) {
				i++;
			}
		}
		if (i > 2) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isAlphanumeric(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetterOrDigit(s.charAt(i)))
			{
				return false;
			}
		}
		return true;
	}
}