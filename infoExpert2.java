
class Book{

    public String name;
    public String auther;
    public double price;

    public Book(String name, String auther, double price){
        this.name=name;
        this.auther=auther;
        this.price=price;
    }

    public double getPrice(){
       return price;
    }


}

class BookStore{

    public double priceCal(Book[] price){
         double total=0;

         for(int i=0; i<price.length; i++){
            total += price[i].getPrice();
         }

         return total;
    }

}

public class infoExpert2 {
    public static void main(String[] args) {
    Book b1=new Book("SDA", "Umer", 200);
    Book b2=new Book("SRE", "Taifoor", 200);
    Book b3=new Book("TSE", "Waqas", 200);
    
    Book[] books={b1,b2,b3};
    BookStore b=new BookStore();
    
    System.out.println("Total price is: " + b.priceCal(books));


    }
}
