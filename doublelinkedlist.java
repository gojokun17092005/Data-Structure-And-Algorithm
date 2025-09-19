public class doublelinkedlist {
    static  class node{
        int data;
        node next;
        node previous;
        public node(int data){
            this.data=data;
            this.next=null;
            this.previous=null;
        }
    }

    public static class doubly_linkedlist{
        node head=null;
        node tail=null;
        void insertAtBegging(int data){
            node newnode = new node(data);
            if(head==null){
                head=newnode;
                tail=newnode;
            }else{
                newnode.next=head;
                head.previous=newnode;
                head=newnode;
            }
        }

        void insertAtEnd(int data){
            node newnode =new node(data);
            if(head==null){
                head=newnode;
                tail=newnode;
            }else{
                node current=head;
                while(current.next!=null){
                    current=current.next;
                }
                current.next=newnode;
                newnode.previous=current;
                tail=newnode;
            }
        }

        void insertAtPosition(int data,int pos){
            node newnode =new node(data);
            if(pos<0){
                System.out.println("Invalid index");
            }else if(pos==0){
                insertAtBegging(data);
            }else{
                node current=head;
                int count=0;
                while(current!=null && count<pos-1){
                    current=current.next;
                    count++;
                }
                newnode.next=current.next;
                newnode.previous=current;
                current.next.previous=newnode;
                current.next=newnode;
            }
        }

        void deleteAtBegging(){
            if(head==null){
                System.out.println("List is empty");
            }else if(head.next==null){
                head=null;
                tail=null;
            }else{
                head=head.next;
                head.previous=null;
            }
        }

        void deleteAtEnding(){
            if(head==null){
                System.out.println("List is empty");
            }else if(head.next==null){
                head=null;
                tail=null;
            }else{
                node current=head;
                while(current.next.next!=null){
                    current=current.next;
                }

                current.next.previous=null;
                current.next=null;
                tail=current;
            }
        }

        void deleteAtposotion(int pos){
            if(head==null){
                System.out.println("");
            }else if(head.next==null){
                head=null;
                tail=null;
            }else{
                node current=head;
                int count=0;
                while(current!=null && count<pos-1){
                    current=current.next;
                    count++;
                }
                current.next.next.previous=current;
                current.next=current.next.next;
            }
        }

        int count(){
            node current=head;
            int count=0;
            while(current!=null){
                current=current.next;
                count++;
            }
            return count;
        }

        void displayFromHead(){
            node current=head;
            while(current!=null){
                System.out.print(current.data + " ");
                current=current.next;
            }
            System.out.println();
        }
        void displayFromTail(){
            node current=tail;
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.previous;
            }
            System.out.println();
        }
        public static void main(String[] args) {
            doubly_linkedlist dd=new doubly_linkedlist();
            dd.insertAtBegging(10 );
            dd.insertAtBegging(5);
            dd.insertAtBegging(0);
            dd.insertAtEnd(20);
            dd.insertAtPosition(15, 3);
            dd.displayFromHead();
            //dd.displayFromTail();
            //dd.deleteAtBegging();
            //dd.deleteAtEnding();
            dd.deleteAtposotion(2);
            dd.displayFromHead(); 
            dd.displayFromTail();
            System.out.println(dd.count());
        }
    }
}
