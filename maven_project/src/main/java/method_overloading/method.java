package method_overloading;

public class method {
public static void main(String[] args) {
display(2,3);
display(5.0f,2.0f);
}

	public static void display(int a,int b)
	{
		int c =a+b;
		System.out.println(c);
	}
	public static void display(float d,float e)
	{
		float f=d*e;
		System.out.println(f);
	}
}


