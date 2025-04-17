package abstr;

public class Class2 extends Class1{
public static void main(String[] args) {
	Class1 obj=new Class2();
	obj.display();
	obj.print();
	//obj.disp();
}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("abstract");
	}

	
	public void disp() {
		System.out.println("method of class 2");
	}

}
