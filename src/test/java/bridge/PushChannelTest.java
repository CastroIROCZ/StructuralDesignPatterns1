package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PushChannelTest {

    @Test
    public void testPushNotification() {
        PushChannel push = new PushChannel();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;

        try {
            System.setOut(new PrintStream(output));

            push.sendNotification("Payment successful");

            assertEquals(
                "Push notification sent: Payment successful",
                output.toString().trim()
            );

        }
        finally {
            System.setOut(originalOutput);
        }
    }
}