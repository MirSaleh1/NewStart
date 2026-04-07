package l07.oop.fundamental.homework.task6;

public class UserProfile {
    public String userName;
    public String email;
    public boolean active;

    public UserProfile(String parameterName, String parameterEmail, boolean active) {
        this.userName = parameterName;
        this.email = parameterEmail;
        this.active = active;
    }

    public UserProfile(String userName, String email) {
        this(userName,email,true);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
