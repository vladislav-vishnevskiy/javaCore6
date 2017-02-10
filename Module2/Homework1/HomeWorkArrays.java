package Module2.Homework1;

/**
 * Input: array with size = 10 can be of one of two data types: int and double. Calculate:
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
public class HomeWorkArrays {
    public static void main(String[] args) {
        int intArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double doubleArray[] = {-1.5, -2.5, -3.5, -4.5, -5.5, 1.5, 2.5, 3.5, 5.5, 6.5};
        //sum
        int intsum = 0;
        for (int i = 0; i < intArray.length; i++) {
            intsum += intArray[i];
        }
        double doublesum = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            doublesum += doubleArray[i];
        }
        System.out.println("Сумма элементов массива int: " + intsum);
        System.out.println("Сумма элементов массива double " + doublesum);
        System.out.println("----------");
        //min
        int intmin = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < intmin) {
                intmin = intArray[i];
            }
        }
        double doublemin = doubleArray[0];
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] < doublemin) {
                doublemin = doubleArray[i];
            }
        }
        System.out.println("Минимальное значение массива int: " + intmin);
        System.out.println("Минимальное значение массива double: " + doublemin);
        System.out.println("----------");
        //max
        int intmax = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > intmax) {
                intmax = intArray[i];
            }
        }
        double doublemax = doubleArray[0];
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] > doublemax) {
                doublemax = doubleArray[i];
            }
        }
        System.out.println("Максимальное значение массива int: " + intmax);
        System.out.println("Максимальное значение массива double: " + doublemax);
        System.out.println("----------");
        //max positive
        int maxPosValue = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] >= 0 && maxPosValue < intArray[i])
                maxPosValue = intArray[i];
        }
        if (maxPosValue < 0) {
            System.out.println("В массиве нет элементов больше нуля.");
        } else
            System.out.println("Наибольшее положительное число в массиве: " + maxPosValue);
        double maxPosValueDouble = doubleArray[0];
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] >= 0 && maxPosValueDouble < intArray[i])
                maxPosValueDouble = doubleArray[i];
        }
        if (maxPosValueDouble < 0) {
            System.out.println("В массиве нет элементов больше нуля");
        } else
            System.out.println("Наибольшее положительное число в массиве double: " + maxPosValueDouble);
        System.out.println("----------");
        //multiplication
        int intMult = 1;
        for (int i = 1; i < intArray.length; i++) {
            intMult *= intArray[i];
        }

        double doubleMult = 1;
        for (int i = 1; i < doubleArray.length; i++) {
            doubleMult *= doubleArray[i];
        }
        System.out.println("Сумма помноженных элементов массива int: " + intMult);
        System.out.println("Сумма помноженных элементов массива double: " + doubleMult);
        System.out.println("----------");
        //modulus
        int modulusInt = intArray[0] % intArray[9];
        double modulusDouble = doubleArray[0] % doubleArray[9];
        System.out.println("Modulus Integer: " + modulusInt);
        System.out.println("Modulus Double: " + modulusDouble);
        System.out.println("----------");
        //Second Largest Element
        int secondIntMax = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > intmax) {
                intmax = intArray[i];
            }
            if ((intArray[i] > secondIntMax) && (intArray[i] != intmax))
                secondIntMax = intArray[i];
        }
        double secondDoubleMax = doubleArray[0];
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] > doublemax) {
                doublemax = doubleArray[i];
            }
            if ((doubleArray[i] > secondDoubleMax) && (doubleArray[i] != doublemax))
                secondDoubleMax = doubleArray[i];
        }
        System.out.println("Второй наибольший элемент массива int: " + secondIntMax);
        System.out.println("Второй наибольший элемент массива double: " + secondDoubleMax);
        System.out.println("----------");
    }
}