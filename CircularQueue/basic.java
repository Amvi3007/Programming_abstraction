package Programming_abstraction.CircularQueue;

public class basic {
    static class CircularQueue{
        int [] arr;
        int front,rear,capacity,size;

        CircularQueue(int capacity){
            this.capacity = capacity;
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        void enqueue(int value){
            if(size == capacity){
                System.out.println("Circular Queue is full");
                return;
            }

            rear = (rear + 1)% capacity;
            arr[rear] = value;
            size++;
            System.out.println("inserted: "+ value);
        }

        void deque(){
            if(size == 0){
                System.out.println("Circular queue is empty");
                return ;
            }

            System.out.println("element removed : "+arr[front]);
            front = (front + 1)%capacity;
            size--;
        }

        void display(){
            if(size == 0){
                System.out.println("Circular  queue is emoty");
                return;
            }
            System.out.println("Queue");

            for(int i =0;i<size;i++){
                int index = (front + i)%capacity;
                System.out.print(arr[index]+" ");
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.deque();
        q.display();
    }
}
