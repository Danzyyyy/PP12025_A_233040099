package pertemuan9;

public class Node {
    //Latihan 1
        private int data;
        private Node next;

        /** Inisialisasi atribut node */

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        /** Setter dan Getter */

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
}
