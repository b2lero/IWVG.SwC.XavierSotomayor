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
    void testfullName(){
        assertEquals("Carlos Montoya", user.fullName());
    }

    @Test
    void testGetNumber(){
        assertEquals(1, user.getNumber());
    }

    @Test
    void testGetName(){
        assertEquals("Carlos",user.getName());
    }
}
