import java.util.LinkedList;

public class L4LinkedList {
    public static void main(String[] args) {
        // Nodes in 2 parts (data + address), non-consecutive memory locations, elements linked through pointers
        LinkedList<String> linkedList = new LinkedList<>();

//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");
//
//        linkedList.pop();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

//        linkedList.poll();

        linkedList.add(4, "E");
        linkedList.remove("E");

        System.out.println(linkedList.indexOf("F"));

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("G");

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(first + " and " + last);

        System.out.println(linkedList);
    }
}
