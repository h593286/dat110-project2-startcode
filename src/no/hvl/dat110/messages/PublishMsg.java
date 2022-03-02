package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {


	private String topic;
	private String message;
	public PublishMsg (String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.topic = topic;
		this.message = message;
	}
	// message sent from client to create publish a message on a topic 

	// TODO:
	// Implement object variables - a topic and a message is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text

	public String getUser(){
		return super.getUser();
	}
	public MessageType getType() {
		return super.getType();
	}
	public String getTopic() {
		return topic;
	}
	public String getMessage() {
		return message;
	}
	@Override
	public String toString() {
		return "Message [type=" + getType() + ", user=" + getUser() + ", topic=" + topic +", message="+message+"]";
	}
}
