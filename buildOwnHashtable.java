
class HashTable {
    public Object table[][];

    HashTable(int size) {
        table= new Object[size][2];
    }

    private int hashFunction(Object key){
        return key.hashCode() % table.length;
    }

    void set(Object key , Object value) {
        int index = hashFunction(key);
        if(table[index][0] == null){
            table[index][0] = key;
            table[index][1] = value;
        }
        else if(table[index][0].equals(key)){
            table[index][1] = value;
        }
        else{
            System.out.println("Collision occurred for key : " + key);
        }
    }

    void get(Object key){
        int index = hashFunction(key);
        if(table[index][0] == key){
            System.out.println("Value for the key " + key + " is : " + table[index][1]);
        }
        else{
            System.out.println("Key not found");
        }
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable(10);
        ht.set("Name", "John");
        ht.get("Name");
        ht.get("Age");
    }
}