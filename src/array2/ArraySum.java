package array2;

public class ArraySum {
    public static void main(String[] args) {
        int[] tab1 = {5, 10, 15};
        int[] tab2 = {20, 25, 35};

        ArrayUtils arrayUtils = new ArrayUtils();
        int sum = arrayUtils.sumArrays(tab1, tab2);

        System.out.println("Suma liczb w tablicach wynosi: " + sum);
    }
}
