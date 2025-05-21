package Pertemuan10.Tugas2;

public class AbstractStack {
    //Latihan 2
    protected int[] array;
    private int capacity, TOP;

    public final int MIN = -1;

    //Latihan 2
    public AbstractStack(int capacity) {
        super();
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }
    public AbstractStack() {
        this(5);
    }

    public boolean isFull(){
        return (TOP == capacity - 1);
    }

    public int size(){
        return TOP + 1;
    }

    public int top(){
        if(isEmpty()){
            System.out.println("Stack kosong");
            return -1;
        } else {
            return array[TOP];
        }
    }

    //Latihan 3
    public boolean isEmpty(){
        return (TOP == MIN);
    }

    //Latihan 1
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            TOP++;
            array[TOP] = data;
        }
    }

    public int pop() {
        int temp = 0;
        if(isEmpty()){
            System.out.println("Stack kosong");
        } else {
            temp = array[TOP];
            TOP = TOP - 1;
        }
        return temp;
    }

    public String displayStack(){
        if (isEmpty()) {
            System.out.print("Elemen From TOP: ");
        } else {
            System.out.print("Elemen From TOP: ");
            for (int i = TOP; i >= 0; i--) {
                System.out.print(" " + array[i]);
            }
        }
        return "";
    }
}
