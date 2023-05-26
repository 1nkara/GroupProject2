public class RegistratinDemo {
        public static void main(String[] args) {
            Registration registration = new Registration();
            registration.setEmail("example@yahoo.com");
            registration.setUserName("user123");
            registration.setPassword("password123");

            registration.displayRegistrationInfo();
        }
    }

