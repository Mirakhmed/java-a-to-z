package les5;

public class ArrayExample {
	public static void main(String[] args) {
		String[] values = new String[10];
		values[0] = "zero";
		values[1] = "first";
		values[2] = "second";
		
		System.out.println(values[0]);
		
		String[] names = new String[] {"petr", "nick", "etc"};
		
		for(int i = 0; i != names.length; i++) {
			System.out.println(names[i]);
		}
	}
}