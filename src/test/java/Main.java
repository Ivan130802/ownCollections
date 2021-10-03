public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(5);
        list.add(5);
        list.add(2);
        list.add(3);

        list.remove(5);

        list.print();

    }
}
