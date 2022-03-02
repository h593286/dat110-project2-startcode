package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

    private String topic;
    public SubscribeMsg (String user, String topic) {
        super(MessageType.SUBSCRIBE, user);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
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
