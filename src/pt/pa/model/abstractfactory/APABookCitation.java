package pt.pa.model.abstractfactory;

/**
 * IEEE bibliography style for a Book:
 *
 *  - #AUTHOR#, #TITLE#, #PLACE#: #PUBLISHER#, #YEAR#.
 *
 * @author brunomnsilva
 */
public class APABookCitation implements Citation {

    protected String author;
    protected String title;
    private String place;
    private String publisher;
    private String year;

    public APABookCitation(String author, String title, String place, String publisher, String year) {
        this.author = author;
        this.title = title;
        this.place = place;
        this.publisher = publisher;
        this.year = year;
    }

    @Override
    public String toStringFormatted() {
        return "TODO"; //TODO: apply citation style format
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
