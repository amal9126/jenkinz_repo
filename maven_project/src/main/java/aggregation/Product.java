package aggregation;

public class Product {
int id;
String name;
Description obj;
public static void main(String[] args) {
		// TODO Auto-generated method stub
Description obj1=new Description("name",10);
Product obj2=new Product(1,"p_name",obj1);	
obj2.display();
	}
public Product(int id, String name, Description obj) {
	super();
	this.id = id;
	this.name = name;
	this.obj = obj;
}
public void display()
{
	System.out.println(id);
	System.out.println(name);
	System.out.println(obj.productname);
	System.out.println(obj.quantity);

}

}
