class ListNode
{
    int val;
    ListNode next;
    ListNode(int val1,ListNode next1)
    {
        val=val1;
        next=next1;
    }
}
public class singly {
    public static void main(String[] args)
    {
        int pos=2;
        int el=5;
        int[] arr={3,5,7,12};
        ListNode head=create(arr);
        System.out.println("AFTER CREATING LIST");
        printList(head);
        System.out.println();
        head=deleteatfirst(head);
        System.out.println("AFTER DELETING FIRST ELEMENT");
        printList(head);
        System.out.println();
        head=deleteatlast(head);
        System.out.println("AFTER DELETING LAST ELEMENT");
        printList(head);
        System.out.println();
        head=deleteatpos(head,pos);
        System.out.println("DELETING ELEMENT AT POSITION");
        printList(head);
        System.out.println();
        head=deletebyelement(head,el);
        System.out.println("DELETING BY ELEMENT");
        printList(head);
        System.out.println();

    }



    public static void printList(ListNode head)
    {
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val);
            if(temp.next != null)
            {
                System.out.print("->");
            }
            temp=temp.next;
        }
    }
    public static ListNode create(int[] arr)
    {
        ListNode head=new ListNode(arr[0],null );
        ListNode temp=head;
        for(int i=1;i< arr.length;i++)
        {
            ListNode bh=new ListNode(arr[i],null );
            temp.next=bh;
            temp=temp.next;
        }
        return head;
    }
    public static ListNode deleteatfirst(ListNode head)
    {
        if(head==null){
            return null;
        }
        return head.next;
    }
    private static ListNode deleteatlast(ListNode head) {
        ListNode temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    public static ListNode deleteatpos(ListNode head,int pos){
        if(head==null){
            return null;
        }
        int cnt=0;
        ListNode temp=head;
        if(pos==0){
            return head.next;
        }
        while(temp.next!=null){
            if(cnt==pos-1){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
            cnt++;
        }
        return head;
    }
    public static ListNode deletebyelement(ListNode head,int el){
        ListNode temp=head;
        if(el==head.val){
            head=head.next;
        }
        if(head==null){
            return null;
        }
        while(temp!=null){
            if(temp.next.val==el){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
}