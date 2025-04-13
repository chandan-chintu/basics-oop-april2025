package interfaceexample;

public interface SampleInterface {

    // all the variables inside interface are public static and final(Constant)
    public int abc=700;
    public final int xyz =900;

    // by default all methods in the interface are abstract only
    public void demo1();
    public abstract void demo2();
}
