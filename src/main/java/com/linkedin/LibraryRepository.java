package com.linkedin;

public interface LibraryRepository {

    void addBook(String bookTitle, int quantity);

    boolean lendBook(String bookTitle);

}
