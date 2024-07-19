package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        //클래스를 사용하지 않을때(배열 사용) - > 학생 한명의 데이터가 나뉘어져 있기 때문에 학생 한명에 대한 데이터를 변경하기 번거롭다.
        String[] studentNames = {"학생1","학생2"};
        int[] studentAges = {15,16};
        int[] studentGrade = {90,80};
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + "나이:" + studentAges[i] + "성적:" + studentGrade[i]);
        }
    }
}
