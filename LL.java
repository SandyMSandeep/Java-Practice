package com.personal.demo;

class Node{
    int data;
    Node next;
    Node(int n){
        data=n;
    }
}

class linked_list{
    Node head,tail;
    
    public void push(int n){
        Node newNode = new Node(n);
        if(head==null){
            tail=newNode;
        }
        newNode.next=head;
        head=newNode;
    }
  
    public void append(int n){
        Node newNode= new Node(n);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    
    public void delete_first(){
        head=head.next;
    }
    
    public void delete_last(){
        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
    }
    
    public void display(){
        Node temp = head; 
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
    
public class LL
{
  public static void main(String[] args) {
      linked_list list = new linked_list();
      list.push(1);
      list.append(2);
      list.append(3);
      list.display();
      list.delete_first();
      list.display();
      list.delete_last();
      list.display();
  }
}