package SerializationPackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class User implements Externalizable {
    private static Long serialVersionUID  = 10L;
    private String userId;
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("in write extern method");
        out.writeObject(userId);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("in red exten method");
        setUserId((String)in.readObject());
    }
}
