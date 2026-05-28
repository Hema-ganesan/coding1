class Node{
    int val;
    Node next;
    Node prev;

    Node(int val1,Node next1,Node prev1){
        val=val1;
        next=next1;
        prev=prev1;
    }
}

public class doubly{
    public static void main(String[] args){
        int[] arr={3,5,7,12};
        //CREATION
        Node head=create(arr);
        System.out.println("AFTER CREATING LIST");
        printList(head);
        System.out.println();

        //INSERTION
        head=insertatfirst(head);
        System.out.println("AFTER INSERTING AT FIRST");
        printList(head);
        System.out.println();
        head=insertatlast(head);
        System.out.println("AFTER INSERTING AT LAST");
        printList(head);
        System.out.println();
        head=insertatposition(head);
        System.out.println("AFTER INSERTING AT POSITION");
        printList(head);
        System.out.println();
        head=insertaftervalue(head);
        System.out.println("INSERTING AFTER VALUE");
        printList(head);
        System.out.println();
//        head=insertbeforevalue(head);
//        System.out.println("INSERTING BEFORE VALUE");
//        printList(head);
//        System.out.println();

    }

    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val);
            if(temp.next!=null){
                System.out.print("<->");
            }
            temp=temp.next;
        }
    }

    //CREATION
    public static Node create(int[] arr){
        Node head=new Node(arr[0],null,null);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            Node bh=new Node(arr[i],null,temp);
            temp.next=bh;
            temp=temp.next;
        }
        return head;
    }

    //INSERTION
    public static Node insertatfirst(Node head){
        int data=1;
        if (head==null){
            Node temp=new Node(data,null,null);
            head=temp;
            return head;
        }
        Node temp=new Node(data,null,null);
        temp.next=head;
        head.prev=temp;
        head=temp;
        return head;
    }

    public static Node insertatlast(Node head){
        int data=13;
        if (head==null){
            Node temp=new Node(data,null,null);
            head=temp;
            return head;
        }
        if(head.next==null){
            Node temp1=new Node(data,null,null);
            head.next=temp1;
            temp1.prev=head;
            return head;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=new Node(data,null,null);
        temp.next.prev=temp;
        return head;
    }

    public static Node insertatposition(Node head){
        int data=34;
        int position=1;
        if(position==0){
            return insertatfirst(head);
        }
        int cnt=0;
        Node temp=head;
        while(temp!=null && cnt<position-1){
            temp=temp.next;
            cnt++;
        }
        if(temp==null){
            return head;
        }
        Node newNode=new Node(data,temp.next,temp);
        if(temp.next!=null){
            temp.next.prev=newNode;
        }
        temp.next=newNode;
        return head;
    }

    public static Node insertaftervalue(Node head){
        Node temp=head;
        int target=5;
        int value=66;
        while(temp!=null){
            if(temp.val==target){
                temp.next=new Node(value,temp.next,temp);
                temp.next.prev=temp;
                return head;
            }
            temp=temp.next;
        }
        return head;
    }


}