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
//structure of node of Queue
class MyNode{
    int data;
    MyNode link;
    
    public MyNode(){
    data=0;
    link=null;}
    public MyNode(int num,MyNode next)
    {
        data=num;
        link=null;
    }
}
//This class will contain all the function for Queue...
class queue_functions{
MyNode start=new MyNode();
MyNode end=new MyNode();
int size=0;
public queue_functions()
{
    
    start=null;
    end=null;
}
//method for adding data at the end of queue
void enqueue(int num)
{
    MyNode mnode = new MyNode(num,null);
    if(start==null)
    {
        start=mnode;
        end=start;
        
    }
    else{
    
        end.link=mnode;
        end=mnode;
    
    }
   
    size++;
}
//method for deleting the top node.....
void dequeue()
{
    if(start==null)
        System.out.println("The Queue is empty");
    else{
    MyNode ptr = new MyNode();
    ptr=start;
    start=ptr.link;
    }
    size--;
}
//method for displaying the queue....
void display()
{
    if(start==null)
        System.out.println("The Queue is empty");
    else{
    MyNode ptr = new MyNode();
    ptr=start;
        System.out.println("The Queue has following data:");
        //System.out.print(" |  ");
        String s="----";
        for(int i=0;i<size;i++)
            s=s+"----";
        
        System.out.println(s);
    while(ptr!=null)
    {
        
        
        System.out.print(" "+ptr.data);System.out.print(" |");
        ptr=ptr.link;
    }
        System.out.println("");
    
        System.out.println(s);
    }
    
}
}
public class Queue {
    public static void main(String[] args) {
        queue_functions obj = new queue_functions();
        obj.enqueue(32);
        obj.enqueue(23);
        obj.enqueue(76);
        obj.enqueue(3);
        obj.enqueue(6);
        obj.enqueue(12);
        obj.dequeue();
        obj.display();
    }
    
}
