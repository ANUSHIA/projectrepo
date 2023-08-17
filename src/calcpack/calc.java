package calcpack;

public class calc {
	
	public int add(int a, int b) {
		int c= a+b;
		return c;

	}
	
	public int sub(int a, int b) {
		int c= a-b;
		return c;

	}

	public static void main(String[] args) {
		int i=5;
		int j=10;
		calc obj = new calc();
		int Result = obj.add(i,j);
		int Result1 = obj.sub(j,i);
		System.out.println(Result);
		System.out.println(Result1);
	}

}
