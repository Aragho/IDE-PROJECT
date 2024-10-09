package person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    public void testPerson() {
        Person person = new Person("Aderomola", "23 ebute,ikorodu,Lagos", "09021345362", "aderomola23@gmail.com");
        assertEquals("person: Aderomola", person.toString());
    }
    @Test
    public void testStudent(){
        Student student = new Student("darasimi","10,oshodi,Lagos","08123456738","darasimi@gmail.com");
        assertEquals("student:darasimi", student.toString());

    }
    @Test
    public void testEmployee(){
        Employee employee = new Employee("oluwaseun","20,ikotun,Lagos","0813245678","oluwaseun@gmail.com");
        assertEquals("employee:oluwaseun", employee.toString());
    }
    @Test
    public void testFaculty(){
        Faculty faculty = new Faculty();

    }
}