package com.bridgelabz.datastructure;

class LinkedList<E> {
    Node<E> head;
    Node<E> tail;

    public Node search(E key) {
        Node<E> temp = head;
        if (head == null) {
            return null;
        }
        while (temp != null) {
            if (temp.getData().equals(key)) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    public void append(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public void display() {
        Node<E> temp = head;
        if (head == null) {
            System.out.println("Linked List is empty");
        }
        while (temp != null) {
            System.out.print(temp.getData() + " , ");
            temp = temp.getNext();
        }
    }

    public Boolean deletion(E deleteData) {
        Node<E> deleteNode = search(deleteData);
        Node<E> temp = head;
        Node<E> node1 = new Node<>();
        while (temp != null) {
            if (temp.getNext().equals(deleteNode)) {
                temp.setNext(deleteNode.getNext());
                deleteNode.setNext(null);
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public void add(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }
}
