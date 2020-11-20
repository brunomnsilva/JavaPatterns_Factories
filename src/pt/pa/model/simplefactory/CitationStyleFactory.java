package pt.pa.model.simplefactory;

/*
 *
 * @author brunomnsilva
 */
public class CitationStyleFactory  {

    public static Citation create(String type, String... args) {
        switch(type.toLowerCase()) {
            case "book":
                return new BookCitation(args[0], args[1], args[2], args[3], args[4]);
            case "bookchapter":
                return new BookChapterCitation(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7]);
            case "journal":
                return new JournalCitation(args[0], args[1], args[2], args[3], args[4], args[5]);
            default:
                throw new UnsupportedOperationException("Type not supported: " + type);
        }
    }
}
