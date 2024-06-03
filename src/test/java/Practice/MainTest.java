package Practice;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testChosenNumber() {
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(1, Main.chosenNumber());

        input = "0\n";
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(0, Main.chosenNumber());

        input = "2\n0\n";
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(0, Main.chosenNumber());
    }
}