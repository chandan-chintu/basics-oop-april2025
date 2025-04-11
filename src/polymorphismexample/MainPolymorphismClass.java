package polymorphismexample;

public class MainPolymorphismClass {
    public static void main(String[] args) {
        PerformSum performSum = new PerformSum();

        performSum.sum(12,34);
        performSum.sum(3,5,6);
        performSum.sum(4.33,55.66);
        performSum.sum(2.34f,34.56f);
        performSum.sum(12,3.44f,5.66);
    }
}
