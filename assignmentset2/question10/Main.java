package corejava.collection.assignmentset2.question10;

public class Main {
    Node head;
    //pushing data at last of linked list
    public void push(int data){
        Node newNode = new Node(data);
        Node last = head;
        newNode.next = null;
        if(head == null){
            newNode.previous= null;
            head = newNode;
            return;
        }
        while (last.next !=null){
            last = last.next;
        }
        last.next = newNode;
        newNode.previous = last;
    }

    //pop (remove value at back);
    public Node deleteNode(Node delete){
        //Base Case
        return null;
    }


    //shift (remove value at front).



    //unshift (insert value at front);

    //print the doubly linked list
    public void printList(Node node){
        Node last = null;
        while(node != null){
            System.out.print(node.data+"  ");
            last = node;
            node = node.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.push(12);
        main.push(56);
        main.push(31);
        main.push(20);
        main.push(10);

        main.printList(main.head);
    }
}
