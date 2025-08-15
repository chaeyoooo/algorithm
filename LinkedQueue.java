package swea;

public class LinkedQueue {
    Node front;
    Node rear;

    public boolean isEmpty(){
        return front == null && rear == null;
    }

    // 조회
    public Integer peek(){
        if(isEmpty()){
            return null;
        }else{
            return front.data;
        }
    }

    // 삽입
    public void enQueue(int data){
        Node node = new Node(data);
        // 1. 공백이면
        if(isEmpty()){
            front = rear = node;
        }else{
            rear.link = node;
            rear = node;
        }
    }

    public Integer deQueue(){
        if(isEmpty()){
            return null;
        }else{
            int data = front.data;
            front = front.link;
            if(front == null){
                rear = null;
            }
            return data; // front가 null 이어도 , 아니어도
        }
    }
}
