package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BitcoinPaymentTest {

    @Test
    public void testBitcoinPaymentEmail() {
        BitcoinPayment payment =
            new BitcoinPayment(new EmailChannel());

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;

        try {
            System.setOut(new PrintStream(output));

            payment.notifyCustomer();

            assertEquals(
                "Email sent: Your Bitcoin payment was successful.",
                output.toString().trim()
            );

        }
        finally {
            System.setOut(originalOutput);
        }
    }

    @Test
    public void testBitcoinPaymentSms() {
        BitcoinPayment payment =
            new BitcoinPayment(new SmsChannel());

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;

        try {
            System.setOut(new PrintStream(output));

            payment.notifyCustomer();

            assertEquals(
                "SMS sent: Your Bitcoin payment was successful.",
                output.toString().trim()
            );

        }
        finally {
            System.setOut(originalOutput);
        }
    }
}