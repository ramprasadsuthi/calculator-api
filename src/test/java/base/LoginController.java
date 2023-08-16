package base;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        // Here you can perform authentication logic
        // For simplicity, let's assume the username is "admin" and the password is "password"
        if (loginRequest.getUsername().equals("admin") && loginRequest.getPassword().equals("password")) {
            return "Login successful";
        } else {
            return "Invalid credentials";
        }
    }
}
