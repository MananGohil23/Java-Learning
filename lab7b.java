class Shape {
    int length, breadth;
    Shape() {
        length = 0;
        breadth = 0;
    }
    Shape(int side) {
        length = side;
        breadth = side;
    }
    Shape(int l, int b) {
        length = l;
        breadth = b;    
    }
    Shape(Shape s) {
        length = s.length;
        breadth = s.breadth;
    }
    void displayArea() {
        System.out.println("Area: " + (length * breadth));
    }
}
class lab7b {
    public static void main(String[] args) {
        Shape square = new Shape(5);
        square.displayArea();
        Shape rectangle = new Shape(4, 6);
        rectangle.displayArea();
        Shape copyShape = new Shape(rectangle);
        copyShape.displayArea();
    }
}