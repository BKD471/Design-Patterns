package structural.registry;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Runner {
    private static Registry<String,Service> registry=Registry.getInstance();

    public static void registerMyServices(List<Service> serviceList){
        serviceList.stream().forEach( service-> registry.set(service.getServiceId(),service));
    }
    public static void main(String[] args) {
        List<Service> serviceList= Arrays.asList(
                new Service("6a84edae-b2fc-4696-9f18-1cbf9eb2691d",8080,"AccountsApplication",
                        LocalDateTime.of(2024,01,04,21,50),
                        Duration.between(LocalDateTime.of(2024,01,04,21,50),LocalDateTime.now())
                        ,true),
                new Service("f258bcfd-b79c-45d6-bdb4-788ed426aea6",8081,"CardApplication",
                        LocalDateTime.of(2024,01,04,20,25),
                        Duration.between(LocalDateTime.of(2024,01,04,20,25),LocalDateTime.now())
                        ,true),
                new Service("ab616543-19cd-47d0-b00d-06052eefc3de",8082,"LoanApplication",
                        LocalDateTime.of(2024,01,04,21,15),
                        Duration.between(LocalDateTime.of(2024,01,04,21,15),LocalDateTime.now())
                        ,true),
                new Service("e64bf38f-60e6-4719-8eeb-0d430ad20f90",8083,"EmailNotificationApplication",
                        LocalDateTime.of(2024,01,04,21,18),
                        Duration.between(LocalDateTime.of(2024,01,04,21,18),LocalDateTime.now())
                        ,true),
                new Service("143d8c87-707d-4ea2-9185-ed5a6f05ad7f",8084,"PaymentApplication",
                        LocalDateTime.of(2024,01,04,21,35),
                        Duration.between(LocalDateTime.of(2024,01,04,21,35),LocalDateTime.now())
                        ,true));

        registerMyServices(serviceList);
        System.out.println(serviceList);
        System.out.println("#######################################################################################");

        //6a84edae-b2fc-4696-9f18-1cbf9eb2691d--> accnt
        //f258bcfd-b79c-45d6-bdb4-788ed426aea6--> cards
        //ab616543-19cd-47d0-b00d-06052eefc3de--> loans
        //e64bf38f-60e6-4719-8eeb-0d430ad20f90--> email
        //143d8c87-707d-4ea2-9185-ed5a6f05ad7f-->payment

        //Get card service details fromregistry
        Service cardService=registry.get("f258bcfd-b79c-45d6-bdb4-788ed426aea6");
        System.out.println(cardService);

        //Get payment service details fromregistry
        Service paymentService=registry.get("143d8c87-707d-4ea2-9185-ed5a6f05ad7f");
        System.out.println(paymentService);


        //lets check the singleton nature
        System.out.println("######################## SINGLETON NATURE #########################################");
        Registry<String,Service> registry2=Registry.getInstance();
        System.out.println(registry.hashCode());
        System.out.println(registry2.hashCode());

        //load details from registry2
        //Get card service details from registry2
        Service cardService2=registry2.get("f258bcfd-b79c-45d6-bdb4-788ed426aea6");
        System.out.println(cardService2);

        //Get payment service details from registry2
        Service paymentService2=registry2.get("143d8c87-707d-4ea2-9185-ed5a6f05ad7f");
        System.out.println(paymentService2);
    }

    /********No matter how many instances of service registry gets created , we have one *******/
}
