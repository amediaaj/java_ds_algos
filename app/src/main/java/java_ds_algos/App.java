/*
 * This source file was generated by the Gradle 'init' task
 */
package java_ds_algos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {

    /*****************************************************
     * 
     * stack = LIFO data structure, Last-in First-out
     *         storerd objeccts in a sort of "verticacl tower"
     * 
     *         push() to add to the top
     *         pop() to remove from the top
     * 
     *****************************************************/
    public void testStack() {
        System.out.println("Testing stack...");
        Stack stack = new Stack<>();
        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("FFVII");
        // Prints FFVII
        System.out.println(stack.peek());
        stack.pop();
        // FFVII no longer in the stack
        System.out.println(stack);

        System.out.println(stack.search("Borderlands"));
        System.out.println();
    }

    /*****************************************************
     * 
     * Queue = FIFO data structure. First-In First-out
     *         A collection designed for holding elements
     *         prior to processing
     *         Linear data strucure
     * 
     *         add = enqueu, offer()
     *         remove = dequeue, poll()
     *         peek() to examine head
     * 
     *****************************************************/
    public void testQueue() {
        System.out.println("Testing queue...");
        Queue<String> queue = new LinkedList<String>();

        // queue names
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        System.out.println(queue.peek());
        queue.poll(); // dequeue
        System.out.println(queue.peek());

        System.out.println(queue.isEmpty());
        while(!queue.isEmpty()) {
            queue.poll();
        }
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());

        System.out.println();
    }

    public static void main(String[] args) {
        App app = new App();
        app.testStack();
        app.testQueue();
        
    }
}
