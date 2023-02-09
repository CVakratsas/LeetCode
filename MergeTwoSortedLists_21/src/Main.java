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

        new ListNode().printList(one1);
        new ListNode().printList(one2);

    }

    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode sortedMerged = new ListNode();
        sortedMerged = null;
        while (a != null || b != null) {
            if ( a == null || b == null) {
                sortedMerged = (a == null) ? b : a;
                if (a == null) {
                    sortedMerged.next = b;
                    b = b.next;
                }
                else {
                    sortedMerged.next = a;
                    a = a.next;
                }
            }
            else {
                if (a.val <= b.val) {
                    sortedMerged = a;
                    a = a.next;
                }
                else {
                    sortedMerged = b;
                    b = b.next;
                }
            }
        }
        return sortedMerged;

//        ListNode sortedMerged = new ListNode();
//        while (a != null || b != null) {
//            if ( a == null || b == null) {
//                sortedMerged = (a == null) ? a : b;
//                break;
//            }
//            if (a.val <= b.val) {
//                sortedMerged = a;
//                a = a.next;
//            }
//            else {
//                sortedMerged = b;
//                b = b.next;
//            }
//        }
//        return sortedMerged;

//        ListNode sortedMerged = new ListNode();
//        ListNode node1 = list1;
//        ListNode node2 = list2;
//        ListNode nodeMerged;
//        while (node1 != null || node2 != null) {
//            if (node1.val <= node2.val) {
//                sortedMerged = list1;
//            }
//            else {
//                sortedMerged = list2;
//            }
//            node1 = node1.next;
//            node2 = node2.next;
//        }
//        return sortedMerged;
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
    public void printList(ListNode listNode) {
        String strList = "[";
        ListNode node = listNode;
        while(node != null) {
            strList += node.val + ",";
            if (node.next != null)
                node = node.next;
            else
                break;
        }
        strList += "]";
        System.out.println(strList);
    }
}