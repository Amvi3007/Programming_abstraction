package Programming_abstraction.queue;

class Queue{
    int []arr;
    int front;
    int rear;
    int size;

    Queue(int size){
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }


    void enqueue(int value){
        if(rear == size-1){
            System.out.println("Queue overflow");
            return;
        }
        if(front == -1){
            front = 0 ;
        }
        rear++;
        arr[rear] = value;
        System.out.println(value+ " inserted");
    }


    void dequeue(){
        if(front == -1 || front>rear){
            System.out.println("Queue overflow");
            return;
        }
        System.out.println(arr[front]+" Removed");
        front++;
    }

    void peek(){
        if(front == -1 || front>rear){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("front element : "+arr[front]);
    }

    void display(){
        if(front == -1 || front>rear){
            System.out.println("Queue is empty");
            return ;
        }

        for(int i = front;i<=rear;i++){
            System.out.println(arr[i]);
        }

    }
}

public class queue_using_array {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(40);

        q.display();
    }
}
