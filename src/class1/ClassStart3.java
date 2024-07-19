package class1;

//학생클래스 사용하기
public class ClassStart3 {
    public static void main(String[] args) {
        Student student1; //객체정의
        student1 = new Student(); //학생이라는 메모리를 만든다, 객체 생성
        student1.name = "학생1"; //점을 통한 접근
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + "나이:" + student1.age + "성적:" + student1.grade);
        System.out.println("이름:" + student2.name + "나이:" + student2.age + "성적:" + student2.grade);
    }
}
