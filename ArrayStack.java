import java.util.Arrays;
public class ArrayStack implements Stack
{
private static Object a[];
private int top;
public ArrayStack(int size){
a=new Object[size];
top = -1;
}

public boolean isEmpty(){

return (top < 0);

}

public void topOfStack(){

System.out.println("Stack top position is: "+top);

}

public void printStack(){

for(int i=0; i<a.length; i++){

System.out.println(a[i]);

}

}

public void push (Object element){

if (top == a.length-1) {

int newSize = a.length + 1;

a = Arrays.copyOf(a, newSize);

}

top++;

a[top] = element;

System.out.println(element+" element pushed in stack!");

}

public Object pop(){

if(top < 0)

throw new IllegalStateException("Stack is empty");

Object object = a[top];

top--;

int newSize = a.length - 1;

a = Arrays.copyOf(a, newSize);

return object;

}

public Object peek(){

if(top < 0)

throw new IllegalStateException("Stack is empty");

return a[top];}
