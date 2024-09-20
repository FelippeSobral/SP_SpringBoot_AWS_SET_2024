package Enumerações;

import Enumerações.enums.OrderStatus;
import Enumerações.entitiesOrder.Order;
import java.util.Date;

public class Semana2 {

    public static void main(String[] args) {
        Order order = new Order(OrderStatus.PENDING_PAYMENT, 1080, new Date());
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}