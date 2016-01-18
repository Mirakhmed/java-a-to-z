package les5;

public class ArraysOne {
	public static void main(String[] args) {
		String[] str = new String[] {"nick", "git", "comp", "nick", "one", "git"};
		
		for(int i =0; i < str.length; i++) {
			str[i] = str[i] ? str[i] : null;
		}
	}
}