package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OnlinePaymentNotificationTest {
    
    @Test 
    public void testOnlinePaymentNotification() {
        OnlinePaymentNotification payment = 
            new OnlinePaymentNotification(new EmailChannel());
            
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            PrintStream originalOutput = System.out;

            try {
                System.setOut(new PrintStream(output));
                
                payment.notifyCustomer();

                assertEquals(
                    "Email sent: Your online payment was successful.",
                    output.toString().trim()
                );

            }
            finally {
                System.setOut(originalOutput);
            }
    }
}