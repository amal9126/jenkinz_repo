package abstraction;

public class Class2 extends Class1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Class2 obj=new Class2();
//obj.dispaly();
//obj.print();
//obj.disp();

Class1 obj=new Class2();
obj.dispaly();
obj.print();
//obj.disp();   error because method of child class
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
	System.out.println("abstract");	
	}
	public void disp()
	{
		System.out.println("method of class 2");
	}
}
