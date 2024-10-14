package DAO;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import Resource.MongoConnection;

import java.util.Arrays;

public class BookDAO {
    private MongoDatabase database;

    public BookDAO() {
        this.database = MongoConnection.getDatabase();
    }

    public void createBooks() {
        MongoCollection<Document> collection = database.getCollection("books");
        collection.insertMany(Arrays.asList(
                new Document("title", "1984").append("author", "George Orwell").append("year", 1949).append("genre", "Ficção Científica"),
                new Document("title", "Dom Casmurro").append("author", "Machado de Assis").append("year", 1899).append("genre", "Romance"),
                new Document("title", "The Lord of the Rings").append("author", "J.R.R. Tolkien").append("year", 1954).append("genre", "Fantasia"),
                new Document("title", "Animal Farm").append("author", "George Orwell").append("year", 1945).append("genre", "Fábula")
        ));
    }

    public void deleteBook() {
        MongoCollection<Document> collection = database.getCollection("books");
        collection.deleteOne(new Document("title", "Dom Casmurro"));
    }

    public void updateBook() {
        MongoCollection<Document> collection = database.getCollection("books");
        collection.updateOne(new Document("title", "1984"), new Document("$set", new Document("year", 1950)));
    }

    public void findBooksByAuthor() {
        MongoCollection<Document> collection = database.getCollection("books");
        collection.find(new Document("author", "George Orwell")).forEach((Document doc) -> System.out.println(doc.toJson()));
    }

    public void findBooksByYear() {
        MongoCollection<Document> collection = database.getCollection("books");
        collection.find(new Document("year", new Document("$gt", 1950))).forEach((Document doc) -> System.out.println(doc.toJson()));
    }
}
