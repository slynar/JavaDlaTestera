package model.bugs;

import java.util.Objects;

public class Bug implements ConsoleNotification, Comparable<Bug> {

    private String description;
    private int priority;
    private boolean status;
    private BugReporter bugReporter;

    public Bug(String description, BugReporter bugReporter, int priority) {
        this.description = description;
        this.bugReporter = bugReporter;
        this.priority = priority;
        this.status = false;
    }

    public void showBugDescription() {
        System.out.println("model.bugs.Bug description: " + description);
    }

    public void showPriority() {
        System.out.println("model.bugs.Bug priority: " + priority);
    }

    public void showStatus() {
        System.out.println("model.bugs.Bug status: " + status);
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

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
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
        notifyStatusChange();
        this.status = status;
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("!!! Bug status has changed !!!");
    }

    @Override
    public String toString() {
        return "Bug{" +
                "description='" + description + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                ", bugReporter=" + bugReporter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return priority == bug.priority && status == bug.status && Objects.equals(description, bug.description) && Objects.equals(bugReporter, bug.bugReporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, priority, status, bugReporter);
    }

    @Override
    public int compareTo(Bug bug) {
        return this.getDescription().compareTo(bug.getDescription());
    }
}