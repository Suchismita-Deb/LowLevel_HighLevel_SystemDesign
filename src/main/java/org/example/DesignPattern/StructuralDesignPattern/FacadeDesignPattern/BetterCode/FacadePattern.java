package org.example.DesignPattern.StructuralDesignPattern.FacadeDesignPattern.BetterCode;

public class FacadePattern {
    public static void main(String[] args) {
        APIGateway apiGateway = new APIGateway();
        String fullOrderDetails = apiGateway.getFullOrderDetails("user123", "order456", "payment789");
        System.out.println(fullOrderDetails);
    }
}
class APIGateway {
    UserService userService;
    OrderService orderService;
    PaymentService paymentService;

    public APIGateway() {
        userService = new UserService();
        orderService = new OrderService();
        paymentService = new PaymentService();
    }

    public String getFullOrderDetails(String userId, String orderId, String paymentId) {


        String userDetails = userService.getUserDetails(userId);
        String orderDetails = orderService.getOrderDetails(orderId);
        String paymentDetails = paymentService.getPaymentDetails(paymentId);

        return userDetails+ "\n"+orderDetails+"\n"+paymentDetails;
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