import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShoppingCartApplication {
    public static void main(String [] arg){
        /**
         * In the Spring, dependency are injected by using xml file configuration or Java config class.
         */
        System.out.println("Setter Injection using XML file(beans.xml) ");
        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        ShoppingCart shoppingCart1 = xmlApplicationContext.getBean("shoppingCart",ShoppingCart.class);
        shoppingCart1.checkOut(10.10);
        System.out.println();

        System.out.println("Setter Injection using Java Config file(AppConfig.java) ");
        ApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ShoppingCart shoppingCart2 = configApplicationContext.getBean("shoppingCart",ShoppingCart.class);
        shoppingCart2.checkOut(10.10);
    }
}
