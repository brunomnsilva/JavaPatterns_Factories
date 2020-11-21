package pt.pa.patterns.abstractfactory;

import pt.pa.model.*;
import java.util.List;

public class IEEEBibliographyManager extends BibliographyManager {

    @Override
    public String output() {
        List<Citation> all = getAll();
        all.sort((c1, c2) -> c1.getAuthors().compareToIgnoreCase(c2.getAuthors()));

        StringBuilder sb = new StringBuilder();
        int number = 1;
        for(Citation c : all) {
            sb.append(String.format("[%d]", number++));
            sb.append("\t");
            sb.append(c.toStringFormatted());
            sb.append("\n");
        }
        return sb.toString();
    }

}
