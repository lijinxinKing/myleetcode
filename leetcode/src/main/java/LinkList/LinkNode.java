package LinkList;

public class LinkNode {
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }

    private LinkNode next;

    public LinkNode(){}

    public void setNewNext(int value){
        LinkNode newNode = new LinkNode(value);
        this.next = newNode;
    }

    public LinkNode(int data) {
        this.data = data;
        this.next = new LinkNode(data);
    }

}
