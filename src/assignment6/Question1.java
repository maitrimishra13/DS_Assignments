package assignment6;

public class Question1 {
    public static class DoubleLinkedList{
        private static class Node{
            int data;
            Node next;
            Node prev;
            Node(int val) {
                data = val;
                prev = null;
                next = null;
            }
        }

        private final Node head;

        public DoubleLinkedList() {
            head = null;
        }

        public void search(int num){
            if(head == null){
                System.out.println("List is empty");
            }
            Node cur = head;
            while(cur != null){
                if(cur.data == num){
                    System.out.println("Element found");
                    return;
                }
                cur = cur.next;
            }
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.search(1);
        list.search(2);
    }
}
