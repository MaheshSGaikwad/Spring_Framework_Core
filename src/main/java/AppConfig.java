import org.springframework.context.annotation.Bean;

public class AppConfig {
    /**
     @Bean Annotation:
      - The @Bean Annotation is used to indicates that method instantiates,configure & initialize a new object to be managed by
        Spring IOC Container.
      - Basically it is similar to the <bean> </bean> in the XML config.
     */
    @Bean("phonePay")
    public PhonePayPaymentProcessor createPhonePayPaymentProcessor(){
        return new PhonePayPaymentProcessor();
    }
    @Bean("gPay")
    public GPayPaymentProcessor createGPayPaymentProcessor(){
        return new GPayPaymentProcessor();
    }
    @Bean("shoppingCart")
    public ShoppingCart createShoppingCart(){
        return new ShoppingCart(createGPayPaymentProcessor());
    }
}
