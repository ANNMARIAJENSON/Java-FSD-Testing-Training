//2. Implement a PriorityQueue and use all the methods.
package SBA_3;
import java.util.Iterator;
import java.util.PriorityQueue;
public class q2 {
	
		public static void main(String args[])
		{
			PriorityQueue<String> pq = new PriorityQueue<>();
			//add method
			pq.add("Ajay");//A-Z= 65-90
			pq.add("Vijay");
			pq.add("Raj");
			pq.add("Gagan");
			System.out.println("The current queue is : "+pq);
			System.out.println("Element method :"+pq.element());
			System.out.println("Peek method :"+pq.peek());  
			System.out.println("Iterating the queue elements:");  
			Iterator itr=pq.iterator();  
			while(itr.hasNext()){  
			System.out.println(itr.next());  
			}  
			pq.remove();//removes the head element  
			pq.poll();  //removes the head
			System.out.println("After removing two elements:");  
			Iterator<String> itr2=pq.iterator();  
			while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}

		
		}
	}