package pertemuan9;

public class QueueMain {
    public static void main(String[] args) {
        //Latihan 4
        StrukturQueue q = new StrukturQueue();
        System.out.println("### Sebelum Enqueue 3x ###");
        System.out.println("size: " + q.size());
        System.out.println("isEmpty: " + q.isEmpty());

        System.out.println();

        System.out.println("### Enqueue 3x ###");
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(1);
        System.out.println("size: " + q.size());
        System.out.println("isEmpty: " + q.isEmpty());
        System.out.println("Front: " + q.front());

        System.out.println();

        //Latihan 5
        StrukturQueue q2 = new StrukturQueue();
        System.out.println("### Sebelum Enqueue 4x ###");
        q2.displayElementsNoQueue();

        System.out.println("### Enqueue 4x ###");
        q2.enqueue(2);
        q2.enqueue(7);
        q2.enqueue(6);
        q2.enqueue(1);
        q2.displayElements();

        System.out.println();

        StrukturQueue q4 = new StrukturQueue();
        System.out.println("### Sebelum Dequeue ###");
        q4.enqueue(2);
        q4.enqueue(7);
        q4.enqueue(6);
        q4.enqueue(1);
        q4.displayElements();

        System.out.println();

        System.out.println("### Dequeue ###");
        q4.dequeue();
        q4.displayElements();
    }
}
