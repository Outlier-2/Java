package cn.l13z.lawOfDemeterPattern;

// 场景：订单系统中，顾客需要查看订单详细信息，但不需要直接与订单类交互
// Scenario: In an order system, customers need to view order details, but do not need to directly interact with the order


class Order {

    String getOrderDetails() {
        return "Order Details";
    }
}

class OrderService {

    String getOrderDetails(Order order) {
        return order.getOrderDetails();
    }

}

class Customer {

    private final OrderService orderService;

    Customer(OrderService orderService) {
        this.orderService = orderService;
    }

    /**
     * @param order {@link Order}
     * @return {@link String}
     */
    String viewOrderDetails(Order order) {
        return this.orderService.getOrderDetails(order);
    }
}



/**
 * @author AlfredOrlando
 */
public class LawOfDemeterPattern {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        Customer customer = new Customer(orderService);
        Order order = new Order();

        String orderDetails = customer.viewOrderDetails(order);
        System.out.println(orderDetails);

    }
}
