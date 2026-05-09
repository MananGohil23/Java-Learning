class digits{
    public static void main(String args[])
    {
        int num , temp=0;
        num = Integer.parseInt(args[0]);
        int counter = 0;
        temp = num;
        while(num!=0)
        {
            num = num/10;
            counter++;
        }
        System.out.println("The number "+ temp+ " contains " + counter + " digits");
    }
}