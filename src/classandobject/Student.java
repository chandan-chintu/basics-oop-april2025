package classandobject;

public class Student {

    public int id;
    public String name;
    public String gender;
    public String grade;
    public String address;

    // it converts the object into string format
    @Override
    public String toString() {
        return "Student{" +
                "gender='" + gender + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
