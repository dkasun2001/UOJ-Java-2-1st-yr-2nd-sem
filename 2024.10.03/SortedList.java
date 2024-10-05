public class SortedList extends IntList {

     public SortedList(int size) {
        super(size);
    }

    public void sorting() {
        int n = super.numElements;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    
    public String toString() {
        sorting();
        return super.toString();
    }
}