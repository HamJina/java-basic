package final1;

public class ConstructInit {

    final int value;

    public ConstructInit(int value) {
        this.value = value; //final필드는 생성자를 통해서 한번만 초기화된다.
    }
}
