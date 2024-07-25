public class ShoppingCart {
    /**
     - Dependency Injection is specific implementation of IOC principle. It is technique used to inject the dependencies of a class
     into class itself rather than class creating its dependency.
     - There are mainly two ways of DI:
     1. Constructor Injection
     2. Setter Injection
     */
    private IPaymentProcessor paymentProcessor;

    ShoppingCart(){
    }

    public IPaymentProcessor getPaymentProcessor() {
        return paymentProcessor;
    }

    /**
     * This is the setter injection where dependency is provided through setter method.
     * @param paymentProcessor
     */
    public void setPaymentProcessor(IPaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    void checkOut(Double amount){
        paymentProcessor.proceedPayment(amount);
    }
}
