package Stack;

// implement stack using array

class MyStack{
    int[] arr= new int[10];
    int size= 0;

    int pop(){
        if(size == 0) return -1;
        int x= arr[size - 1];
        arr[size - 1] = 0;
        size--;
        return x;
    }

    void push(int x){
        if(size == arr.length) return;
        arr[size++] = x;
    }

    int peek(){
        if(size == 0) return -1;
        return arr[size-1];
    }

    boolean isEmpty(){
        if(size == 0) return true;
        return false;
    }
}