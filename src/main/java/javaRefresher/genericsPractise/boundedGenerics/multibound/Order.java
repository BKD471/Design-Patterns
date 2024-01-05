package javaRefresher.genericsPractise.boundedGenerics.multibound;

import javaRefresher.genericsPractise.boundedGenerics.multibound.ootbclasses.AbstractWriter;
import javaRefresher.genericsPractise.boundedGenerics.multibound.ootbclasses.IPdfService;
import javaRefresher.genericsPractise.boundedGenerics.multibound.ootbclasses.IimageService;

import java.util.UUID;

public class Order extends AbstractWriter implements IimageService, IPdfService {
    private final UUID productId;
    private final String productName;
    private final Double productPrice;

    public Order(UUID productId,String productName,Double productPrice){
        this.productId=productId;
        this.productName=productName;
        this.productPrice=productPrice;
    }


    /**
     *
     */
    @Override
    public void pdfAlgo() {
        System.out.println("Using Pdf algo 1...................");
    }

    /**
     *
     */
    @Override
    public void imageAlgo() {
        System.out.println("using img gene algo 2.....................");
    }

    @Override
    public String toString() {
        return "Order{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                "} " + super.toString();
    }
}
