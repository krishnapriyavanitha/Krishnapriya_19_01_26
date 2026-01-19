public class UserRegistration {
    public static void main(String[] args) {
        // Updated user name
        String userName = "krishnapriya";
        
        // Extracting the first 7 characters ("krishna")
        // index 0 to 7 (stops before index 7)
        String shortName = userName.substring(0, 7);
        
        // Extracting the remaining part ("priya")
        // starts from index 7 to the end
        String lastNamePart = userName.substring(7);
        
        // Output the results
        System.out.println("Full Name: " + userName);
        System.out.println("First Part: " + shortName);
        System.out.println("Second Part: " + lastNamePart);
    }
}