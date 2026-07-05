// HTTP Methods Demo
// Demonstrates all HTTP methods with their purpose and usage

import java.util.HashMap;
import java.util.Map;

public class HttpMethodsDemo {

    static Map<Integer, String> db = new HashMap<>();

    // GET - Retrieve data (Read)
    static void get(int id) {
        System.out.println("\n[GET] /users/" + id);
        System.out.println("Purpose : Retrieve data without modifying it");
        System.out.println("Response: " + (db.containsKey(id) ? db.get(id) : "404 Not Found"));
    }

    // POST - Create new data
    static void post(int id, String name) {
        System.out.println("\n[POST] /users");
        System.out.println("Purpose : Create a new resource");
        db.put(id, name);
        System.out.println("Response: 201 Created -> " + name);
    }

    // PUT - Full update of existing data
    static void put(int id, String name) {
        System.out.println("\n[PUT] /users/" + id);
        System.out.println("Purpose : Fully update an existing resource");
        if (db.containsKey(id)) {
            db.put(id, name);
            System.out.println("Response: 200 OK -> Updated to: " + name);
        } else {
            System.out.println("Response: 404 Not Found");
        }
    }

    // PATCH - Partial update
    static void patch(int id, String updatedField) {
        System.out.println("\n[PATCH] /users/" + id);
        System.out.println("Purpose : Partially update a resource");
        if (db.containsKey(id)) {
            String existing = db.get(id);
            db.put(id, existing + " [" + updatedField + "]");
            System.out.println("Response: 200 OK -> Partial update applied: " + db.get(id));
        } else {
            System.out.println("Response: 404 Not Found");
        }
    }

    // DELETE - Remove data
    static void delete(int id) {
        System.out.println("\n[DELETE] /users/" + id);
        System.out.println("Purpose : Delete an existing resource");
        if (db.containsKey(id)) {
            db.remove(id);
            System.out.println("Response: 200 OK -> User deleted");
        } else {
            System.out.println("Response: 404 Not Found");
        }
    }

    public static void main(String[] args) {

        System.out.println("========== HTTP METHODS DEMO ==========");

        // POST - Create
        post(1, "Lakshita");
        post(2, "Alice");
        post(3, "Bob");

        // GET - Read
        get(1);
        get(99); // Not found

        // PUT - Full Update
        put(2, "Alice Smith");

        // PATCH - Partial Update
        patch(1, "role:admin");

        // DELETE
        delete(3);
        delete(99); // Not found

        System.out.println("\n========== HTTP METHODS SUMMARY ==========");
        System.out.printf("%-10s %-15s %-15s %-20s%n", "Method", "CRUD",  "Idempotent", "Description");
        System.out.println("-".repeat(65));
        System.out.printf("%-10s %-15s %-15s %-20s%n", "GET",    "Read",   "Yes", "Retrieve data");
        System.out.printf("%-10s %-15s %-15s %-20s%n", "POST",   "Create", "No",  "Create new resource");
        System.out.printf("%-10s %-15s %-15s %-20s%n", "PUT",    "Update", "Yes", "Full update");
        System.out.printf("%-10s %-15s %-15s %-20s%n", "PATCH",  "Update", "No",  "Partial update");
        System.out.printf("%-10s %-15s %-15s %-20s%n", "DELETE", "Delete", "Yes", "Remove resource");

        System.out.println("\nIdempotent = calling the same request multiple times gives same result");
    }
}