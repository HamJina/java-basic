package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt(); //사용자가 입력한 값이 n에 저장된다.
        scanner.nextLine(); //입력버퍼를 비우기 위한 코드

        ProductOrder[] orders = new ProductOrder[n]; //n개의 객체 배열 생성하기

        for(int i = 0; i < orders.length; i++) { //n개의 주문 정보를 입력받는다.
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요. ");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("상품명: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); //입력버퍼를 비우기 위한 코드

            orders[i] = createOrder(productName, price, quantity); //입력정보대로 order객체 생성하기
        }

        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(orders);

        // getTotalAmount()를 사용해서 총 결제 금액 계산
        int totalAmount = getTotalAmount(orders);

        // 총 결제 금액 출력
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productNName, int price, int quantity)
    {
        // 주문 객체 생성
        ProductOrder order = new ProductOrder();
        order.productName = productNName;
        order.price = price;
        order.quantity = quantity;
        return order; //참조값을 반환한다.
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
