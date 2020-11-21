package pt.pa.patterns.abstractfactory;

import pt.pa.model.*;

/**
 *
 *
 * @author brunomnsilva
 */
public class IEEECitationStyleFactory implements CitationStyleFactory {
    @Override
    public Citation createCitation(String type, String... args) {
        switch(type.toLowerCase()) {
            case "book":
                return new IEEEBookCitation(args[0], args[1], args[2], args[3], args[4]);
            case "bookchapter":
                return new IEEEBookChapterCitation(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7]);
            case "journal":
                return new IEEEJournalCitation(args[0], args[1], args[2], args[3], args[4], args[5]);
            default:
                throw new UnsupportedOperationException("Type not supported: " + type);
        }
    }

    @Override
    public BibliographyManager createManager() {
        return new IEEEBibliographyManager();
    }
}
