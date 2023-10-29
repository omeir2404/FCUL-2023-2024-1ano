public class ex_2
{ 

	public static void main (String[] args) {
		System.out.println(passwordValida("ASDF1GHJK3GG"));
		
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
    return i > 0;
}

public static boolean isAlphanumeric(String s) {
    for (int i = 0; i < s.length(); i++) {
        if (!Character.isLetterOrDigit(s.charAt(i))) {
            return false;
        }
    }
    return true;
}
}