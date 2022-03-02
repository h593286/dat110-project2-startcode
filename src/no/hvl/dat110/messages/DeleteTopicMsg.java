package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

    private String topic;
    public DeleteTopicMsg (String user, String topic) {
        super(MessageType.DELETETOPIC, user);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }
    public String getUser(){
        return super.getUser();
    }
    public MessageType getType() {
        return super.getType();
    }

    @Override
    public String toString() {
        return "Message [type=" + getType() + ", user=" + getUser() + ", topic=" + topic +"]";
    }
}
