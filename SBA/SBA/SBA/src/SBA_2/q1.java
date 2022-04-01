/*1.Create an array list of user-defined data type Book. it should have:-
i)Name of the Book
ii)Author of the book
iii)year of publication of the book
iV)number of copies sold.
sort the array list based on the year of publication.*/

package SBA_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book {   
	String book_name,book_author;
	int year; 
	int no_of_copies_sold;  
	public Book( String book_name, String book_author, int year, int no_of_copies_sold)
	{  
	    this.book_name = book_name;  
	    this.book_author = book_author;  
	    this.year = year;  
	    this.no_of_copies_sold = no_of_copies_sold;  
	}
	public Integer getYear() {
		return year;
	}

	@Override
	public String toString() {
		
		return " date="+year+", name="+book_name+", author="+book_author+", cpy="+no_of_copies_sold+"\n";
	}
	}  
	public class q1  {  
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
	        System.out.println(b.book_name+" | "+b.book_author+" | "+b.year+" | "+b.no_of_copies_sold);  
	    }  
	    System.out.println("\n");
	    System.out.println("----------------After Sorting List------------------");
		list.sort((source,target) -> {return (source.getYear() - target.getYear());});
		list.sort(Comparator.comparingInt(Book::getYear));
		System.out.println(list);
	}  
	}  
