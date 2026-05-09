class strcompare{
    public static void main(String args[])
    {
        // String:
        String s1 = "String";
        System.out.println("Concatenated String : "+s1.concat("hello"));
        System.out.println("Original String : "+s1);
        System.out.println("----------------------------------");
        // StringBuffer:
        StringBuffer sb1 = new StringBuffer("StringBuffer");
        System.out.println("Original String Buffer : " +sb1);
        sb1.append("hiiii");
        System.out.println("Modified original String Buffer :"+sb1);
    }
}