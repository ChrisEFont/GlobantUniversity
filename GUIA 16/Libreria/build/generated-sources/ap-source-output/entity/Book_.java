package entity;

import entity.Author;
import entity.Publisher;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-10-19T20:53:05")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, Integer> copies;
    public static volatile SingularAttribute<Book, Integer> copiesAvailable;
    public static volatile SingularAttribute<Book, Author> author;
    public static volatile SingularAttribute<Book, Long> isbn;
    public static volatile SingularAttribute<Book, Publisher> publisher;
    public static volatile SingularAttribute<Book, Integer> copiesBorroweds;
    public static volatile SingularAttribute<Book, String> title;

}