

public class Lianbiao {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        // 创建链表节点
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        // 构建链表关系
        node1.next = node2;
        node2.next = node3;
        // 打印链表内容
        ListNode current = node1;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
