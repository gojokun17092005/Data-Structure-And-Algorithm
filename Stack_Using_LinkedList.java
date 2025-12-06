public class Stack_Using_LinkedList {
    static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class stack{
        node top;
         void push(int data){
            node newnode=new node(data);
            if(top==null){
                top=newnode;
            }else{
                newnode.next=top;
                top=newnode;
            }
         }

         int pop(){
            if(top==null){
                System.out.println("UNDERFLOW CONDITION");
                return -1;
            }
            int popped_value=top.data;
            top=top.next;
            return popped_value;
         }

         int peek(){
            if(top==null){
                System.out.println("UNDERFLOW CONDITION");
                return -1;
            }
            return top.data;
         }

         void display(){
            if(top==null){
                System.out.println("STACK IS EMPTY");
            }
            node temp=top;
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println();
         }

         public static void main(String[] args) {
            stack ss =new stack();
            ss.push(5);
            ss.push(10);
            ss.push(15);
            ss.push(20);
            ss.display();
            System.out.println(ss.pop());
            System.out.println(ss.peek());
         }
    }
}
