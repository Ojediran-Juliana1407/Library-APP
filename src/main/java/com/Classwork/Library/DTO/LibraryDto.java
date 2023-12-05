package com.Classwork.Library.DTO;

public class LibraryDto {
    private String Title;
    private String Author;
    private int ISBN;
    private int createdAt;
    private int updatedAt;


    public LibraryDto() {

    }

    public LibraryDto(String Title, String Author,int ISBN, int createdAt, int updatedAt){
      this.Title = Title;
      this.Author = Author;
      this. ISBN = ISBN;
      this.createdAt = createdAt;
      this.updatedAt = updatedAt;

    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

    public int getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(int updatedAt) {
        this.updatedAt = updatedAt;
    }
    @Override
    public String toString() {
        return "LibraryDto{" +
                "Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
