package polymorphism;


class Par {
    public void disp(int a, int b) {
        System.out.println("Parent: a = " + a + ", b = " + b);
    }
}

public class Sample extends Par {

    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.disp(10, 20); // Calling the disp method with arguments
    }

    @Override
    public void disp(int a, int b) {
       super.disp(5, 6);  //Call the Parents's disp method
    	
    	System.out.println("Child: a = " + a + ", b = " + b);
        
    }
}
