import java.util.Scanner;

class Marks {
    int marks;
    int rollNumber;
    String name;

    Marks(int rollNumber, String name) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}

class Maths extends Marks {

    Maths(int rollNumber, String name, int marks) {
        super(rollNumber, name);
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }
}

class Physics extends Marks {
    Physics(int rollNumber, String name, int marks) {
        super(rollNumber, name);
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }
}

class Chemistry extends Marks {

    Chemistry(int rollNumber, String name, int marks) {
        super(rollNumber, name);
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }
}

public class third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students.");

        int numberOfStudents = input.nextInt();

        Chemistry[] chemistryMarks = new Chemistry[numberOfStudents];
        Maths[] mathsMarks = new Maths[numberOfStudents];
        Physics[] physicsMarks = new Physics[numberOfStudents];

        for (int index = 0; index < numberOfStudents; index++) {
            System.out.println("Enter the marks of Roll no. " + (index + 1) + " in Chemistry.");
            int chemMarks = input.nextInt();
            chemistryMarks[index] = new Chemistry(index + 1, "", chemMarks);

            System.out.println("Enter the marks of Roll no. " + (index + 1) + " in Maths.");
            int mathMarks = input.nextInt();
            mathsMarks[index] = new Maths(index + 1, "", mathMarks);

            System.out.println("Enter the marks of Roll no. " + (index + 1) + " in Physics.");
            int physicMarks = input.nextInt();
            physicsMarks[index] = new Physics(index + 1, "", physicMarks);
        }

        float averageMarksChemistry = 0, averageMarksMaths = 0, averageMarksPhysics = 0;

        for (int index = 0; index < numberOfStudents; index++) {
            averageMarksChemistry += chemistryMarks[index].marks;
            averageMarksPhysics += physicsMarks[index].marks;
            averageMarksMaths += mathsMarks[index].marks;
        }

        averageMarksChemistry /= numberOfStudents;
        averageMarksMaths /= numberOfStudents;
        averageMarksPhysics /= numberOfStudents;

        System.out.println("The average marks of Students in Chemistry: " + averageMarksChemistry);
        System.out.println("The average marks of Students in Maths: " + averageMarksMaths);
        System.out.println("The average marks of Students in Physics: " + averageMarksPhysics);

        System.out.println("Enter the roll number of student to see the marks.");
        int rollNumber = input.nextInt();

        System.out.println("Chemistry Marks: " + chemistryMarks[rollNumber - 1].getMarks());
        System.out.println("Maths Marks: " + mathsMarks[rollNumber - 1].getMarks());
        System.out.println("Physics Marks: " + physicsMarks[rollNumber - 1].getMarks());
    }
}
