class digits{
    public static void main(String args[])
    {
        // System.out.println("Enter a number : ");
        int num;
        num = Integer.parseInt(args[0]);
        int counter = 0;
        while(num!=0)
        {
            num = num/10;
            counter++;
        }
        System.out.println("The number of digits in the number is : "+counter);
    }
}