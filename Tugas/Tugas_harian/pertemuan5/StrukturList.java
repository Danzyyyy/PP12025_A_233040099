package pertemuan5;

import pertemuan4.Node;


public class StrukturList {

    public Node HEAD;

    StrukturList(){
        HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void dispose(Node temp){
        temp.setNext(null);
        temp = null;
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

    //Latihan 1
    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List kosong");
        }
        else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }

    //Latihan 1
    public void removeMid(int e){
        Node preNode = new Node(0);
        Node tempNode;
        int i;
        boolean ketemu;

        if (HEAD == null){
            System.out.println("Element list kosong");
        } else {
            ketemu = false;
            i = 1;
            tempNode = HEAD;
            while (tempNode.getNext() != null && !ketemu)
            {
                if (tempNode.getData() == e){
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }
            if (ketemu)
            {
                if (i==1){
                    HEAD = null;
                } else {
                    preNode.setNext(tempNode.getNext());
                }
            }
        }
    }

    //Latihan 3
    public void removeTail(){
        Node preNode = null, lastNode;
        if (HEAD != null){
            if (HEAD.getNext()==null){
                HEAD = null;
            } else {
                lastNode = HEAD;
                while (lastNode.getNext() != null){
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }
                preNode.setNext(null);
            }
        }
    }
}
