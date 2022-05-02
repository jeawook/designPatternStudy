package byJins.strategy;

import java.util.List;

public class QuickSort implements Sort{
    @Override
    public void sort(List<Object> al) {
        System.out.println("Strategy.QuickSort!!!");
    }
}
