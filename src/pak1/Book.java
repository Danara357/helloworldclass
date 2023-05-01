package pak1;

import java.util.Objects;

public class Book {
    private String title;
    private Autor autor;
    private int publishingYear;

    public Book(String title, Autor autor, int publishingYear) {
        this.title = title;
        this.autor = autor;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", autor=" + autor +
                ", publishingYear=" + publishingYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getPublishingYear() == book.getPublishingYear() && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAutor(), book.getAutor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAutor(), getPublishingYear());
    }
}
