package les4;

public class CubeFunction {
	
	private int a, b, c;
	
	public static void main(String[] args) {
		
		CubeFunction y = new CubeFunction(2,3,7);
		y.calculate(10);

	}
	
	public float calculate(int x) {
				
		//y = a * x ^ 2 + b * x + c;
	
		for(int x1 = 0; x1 < x; x1++) {
			System.out.println(x1);
		}
		return x;
	}
	
	public CubeFunction(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
}