import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListNode one1 = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four1 = new ListNode(4);
        ListNode four2 = new ListNode(4);
        ListNode one2 = new ListNode(1);
        one1.next = two;
        two.next = four1;
        one2.next = three;
        three.next = four2;

        one1.printList();
        one2.printList();

        ListNode merged = ListNode.mergeTwoLists(one1, one2);
        merged.printList();
    }
}

//    Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {

    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
    public void printList() {
        String strList = "[";
        ListNode node = this;
        while(node != null) {
            strList += node.val;
            if (node.next != null)
                strList += ",";
            if (node.next != null)
                node = node.next;
            else
                break;
        }
        strList += "]";
        System.out.println(strList);
    }
    public static ListNode mergeTwoLists(ListNode a, ListNode b) {

        ListNode headMerged = new ListNode();
        ListNode tail = headMerged;

        while (true) {

            if (a == null) {
                tail.next = b;
                break;
            }
            if (b == null) {
                tail.next = a;
                break;
            }
            if (a.val <= b.val) {
                tail.next = a;
                a = a.next;
            }
            else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        return headMerged.next;
    }
}