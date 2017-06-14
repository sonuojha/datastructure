package com.DataStructures.LinkedList;

/**
 * Created by aojha on 5/23/17.
 */

class Node{
    int data;
    Node next;

    public void setLink(Node n){
        this.next = n;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getLink(){
        return next;
    }
}

class LinkList{
    protected Node start = null;
    protected Node end;

    public int size;

    public LinkList(){
        start = null;
        end = null;
        size = 0;
    }

    public boolean isEmpty(){
        return start == null;
    }

    public int getSize(){
        return size;
    }

    public  void updateSize(){
        size++;
    }


    public void createNode(int value){

        Node temp = new Node();

        temp.data = value;
        temp.next = null;

        if(start == null) {
            start = temp;
            end = start;
            updateSize();
        }
        else{
            end.next = temp;
            end = temp;
            updateSize();
        }
    }

    public void insertNodeAt(int value, int loc) throws Exception {
        Node temp = new Node();
        Node curr = start;
        temp.data = value;
        if(loc == 0){
            temp.next = start;
            start = temp;
            updateSize();
        }
        else {
            if(loc <= size){
                for(int i=1; i < loc; i++)
                    curr = curr.next;

                temp.next = curr.next;
                curr.next = temp;
                updateSize();
            }
            else{
                throw new Exception("index out of bound");
            }

        }
    }

    void reverse(){
        Node prev, curr, next;
        prev = null;
        curr = start;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        start = prev;
    }

    void reverseRecursive(Node p){
        if(p.next == null){
            start = p;
            return;
        }

        reverseRecursive(p.next);
        Node q = p.next;
        q.next = p;
        p.next = null;
    }

    void findMiddle(){
        Node slow, fast;
        slow = fast= start;

        while(fast!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    void swapPair(){
        Node curr = start;

        while(curr!= null && curr.next != null){
            int k = curr.data;
            curr.data = curr.next.data;
            curr.next.data = k;
            curr = curr.next.next;
        }
    }

    void removeDuplicateElementsfromSortedLL(){
        Node curr, next;
        curr = next = start;

        while(curr.next != null){

            if(curr.data == curr.next.data){
                next = curr.next.next;
                curr.next = next;
            }
            else {
                curr = curr.next;
            }

        }
    }

    public void display(){
        Node ptr = start;
        while(ptr != null){
            System.out.print(ptr.data+ " ");
            ptr = ptr.next;
        }
    }

}

class singllyLinkedList{
    public static void main(String[] args) {
        LinkList list = new LinkList();
        System.out.println("LL size : "+list.getSize());
        list.createNode(10);
        list.createNode(10);
        list.createNode(10);
        list.createNode(20);
        list.createNode(30);
        list.createNode(40);
        list.createNode(50);
        try {
            list.insertNodeAt(100, 4);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("LL size : "+list.getSize());
        list.reverseRecursive(list.start);
        list.removeDuplicateElementsfromSortedLL();

        list.findMiddle();
        list.swapPair();

        list.display();

    }
}






