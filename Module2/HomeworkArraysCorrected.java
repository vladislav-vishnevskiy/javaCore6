package Module2;

/**
 * sum
 * min/max
 * max positive
 * multiplication
 * modulus of first and last element
 * second largest element

 * As a result you should have methods with following names :

 * sum(int array[]), sum(double[])
 * min(int array[]), min(double[])
 * max(int array[]), max(double[])
 * maxPositive(int array[]), maxPositive(double array[]),
 * multiplication  (int array[]), multiplication (double[])
 * modulus(int array[]), modulus(double[])
 * secondLargest(int array[]), secondLargest(double[])
 */
public class HomeworkArraysCorrected {
    public static void main(String[] args) {
        int intArray[] = {-5, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double doubleArray[] = {-1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5, 10.5};

        System.out.println("Сумма чисел массива int = " + sum(intArray));
        System.out.println("Сумма чисел массива double = " + sum(doubleArray));
        System.out.println("Минимальное число в массиве int: " + min(intArray));
        System.out.println("Минимальное число в массиве double: " + min(doubleArray));
        System.out.println("Максимальное число в массиве int: " + max(intArray));
        System.out.println("Максимальное число в массиве double: " + max(doubleArray));
        System.out.println("Максимальное положительное число в массиве int: " + maxPositive(intArray));
        System.out.println("Максимальное положительное число в массиве double: " + maxPositive(doubleArray));
        System.out.println("Произведение элементов массива int = " + multiplication(intArray));
        System.out.println("Произведение элементов массива double = " + multiplication(doubleArray));
        System.out.println("Модуль первого и последнего элемента массива int: " +getModulus(intArray));
        System.out.println("Модуль первого и последнего элемента массива double: " + getModulus(doubleArray));
        System.out.println("Второе по величине число массива int: " + secondLargest(intArray));
        System.out.println("Второе по величине число массива double: " + secondLargest(doubleArray));
    }

    public static int sum(int array[]) {                                                            //сумма массива int
        int intSum = 0;
        for (int i = 0; i < array.length; i++) {
            intSum += array[i];
        }
        return intSum;
    }

    public static double sum(double array[]) {                                                   //сумма массива double
        double doubleSum = 0;
        for (int i = 0; i < array.length; i++) {
            doubleSum += array[i];
        }
        return doubleSum;
    }

    public static int min(int array[]) {                                                                     //min int
        int minIntArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minIntArray)
                minIntArray = array[i];
        }
        return minIntArray;
    }

    public static double min(double array[]) {                                                            //min double
        double minDoubleArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minDoubleArray)
                minDoubleArray = array[i];
        }
        return minDoubleArray;
    }

    public static int max(int array[]) {                                                                    //max int
        int maxIntArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxIntArray)
                maxIntArray = array[i];
        }
        return maxIntArray;
    }

    public static double max(double array[]) {                                                           //max double
        double maxDoubleArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxDoubleArray)
                maxDoubleArray = array[i];
        }
        return maxDoubleArray;
    }

    public static int maxPositive(int array[]) {                                                    //Max Positive int
        int intMaxPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (array[i] > intMaxPositive) {
                    intMaxPositive = array[i];
                }
            }
        }
        return intMaxPositive;
    }

    public static double maxPositive(double array[]) {                                           //Max Positive double
        double doubleMaxPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (array[i] > doubleMaxPositive) {
                    doubleMaxPositive = array[i];
                }
            }
        }
        return doubleMaxPositive;
    }

    public static int multiplication(int array[]) {                                               //multiplication int
        int intMult = 1;
        for (int i = 1; i < array.length; i++) {
            intMult *= array[i];
        }
        return intMult;
    }

    public static double multiplication(double array[]) {                                      //multiplication double
        double doubleMult = 1;
        for (int i = 1; i < array.length; i++) {
            doubleMult *= array[i];
        }
        return doubleMult;
    }

    public static int getModulus(int array[]) {                                                          //modulus int
        int firstNumb = array[0];
        int lastNumb = array[array.length - 1];
        int intModulus = firstNumb % lastNumb;

        return intModulus;
    }

    public static double getModulus(double array[]) {                                                 //modulus double
        double firstNum = array[0];
        double lastNum = array[array.length - 1];
        double doubleModulus = firstNum % lastNum;

        return doubleModulus;
    }

    public static int secondLargest(int array[]) {                                                  //Second Largst int
        int intMax = array[0];
        int secondIntMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > intMax) {
                intMax = array[i];
            }
            if ((array[i] > secondIntMax) && (array[i] != intMax))
                secondIntMax = array[i];
        }
        return secondIntMax;
    }

    public static double secondLargest(double array[]) {                                        //Second Largest double
        double doubleMax = array[0];
        double secondDoubleMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > doubleMax) {
                doubleMax = array[i];
            }
            if ((array[i] > secondDoubleMax) && (array[i] != doubleMax))
                secondDoubleMax = array[i];
        }
        return secondDoubleMax;
    }
}

