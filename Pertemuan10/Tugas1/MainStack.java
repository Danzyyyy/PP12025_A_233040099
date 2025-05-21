package Pertemuan10.Tugas1;

public class MainStack {
    public static void main(String[] args) {
        //Latihan 4
        System.out.println("#Sebelum push");
        StrukturStack stack = new StrukturStack(3);
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayStack();

        System.out.println();

        System.out.println("#Melakukan push 3x");
        stack.push(2);
        stack.push(4);
        stack.push(1);

        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.displayStack();

        System.out.println();

        //Tugas
        stack.pop();
        stack.pop();

        System.out.println("Setelah pop");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.println(stack.displayStack());



    }
}
