class Volume{

    Volume(double r){
        System.out.println("Volume of sphere: " + (4.0/3.0)*3.14*r*r*r);
    }

    Volume(double r , int x){
        System.out.println("Volume of Hemisphere: " + (2.0/3.0)*3.14*r*r*r);
    }

}

class Main{
    public static void main(String args[]){
        Volume v1 = new Volume(5.0);
        Volume v2 = new Volume(5.0 , 1);
    }
}