importjava.util.*;
class Stack {
private static final int MAX_SIZE = 3;
private int[] stackArray;
private int top;
public Stack()
   {
stackArray = newint[MAX_SIZE];
top = -1;
   }

public void push(int value)
   {
	if (top==(MAX_SIZE-1))
	{
		System.out.println("Stack full");
		return;
	}
	stackArray[++top] = value;
   }
public void pop() 
   {
	if (top==-1)
	{
		System.out.println("Stack empty");
		return;
	}
	System.out.println("TOS is "+ stackArray[top--]); 
   }
public void display()
   {
	if (top==-1)
	{
		System.out.println("Stack empty");
		return;
	}
	System.out.println("Contents of stack are");
	for(inti=top;i>=0;i--)
		System.out.println(stackArray[i]);
   }
}
public class Stack_simulation {
public static void main(String[] args) {
     Stack st = newStack();
     Scanner sc = newScanner(System.in);
for(;;)
     {
	


