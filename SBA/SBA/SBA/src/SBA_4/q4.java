/*4. Create a class of Books with attributes:
a)id
b)name
c)author
d)publisher
e)quantity sold.
Implement a Hashtable to implement the objects of Books type. Print all the
details of books by traversing through the Hashtable.*/
package SBA_4;
	import java.util.*;    
	class Book {    
	int id;    
	String name,author,publisher;    
	int quantity;    
	public Book(int id, String name, String author, String publisher, int quantity) {    
	    this.id = id;    
	    this.name = name;    
	    this.author = author;    
	    this.publisher = publisher;    
	    this.quantity = quantity;    
	}    
	}    
	public class q4 {    
	public static void main(String[] args) {    
	    //Creating map of Books    
	    Hashtable<Integer,Book> map=new Hashtable<Integer,Book>();    
	    //Creating Books    
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
	    //Adding Books to map   
	    map.put(1,b1);  
	    map.put(2,b2);  
	    map.put(3,b3);      
	    //Traversing map  
	    for(Map.Entry<Integer, Book> z:map.entrySet()){    
	        int key=z.getKey(); //key=3 
	        Book b=z.getValue(); //b=b3 
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    }    
	}    
	}    