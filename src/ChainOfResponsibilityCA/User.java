package ChainOfResponsibilityCA;

public class User {

    private String position;
    private String password;

    public User(String position, String password) {
        this.position = position;
        this.password = password;
    }

    public User() {
        position = "Owner";
        this.password = "ownerpassword";
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
