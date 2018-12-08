package LinkedList;

public class LinkedList {
  private LinkedListElement head;

  public LinkedList() {
    head = new LinkedListElement(null);
  }

  public void add(Integer item) {
    LinkedListElement newElement = new LinkedListElement(item);
    LinkedListElement lastElement = head;
    while (lastElement.getNext() != null) {
      lastElement = lastElement.getNext();
    }
    lastElement.setNext(newElement);
  }

  public String toString() {
    String result = "[";
    LinkedListElement current = head;
    while(current.getNext() != null) {
      current = current.getNext();
      result += current.getNext() == null ? current.getValue() :  current.getValue() + ", ";
    }
    result += "]";
    return result;
  }

}
