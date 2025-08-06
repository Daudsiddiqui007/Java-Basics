package Collections_ADT;

public class LL_Main {

        public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.create(4);
//        list.printList();
            list.addFirst(8);
            list.addLast(3);
            list.addFirst(7);
            list.addLast(6);
            list.addAtPosition(3, 2);
//        System.out.println(list.getPosition(5));
//        list.printList();
            list.updateAtPosition(2, 1);
            list.printList();
            Node root = LinkedList.reverseRecursive(list.getRoot());
            LinkedList.printList(root);
        }
    }


