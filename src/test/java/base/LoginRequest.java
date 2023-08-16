package base;

public class LoginRequest {
    private String username;
    private String password;

    // Default constructor (required for JSON deserialization)
    public LoginRequest() {
    }

    // Getters and setters for the username and password fields
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
