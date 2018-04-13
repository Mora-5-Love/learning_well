
public class Reverse_node {

    public  ListNode reverse_list(ListNode head){
        if(head == null) return null;

        ListNode pre = null;
        ListNode next = null;
        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
    public static void main(String[] args){
        ListNode head = null;
        int t =10;
        while ((t = 10) > 0){
            ListNode head1 = new ListNode(t);
            head = head1;
            head = head.next;
            t--;
        }
        while (head!=null){
            System.out.println(head.value);
            head =head.next;
        }
    }
}
