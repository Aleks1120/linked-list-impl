public class List {
    private Node head;

    public static List insert(List list, int data) {
        Node newNode = new Node(data, null);

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node element = list.head;
            while (element.getNext() != null) {
                element = element.getNext();
            }
            element.setNext(newNode); //the last node's "next" reference set to our new node
        }
        return list;
    }

    public static void printList(List list) {
        Node currNode = list.head;
        System.out.print("Sunny's List: ");

        while (currNode != null) {
            System.out.print(currNode.getData() + " ");
            currNode = currNode.getNext();
        }
    }
}

