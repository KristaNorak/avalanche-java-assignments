import LinkedList.LinkedList;

public class HelloWorld {
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();

    linkedList.add(4);
    linkedList.add(-21);
    linkedList.add(65);
    linkedList.add(12);

    System.out.println(linkedList.toString());
  }
}