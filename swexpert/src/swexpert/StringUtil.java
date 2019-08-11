package swexpert;

public class StringUtil {
	public String leftPad(String str, int size, char fillChar) {
		String addedChar = "";
		if(str.length() >= size) {
			return str;
		}
		for(int i = 0; i < size - str.length(); i++) {
			addedChar = addedChar + fillChar;
		}
		return addedChar + str;
	}
}
