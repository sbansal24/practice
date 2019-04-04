import java.util.Objects;

public class LongTaskStatus {
    private Message name;

    public LongTaskStatus(Message name) {
        this.name = name;
    }

    public Message getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LongTaskStatus that = (LongTaskStatus) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
