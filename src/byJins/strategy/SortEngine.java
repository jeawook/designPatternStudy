package byJins.strategy;

import java.util.ArrayList;
import java.util.List;

public class SortEngine {
    private Sort sorter;

    public SortEngine(Sort sorter) {
        this.sorter = sorter;
    }

    public void setSorter(Sort sorter) {
        this.sorter = sorter;
    }

    public List<Object> search() {
        List<Object> list = new ArrayList<>();
        sorter.sort(list);
        return list;
    }
}
