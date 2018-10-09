package doublyll;

public class Node<T> {
    public T value;
    public Node<T> next;
    public Node<T> previous;

    public Node(T value, Node<T> next, Node<T> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
}
