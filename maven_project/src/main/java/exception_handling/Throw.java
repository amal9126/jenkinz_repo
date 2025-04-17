package exception_handling;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=3;
if(i>18)
{
	System.out.println("eligible");
}
else
{
	//System.out.println("not eligible");
	throw new ArithmeticException("error");
}
	}

}
