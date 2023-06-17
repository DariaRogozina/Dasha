package lesson3;

import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        swap(arr);
        System.out.println(Arrays.toString(arr));
        createArray();
        int[] array1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        changeArray(array1);
        fillDiagonals();
        create(12, 4);
        findMin(array1);
        findMax(array1);
        int[] array = {1, 1, 1, 2, 1, 5, 1};
        System.out.println(findMedian(array));
    }

    // 1
    public static void swap(int[] arr) {
        // TODO: 08.11.2022 поменять местами 0 и 1 в arr
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        }
    }

    // 2
    public static int[] createArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            // TODO: 08.11.2022 Создать массив длины 100
            //  Заполнить значениями 1, 2, ..., 100
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        return null;
    }

    // 3
    public static void changeArray(int[] array1) {
        // TODO: 08.11.2022 Все числа в ячейках, значение в которых меньше 6, умножить на 2
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 6) {
                array1[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array1));
    }

    // 4
    public static void fillDiagonals() {
        // TODO: 08.11.2022 Заполнить диагональные элементы единицами
        //  array[0][0], array[1][1], ...
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i + j) == 3 || i == j) {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    // 5
    public static int[] create(int len, int initialValue) {
        // TODO: 08.11.2022 Создать массив длины len со значениями initialValue
        //  [initialValue, initialValue, ..., initialValue].length = len
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
        return null;
    }

    // 6
    public static int findMin(int[] array1) {
        // TODO: 08.11.2022 Найти минимальный
        int min = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < min) {
                min = array1[i];
            }
        }
        System.out.println("Max = " + min);
        return 0;
    }

    // 6
    public static int findMax(int[] array1) {
        // TODO: 08.11.2022 Найти максимальный
        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        System.out.println("Max = " + max);
        return 0;
    }

    // 7
    public static boolean findMedian(int[] array) {
        // TODO: 08.11.2022 Если есть место, от которого сумма слева и справа равны, вернуть true.
        //  Иначе вернуть false.
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double half = sum / 2;
        int arr = 0;
        for (int i = 0; i < array.length; i++) {
            arr += array[i];
            if (half == arr) {
                return true;
            }
        }
        return false;

//    // 8
//    public static void shift(int[] array, int n) {
//        // TODO: 08.11.2022 Сдвинуть все элементы массива array на n вправо (при положительном n)
//        //  или на n влево (при отрицательном n).
//        //  Если сложно, то решить задачу сдвига на 1 вправо.
//    }


    }
}

