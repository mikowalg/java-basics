package pl.edu.wszib;

public abstract class MyClass implements MyInterface {
    //modyfikatory dostepu
    // private
    //
    // protected
    // public
    //
    //
    //
    //

    private String field1;

    String field2;

    protected String field3;

    public String field4;

    public abstract void run();

    private void run1() {
        System.out.println("Field1 = " + field1);
    }
     void run2() {
         System.out.println("Field2 = " + field2);
    }
    protected void run3() {
        System.out.println("Field3 = " + field3);
    }
    public void run4() {
        System.out.println("Field4 = " + field4);
        run1();
    }


}
