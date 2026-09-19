import java.util.*;
public class Stack
{
int s[]=new int[10]; int top= -1;
int size=3;
void push(int i)
{
if(top==size-1)
System.out.println("Stack Overflow");
else
{
s[++top] = i;
}
}
void pop( )
{
if (top == -1)
{
System.out.println("Stack Underflow");
}
else
{
System.out.println(" Popped Element= " + s[top]);
top--;
}
}
void display( )
{
if(top == -1)
{
System.out.println("Stack is Empty\n");
}
else
{
System.out.println("Stack Elements are:\n");
for (int i = top; i >= 0; i--)
System.out.println(s[i]);
}
}

public static void main(String args[])
{
try (Scanner scan = new Scanner(System.in))
{
Stack stk = new Stack();
for(;;)
{
System.out.println("\n---Stack Operations---");
System.out.println("1. Push");
System.out.println("2. Pop");
System.out.println("3. Display");
System.out.println("4. Exit");
System.out.println("Enter your choice:\n");
int choice = scan.nextInt();
switch (choice)
{
case 1 :
System.out.println("Enter the element to push");
stk.push(scan.nextInt());
break;
case 2 : stk.pop();
break;
case 3 : stk.display();
break;
case 4 : System.exit(0);
default :
System.out.println("Invalid Choice\n");
break;
}
}
}
}
}
