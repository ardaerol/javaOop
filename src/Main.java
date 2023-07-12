import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

//        String mesaj = "asdaadsada";
//
//        Product product1 = new Product();
//        product1.setName("Delonghi Kahve Makinesi");
//        product1.setDiscount(7);
//        product1.setUnitPrice(7500);
//        product1.setUnitInStock(3);
//        product1.setImageUrl("image1.jpg");
//
////        System.out.println(product1.name + " " + product1.unitPrice + " "
////                + product1.unitInStock + " " + product1.discount + " " + product1.imageUrl);
//
//        Product product2 = new Product();
//        product2.setName("Smeg Kahve Makinesi");
//        product2.setDiscount(5);
//        product2.setUnitPrice(6500);
//        product2.setUnitInStock(4);
//        product2.setImageUrl("image2.jpg");
//
//
//        Product product3 = new Product();
//        product3.setName("Kitchen Kahve Makinesi");
//        product3.setDiscount(3);
//        product3.setUnitPrice(5500);
//        product3.setUnitInStock(2);
//        product3.setImageUrl("image3.jpg");
//
//        Product[] products = {product1, product2, product3};
//
//        for (Product product: products){
//            System.out.println(product.getName());
//        }

        IndividualCustomer individualCustomer = new IndividualCustomer();

        individualCustomer.setId(1);
        individualCustomer.setCustomerName("arda");
        individualCustomer.setCustomerSurname("erol");
        individualCustomer.setTcNo("1213123312312");
        individualCustomer.setPhone("3324234234");
        individualCustomer.setCustomerNumber("12345");

        System.out.println(individualCustomer.getCustomerName());

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("34131443413");
        corporateCustomer.setTaxNumber("1111111111");
        corporateCustomer.setCustomerNumber("54321");

        System.out.println(corporateCustomer.getCompanyName());

        Customer[] customers = {individualCustomer, corporateCustomer};

        for (Customer customer:customers) {
            System.out.println(customer.getCustomerNumber());
        }




    }
}
