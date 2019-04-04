import java.util.Objects;

public class Message {
    private String key;

    public Message(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(key, message.key);
    }

    @Override
    public int hashCode() {

        return Objects.hash(key);
    }
}
