// import java.io.IOException;

class throwsExample{
    static void display() throws Exception{
        throw new Exception("This is an exception");
    }
    public static void main(String args[]){
        try{
            display();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
