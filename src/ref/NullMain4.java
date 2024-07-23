package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); //null에러를 해결하는 방법: 참조값을 지정해준다.
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);

        System.out.println("bigData.data.value=" + bigData.data.value);
    }
}
