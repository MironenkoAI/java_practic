package homework1;

/*ЗАДАЧА 2. Дан массив nums = [3,2,2,3] и число val = 3.
        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
        а остальные - равны ему. */
public class MainClassTask2 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3, 1, 3};
        for (int x : nums) System.out.print(x + " ");
        System.out.println();
        sortValue(nums, 3);
        for (int x : nums) System.out.print(x + " ");
    }
    public static void sortValue(int[] arr, int k) {
        int i, j = 0;
        for (i = 0; i < arr.length; i++)
            if (arr[i] != k) arr[j++] = arr[i];

        for (i = j; i < arr.length; i++) arr[i] = k;
    }
}
