package interfaceexample;


public class SampleClass implements SampleInterface, SampleInterface2 {
    @Override
    public void demo1() {
        System.out.println("demo1 body inside sampleclass");
        System.out.println("abc is  : "+SampleInterface.abc);
    }

    @Override
    public void demo2() {
        System.out.println("demo2 body inside sampleclass");
        System.out.println("abc is  : "+SampleInterface.xyz);
    }

    @Override
    public void demo4() {
        System.out.println("demo4 body inside sampleclass");
    }

    @Override
    public void demo5() {
        System.out.println("demo5 body inside sampleclass");
    }
}
