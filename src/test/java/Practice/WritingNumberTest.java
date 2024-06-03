package Practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


class WritingNumberTest {

    private WritingNumber writingNumber;

    @BeforeEach
    void beforeEach() {
        writingNumber = new WritingNumber();
    }

    @Test
    void testWritingNumber() {


        String input = "123\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(123, writingNumber.writingNumber());

        input = "1000000000001\n50\n";
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(50, writingNumber.writingNumber());

        input = "-1\n1000\n";
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(1000, writingNumber.writingNumber());
    }

}