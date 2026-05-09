class demo {
    int x;
    int y;

    demo(int X, int Y) {
        x = X;
        y = Y;
    }

    demo(demo obj) {
        x = obj.x;
        y = obj.y;
    }

    void display() {
        System.out.println("x : " + x + "\ny : " + y);
    }
}
class cpy {
    public static void main(String args[]) {
        demo d1 = new demo(5, 6);
        demo d2 = new demo(d1);
        d2.display();
    }
}