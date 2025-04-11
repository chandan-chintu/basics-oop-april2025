package classandobject;

public class Sample {

    int abc =100; // non static variable
    static int pqr=200; // static variable

    public  void demo1(){
        System.out.println("demo1 non static method");
        pqr=300;
        demo2(); // static or non-static methods and static or non-static variables are allowed
        abc=400;
    }

    public static void demo2(){
        System.out.println("demo2 static method");
        //abc =500; - cannot be used as this is non static
        pqr=600; // inside static methods only static variables and methods are allowed
       // demo1();- cannot be used as this is non static
    }
}
