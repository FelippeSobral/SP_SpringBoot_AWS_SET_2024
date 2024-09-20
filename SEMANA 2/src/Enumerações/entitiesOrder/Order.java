package Enumerações.entitiesOrder;

import Enumerações.enums.OrderStatus;

import java.util.Date;

public class Order {

    private Integer id;
    private Date moment;
    private OrderStatus status;
        public Order() {
        }

    public Order(OrderStatus status, Integer id, Date moment) {
        this.status = status;
        this.id = id;
        this.moment = moment;
    }

    public Integer getId() {
        return id;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }





}

