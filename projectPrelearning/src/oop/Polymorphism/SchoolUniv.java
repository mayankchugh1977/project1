package oop.Polymorphism;

public class SchoolUniv {
    public static void main(String[] args) {
        University univ = new University("Mayank", 10, true);
    }
}


class School {
    protected String name;
    protected int numStudents;

    public School(String name, int numStudents) {
        this.name = name;
        this.numStudents = numStudents;
    }

    public String getName() {
        return this.name;
    }

    public int getNumStudents() {
        return this.numStudents;
    }
}


class University extends School {
    private final String type = "University";
    private boolean isPublic;

    public University(String name, int numStudents, boolean isPublic) {
        super(name,numStudents);
        this.isPublic = isPublic;
    }

    public boolean getIsPublic() {
        return this.isPublic;
    }

    public String getName() {
        return super.getName() + " " + type;
    }

    public int getNumStudents(){
        return super.getNumStudents();
    }
}