package calcpack;

public class calc {
	
	public int add(int a, int b) {
		int c= a+b;
		return c;

	}

	public static void main(String[] args) {
		int i=5;
		int j=10;
		calc obj = new calc();
		int Result = obj.add(i,j);
		System.out.println(Result);
	}

}
