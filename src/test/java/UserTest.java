import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private User user;

    @BeforeEach
    void before(){
        user = new User(1,"Carlos","Montoya");
    }

    @Test
    void testUser() {
        assertEquals(1, user.getNumber());
        assertEquals("Carlos", user.getName());
        assertEquals("Montoya", user.getFamilyName());
    }

    @Test
    void testFormat() {
        user = new User(1, "carlos", "montoya");
        this.testUser();
    }

    @Test
    void testfullName(){
        assertEquals("Carlos Montoya", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("C.", user.initials());
    }

    @Test
    void testgetCode() {
        user = new User(1, "carlos", "montoya");
        this.testUser();
    }

}
