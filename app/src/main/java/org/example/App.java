package org.example;

public class App {
    public String getMessage() {
        // Fetch name from environment variable (fallback to "User")
        String userName = System.getenv("MY_NAME");
        if (userName == null || userName.isEmpty()) {
            userName = "User"; // Default name if variable is not set
        }

        return "Hello, " + userName + " welcome to my portal";
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }
}
