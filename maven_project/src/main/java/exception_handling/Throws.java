package exception_handling;

public class Throws {

	public static void main(String[] args)
	{ 
	number(5,0);
	}
		// TODO Auto-generated method stub
public static void number(int a,int b) throws ArithmeticException
{
	int c=a/b;
	System.out.println(c);
}
	

}
