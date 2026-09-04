package ObjectInArray.student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Sourabh", "BE", 75, 2026);
        Student s2 = new Student("harsh", "MCA", 62, 2025);
        Student s3 = new Student("Sawan", "BTECH", 65, 2025);
        Student s4 = new Student("Sumit", "BCA", 85, 2026);
        Student s5 = new Student("nayan", "MCA", 55, 2023);

        Student students[] = {s1, s2, s3, s4, s5};
        for (int i = 0; i < students.length; i++) {
            students[i].disp();
        }

        System.out.println("=====Min 60 % =====");

        for (int i = 0; i < students.length; i++) {
            if (students[i].percentage >= 60) {
                students[i].disp();
            }
        }

        System.out.println("=====Min 60 % and 26 or 25  =====");

        for (int i = 0; i < students.length; i++)
            if (students[i].percentage >= 60 && (students[i].yop == 2026 || students[i].yop == 2025) &&
                    (students[i].qual.equalsIgnoreCase("be") || students[i].qual.equalsIgnoreCase("btech") ||
                            students[i].qual.equalsIgnoreCase("mca"))) {
                students[i].disp();
            }
    }
}

