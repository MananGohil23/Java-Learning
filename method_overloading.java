class area{
    area(int side){
        int a = side*side;
        System.out.println(a);
    }
    area(int l , int w){
        int a = l*w;
        System.out.println(a);
    }
    area(){
        int a = 0;
        System.out.println(a);
    }
}
class axy{
    public static void main(String args[]){
        area p1 = new area(); 
        area p2 = new area(4);
        area p3 = new area(3 , 4); 
    }
}