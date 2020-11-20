package pt.pa.model.simplefactory;


/**
 * IEEE bibliography style for a Book:
 *
 *  - #AUTHOR#, #TITLE#, #PLACE#: #PUBLISHER#, #YEAR#.
 *
 * @author brunomnsilva
 */
public class BookCitation implements Citation {

    protected String author;
    protected String title;
    private String place;
    private String publisher;
    private String year;

    public BookCitation(String author, String title, String place, String publisher, String year) {
        this.author = author;
        this.title = title;
        this.place = place;
        this.publisher = publisher;
        this.year = year;
    }

    @Override
    public String toStringFormatted() {
        return author + ", " + title + ", " + place + ": " + publisher + ", " + year + ".";
    }

    @Override
    public String getAuthors() {
        return author;
    }

    @Override
    public String getYear() {
        return year;
    }
}
