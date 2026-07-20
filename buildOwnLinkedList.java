class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;
        Node previous;

        Node(int d) {
            data = d;
            next = null;
            previous = null;
        }
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.previous = current;
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) {
            head.previous = newNode;
        }
        head = newNode;
    }

    public void insert(int data, int position) {
        Node newNode = new Node(data);
        if(position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for(int i = 0; i<position-1 && current !=null; i++) {
            current = current.next;
        }
        if(current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void remove(int data) {
        if(head == null) return;
        if(head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next != null) {
            if(current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void reverse() {
        Node current = head;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.prepend(0);
        list.insert(4, 2);
        list.remove(3);
        list.reverse();
        list.display(); // Output: 2 4 1 0
    }
}