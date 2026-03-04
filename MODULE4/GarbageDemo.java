package MODULE4;

class GarbageDemo {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collected!");
    }

    public static void main(String[] args) {

        // Creating objects
        GarbageDemo obj1 = new GarbageDemo();
        GarbageDemo obj2 = new GarbageDemo();

        obj1 = null;
        obj2 = null;

        System.gc();

        System.out.println("End of main method");
    }
}