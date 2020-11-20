package pt.pa.model.simplefactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Ilustrates an application of the Simple Factory pattern.
 *
 * The factory contains a static method with a conditional statement that creates the type of object
 * required by the caller.
 *
 * The client works with the interface of the created products.
 *
 * This pattern only allows one factory.
 *
 * @author brunomnsilva
 */
public class Main {

    public static void main(String[] args) {

        List<Citation> bibliography = new ArrayList<>();

        Citation citation1 = CitationStyleFactory.create("book", "D. Sarunyagate", "Lasers",
                "New York", "McGraw-Hill", "1996");

        Citation citation2 = CitationStyleFactory.create("bookchapter", "G. O. Young",
                "Synthetic structure of industrial plastics", "Plastics, 2nd ed",
                "J. Peters", "New York", "McGraw-Hill", "15-64", "1996");

        Citation citation3 = CitationStyleFactory.create("journal", "G. Liu, K. Y. Lee, and H. F. Jordan",
                "TDM and TWDM de Bruijn networks and shufflenets for optical communications",
                "EEE Trans. Comp.", "46", "695-701", "June 1997");

        bibliography.add( citation1 );
        bibliography.add( citation2 );
        bibliography.add( citation3 );

        for(Citation c : bibliography) {
            System.out.println(c.toStringFormatted());
        }

    }
}
