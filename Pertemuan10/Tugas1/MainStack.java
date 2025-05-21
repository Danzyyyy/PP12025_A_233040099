package Pertemuan10.Tugas1;

public class MainStack {
    public static void main(String[] args) {
        //Latihan 4
        System.out.println("#Sebelum push");
        StrukturStack stack = new StrukturStack();
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.println("Elemen From TOP: " + stack.displayElements());

        System.out.println("#Melakukan push 3x");

        StrukturStack stack2 = new StrukturStack(3);
        stack2.push(2);
        stack2.push(4);
        stack2.push(1);

        System.out.println("Size: " + stack2.size());
        System.out.println("Empty: " + stack2.isEmpty());
        System.out.println("Full: " + stack2.isFull());
        System.out.println("Top: " + stack2.top());
        System.out.println("Elemen From TOP: " + stack2.displayElements());

        System.out.println();

        //Tugas
        stack2.pop();
        stack2.pop();

        System.out.println("Setelah pop");
        System.out.println("Size: " + stack2.size());
        System.out.println("Empty: " + stack2.isEmpty());
        System.out.println("Full: " + stack2.isFull());
        System.out.println("Top: " + stack2.top());
        System.out.println("Elemen From TOP: " + stack2.displayElements());



    }
}
