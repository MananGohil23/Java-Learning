class Product{
    int id;
    int price;
    String name;

    //Parameterized constructor
    Product(int id , int price , String name){
        this.id = id;
        this.price = price;
        this.name = name;
    }

    //Copy constructor
    Product(Product p){
        this.id = p.id;
        this.price = p.price;
        this.name = p.name;
    }

    public static void main(String args[]){
        Product p1 = new Product(1 , 100 , "Laptop");
        Product p2 = new Product(p1);

        System.out.println("Product 1: " + p1.id + " " + p1.price + " " + p1.name);
        System.out.println("Product 2: " + p2.id + " " + p2.price + " " + p2.name);
    }
}

