package bridge;

public class BridgeDriver {

    public static void main(String[] args) {

        System.out.println("Scenario 1: Online Payment with Email");
        OnlinePaymentNotification onlineEmail = new OnlinePaymentNotification(new EmailChannel());
        onlineEmail.notifyCustomer();

        System.out.println();

        System.out.println("Scenario 2: Online Payment with SMS");
        OnlinePaymentNotification onlineSms = new OnlinePaymentNotification(new SmsChannel());
        onlineSms.notifyCustomer();

        System.out.println();

        System.out.println("Scenario 3: Cash on Delivery with Email");
        CashOnDeliveryPayment cashEmail = new CashOnDeliveryPayment(new EmailChannel());
        cashEmail.notifyCustomer();

        System.out.println();

        System.out.println("Scenario 4: Cash on Delivery with SMS");
        CashOnDeliveryPayment cashSms = new CashOnDeliveryPayment(new SmsChannel());
        cashSms.notifyCustomer();

        System.out.println();

        System.out.println("Scenario 5: Bitcoin Payment with Email");
        BitcoinPayment bitcoinEmail = new BitcoinPayment(new EmailChannel());
        bitcoinEmail.notifyCustomer();

        System.out.println();

        System.out.println("Scenario 6: Bitcoin Payment with SMS");
        BitcoinPayment bitcoinSms = new BitcoinPayment(new SmsChannel());
        bitcoinSms.notifyCustomer();
    }
}