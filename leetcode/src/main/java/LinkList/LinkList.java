package LinkList;

public class LinkList {
    private LinkNode head;
    private LinkNode current;
    public LinkList(LinkNode node){
        this.head = new LinkNode(node.getData());
        current = head;
    }
    public void append(int value){
        current.setNewNext(value);
        current = current.getNext();
    }

    public void remove(int destation){
        LinkNode pointer = this.head;
        for (int i = 0; i <destation - 1; i++) {
            pointer = pointer.getNext();
        }
        LinkNode temp = pointer.getNext().getNext();
        pointer.setNext(temp);
    }

    public void insert(int destation, int value){
        LinkNode pointer = this.head;
        for (int i = 0; i < destation; i++) {
            pointer = pointer.getNext();
        }
        LinkNode temp = pointer.getNext();
        LinkNode newNode = new LinkNode(value);
        pointer.setNext(newNode);
        newNode.setNext(temp);
    }

    public int at(int index){
        LinkNode pointer = this.head;
        int position = 0;
        while (pointer != null){
            if (pointer.getData() == index){
                break;
            }
            position++;
            pointer = pointer.getNext();
        }
        return position;
    }

    public void display(){
        LinkNode pointer = this.head;
        while (pointer != null){
            System.out.println("Data: " + pointer.getData());
            pointer = pointer.getNext();
        }
    }

    public int size(){
        LinkNode pointer = this.head;
        int position = 0;
        while (pointer != null){
            position++;
            pointer = pointer.getNext();
        }
        return position;
    }

    public static void main(String[] args) {

        LinkNode linkNode = new LinkNode();
        linkNode.setData(32);
        linkNode.setNext(null);
        LinkList linkList = new LinkList(linkNode);

        linkList.display();

    }
}
