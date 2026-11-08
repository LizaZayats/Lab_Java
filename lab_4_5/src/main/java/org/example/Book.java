package org.example;

import java.util.ArrayList;
import java.util.List;


import static org.example.Genre.FICTION;

class Book {
    private String title;
    private Genre genre;


    public Book() {
        this.title = "Нет";
        this.genre = FICTION;
    }

    public Book(String title, Genre genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public static List<Book> findFantasy(Book[] books) {
        List<Book> result = new ArrayList<>();
        for (Book b : books) {
            if (b.getGenre() == Genre.FANTASY) {
                result.add(b);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s (жанр: %s)", title, genre);
    }


}