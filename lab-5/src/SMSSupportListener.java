package observer.eventmanagement;


import java.io.File;

public class SMSSupportListener implements EventListener {
    private String phoneNumber;
    private String defaultMessage;

    public SMSSupportListener(String phoneNumber, String defaultMessage) {
        this.phoneNumber = phoneNumber;
        this.defaultMessage = defaultMessage;
    }

    @Override
    public void update(String eventType, File file) {
        if (defaultMessage.length() > 160) {
            System.out.println("Warning: Default SMS message exceeds 160 characters. Please define a valid default SMS.");
        } else {
            sendSMS(phoneNumber, defaultMessage);
        }
    }

    private void sendSMS(String phoneNumber, String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}
