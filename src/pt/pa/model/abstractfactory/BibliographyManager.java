package pt.pa.model.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public abstract class BibliographyManager {

    private List<Citation> list;

    public BibliographyManager() {
        list = new ArrayList<>();
    }

    public void add(Citation citation) {
        list.add(citation);
    }

    public List<Citation> getAll() {
        return new ArrayList<>( list );
    }

    public abstract String output();
}
