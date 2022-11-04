package de.tum.in.ase;

public class Tutor {

    // TODO Task 1 Add the attributes name and favorite programming language
    //  Be careful to use the right types and modifiers
    private String name;
    private String favoriteProgrammingLanguage;

    // TODO Task 2 Add the constructor. Make sure to use the same parameters as seen in the UML diagram.

    public Tutor(String name, String favoriteProgrammingLanguage) {
        this.name = name;
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }


    // TODO Task 2 Add getters and setters for all the attributes.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteProgrammingLanguage() {
        return favoriteProgrammingLanguage;
    }

    public void setFavoriteProgrammingLanguage(String favoriteProgrammingLanguage) {
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }


    // TODO Task 3 Add the method printIntroduction.
    //  It returns nothing and has no parameters. Instead it prints the introduction to the console.
    //  You can find the phrasing of the introduction in the problem statement on Artemis
    public void printIntroduction() {
        System.out.printf("Hi, I'm %s. My favorite programming language is %s%n.", name, favoriteProgrammingLanguage);
    }

    // TODO Task 3 Add the method getIntroduction.
    //  It returns a String and has no parameters. It prints nothing to the console.
    //  You can find the phrasing of the introduction in the problem statement on Artemis
    public String getIntroduction() {
        return String.format("Hi, I'm %s. My favorite programming language is %s%n.", name, favoriteProgrammingLanguage);
    }

    // TODO Task 4 Add the method sayGoodbye.
    //  It returns nothing and has no parameters. Instead it prints the goodbye message to the console.
    //  You can find the phrasing of the goodbye message in the problem statement on Artemis
    public void sayGoodbye() {
        System.out.println("Goodbye. I'll see you next week.");
    }
}
