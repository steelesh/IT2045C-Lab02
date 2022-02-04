import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1, p2, p3;

    @BeforeEach
    void setUp() {
        p1 = new Person("00000A", "John", "Tester1", "Mr.", 1990);
        p2 = new Person("00000A", "Bob", "Tester2", "Hon.", 1980);
        p3 = new Person("00000A", "Steve", "Tester3", "Esq.", 1970);
    }
    @Test
    void setID(){
        p1.setID("00000B");
        assertEquals("00000B", p1.getID());
    }

    @Test
    void setFirstName() {
        p1.setFirstName("John");
        assertEquals("John", p1.getFirstName());
    }

    @Test
    void setLastName() {
        p2.setLastName("Tester2");
        assertEquals("Tester2", p2.getLastName());
    }

    @Test
    void setTitle() {
        p3.setTitle("Esq.");
        assertEquals("Esq.", p3.getTitle());
    }
    @Test
    void setYob() {
        p3.setYob(1970);
        assertEquals(1970, p3.getYob());
    }
    @Test
    void testToString() {
        p1.setFirstName("John");
        assertEquals("John", p1.getFirstName());
    }

    @Test
    void fullName() {
        p1.setFirstName("John");
        p1.setLastName("Tester1");
        assertEquals("John Tester1", p1.fullName());
    }

    @Test
    void formalName() {
        p2.setTitle("Hon.");
        p2.fullName();
        assertEquals("Hon. Bob Tester2", p2.formalName());
    }

    @Test
    void getAge() {
        p2.setYob(1980);
        assertEquals(42, p2.getAge());
    }
    @Test
    void getAgeFromYear(){
        p1.setYob(1990);
        assertEquals(20, p1.getAgeFromYear(2010));
    }
    @Test
    void toCSV() {
        assertEquals("00000A, John, Tester1, Mr., 1990", p1.toCSV());
    }
}