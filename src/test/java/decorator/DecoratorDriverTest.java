package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DecoratorDriverTest {

    @Test
    public void testDecoratorDriver() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;

        try {
            System.setOut(new PrintStream(output));

            DecoratorDriver.main(new String[]{});

            String result = output.toString();

            assertTrue(result.contains("Burger"));
            assertTrue(result.contains("Fries"));
            assertTrue(result.contains("Hot Dog"));
            assertTrue(result.contains("Order Total:"));
            assertTrue(result.contains("Discounted Total:"));

        }
        finally {
            System.setOut(originalOutput);
        }
    }
}