package bridge;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class EmailChannelTest {
    
@Test
public void testEmailNotification() {
        EmailChannel email = new EmailChannel();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;

        try {
            System.setOut(new PrintStream(output));

            email.sendNotification("Payment successful");

            assertEquals(
                "Email sent: Payment successful",
                output.toString().trim()
            );
        } finally {
            System.setOut(originalOutput);
        }
    }  
}
