package person;

public class Student extends Person {
    private String status;
    public Student(String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;

    }
    @Override
    public String toString() {
        return "student:" + getName();
    }
}
