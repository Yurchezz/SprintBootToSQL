package ua.lviv.iot.models;

public class Book extends Good {
    private int pageCount;
    private String author;

    public Book(final String name,
                final int price,
                final int pageCount,
                final String author,
                final Delivery delivery) {

        super(name, price, delivery);
        this.pageCount = pageCount;
        this.author = author;
    }



    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(final int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders()
                + "PageCount,"
                + "Author";
    }

    @Override
    public String toCSV() {
        return super.toCSV()
                + "," + getPageCount()
                + "," + getAuthor();
    }
}
