package Collections_ADT;

public class LinkedList {
        Node head;
        Node tail;
        int size;

        //Constructors
        public LinkedList(){
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        //Copy Constructor
        public LinkedList(LinkedList list){
            this.head = list.head;
            this.tail = list.tail;
            this.size = list.size;
        }

        //Creation of list with Data
        public void create(int data){
            if(this.head!=null){
                System.out.println("LinkedList Already created!!!");
            }
            this.head = new Node(data);
            this.tail = this.head;
            this.size++;
        }

        //Adding Element at First Place
        public void addFirst(int data){
            Node node = new Node(data);
            if(this.head == null){
                this.head = node;
                this.tail = node;
            }
            else{
                node.next = this.head;
                this.head = node;
            }
            this.size++;
        }

        //Adding Element at Last Place
        public void addLast(int data){
            Node node = new Node(data);
            if(this.head == null){
                this.head = node;
                this.tail = node;
            }
            else{
                this.tail.next = node;
                this.tail = node;
            }
            this.size++;
        }

        //Adding Element At nth Position
        public void addAtPosition(int n, int data){
            if(n > this.size+1 || n < 1){
                System.out.println("Position Range should between 1 to " + this.size + ".");
            }
            else if(n == 1){
                if(this.head == null){
                    this.head = new Node(data);
                    this.tail = this.head;
                }
                else{
                    Node node = new Node(data);
                    node.next = this.head;
                    head = node;
                }
                this.size++;
            }
            else{
                Node node = new Node(data);
                Node temp = this.head;
                int pos = 1;
                while(temp.next != null && pos < n-1) {
                    temp = temp.next;
                    pos++;
                }
                node.next = temp.next;
                temp.next = node;
                this.size++;
            }
        }

        //Deleting First Element From LinkedList
        public void deleteFirst(){
            if(this.head == null){
                System.out.println("LinkedList is already Empty!");
            }
            else{
                this.head = this.head.next;
            }
        }

        //Deleting Last Element From LinkedList
        public void deleteLast(){
            if(this.head == null){
                System.out.println("LinkedList is already Empty!");
            }
            else{
                Node temp = this.head;
                while(temp.next.next != null){
                    temp = temp.next;
                }
                temp.next = null;
                this.tail = temp;
            }
        }

        //Deleting Element of LinkedList For given Position
        public void deleteAtPosition(int n){
            if(this.head == null){
                System.out.println("LinkedList is already Empty!");
            }
            else if(n > this.size || n < 1){
                System.out.println("Position Range should between 1 to " + this.size + ".");
            }
            else if(n == 1){
                this.head = this.head.next;
            }
            else{
                Node temp = this.head;
                int pos = 1;
                while(temp != null && pos < n-1){
                    temp = temp.next;
                    pos++;
                }
                if(n == this.size){
                    this.tail = temp;
                }
                temp.next = temp.next.next;
            }
        }

        //To Check Element is Present or Not
        public boolean isExist(int data){
            Node temp = this.head;
            while(temp != null){
                if(temp.data == data){
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }

        //Returns Position of Given Element
        public int getPosition(int data){
            if(this.head == null){
                return -1;
            }
            Node temp = this.head;
            int pos = 1;
            while(temp != null){
                if(temp.data == data){
                    return pos;
                }
                pos++;
                temp = temp.next;
            }
            return -1;
        }

        //Update Element at Given Position
        public void updateAtPosition(int n, int data){
            if(n > this.size || n < 1 || this.head == null){
                System.out.println("Position Range should between 1 to " + this.size + ".");
            }
            else{
                Node temp = this.head;
                int pos = 1;
                while(temp.next != null && pos < n){
                    temp = temp.next;
                    pos++;
                }
                temp.data = data;
            }
        }

        //Reverse LinkedList Iterative Method
        public void reverseIterative(){
            if(this.head == null || this.size == 1){
                return;
            }
            else if(this.size == 2){
                Node temp = this.head;
                temp.next.next = temp;
                temp.next = null;
                this.head = this.tail;
                this.tail = temp;
            }
            else{
                Node pre = null;
                Node curr = this.head;
                Node post = this.head.next;
                while(curr != null){
                    curr.next = pre;
                    pre = curr;
                    curr = post;
                    if(post != null) {
                        post = post.next;
                    }
                }
                this.tail = this.head;
                this.head = pre;
            }
        }

        //Reverse LinkedList Recursive Method
        public static Node reverseRecursive(Node node) {
            if (node.next == null) {
                return node;
            }
            Node newHead = reverseRecursive(node.next);
            node.next.next = node;
            node.next = null;
            return newHead;
        }

        //Print the LinkedList
        public void printList(){
            Node temp = this.head;
            while(temp != null){
                System.out.print("[" + temp.data + "]-->");
                temp = temp.next;
            }
            System.out.println("X");
        }

        //Print the LinkedList
        public static void printList(Node root){
            Node temp = root;
            while(temp != null){
                System.out.print("[" + temp.data + "]-->");
                temp = temp.next;
            }
            System.out.println("X");
        }

        //Check if LinkedList is Empty
        public boolean isEmpty(){
            return this.size == 0;
        }

        //Returns Size of LinkedList
        public int getSize(){
            return this.size;
        }

        //Returns First Node Reference
        public Node getRoot(){
            return this.head;
        }
    }

