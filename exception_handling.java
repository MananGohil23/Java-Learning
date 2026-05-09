

class abc {
    public static void main(String[] args) {
        try{
            int num = Integer.parseInt("abc");
            int result = 10/0;
            int a[] = {1,2,3};
            System.out.println(a[5]);
            String str = null;
            System.out.println(str.length());
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}