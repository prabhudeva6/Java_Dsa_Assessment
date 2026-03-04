package MODULE4;

class FinalClass {
    void show() {
        System.out.println("This is a final class.");
    }
}

class Parent {
    final int x = 100;
    final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {

    /*
    void display() {
        System.out.println("Trying to override final method");
    }
    */
}

public class Final {
    public static void main(String[] args) {


        final int y = 50;
        // y = 60;

        System.out.println("Final variable y: " + y);

        Child obj = new Child();
        obj.display();
        System.out.println("Final variable x: " + obj.x);

        FinalClass fc = new FinalClass();
        fc.show();
    }
}