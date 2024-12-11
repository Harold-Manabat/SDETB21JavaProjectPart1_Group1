package JavaProject_OOP_Part1;

public class Registration {
    // Encapsulated variables with private access
    private String email;
    private String userName;
    private String password;

    // Method to set email
    public boolean setEmail(String email) {
        if (email != null && email.toLowerCase().endsWith("@yahoo.com")) {
            this.email = email;
            return true;
        } else {
            System.out.println("Invalid email. Please use a yahoo email address.");
            return false;
        }
    }

    // Method to set username
    public boolean setUserName(String userName) {
        if (userName != null && userName.length() > 6) {
            this.userName = userName;
            return true;
        } else {
            System.out.println("Invalid username. It must be longer than 6 characters.");
            return false;
        }
    }

    // Method to set password
    public boolean setPassword(String password) {
        if (password != null && password.length() > 6 && !password.contains(userName)) {
            this.password = password;
            return true;
        } else {
            System.out.println("Invalid password. It must be longer than 6 characters and not contain the username.");
            return false;
        }
    }

    // Method to display the user information (for testing purposes)
    public void displayUserInfo() {
        if (email != null && userName != null && password != null) {
            System.out.println("User registered successfully!");
            System.out.println("Email: " + email);
            System.out.println("Username: " + userName);
        } else {
            System.out.println("User registration failed.");
        }
    }

    public static void main(String[] args) {
        Registration user = new Registration();

        // Attempt to set valid values
        boolean emailSet = user.setEmail("JavaSyntax@yahoo.com");  // Ensure email is valid
        boolean userNameSet = user.setUserName("johnDoe123");    // Ensure username is valid
        boolean passwordSet = user.setPassword("mySecurePassword"); // Ensure password is valid

        // Display user info if everything is valid
        if (emailSet && userNameSet && passwordSet) {
            user.displayUserInfo();
        }

        // Try with invalid values
        //user.setEmail("JavaSyntax@gmail.com");  // Invalid email
        //user.setUserName("john");            // Invalid username (too short)
        //user.setPassword("john123");         // Invalid password (contains username)
    }
}
