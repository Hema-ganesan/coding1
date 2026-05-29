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
        int data=124;
        int[] arr={3,5,7,12};
        ListNode head=create(arr);
        System.out.println("AFTER CREATING LIST");
        printList(head);
        System.out.println();

        //INSERTION
        head=insertatfirst(head,2);
        System.out.println("AFTER INSERTING AT FIRST ELEMENT");
        printList(head);
        System.out.println();
        head=insertatlast(head,15);
        System.out.println("AFTER INSERTING AT LAST ELEMENT");
        printList(head);
        System.out.println();
        head=insertatpos(head,data,pos);
        System.out.println("AFTER INSERTING AT POS");
        printList(head);
        System.out.println();
        head=insertbeforeval(head,121,5);
        System.out.println("INSERTING BEFORE A VALUE");
        printList(head);
        System.out.println();
        head=insertafterval(head,6,5);
        System.out.println("INSERTING AFTER A VALUE");
        printList(head);
        System.out.println();

        //DELETION
        head=deleteatfirst(head);
        System.out.println("AFTER DELETING AT FIRST ELEMENT");
        printList(head);
        System.out.println();
        head=deleteatlast(head);
        System.out.println("AFTER DELETING AT LAST ELEMENT");
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

        //LENGTH
        System.out.println("LENGTH OF THE LIST");
        System.out.println(findlength(head));

        //ELEMENT EXIST OR NOT
        System.out.println("ELEMENT EXIST OR NOT");
        System.out.println(elementexistornot(head,12));
        System.out.println();
    }



    public static void printList(ListNode head)
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
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
        if(arr.length==0){return null;}
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
    //INSERTION FUNCTION
    public static ListNode insertatfirst(ListNode head,int val)
    {
        ListNode temp=new ListNode(val,head);
        temp.next=head;
        head=temp;
        return head;
    }

    public static ListNode insertatlast(ListNode head,int val)
    {
        if(head==null){
            return new ListNode(val,null);
        }
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        if(temp.next==null){
            temp.next=new ListNode(val,null);
        }
        return head;
    }

    public static ListNode insertatpos(ListNode head,int data,int pos)
    {
        ListNode temp=head;
        ListNode temp1;
        int i=0;
        if(pos==0){
            head=new ListNode(data,null);
            if(temp!=null)
            {
                head.next=temp;
            }
        }
        while(temp.next!=null){
            i++;
            temp=temp.next;
            if(i==pos-1){
                temp1=new ListNode(data,null);
                temp1.next=temp.next;
                temp.next=temp1;
            }
        }
        return head;
    }

    public static ListNode insertbeforeval(ListNode head,int val,int el)
    {
        if(head==null){
            return null;
        }
        if(head.val==el){
            return new ListNode(val,head);
        }
        ListNode temp=head;
        ListNode temp1;
        while(temp.next!=null){
            if(temp.next.val==el){
                temp1=new ListNode(val,null);
                temp1.next=temp.next;
                temp.next=temp1;
                break;
            }
            temp=temp.next;
        }
        return head;
    }

    public static ListNode insertafterval(ListNode head,int val,int el)
    {
        ListNode temp=head;
        ListNode temp1;
        while(temp!=null){
            if(temp.val==el){
                temp1=new ListNode(val,null);
                temp1.next=temp.next;
                temp.next=temp1;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    //DELETION FUNCTION
    public static ListNode deleteatfirst(ListNode head)
    {
        if(head==null){
            return null;
        }
        return head.next;
    }

    private static ListNode deleteatlast(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
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
        if(head==null || pos<0){
            return head;
        }
        int cnt=0;
        ListNode temp=head;
        if(pos==0){
            return head.next;
        }
        while(temp.next!=null && temp!=null){
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
        if(head.val==el){
            head=head.next;
        }
        if(head==null){
            return null;
        }
        while(temp.next!=null){
            if(temp.next.val==el){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
        return head;
    }

    //LENGTH
    public static int findlength(ListNode head)
    {
        int cnt=0;
        ListNode temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }

    //ELEMENT EXIST OR NOT
    public static boolean elementexistornot(ListNode head,int val)
    {
        ListNode temp=head;
        while(temp!=null){
            if(temp.val==val){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}