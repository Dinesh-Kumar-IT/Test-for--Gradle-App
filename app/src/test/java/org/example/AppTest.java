package org.example;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public String getMessage() {
        String userName = System.getenv("MY_NAME");
        if (userName == null || userName.isEmpty()) {
            userName = System.getProperty("user.name");
        }
        return "Hello, " + userName + "!";
    }
}
