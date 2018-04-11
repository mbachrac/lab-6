package edu.luc.cs271.arrayqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

  private final int capacity;

  private int size;

  private int front;

  private int rear;

  private final E[] data;

  // TODO why do we need an explicit constructor?


  @SuppressWarnings("unchecked")
  public FixedArrayQueue(final int capacity) {
    this.capacity = capacity;
    this.data = (E[]) new Object[capacity];
    this.size = 0;
    this.front = 0;
    this.rear = capacity - 1;
  }

  @Override
  public boolean offer(final E obj) {
    // TODO
    if(size==capacity)
      return false;
    size++;
    rear=(rear+1)%capacity;
    data[rear]=obj;
    return true;
  }

  @Override
  public E peek() {
    // TODO
    if(isEmpty())
      return null;
    else
      return data[front];
  }

  @Override
  public E poll() {
    // TODO
    if(isEmpty())
      return null;
    E result=data[front];
    front=(front+1)%capacity;
    size--;
    return result;
  }

  @Override
  public boolean isEmpty() {
    // TODO
    return size==0;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size
    List<E>myList=new ArrayList<E>(size);
    if(isEmpty())
        return myList;
    E firstThing=data[front];
    int i=0;
   do
    {
      myList.add(i,data[front]);
      i++;
      front=(front+1)%capacity;
    }while(data[front]!=firstThing);
    return myList;
  }
}
