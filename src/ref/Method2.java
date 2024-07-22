package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90); //반환된 참조값이 student1에 저장된다.
        Student student2 = createStudent("학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student(); //객체 생성, student에는 참조값이 저장됨
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; //생성된 student객체의 참조값을 반환하게 된다.
    }

    static void printStudent(Student student1) {
        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
    }
}
