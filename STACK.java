interface STACK {

public Object peek();
public Object pop();
public void push(Object obj);
public int size();
public Object bottomelement();
//public void display();
//public Object popbottom();


}

class ArrayStack implements STACK{
private int size;
private Object[] a;
public ArrayStack(int c){

    a=new Object[c];

}
public Boolean isEmpty(){
    return (size==0);
}

public Object peek(){
    if(size==0) throw new IllegalStateException("stack is empty");
    return a[size-1];
}

//second from the top
public Object secondtop(){
    if(size==0){
        throw new IllegalStateException("stack is empty");
    }
    return a[size-2];}

    //remove and return second top element 
    public Object popsecondelement(){
        if(size==0) throw new IllegalStateException("stack is empty");
        
        //When deleting an element in between an array, we have to replace that element with last element and then make the last element null.
        //Otherwise there will be a NULL value in your aray.
        Object obj=a[size-2];
        a[size-2]=a[--size];
        a[size] = null;
        return obj;

    }


//return bottom element of stack
public Object bottomelement(){
    if(size==0) throw new IllegalStateException("stack is empty");
    //you can simply return objects of arrays through the index
    return a[0];
}
public Object secondlement(){
    if(size==0) throw new IllegalStateException("stack is empty");
    //you can simply return objects of arrays through the index
    return a[1];
}
public Object pop(){
    if(size==0) throw new IllegalStateException("stack is empty");
    Object obj=a[--size];
    a[size]=null;
    return obj;
}
public void push(Object obj){
    a[size++]=obj;
}
public int size(){
    return size;
}

public String toString() {
    String result = "Stack:";
    
    for (int index=0; index<size; index++) {
    result = result + a[index].toString()+",";
    if(index == size()){
    result = result + a[index].toString()+".";
    break;
    }
    }
    return result;
    }


 
// class RPN{

// RPN(String[] args){
//     Stack stack=new ArrayStack(args.length);
//     for(int i=0;i<args.length;i++){
//         String input=args[i];
//         if(isAnOperator(input)){
// double x =Double.parseDouble((String)stack.pop());
// double y=Double.parseDouble((String)stack.pop());
// double z=evualate(x,y,input);

// stack.push(" "+z);

//     }
//     else
//         stack.push(input);

//     }
// }
// private boolean isAnOperator(String op){
//     return (op.length()==1&&"ASMD".indexOf(op)>=0);
// }
// private double evulate(double x,double y,String op){
//     double z=0;
//     if(op.equals("A"))
//     z=x+y;
//     else if(op.equals("S"))
//     z=x-y;
//    else if(op.equals("M"))
//     z=x*y;
//    else
//     z=x/y;


//     System.out.println(x+" "+op+" "+y+" "+z);
//     return z;
// }
// }



public Object popbottom(){
    
    if(size==0) throw new IllegalStateException("stack is empty");

    Object obj=a[0];
    //When deleting an element in between an array, we have to replace that element with last element and then make the last element null.
        //Otherwise there will be a NULL value in your aray.
    a[0]=[--size];
    a[size] = null;
    return obj;
}

public void display(){
    
       for(int i=0;i<size;i++){
                System.out.print(a[i]);
        
    }
}
  public void reverse(){
    for(int i=size-1;i>=0;i--){
        System.out.print(a[i]+",");
    
}
  }

  public Object popaftertop(){//second top
    if(size==0) throw new IllegalStateException("stack is empty");
    Object obj=a[size-2];
    a[size-2]=a[--size];
      a[size] = null;
    return obj;
  }


  
  public void middle(int  c[],int f,int l,int k){
int  mid=f+l/2;
while(f<=l){
    if(c[mid]<k){
        f=mid+1;
    }
    else if(c[mid]==k){
        System.out.println("element is found at index"+mid);
        break;
    }
    else{
        l=mid-1;
    }
mid=(f+l)/2;
}
if(f>l){
    System.out.println("element is not found");
}
  }

  //linkestack
  public Linked toLinkedStack(){
      Linked l=new Linked();
      for(int i=0;i<size;i++){
          l.push(i);
      }
      return l;
  }
    public static void main(String args[]){
        ArrayStack a=new ArrayStack(30);

        a.push("one");
        a.push("two");

        a.push("three");
        a.push("four");
        a.display();

System.out.println();

        System.out.print("removes second top "+a.popsecondelement());
System.out.println();
a.display();
System.out.println();
System.out.println(a.toLinkedStack());
System.out.println();
        System.out.print("  top :"+a.peek());
System.out.print(" second from the top :"+a.secondtop());
        // a.push(5);
        // a.push(6);
//      //   int key=33;
    
        System.out.println("second top "+a.popaftertop());
System.out.println();
       a.display();
       System.out.println();
       System.out.println("reverse");
       System.out.println();
       a.reverse();
        // a.push(7);
        // a.push(6);
        // a.push(8);
        // a.push(99);
        System.out.println();
     System.out.println("peek is "+a.peek());
         System.out.println("pop is "+a.pop());
         
// //         // RPN n=new RPN("2","4","A","3","5","7","D");


// //Tostring method

//String s=a.toString();
       // System.out.println(a);

// if(s.equals("Stack:one,two,three,four,")){
//     System.out.println("Test 5 passed - toString()");
// }
// else {
//     System.out.println("Test 5 failed - toString()");
// }
// System.out.println(a.peek());
// System.out.println(a.bottomelement());
//a.popbottom();

System.out.println(a.bottomelement());
System.out.println(a.secondlement());

}

}
