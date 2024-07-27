package static2;

public class DecoData {

    private int instanceValue; //인스턴스 변수
    private static int staticValue; //정적 변수

    //정적메서드: 정적 변수와 메서드만을 사용할 수 있다.
    public static void staticCall() {
        //instanceValue++; //인스턴스 변수 접근을 하면 컴파일 오류 발생
        //instanceMethod(); //인스턴스 메서드 접근시 컴파일 오류 발생 해당 함수는 정적메서드이기 때문
        staticValue++;
        staticMethod();
    }

    //인스턴스 메서드: 정적변수, 메서드. 인스턴스변수,메서드 모두 사용가능하다.
    public void instanceCall() {
        instanceValue++; //인스턴스 변수에 접근가능
        instanceMethod(); //인스턴스 메서드에 접근가능

        staticValue++; //정적 변수에 접근 가능
        staticMethod(); //정적 메서드에 접근 가능
    }

    //인스턴스 메서드
    private void instanceMethod() {
        System.out.println("instanceValue= " + instanceValue);
    }

    //정적 메서드
    private static void staticMethod() {
        System.out.println("staticValue= " + staticValue);
    }
}
