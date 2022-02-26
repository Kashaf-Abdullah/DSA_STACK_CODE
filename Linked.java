import java.util.EmptyStackException;
import java.util.Stack;
public class Linked {
    private Node top;
    private int size;
    class Node{
        private int data;
        private Node next;
        public Node (int data){
            this.data=data;
            // this.next=null;
        }

    }
public void push(int data){
    Node tempNode=new Node (data);
    tempNode.next=top;
top=tempNode;
size++;

}



public int pop(){//if(Size==0) throw new EmptyStackException();
    if(isEmpty()){
        throw new EmptyStackException();

    }
    int result=top.data;
    
    top=top.next;
    size--;
    return result;
}

public int peek(){
    if(isEmpty()){
        throw new EmptyStackException();

    }
    return top.data;
}
public int size(){
    return size;

}
public Boolean isEmpty(){
    return size==0;
}
public void displayStack(){
    Node current=top;
    while(current!=null){
        System.out.print(current.data+" ");
        current=current.next;
    }
}
public int beforepeek(){
    if(isEmpty()){
        throw new EmptyStackException();

    }


return top.next.data;
    
}


public int popsecond(){
    if(isEmpty()){
        throw new EmptyStackException();

    }
    int result=top.next.data;
    top.next=top.next.next;
    size--;
    return result;
}



    Node head=null;

public void middle(){
    Node a=top;
    Node b=top;
while(b!=null&&b.next!=null)
{
    b=b.next.next;
    a=a.next;
}
System.out.println("the middle is "+a.data);
}

public String toString(){
  Node n=top;
  String temp="";
  while(n!=null){
      temp=temp+n.data+" ";
      n=n.next;
  }
  return temp;

}
// public STACK ArrayStack(){
//     STACK s=new STACK(size);
//     int i;
//     Object temp[]=new Object[size];
//     for(Node p=top,i=0 ;p!=null;p=p.next,i=i+1){
//         temp[i]=p.data;
//     }
//     for(int j=temp.length-1;j>=0;j--){
// s.push(temp[j]);

//     }
//     return s;

// }
}


class Test{
    public static void main(String args[]){

        Linked l=new Linked();
        System.out.println(l.size());
        l.push(3);
        l.push(6);
        l.push(8);
        l.push(99);
        l.push(35);
        l.middle();
        System.out.println("to string"+l.toString());

        
        System.out.println("pop before top "+l.popsecond());
        System.out.println();
        l.displayStack();
        System.out.println();
        System.out.println("the  before   peek is "+l.beforepeek());
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.peek());
        System.out.println(l.pop());
        System.out.println(l.size());
    }
}
