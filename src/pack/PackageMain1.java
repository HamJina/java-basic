package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); //같은 패키지 안에 있는 클래스 사용

        //다른 패키지에 있는 클래스를 사용할때(앞에 패키지명을 적어준다.)
        pack.a.User user = new pack.a.User();
    }
}
