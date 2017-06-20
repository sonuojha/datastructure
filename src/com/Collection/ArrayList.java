package com.Collection;

import java.security.Key;
import java.util.*;

/**
 * Created by aojha on 6/15/17.
 */

class Book{
    int id;
    String name, auther, publisher;

    Book(int id, String name, String auther, String publisher){
        this.id  =id;
        this.name = name;
        this.auther = auther;
        this.publisher = publisher;
    }
}

class EnumMapExample{
    public enum Key{
        one, two, three;
    }
}
public class ArrayList {
    public static void main(String[] args) {

        EnumMap<EnumMapExample.Key, Book> map = new EnumMap<EnumMapExample.Key, Book>(EnumMapExample.Key.class);
        Book b1 = new Book(101, "Let us C","Yashwant", "PBP");
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill");
        Book b3=new Book(103,"Operating System","Galvin","Wiley");

        map.put(EnumMapExample.Key.one, b1);
        map.put(EnumMapExample.Key.two, b2);
        map.put(EnumMapExample.Key.three, b3);

        for(Map.Entry<EnumMapExample.Key, Book> entry:map.entrySet()){
            Book book = entry.getValue();
            System.out.println(book.id + " " + book.name + " " + book.auther + " " + book.publisher);
        }
    }
}
