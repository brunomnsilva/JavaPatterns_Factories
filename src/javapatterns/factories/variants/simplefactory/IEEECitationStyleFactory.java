package javapatterns.factories.variants.simplefactory;

import javapatterns.factories.model.Citation;
import javapatterns.factories.model.IEEEBookChapterCitation;
import javapatterns.factories.model.IEEEBookCitation;
import javapatterns.factories.model.IEEEJournalCitation;

/**
 * Citation factory.
 *
 * Implements the factory method pattern.
 *
 * The factory contains a static method with a conditional statement that creates the type of object
 * required by the caller.
 *
 * This pattern only allows one factory (this one!), therefore is not extensible.
 *
 * @author brunomnsilva
 */
public class IEEECitationStyleFactory {

    public static Citation create(String type, String... args) {
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
