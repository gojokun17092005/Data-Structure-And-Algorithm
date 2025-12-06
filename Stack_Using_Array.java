public class Stack_Using_Array {
    int size;
    int top=-1;
    int [] arr;
    public Stack_Using_Array(int size){
        this.size=size;
        this.arr=new int[size];
    }
    void push(int data){
        if(top>=size){
            System.out.println("OVERFLOW CONDITION");
        }else{
            top=top+1;
            arr[top]=data;
            System.out.println(data+" DATA IS PUSHED IN THE STACK");
        }
    }

    int pop(){
        if(top<0){
            System.out.println("UNDERFLOW CONDITION");
            return-1;
        }
        return arr[top--];
    }

    int peek(){
        if(top<0){
            System.out.println("UNDERFLOW CONDITION");
        }
        return arr[top];
    } 

    void display(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack_Using_Array ss=new Stack_Using_Array(3);
        ss.push(5);
        ss.push(10);
        ss.push(15);
        ss.display();
        System.out.println(ss.peek());
        System.out.println(ss.pop());
        System.out.println(ss.peek());
    }
}
