package day_8.to_string;

public class Book {
    private String title;
    private String author;
    private int ISBN;
    private int pages;

    
    public Book(String title, String author, int ISBN, int pages) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }

    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    // I just overrided the Object Class' toString method to return Boook instance's details. 
    @Override
    public String toString() {
        return String.format(" Title  : %s \n Author : %s \n ISBN   : %d \n Pages  : %d \n\n",this.title,this.author,this.ISBN,this.pages);
    }
}
