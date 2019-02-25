package no.hvl.dat110.messages;
/*
       @author Herborg Irgens Sjo
 */

/**
 * The type Create message msg.
 */
public class CreateTopicMsg extends Message {

    // TODO:
    // Implement objectvariables, constructor, get/set-methods, and toString method

    /**
     * The Topic.
     */
    String topic;

    /**
     * Instantiates a new Create message msg.
     *
     * @param topic the message
     */
    public CreateTopicMsg(String topic) {
        this.topic = topic;
    }

    /**
     * Instantiates a new Create message msg.
     *
     * @param type  the type
     * @param user  the user
     * @param topic the message
     */
    public CreateTopicMsg(MessageType type, String user, String topic) {
        super(type, user);
        this.topic = topic;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Sets message.
     *
     * @param topic the message
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "CreateTopicMsg{" +
                "message='" + topic + '\'' +
                '}';
    }
}
