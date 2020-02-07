package internalclass;

public class Main {
    public static void main(String[] args) {
        Sortable sorter = new Sortable() {
            @Override
            public void sort(int[] tab) {
                for (int j = 1; j < tab.length; j++) {
                    for (int i = 0; i < tab.length - j; i++) {
                        if (tab[i] > tab[i + 1]) {
                            int temp = tab[i + 1];
                            tab[i + 1] = tab[i];
                            tab[i] = temp;
                        }
                    }
                }
            }
        };
        int[] tab = {2000, 4, 56, 87, 9, 846, 211, 75, 1000, 100, 354, 101, 745};
        printArray(tab);
        sorter.sort(tab);
        printArray(tab);
    }

    private static void printArray(int[] tab) {
        for (int value : tab) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}