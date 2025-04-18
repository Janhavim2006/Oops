abstract class Student {
    String name;
    String grade;
    double gpa;
    String role;

    Student(String name, String grade, double gpa, String role) {
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
        this.role = role;
    }

    abstract String getAchievement();
    abstract void participateInEvent();
    abstract void maintainRecord();

    void displayInfo() {
        System.out.println("\n--- Student Info ---");
        System.out.println("Name   : " + name);
        System.out.println("Grade  : " + grade);
        System.out.println("GPA    : " + gpa);
        System.out.println("Role   : " + role);
    }
}

class Prefect extends Student {
    Prefect(String name, String grade, double gpa) {
        super(name, grade, gpa, "Prefect");
    }

    String getAchievement() {
        return "Leadership Award";
    }

    void participateInEvent() {
        System.out.println(name + " organized the school assembly.");
    }

    void maintainRecord() {
        System.out.println(name + " maintains student discipline records.");
    }
}

class Athlete extends Student {
    Athlete(String name, String grade, double gpa) {
        super(name, grade, gpa, "Athlete");
    }

    String getAchievement() {
        return "Gold Medal in 100m sprint";
    }

    void participateInEvent() {
        System.out.println(name + " participated in inter-school athletics.");
    }

    void maintainRecord() {
        System.out.println(name + " tracks training and performance logs.");
    }
}

class Scholar extends Student {
    Scholar(String name, String grade, double gpa) {
        super(name, grade, gpa, "Scholar");
    }

    String getAchievement() {
        return "Top Rank in Board Exams";
    }

    void participateInEvent() {
        System.out.println(name + " took part in Science Olympiad.");
    }

    void maintainRecord() {
        System.out.println(name + " maintains academic project records.");
    }
}

public class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Prefect("Aditi", "10th", 9.5);
        Student s2 = new Athlete("Yash", "11th", 8.2);
        Student s3 = new Scholar("Janhavi", "12th", 9.8);

        Student[] students = {s1, s2, s3};

        for (Student student : students) {
            student.displayInfo();
            System.out.println("Achievement: " + student.getAchievement());
            student.participateInEvent();
            student.maintainRecord();
            System.out.println();
        }
    }
}