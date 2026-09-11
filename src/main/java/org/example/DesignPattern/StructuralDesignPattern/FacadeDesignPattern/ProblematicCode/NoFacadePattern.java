package org.example.DesignPattern.StructuralDesignPattern.FacadeDesignPattern.ProblematicCode;

public class NoFacadePattern {

    public static void main(String[] args) {
        UserService userService = new UserService();
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();
        System.out.println(userService.getUserDetails("John"));
        System.out.println(orderService.getOrderDetails("12345"));
        System.out.println(paymentService.getPaymentDetails("98765"));
        // The client is individually calling the services.
    }
}





class UserService {
    public String getUserDetails (String userName) {
        return "Getting user details for " + userName;
    }
}
class OrderService {
    public String getOrderDetails (String orderId) {
        return "Getting order details for " + orderId;
    }
}
class PaymentService {
    public String getPaymentDetails (String paymentId) {
        return "Getting payment details for " + paymentId;
    }
}