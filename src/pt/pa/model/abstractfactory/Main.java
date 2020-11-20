package pt.pa.model.abstractfactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Ilustrates an application of the Factory Method pattern.
 *
 * The factory contains a static method with a conditional statement that creates the type of object
 * required by the caller.
 *
 * The client works with the interface of the created products.
 *
 * This pattern allows to change the concrete implementation of the factory. The client only works with
 * the interface of the factory.
 *
 * @author brunomnsilva
 */
public class Main {

    public static void main(String[] args) {

        CitationStyleFactory factory = new IEEECitationStyleFactory();
        //CitationStyleFactory factory = new IEEECitationStyleFactory();

        Citation citation1 = factory.createCitation("book", "D. Sarunyagate", "Lasers",
                "New York", "McGraw-Hill", "1996");

        Citation citation2 = factory.createCitation("bookchapter", "G. O. Young",
                "Synthetic structure of industrial plastics", "Plastics, 2nd ed",
                "J. Peters", "New York", "McGraw-Hill", "15-64", "1996");

        Citation citation3 = factory.createCitation("journal", "G. Liu, K. Y. Lee, and H. F. Jordan",
                "TDM and TWDM de Bruijn networks and shufflenets for optical communications",
                "EEE Trans. Comp.", "46", "695-701", "June 1997");

        BibliographyManager bibliography = factory.createManager();

        bibliography.add( citation1 );
        bibliography.add( citation2 );
        bibliography.add( citation3 );

        System.out.println(bibliography.output());

    }
}
