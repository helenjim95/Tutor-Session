package de.tum.in.ase;

public class Task {

    // TODO Task 1 Add the attributes done, title and working time
    //  Be careful to use the right types and modifiers
    private boolean done;
    private String title;
    private int workingTime;

    // TODO Task 2 Add the constructor. Make sure to use the same parameters as seen in the UML diagram and initialize the
    //  other attributes with default values

    public Task(String title, int workingTime) {
        this.title = title;
        this.workingTime = workingTime;
    }

    // TODO Task 2 Add getters and setters for all the attributes.
    //  Remember that the getter for boolean has "isVariablename" as method name

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(int workingTime) {
        this.workingTime = workingTime;
    }
}
