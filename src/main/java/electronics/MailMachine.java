package electronics;

public class MailMachine  {
    private static final int MAX_ELEMENTS =4;
    //setting the limit of sent messages
    private final EmailSender[] senders = new EmailSender[MAX_ELEMENTS];
    //entering a counter that counts all send messages by this device
    private int counter = 0;
    //method - which adds a new message to be sent
    public void addEmailSender(EmailSender emailSender){
        if(counter > MAX_ELEMENTS -1){
            System.out.println("Can't add new message to be send");
        }
        senders[counter] = emailSender;
        counter ++;
        System.out.println("Adding new message (emailSender)");
    }
    // composition - adding a method that will send a new message via the EmailSender interface.
    public void sendEmail(String message) {
        for (EmailSender emailSender : senders) {
            emailSender.sendEmail(message);
        }
    }
}

