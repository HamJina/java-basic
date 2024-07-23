package class1;

//학생클래스 사용하기
public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1"; //점을 통한 접근
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        //객체배열 생성해서 저장하기
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for(int i = 0; i < students.length; i ++) {
            System.out.println("이름:" + students[i].name + "나이:" + students[i].age + "성적:" + students[i].grade);
        }
    }
}