class Throw{
    public static void main(String args[]){
        int age = 15;
        if(age<18){
            throw new NumberFormatException("not eligible");
        }
        System.out.println("Can not vote");
    }
}