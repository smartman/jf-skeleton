package ee.ut.jf2014.homework1;

import static org.junit.Assert.*;
import org.junit.Test;

public class HomeworkTest {

    @Test
    public void testSquare() {
        Homework homework = new Homework();
        assertEquals(16, homework.square(4));
    }

    @Test
    public void testReverse() {
        Homework homework = new Homework();
        assertEquals("Input", homework.reverse("tupnI"));
    }
}
