package LinkedList;

class LinkedListElement {
  private Integer value;
  private LinkedListElement next;

  LinkedListElement(Integer value) {
    this.value = value;
  }

  LinkedListElement getNext() {
    return next;
  }

  void setNext(LinkedListElement element) {
    next = element;
  }

  Integer getValue() {
    return value;
  }
}
