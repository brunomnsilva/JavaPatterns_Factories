package pt.pa.patterns.factorymethod;

import pt.pa.model.Citation;
import pt.pa.model.IEEEBookChapterCitation;
import pt.pa.model.IEEEBookCitation;
import pt.pa.model.IEEEJournalCitation;

/**
 * Concrete implementation of the IEEE Citation factory.
 *
 * Concrete products returned by this factory are all from the IEEE family.
 *
 * @author brunomnsilva
 */
public class IEEECitationStyleFactory implements CitationStyleFactory {
    @Override
    public Citation create(String type, String... args) {
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
}
