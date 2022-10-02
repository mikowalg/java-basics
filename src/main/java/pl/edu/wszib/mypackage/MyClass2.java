package pl.edu.wszib.mypackage;

import pl.edu.wszib.MyClass;
import pl.edu.wszib.MyInterface;
import pl.edu.wszib.MyInterface2;

public class MyClass2 extends MyClass implements MyInterface, MyInterface2 {

    public MyClass myClass;

    @Override
    public void run() {
        field3 = "Field3 from extended";
//        myClass.run4();
        run3();
    }

//    @Override
//    public void run2() {
//        field3 = "Field3 from extended";
////        myClass.run4();
//        run4();
//    }

}
