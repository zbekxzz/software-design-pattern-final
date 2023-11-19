package buns;

public class User extends Entity {
    private Status status;
    private String password;

    public User() {}

    public User(Long id, String username, Status status, String password) {
        super.setId(id);
        super.setUsername(username);
        this.status = status;
        this.password = password;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
