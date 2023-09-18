/*
2.Create a Java console application using interface concepts for abstract data type Stack.
Implement Stack operations PUSH, POP and Display using Array.
*/

package javaex4;

 //@author VISHWA

import java.util.*;

interface stack
{
    int pop();
    void push(int num);
    void display();
}

class array implements stack
{
    int top=-1;
    int size=20;
    int array[]=new int[size];
    public int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty.");
            return -1;            
        }
        else
        {
            int x=array[top--];
            --top;
            return x;
        }
    }
    
    public void display()
    {
        if(top==-1)
        {
            System.out.println("The array is empty.");
        }
        else
        {
            for(int i=0;i<=top;i++)
            {
                System.out.println("a["+i+"]= "+array[i]);
            }
        }
    }
    
    public void push(int num)
    {
        if(top==size-1)
        {
            System.out.print("The array is empty.");
        }
        else
        {
            array[++top]=num;
        }
    }
}
 
public class console 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        array a=new array();
        System.out.println("\nStack operations using array");
        System.out.println("1.PUSH \t2.DISPLAY \n3.POP  \t4.EXIT \n");
        int c=0;
        while(c!=4)
        {
            System.out.print("\nEnter the choice: ");
            c=obj.nextInt();
            switch(c)
            {
                case 1:
                    System.out.print("Enter the number to push: ");
                    int p=obj.nextInt();
                    a.push(p);
                    break;
                    
                case 2:
                    System.out.println("Displaying the elements of Stack:");
                    a.display();
                    break;
                    
                case 3:
                    int b=a.pop();
                    System.out.println("The poped element:"+b);
                    break;
            }            
        }
    }    
}
