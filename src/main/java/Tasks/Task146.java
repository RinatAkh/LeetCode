package Tasks;

import java.util.HashMap;

public class Task146 {
    private HashMap<Integer, Node> cache;
    private int capacity;
    private Node head, tail;

    public Task146(int capacity) {
        this.cache = new HashMap<>(capacity);
        this.capacity = capacity;
    }

    public int get(int key) {
        Node node = cache.get(key);
        if(node != null) {
            moveToHead(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        Node node = cache.get(key);
        if(node != null) {
            node.value = value;
            moveToHead(node);
        } else {
            if(cache.size() == capacity) {
                cache.remove(tail.key);
                remove(tail);
            }
            Node newNode = new Node(key, value);
            addToHead(newNode);
            cache.put(key, newNode);
        }
    }

    private void moveToHead(Node node) {
        remove(node);
        addToHead(node);
    }

    private void remove (Node node) {
        Node prev = node.prev;
        Node next = node.next;
        if(prev != null) {
            prev.next = node.next;
        } else {
            head = next;
        }

        if(next != null) {
            next.prev = node.prev;
        } else {
            tail = prev;
        }
    }

    private void addToHead(Node node) {
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
        if(tail == null) {
            tail = head;
        }
    }

    private class Node {
        int key, value;
        Node prev, next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
