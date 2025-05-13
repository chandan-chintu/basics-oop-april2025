package encapsulationexample;

public class MainEncapsulationClass {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        //added dummy lines
        // assigning the values
        //teacher1.id=1123; - cannot be used because id is private in teacher class
        teacher1.setId(111);
        teacher1.setName("William");
        teacher1.setQualification("Masters of Science");
        teacher1.setMobile("+91-8877888888");
        teacher1.setEmail("willian123@gmail.com");
        //added dummy lines
        System.out.println("teacher1 is :"+teacher1);
        // get specific details
        System.out.println("teacher1 name is : "+teacher1.getName());
        System.out.println("teacher1 email is : "+teacher1.getEmail());
        System.out.println("teacher1 mobile is : "+teacher1.getMobile());
    }
}
