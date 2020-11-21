package pt.pa.model;

/**
 * APA bibliography style for a Journal:
 *
 *  - #AUTHOR#, "#TITLE#", #JOURNAL_TITLE#, vol. #VOLUME#, pp. #PAGE_NUMBERS#, #YEAR#.
 *
 * @author brunomnsilva
 */
public class APAJournalCitation implements Citation {

    protected String author;
    protected String title;
    private String journal_title;
    private String volume_issue;
    private String page_numbers;
    private String year;

    public APAJournalCitation(String author, String title, String journal_title, String volume_issue,
                              String page_numbers, String year) {
        this.author = author;
        this.title = title;
        this.journal_title = journal_title;
        this.volume_issue = volume_issue;
        this.page_numbers = page_numbers;
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
