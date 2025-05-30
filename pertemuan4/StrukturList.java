package pertemuan4;


public class StrukturList {

    public Node HEAD;

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


    public void addHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        }
        else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addMid(int data, int position){
        Node posNode = null, curNode;
        int i;
        Node newNode = new Node(data);
        if(HEAD == null){
            HEAD = newNode;
        }
        else {
            curNode = HEAD;
            if(position == 1){
                newNode.setNext(curNode);
                HEAD = newNode;
            }
            else {
                i = 1;
                while(curNode != null && i < position){
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }

    public void displayElements() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.printf(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }
}
