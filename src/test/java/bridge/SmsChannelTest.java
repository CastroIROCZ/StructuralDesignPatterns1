package bridge;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SmsChannelTest {
    
@Test
public void testSmsNotification() {
        SmsChannel sms = new SmsChannel();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;

        try {
            System.setOut(new PrintStream(output));

            sms.sendNotification("Payment successful");

            assertEquals(
                "SMS sent: Payment successful",
                output.toString().trim()
            );
        } finally {
            System.setOut(originalOutput);
        }
    }  
}
