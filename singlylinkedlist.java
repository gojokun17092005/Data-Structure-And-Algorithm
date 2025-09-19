class singlylinkedlist{
    static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static class singly_linkedlist{
        node head=null;
        node tail=null;

        void insertAtBegging(int data){
            node newnode=new node(data);
            if(head==null){
                head=newnode;
                tail=newnode;
            }else{
                newnode.next=head;
                head=newnode;
            }
        }

        void insertAtEnd(int data){
            node newnode=new node(data);
            if(head==null){
                head=newnode;
                tail=newnode;
            }else{
                node current=head;
                while(current.next!=null){
                    current=current.next;
                }
                current.next=newnode;
                tail=newnode;
            }
        }

        void insertAtPosition(int data,int pos){
            node newnode=new node(data);
            if(pos<0){
                System.out.println("invalid index");
                return;
            }
            if(pos == 0){
                insertAtBegging(data);
                return;
            }
            
            int counter=0;
            node temp=head;
            while(temp!=null && counter<pos-1){
                temp=temp.next;
                counter++;
            }
            newnode.next=temp.next;
            temp.next=newnode;
            
        }

        void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        void deleteAtBegging(){
            if(head==null){
                System.out.println("List is empty");
            }else if(head.next==null){
                head=null;
            }else{
                head=head.next;
            }
        }

        void deleteAtEnding(){
            if(head==null){
                System.out.println("List is empty");
            }else if(head.next==null){
                head=null;
            }else{
                node temp=head;
                while(temp.next.next!=null){
                    temp=temp.next;
                }
                temp.next=null;
            }
        }

        void deleteAtposotion(int pos){
            if(pos<0){
                System.out.println("list not possible");
            }else if(pos==0){
                deleteAtBegging();
            }else{
                node temp=head; 
                int count=0;
                while(temp!=null && count<pos-1){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
            }
        }

        int size(){
            node temp=head;
            int count=0;
            while(temp!=null){
                temp=temp.next;
                count++;
            }
            return count;
        }

        void midElement(){
            node current=head;
            int x=size();
            if(x%2!=0){
                for(int i=0;i<x/2;i++){
                    current=current.next;
                }
                System.out.println("MIDDLE ELEMENT : "+current.data);
            }else{
                for(int i=0;i<(x/2)-1;i++){
                    current=current.next;
                }
                System.out.println("MIDDLE ELEMENT : "+current.data);
            }
        }

        void midElementusingTwoPointers() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            node slow = head;
            node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;       // move 1 step
                fast = fast.next.next;  // move 2 steps
            }

            System.out.println("MIDDLE ELEMENT : " + slow.data);
        }


        public static void main(String[] args) {
            singly_linkedlist ll=new singly_linkedlist();
            ll.insertAtBegging(10);
            ll.insertAtBegging(5);
            ll.insertAtBegging(0);
            ll.insertAtEnd(15);
            ll.insertAtEnd(20);
            ll.insertAtPosition(50, 1);
            ll.display();
         //  ll.deleteAtEnding();
           // ll.deleteAtBegging();
            //ll.deleteAtposotion(0); //here position 0 refers to the  0 index;
           // ll.display();
            System.out.println(ll.size());
            ll.midElement();
            ll.midElementusingTwoPointers();
        }
    }
    
        
}


