import java.util.Scanner;

public class Login {
    private String username;
    private String password;

    // Constructor untuk menginisialisasi username dan password
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Method untuk validasi login
    public boolean validate() {
        return username.equals("admin") && password.equals("1234");
    }
}
