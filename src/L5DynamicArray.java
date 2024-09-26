import java.util.ArrayList;

public class L5DynamicArray {
    public static void main(String[] args) {
        // Creating a dynamicArray, but you can and should use ArrayList
        L5DynamicArrayClass dynamicArray = new L5DynamicArrayClass(5);

        System.out.println(dynamicArray.capacity);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

//        dynamicArray.insert(0, "X");
//        dynamicArray.delete("A");
//        System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Is Empty? " + dynamicArray.isEmpty());
    }
}
