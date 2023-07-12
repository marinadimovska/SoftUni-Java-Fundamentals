import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Students {
    public static class Student{
        String first_name;
        String last_name;
        String age;
        String hometown;

        public Student(String first_name, String last_name, String age, String hometown) {
            this.first_name = first_name;
            this.last_name = last_name;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getHometown() {
            return hometown;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studList = new ArrayList<>();
        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] parts = command.split(" ");
            String firstName = parts[0];
            String lastName = parts[1];
            String age = parts[2];
            String hometown = parts[3];

            Student curStudent = new Student(firstName,lastName,age,hometown);
            studList.add(curStudent);


            command = scanner.nextLine();

        }
        String cityName = scanner.nextLine();
        for (Student student:studList) {
            if (student.getHometown().equals(cityName)) {
                System.out.printf("%s %s is %s years old%n", student.getFirst_name(), student.getLast_name(),
                        student.getAge());
            }
        }
    }
}

