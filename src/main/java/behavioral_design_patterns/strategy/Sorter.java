package behavioral_design_patterns.strategy;

public class Sorter {
    private SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(int arr[]){
        sortingStrategy.sort(arr);
    }
}
