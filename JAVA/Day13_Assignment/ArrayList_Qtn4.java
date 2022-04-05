package Day13_Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
	class Book {   
		String book_name,book_author;
		int year_of_publish; 
		int no_of_copies_sold;  
		public Book( String book_name, String book_author, int year_of_publish, int no_of_copies_sold)
		{  
		    this.book_name = book_name;  
		    this.book_author = book_author;  
		    this.year_of_publish = year_of_publish;  
		    this.no_of_copies_sold = no_of_copies_sold;  
		}
		}  
		public class ArrayList_Qtn4 {  
		public static void main(String[] args) {  
		    List<Book> list=new ArrayList<Book>();  
		    Book b1=new Book("Two States","Chethan Bagath",2009,12000);  
		    Book b2=new Book("Kite Runner","Khaled",2008,150);  
		    Book b3=new Book("Little Women","May Alcott",2019,200);
		    Book b4=new Book("A little book oh Happiness","Ruskin Bond",2021,500);
		    list.add(b1);  
		    list.add(b2);  
		    list.add(b3);  
		    list.add(b4);
		    System.out.println("NAME OF BOOK"+" | "+"AUTHOR OF BOOK"+" | "+"YEAR OF PUBLISH"+" | "+"COPIES SOLD");
		    System.out.println("\n");
		    System.out.println("----------------Original List------------------");
		    for(Book b:list){  
		        System.out.println(b.book_name+" | "+b.book_author+" | "+b.year_of_publish+" | "+b.no_of_copies_sold);  
		    }  
		    System.out.println("\n");
		    Collections.sort(list,Collections.reverseOrder()); 
	        System.out.println("--------------------------- Booklist Sorted by year ------------------------------");
	        for (Book b : list) {
	            System.out.println(b.book_name + " -- " + b.book_author + " -- " + b.year_of_publish + " -- " + b.no_of_copies_sold);
	        }
	        System.out.println("----------------------------------------------------------------------------");
		}  
		}  
