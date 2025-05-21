package pertemuan9;

public class StrukturQueue {

    //Latihan 2
    public Node FRONT, REAR;

    StrukturQueue() {
        FRONT = null;
    }

    //Latihan 2
    public boolean isEmpty() {
        return FRONT == null;
    }


    public int count() {
        Node curNode = FRONT;
        int jum = 0;

        while (curNode != null) {
            jum++;
            curNode = curNode.getNext();
        }
        return jum;
    }

    //Latihan 1
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }

    public int dequeue() {
        int data = -1;
        if (!isEmpty()) {
            data = FRONT.getData();
            FRONT = FRONT.getNext();
            if (isEmpty()) {
                REAR = null;
            }
        }
        return data;
    }

    //Latihan 3
    public int size() {
        int size = 0;
        Node curNode = FRONT;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    //Latihan 3
    public int front() {
        return FRONT != null ? FRONT.getData() : -1;
    }

    //Latihan 5
    public void displayElements() {
        if (isEmpty()) {
            System.out.println("size: " + size());
            System.out.println("isEmpty: " + isEmpty());
            System.out.println("Queue Kosong");
        } else {
            Node curNode = FRONT;
            System.out.println("size: " + size());
            System.out.println("isEmpty: " + isEmpty());
            System.out.print("Elemen Queue: ");
            while (curNode != null) {
                System.out.print(curNode.getData() + " ");
                curNode = curNode.getNext();
            }
            System.out.println();
            System.out.println("Front: " + front());
        }
    }

    //Latihan 5
    public void displayElementsNoQueue(){
        if (isEmpty()) {
            System.out.println("size: " + size());
            System.out.println("isEmpty: " + isEmpty());
            System.out.println("Elemen Queue: Queue Kosong");
        } else {
            Node curNode = FRONT;
            System.out.println("size: " + size());
            System.out.println("isEmpty: " + isEmpty());
            System.out.print("Elemen Queue: ");
            System.out.println();
        }
        System.out.println();
    }
}
