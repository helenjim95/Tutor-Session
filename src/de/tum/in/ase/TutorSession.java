package de.tum.in.ase;

public final class TutorSession {
    // TODO Task 1 Add the attributes lectureWeek, tutor, firstTask and secondTask.
    //  Be careful to use the right types and modifiers.
    private int lectureWeek;
    private Tutor tutor;
    private Task firstTask;
    private Task secondTask;

    // TODO Task 2 Add the constructor. Make sure to use the same parameters as seen in the UML diagram.
    public TutorSession(int lectureWeek, Tutor tutor, Task firstTask, Task secondTask) {
        this.lectureWeek = lectureWeek;
        this.tutor = tutor;
        this.firstTask = firstTask;
        this.secondTask = secondTask;
    }

    public int getLectureWeek() {
        return lectureWeek;
    }

    public void setLectureWeek(int lectureWeek) {
        this.lectureWeek = lectureWeek;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Task getFirstTask() {
        return firstTask;
    }

    public void setFirstTask(Task firstTask) {
        this.firstTask = firstTask;
    }

    public Task getSecondTask() {
        return secondTask;
    }

    public void setSecondTask(Task secondTask) {
        this.secondTask = secondTask;
    }

    // TODO Task 3 Add the method runTask. It returns nothing and has a Task as parameter.
    //  It prints three lines to the command line. You can see them in the problem statement on Artemis.
    //  For this output you need values from the Task given as a parameter. Use its getters to obtain these values.
    //  Also you need to set the task to done. Use its setter to do so.
    public void runTask(Task task) {
        System.out.println("Lets do the task " + task.getTitle() + " now!");
        System.out.println("... " + task.getWorkingTime() + " minutes later...");
        System.out.println("We are finished with " + task.getTitle() + ".");
        task.setDone(true);
    }

    // TODO Task 4 Add the method runTutorSession. It has no parameters and return nothing.
    //  This method first tells the tutor to introduce himself, but in the yelling way,
    //  then it runs both tasks with the helper function runTask
    //  and finally it tells the tutor to say goodbye.
        public void runTutorSession() {
            tutor.printIntroduction();
            runTask(firstTask);
            runTask(secondTask);
            tutor.sayGoodbye();
        }

    public static void main(String[] args) {
        // TODO Task 5 Create a Tutor
        //  Create two Tasks
        //  Create a TutorSession with the Tutor and the Tasks created before
        //  Run your tutor session
        Tutor tutor = new Tutor("Shawn", "Python");
        Task firstTask = new Task("Intro to Python", 40);
        Task secondTask = new Task("Data Science", 55);
        TutorSession tutorSession = new TutorSession(5, tutor, firstTask, secondTask);
        tutorSession.runTutorSession();
    }
}
