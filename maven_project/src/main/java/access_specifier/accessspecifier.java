package access_specifier;

public class accessspecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
accessspecifier obj=new accessspecifier();
obj.print();
obj.display();
obj.disp();
obj.prnt();
	}
public void print()
{
	System.out.println("public");
}
private void display()
{
	System.out.println("private");
}
protected void disp()
{
	System.out.println("protected");
}
void prnt()
{
	System.out.println("default");
}
}
