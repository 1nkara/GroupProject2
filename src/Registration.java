public class Registration {
        private String email;
        private String userName;
        private String password;

        public void setEmail(String email) {
            if (email.endsWith("@yahoo.com")) {
                this.email = email;
            } else {
                System.out.println("Invalid email");
            }
        }

        public void setUserName(String userName) {
            if (userName.length() > 6) {
                this.userName = userName;
            } else {
                System.out.println("Invalid userName");
            }
        }

        public void setPassword(String password) {
            if (password.length() > 6 && !password.contains(userName)) {
                this.password = password;
            } else {
                System.out.println("Invalid password");
            }
        }

        public void displayRegistrationInfo() {
            System.out.println("Registration Information:");
            System.out.println("Email: " + email);
            System.out.println("UserName: " + userName);
            System.out.println("Password: " + password);
        }
    }

