import java.util.Stack;

public class L1Stack {
    public static void main(String[] args) {
        // LIFO Data Structure - Last In First Out
        Stack<String> stack = new Stack<>();

        //System.out.println(stack.empty()); --> Check if it's empty

        // Adding the objects
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("PvZ Garden Warfare");

        stack.pop(); // -> Took "PvZ Garden Warfare"
        stack.pop(); // -> Took "DOOM"

        String myFavGame = stack.pop(); // -> Took "Skyrim" and assigned its value to the variable myFavGame
        System.out.println(myFavGame);

        System.out.println(stack.peek()); // -> To see the element at the "top" of the stack without removing it

        System.out.println(stack);

        stack.push("Call Of Duty");
        stack.push("Cuphead");
        stack.push("Forza Horizon");

        System.out.println(stack);

        System.out.println(stack.search("Minecraft"));
        System.out.println(stack.search("Call Of Duty"));
        System.out.println(stack.search("Cuphead"));
        System.out.println(stack.search("Forza Horizon"));

        // -> If search cannot find the element it will return -1

//        for (int i = 0; i < 1000000; i++) {
//            stack.push("Fallout76");
//        } -> WARNING: You will run out of memory

    }
}
