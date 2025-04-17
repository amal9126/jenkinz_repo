package multiple_inheritance;

public class Child implements Parent1,Parent2{

public static void main(String[] args) {
Child obj=new Child();
obj.display();
obj.disp();

	}
public void display()
{
	System.out.println("method of parent 1");
}

public void disp()
{
	System.out.println("method of parent 2");
}
}
