package com.sda.kolekcje;

public class CustomLinkedList<E> implements CustomList<E> {

    private int size;
    private Node head;

    public CustomLinkedList(){
        head = new Node(null);
    }

    @Override
    public void addTail(E e) {
        
    }

    @Override
    public void find(int index) {
        Node tmp = head;
    for (int i=0; i<index; i++){
        tmp = tmp.next;
    }
        System.out.println(tmp);
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void add(E e) {
    Node copy = head;
        System.out.println("Wartosc copy:" + copy);
    head = new Node(e);
        System.out.println("Wartosc head:" + head);
    head.next = copy;
        System.out.println("Wartość next: "+ head.next);
    size++;
    }
    public void printList(){
        Node tmp = head;
        while (tmp != null){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }

    }
    @Override
    public int size() {
        return 0;
    }
    class Node{
        private Object data;
        private Node next;

        public Node(Object data){
            this.data = data;
        }
        public Object GetData() {
            return this.data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
    }
