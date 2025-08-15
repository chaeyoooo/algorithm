package swea;

public class LinkedStack {
    Node top; // 포인터 변수

    // 공백
    public boolean isEmpty(){
        return top == null;
    }

    // 조회
    public Integer peek(){
        if(top == null){
            return null;
        }
        return top.data;
    }

    // 삽입
    public void push(int data){
        Node node = new Node(data);
        node.link = top;
        top = node;
    }

    // 삭제
    public Integer pop(){
        if(isEmpty()){
            return null;
        }else{
            int data = top.data;
            top = top.link;
            return data;
        }
    }
}
