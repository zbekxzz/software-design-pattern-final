package service.observing;

public class EmailSupplier implements OrderObserver {
    private String supplierEmail;

    public EmailSupplier(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

    @Override
    public void update(String orderMessage) {
        sendEmail(orderMessage);
    }

    private void sendEmail(String orderMessage) {
        // Implement email sending logic here
        System.out.println("Email sent to supplier (" + supplierEmail + "): " + orderMessage);
    }
}