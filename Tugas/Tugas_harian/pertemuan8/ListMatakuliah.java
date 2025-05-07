package pertemuan8;

public class ListMatakuliah {

    public Node HEAD;

    ListMatakuliah(){
        HEAD = null;
    }

    boolean isEmpty() {
        return HEAD == null;
    }

    //Tes-2
    public void addTail(Matakuliah data) {
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

    //Latihan 2
    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        }
        else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    //Tes-3
    public void addMid(Matakuliah data, int position){
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

    public int count(){
        Node curNode = HEAD;
        int jum = 0;

        while(curNode != null){
            jum++;
            curNode = curNode.getNext();
        }
        return jum;
    }

    //Latihan 3
    public void displayElements() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node curNode = HEAD;
            while (curNode != null) {
                System.out.println("Matakuliah: "+ curNode.getData().getKode() + ", " + curNode.getData().getNama() + ", " + curNode.getData().getSks());
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }
}
