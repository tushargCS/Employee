//Q2. Create a class Book with the following information.
//        Member variables : name (String), author (of the class Author you have just created),
//        price (double), and qtyInStock (int)
//        [Assumption: Each book will be written by exactly one Author]
//        Parameterized Constructor: To initialize the variables
//        Getter methods  for all the member variables
public class Book {
    String name;
    double price;
    int qtyInStocks;
    public void getDimension(String name,double price,int qtyInStocks){
        this.name=name;
        this.price=price;
        this.qtyInStocks=qtyInStocks;
    }
    public void showDimension(){
        System.out.println(name);
        System.out.println(qtyInStocks);
        System.out.println(price);
    }
    public static void main(String[] args) {
        Book obj = new Book();
        obj.getDimension("tush",123,4);
          obj.showDimension();
    }

}
