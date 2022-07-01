package electronics;

public class ElectronicsMain {
    public static void main(String[] args) {
        Phone nokia = new Phone("Nokia 3", "733-367-544");
        Phone iphone = new Phone("Iphone 6", "515-742-802");
        Tablet lenovo = new Tablet("Lenovo Yoga Smart Tab 10 ");

        EmailSender customEmailSender = new EmailSender() {
            @Override
            public void sendEmail(String message) {
                System.out.println("I'm going to my friend, to send an email from him");
            }
        };
        MailMachine mailMachine = new MailMachine();
        mailMachine.addEmailSender(nokia);
        mailMachine.addEmailSender(lenovo);
        mailMachine.addEmailSender(iphone);

        mailMachine.addEmailSender(customEmailSender);

        mailMachine.sendEmail("Very important message");
    }
}
