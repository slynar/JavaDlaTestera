public class Bug {

    String description;
    String email;
    int priority;
    boolean status;

    public Bug(String description, String email, int priority) {
        this.description = description;
        this.email = email;
        this.priority = priority;
        this.status = false;
    }

    void showBugDescription() {
        System.out.println("Bug description: " + description);
    }

    void showEmail() {
        System.out.println("Bug reported by: " + email);
    }

    void showPriority() {
        System.out.println("Bug priority: " + priority);
    }

    void showStatus() {
        System.out.println("Bug status: " + status);
    }
}