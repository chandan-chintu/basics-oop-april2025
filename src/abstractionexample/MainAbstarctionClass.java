package abstractionexample;

public class MainAbstarctionClass {
    public static void main(String[] args) {
        // we cannot directly create object for abstract class

        AbstarctChildClass abstarctChildClass = new AbstarctChildClass();
        abstarctChildClass.demo1();
        abstarctChildClass.demo2();
    }


}
