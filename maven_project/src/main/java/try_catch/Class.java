package try_catch;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;

try
{
	int b=a/0;   //ArithmeticException: / by zero
}
catch(Exception ae)
{
	int b=a/2;
System.out.println(b);
System.out.println(ae);
}
	}

}
