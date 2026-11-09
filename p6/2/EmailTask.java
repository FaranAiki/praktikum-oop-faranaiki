public class EmailTask extends Task {
    private String recipient;

    public EmailTask(String name, int priority, int duration, String recipient) {
        super(name, priority, duration);
        this.recipient = recipient;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", To: " + recipient;
    }

    @Override
    public String run() {
        return "Sending email to " + recipient + "...";
    }
}
