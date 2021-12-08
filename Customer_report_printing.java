//Q4. Santa runs a local musical equipment store in your neighbourhood. He has contracted you to create an
//        interactive application that will assist him with customer purchases. Create a class named
//        Customer Purchases that will contain get and set methods for a customer number, first name, surname,
//        product, price and quantity. Create a separate class called Printing that will include a method called Print
//        Details, that will print the Customer Invoice. In the Printing class include another method called
//        Customer Purchase Report which will display the following information:
//        REPORT OPTION PERCENTAGE
//        TAX 15%
//        COMMISSION 8.5%
//        DISCOUNT 10%
//        TOTAL (Price + Tax) – (Discount + Commission)
//
//        In your main class,capture all the customer purchase details required to produce the reports.
class Printing{
    public void PrintDetails()
    {     Customer obj= new Customer();
        System.out.println("CUSTOMER INVOICE");
        System.out.println("***************************");
        System.out.println("CUSTOMER NUMBER: " + obj.customer_no);
        System.out.println("CUSTOMER NAME: " +obj.name);
        System.out.println("PRODUCT PRICE: R " + (obj.price));
        System.out.println("PRODUCT QUANTITY: " + obj.quantity);
        System.out.println("***************************");
    }
    public void report(){
        Customer obj= new Customer();
        double tax=0.15*obj.price;
        double commission=0.085* obj.price;
        double discount=0.1*obj.price;
        double total=(obj.price + tax) - (discount + commission);
        System.out.println("\nCUSTOMER PURCHASE REPORT");
        System.out.println("***************************");
        System.out.println("PRODUCT PRICE: R " + String.format("%.2d", obj.price));
        System.out.println("TAX (15%): R " + String.format("%.2f", tax));
        System.out.println("COMMISSION (8.5% ): R " + String.format("%.2f", commission));
        System.out.println("DISCOUNT (10% ): R " + String.format("%.2f", discount));
        System.out.println("TOTAL: R " + String.format("%.2f", total));
        System.out.println("***************************");
    }
    }

class Customer{
    int customer_no;
    String name;
    String product;
    int price,quantity;

    public int getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(int customer_no) {
        this.customer_no = customer_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
