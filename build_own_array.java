import java.util.ArrayList;
class MyArray {
    int length;
    ArrayList<Object> data;

    MyArray(){
        this.length = 0;
        this.data = new ArrayList<>();
    }

    Object getIndex(int index){
        return this.data.get(index);
    }

    int push(Object item){
        this.data.add(item);
        this.length++;
        return this.length;
    }
    
    Object delete(int index){
        if(index < 0 || index >= this.length){
            return null;
        }
        this.shiftItems(index);
        this.pop();
        return this.data.get(index);
    }

    Object pop(){
        if(this.length == 0){
            return null;
        }
        Object item = this.data.remove(this.length - 1);
        this.length--;
        return item;
    }

    void shiftItems(int index){
        for(int i = index ; i< this.length - 1; i++){
            this.data.set(i, this.data.get(i + 1));
        }
    }

    public static void main(String args[]){
        MyArray arr = new MyArray();
        arr.push(1);
        arr.push(2);
        arr.push(3);
        arr.push("hello");
        arr.getIndex(0);
        arr.getIndex(1);
        arr.getIndex(2);
        System.out.println("Length of array: " + arr.length);
        System.out.println("Data in array: " + arr.data);
        System.out.println("Element at index 0: " + arr.getIndex(0));
        System.out.println("Element at index 1: " + arr.getIndex(1));      
        System.out.println("Element at index 2: " + arr.getIndex(2));
        System.out.println("Element at index 3: " + arr.getIndex(3));
        // System.out.println("Popped element: " + arr.pop());
        // System.out.println("Length of array after pop: " + arr.length);
        // System.out.println("Data in array after pop: " + arr.data);
        arr.delete(2);
        System.out.println("Length of array after delete: " + arr.length);
        System.out.println("Data in array after delete: " + arr.data);
    }

}

