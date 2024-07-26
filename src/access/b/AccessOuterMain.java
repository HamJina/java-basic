package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public호출 가능
        data.publicField = 1;
        data.publicMethod();

        //다른 패키지 default 로출 가능
        // data.defaultField = 2;
        // data.defaultMethod();

        //private 로출 불가
        //data.privateField = 3;
        //ata.privateMethod();
        data.innerAccess();
    }
}
