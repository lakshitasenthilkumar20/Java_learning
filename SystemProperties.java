public class SystemProperties {
    public static void main(String[] args) {
        System.out.println("OS Name          : " + System.getProperty("os.name"));
        System.out.println("Java Version     : " + System.getProperty("java.version"));
        System.out.println("User Name        : " + System.getProperty("user.name"));
        System.out.println("Working Directory: " + System.getProperty("user.dir"));
        System.out.println("Home Directory   : " + System.getProperty("user.home"));
        System.out.println("\n--- All System Properties ---");
        System.getProperties().list(System.out);
    }
}