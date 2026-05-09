class strref{
    public static void main(String args[])
    {
        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.println("String1 : "+s1 +"\nString2 : "+s2);
        System.out.println("Using the .equals() funtion :");
        System.out.println("s1.equals(s2) = "+s1.equals(s2));
        System.out.println("Using the '==' operator :");
        System.out.println("s1==s2 : "+(s1==s2));
    }
}