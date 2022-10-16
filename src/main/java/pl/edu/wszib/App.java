package pl.edu.wszib;

import pl.edu.wszib.mypackage.MyClass2;

import static zad1.Shake.testMethod;

public class App
{

    public static void main(String[] args) {
        System.out.println("Hello word");

        MyClass myClass = new MyClass2();
        myClass.field2 = "Field2";
        myClass.field3 = "Field3";
        myClass.field4 = "Field4";
        myClass.run2();
        myClass.run3();
        myClass.run4();

        int testVar = 5;
        testMethod(testVar);
        System.out.println("testVar " + testVar);
    }

    //klasa to szablon a obiekt to przepis na realizacje

}
