package patterns.hw31.strategy;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 1, 4};

        SortingStrategy bubbleSort = new BubbleSortStrategy();
        SortingContext context = new SortingContext(bubbleSort);
        context.sortArray(array);

        SortingStrategy quickSort = new QuickSortStrategy();
        context.setStrategy(quickSort);
        context.sortArray(array);

        SortingStrategy mergeSort = new MergeSortStrategy();
        context.setStrategy(mergeSort);
        context.sortArray(array);
    }
}
