package pertemuan8;

//Latihan 1
public class Node {
    private Matakuliah data;
    private Node next;

    /** Inisialisasi atribut node */

    public Node(Matakuliah data) {
        this.data = data;
        this.next = null;
    }

    /** Setter dan Getter */

    public Matakuliah getData() {
        return data;
    }

    public void setData(Matakuliah data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
