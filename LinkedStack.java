
public class LinkedStack  implements Stack{
    private Node top;
    private int size;

@Override
public int size() {
    return size;
}

@Override
public Object peek() {
    if(size==0) throw new IllegalStateException("stack empty");
    return top.object;

}

@Override
public Object pop() {

    if(size==0) throw new IllegalStateException("stack empty");
    --size;
    Object temptop=top.object;
    top=top.next;
    return temptop;
}

@Override
public void push(Object obj) {
    top=new Node(obj,top);
    ++size;

}
public ArrayStack ArrayStack(){
    ArrayStack as=new ArrayStack(size);
    Object temp[]=new Object[size];
    for(Node p=top,int i=0 ;p!=null,i<size;p=p.next;i=i+1){
        temp[i]=p.data;
    }
    for(int j=temp.length-1;j>=0;j--){
as.push(temp[j]);

    }
    return as;

}

private class Node{
        Object object;
        Node next;
        Node (Object object,Node next){
            this.object=object;
            this.next=next;
        }

    }
 
}