import java.util.Deque;
import java.util.ArrayDeque;
public class ArrayDeQueue 
{
    public static void main (String[] args)
    {
    	Deque<Integer> queue=new ArrayDeque<Integer>();
    	     	
    	System.out.println(queue);
    	queue.offer(20);
         queue.add(1);
    	queue.add(2);
    	queue.offer(3);
    	queue.offer(4);

    	System.out.println(queue);
    	queue.peek();
    	System.out.println(queue);
    	queue.remove(1);//index
    	System.out.println(queue);
    	queue.poll();
    	System.out.println(queue);
    	queue.addFirst(100);
    	System.out.println(queue);
    	queue.offerFirst(50);
    	System.out.println(queue);
    	queue.addLast(10);
    	System.out.println(queue);
    	queue.offerLast(40);
    	System.out.println(queue);
 }
}

