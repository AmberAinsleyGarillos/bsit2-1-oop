 class Student {
    String name;
    int age;
    String course;

    double grade1;
    double grade2;
    double grade3;

    double average = 0;

    public Student(String studentName, int studentAge, String studentCourse, double gradeOne, double gradeTwo, double gradeThree) {
        name = studentName;
        age = studentAge;
        course = studentCourse;
        grade1 = gradeOne;
        grade2 = gradeTwo;
        grade3 = gradeThree;
    }

    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Grades: " + grade1 + ", " + grade2 + ", " + grade3);
    }

    public void calculateAverage() {
        average = (grade1 + grade2 + grade3) / 3;
    }

    public void getLetterGrade() {
        if (average >= 90) {
            System.out.println("Letter Grade: A");
        } else if (average >= 80) {
            System.out.println("Letter Grade: B");
        } else if (average >= 70) {
            System.out.println("Letter Grade: C");
        } else if (average >= 60) {
            System.out.println("Letter Grade: D");
        } else {
            System.out.println("Letter Grade: F");
        }
    }

    public void isPassing() {
        if (average >= 70) {
            System.out.println("PASSING");
        } else {
            System.out.println("FAILING");
        }
    }

    public static class gradeCalculator {
        public static void main(String[] args) {
            Student student1 = new Student("Amber Garillos", 20, "BSIT", 90, 90, 90);
            Student student2 = new Student("Ashton Lactuan", 19, "BSIT", 70, 60, 80);
            Student student3 = new Student("Kissie Aput", 20, "BSIT", 100, 100, 100);

            student1.displayInfo();
            student1.calculateAverage();
            student1.getLetterGrade();
            student1.isPassing();

            System.out.println();

            student2.displayInfo();
            student2.calculateAverage();
            student2.getLetterGrade();
            student2.isPassing();

            System.out.println();

            student3.displayInfo();
            student3.calculateAverage();
            student3.getLetterGrade();
            student3.isPassing();
        }
    }
}
