class strbffr{
    public static void main(String args[])
    {
        StringBuffer sb1 = new StringBuffer("hi");
        sb1.append("java");
        System.out.println(sb1);
        sb1.reverse();
        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb1.capacity());
        sb1.insert(1 , "xyz");
        sb1.delete(1,3);
        sb1.setCharAt(0 , 'k');
        System.out.println(sb1);
    }
}