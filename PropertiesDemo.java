import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {

        // Create Properties object
        Properties props = new Properties();

        // Set properties (key-value pairs as Strings)
        props.setProperty("server.port", "8080");
        props.setProperty("server.host", "localhost");
        props.setProperty("db.name", "myDatabase");
        props.setProperty("db.username", "admin");
        props.setProperty("db.password", "secret123");
        props.setProperty("app.name", "InternshipApp");

        System.out.println("All Properties:");
        props.list(System.out);

        // Get specific property
        System.out.println("\nServer Port : " + props.getProperty("server.port"));
        System.out.println("DB Name     : " + props.getProperty("db.name"));

        // Get with default value (if key not found)
        System.out.println("Timeout     : " + props.getProperty("timeout", "30 seconds (default)"));

        // Check size
        System.out.println("\nTotal Properties: " + props.size());

        // Remove a property
        props.remove("db.password");
        System.out.println("After removing 'db.password':");
        props.list(System.out);

        // Properties is commonly used for application.properties in Spring Boot
        // Example: server.port=8080, spring.datasource.url=jdbc:mysql://...
    }
}