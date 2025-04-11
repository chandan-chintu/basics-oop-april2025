package classandobject;

import static classandobject.Sample.pqr;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello everyone, welcome to Spring1!!!");

        // creating the object of student class
        Student student1 = new Student();
        System.out.println("before assigning the values for student1 : "+student1);

        // assigning values
        student1.id=123;
        student1.name="Ajay";
        student1.address="123,djioc,owsidjcfv,hsjxk";
        student1.gender="male";
        student1.grade="9th grade B section";
        System.out.println("after assigning the values for student1 : "+student1);


        System.out.println("Examples for static ");
        Sample sample1 = new Sample();
        System.out.println("abc is : "+sample1.abc); // non static using object name accessing it
        System.out.println("pqr is : "+Sample.pqr); // static using class name accessing it

        sample1.demo1(); // non static using object name accessing it
        Sample.demo2();  // static using class name accessing it

        final int aaa=900;
        int bbb=333;
        System.out.println("aaa is "+aaa);
        System.out.println("bbb is "+bbb);

        bbb=888;
        System.out.println("bbb after change is "+bbb);
       // aaa=222; cannot change final
    }
}
