import java.util.*;
class stdvec{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> stdmarks = new Vector<>();
        System.out.println("Enter marks of 5 subjects :");
        for(int i=0;i<5;i++)
        {
            stdmarks.add(sc.nextInt());
        }
        System.out.println(stdmarks);
        int vecsize = stdmarks.size();
        int veccapacity = stdmarks.capacity();
        System.out.println("Size of the vector : "+vecsize+"\nCapacity of the vector : " + veccapacity);
        System.out.println("Enter marks that you want to insert into the vector :");
        int new_mark = sc.nextInt();
        System.out.println("Enter the index at which the mark should be added :");
        int new_mark_index = sc.nextInt();
        stdmarks.insertElementAt(new_mark, new_mark_index);
        System.out.println(stdmarks);
        System.out.println("Enter the index of the element that you want to remove from the vector :");
        int rem_mar_index = sc.nextInt();
        stdmarks.remove(rem_mar_index);
        System.out.println(stdmarks);
        System.out.println("Enter the marks that you wanna check whether it is present in the vector or not :");
        int check_mark = sc.nextInt();
        if(stdmarks.contains(check_mark)){
            System.out.println("The marks "+check_mark+" is present in the vector.");
        }
        else{
            System.out.println("The marks "+check_mark+" is not present in the vector.");           
        }
        System.out.println("First Element of the vector : "+stdmarks.elementAt(0)+"\nLast Element of the vector : "+stdmarks.elementAt(vecsize-1));
    }
}