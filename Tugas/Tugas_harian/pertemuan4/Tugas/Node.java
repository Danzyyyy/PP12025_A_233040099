package pertemuan4.Tugas;

public class Node {
        //Tugas 1
        private double data; // pergantian tipe data dari int ke double
        private Node next;
        public Node(double data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public double getData() {
            return data;
        }

        public void setData(double data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }
}