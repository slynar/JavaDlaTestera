package model;

public class Bug {

    private String description;
    private String email;
    private int priority;
    private boolean status;

    public Bug(String description, String email, int priority) {
        this.description = description;
        this.email = email;
        this.priority = priority;
        this.status = false;
    }

    public void showBugDescription() {
        System.out.println("model.Bug description: " + description);
    }

    public void showEmail() {
        System.out.println("model.Bug reported by: " + email);
    }

    public void showPriority() {
        System.out.println("model.Bug priority: " + priority);
    }

    public void showStatus() {
        System.out.println("model.Bug status: " + status);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        boolean b = description.isEmpty();
        if (description.length() > 10 && b == false) {
            this.description = description;
        } else {
            System.out.println(description + " -> this description is too short");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            System.out.println(email + " -> this is incorrect email address");
        } else {
            this.email = email;
        }
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        switch (priority) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.priority = priority;
                break;
            default: {
                System.out.println(priority + " -> this is incorrect priority - it should be int between 1 and 5");
            }
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}