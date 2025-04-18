package pertemuan3;

public class StrukturList {

    Node HEAD;

    StrukturList(){
        HEAD = null;
    }

    boolean isEmpty() {
        return HEAD == null;
    }

    public void addTail(int data) {
        Node posNode = null, curNode = null;
        Node newNode = new Node(data);
        if (isEmpty()){
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }
}
