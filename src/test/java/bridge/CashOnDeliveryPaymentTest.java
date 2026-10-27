package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CashOnDeliveryPaymentTest {

    @Test
    public void testCashOnDeliveryPaymentNotification() {
        CashOnDeliveryPayment payment =
            new CashOnDeliveryPayment(new EmailChannel());

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;

        try {
            System.setOut(new PrintStream(output));

            payment.notifyCustomer();

            assertEquals(
                "Email sent: Your order has been placed. Please pay upon delivery.",
                output.toString().trim()
            );

        }
        finally {
            System.setOut(originalOutput);
        }
    }
}