package Arrays;

/**
 *
 * @author belkizozbek
 */
public class ArrayAsParameter {

    public static void main(String[] args) {

        int[] array1 = new int[3];
        array1[0] = 12;
        array1[1] = 19;
        array1[2] = 78;

        int[] array2 = {12, 87, 99, 43, 45};

        System.out.println(calculateAverage(array2));
        System.out.println(calculateAverage(array1));
        System.out.println(calculateAverage(new int[]{65, 34, 8}));
        System.out.println(calculateAverage(new int[3]));       //passing with default value

    }

    public static double calculateAverage(int[] array) {

        int sum = 0;

        for (int i : array) {
            sum += i;
        }

        double average = (double) sum / array.length;

        return average;
    }

}
