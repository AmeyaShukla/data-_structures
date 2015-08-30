/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ameya
 */
import java.util.*;
//Node class is the structure of node of stack..
class Node{
    //data is the value to be stored at each node
int data;
//pointer to next node
Node link;
    //Default constructor
    public Node(){
    data=0;
    link=null;
    }
    //Parameterized constructor
    public Node(int num,Node next){
    this.data=num;
    this.link=next;
    }
}
//this class contains all the operation to be performed on the stack....
class stack_function{
    Node start=new Node();
    
    stack_function()
    {
        start=null;
    }
    //method for inserting node(push) in the stack....
     void push(int num)
    {
        Node nnode = new Node(num,null);
        if(start==null)
        {
            start=nnode;
        }else
        {
            nnode.link=start;
            start=nnode;
            
        }
        
    }
    // pop method for removing the top element(pop) from the stack
     void pop()
     {
         if(start==null)
         {
             System.out.println("The stack is already empty");}
         else{
             Node ptr = new Node();
             ptr=start;
             start=ptr.link;
         
         }
         
         
     }
     //method for traversing the stack..it will print the elements of the list...
     void traverse_Stack()
     {
         if(start==null)
             System.out.println("Oops.....The stack is empty...!! ");
         else
         {
             System.out.println("The stack has the following data:");
             Node ptr =new Node();
             ptr=start;
             while(ptr!=null)
             {
                 
                 System.out.print("----------");System.out.println("");
                 System.out.print("|   ");System.out.print(ptr.data+" ");System.out.print("   |");System.out.println("");
                 ptr=ptr.link;
             }
         }
     }
     
}
//class conatining the main method
public class Stack {
    
    public static void main(String[] args) {
        //object of stack_function to perform operations on the stack
        stack_function obj =new stack_function();
        //various operations are performed by calling the method..
        obj.push(5);
        obj.push(2);
        obj.push(4);
        obj.push(7);
        obj.push(6);
        obj.push(12);
        obj.pop();
        obj.traverse_Stack();
    }
}
