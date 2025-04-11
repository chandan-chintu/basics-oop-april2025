package polymorphismexample;

public class PerformSum {

    public void sum(int a, int b){
        System.out.println("Sum of two integers numbers is : "+(a+b));
    }

    public void sum(int a, int b, int c){
        System.out.println("Sum of three integers numbers is : "+(a+b+c));
    }

    public void sum(float a, float b){
        System.out.println("Sum of two float numbers is : "+(a+b));
    }

    public void sum(double a, double b){
        System.out.println("Sum of two double numbers is : "+(a+b));
    }

    public void sum(int a, float b, double c){
        System.out.println("Sum of one int, one float and one double numbers is : "+(a+b+c));
    }
}
