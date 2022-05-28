package come.core.java.one;

public class test_stcak {

    //is empty
    //is full
    // push
    //pop
    //peek
    //FILO

    int size;
    int a[];
    int top;

    public test_stcak(int size){
        this.size = size;
        a = new int[size];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size-1;
    }

    public void push(int ele){
        if(!isFull()) {
            top++;
            a[top] = ele;
        }else {
            System.out.println("full not able to add");
        }
    }

    public int pop(){
        if(!isEmpty()){
            int num = a[top];
            top--;
            return num;

        }else {
            return -1;
        }
    }
    public void printarray(){
        for (int i =0 ;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        test_stcak ts = new test_stcak(3);
        boolean empty = ts.isEmpty();
        boolean full = ts.isFull();
        System.out.println(empty +" "+full);
        ts.push(23);
        ts.push(78);
        ts.push(69);
        ts.printarray();
        int num1 = ts.pop();
        System.out.println(num1);
        int num2 =  ts.pop();
        System.out.println(num2);

    }
}
