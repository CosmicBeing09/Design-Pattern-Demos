package behavioral_design_patterns.iterator;

import java.util.NoSuchElementException;

public class MyList <T>{

    private Node<T> head;
    private Node<T> tail;

    public MyList(){
        head = null;
        tail = null;
    }

    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    public MyIterator<T> iterator(){
        return new MyListIterator<>(head);
    }

    private static class MyListIterator<T> implements MyIterator<T>{

        private Node<T> currentNode;

        public MyListIterator(Node<T> node){
            currentNode = node;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            T data = currentNode.data;
            currentNode = currentNode.next;
            return data;
        }
    }


    private static class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
            next = null;
        }
    }
}
