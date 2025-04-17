package multilevel_inheritance;

public class Child2 extends Child1 {
public static void main(String[] args) {
Child2 obj =new Child2();
obj.display();
obj.disp();
}
	
	public void disp()
	{
		System.out.println("method of child 2");
	}
}
