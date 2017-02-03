package Module2;

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
        int intArray[] = {-31, -27, - 42, -19, -5, 51, 27, 82, 21, 30};
        double doubleArray[] = {-3.1, -5.7, -8.1, -12.4, -16.2, 43.5, 21.7, 11.5, 18.2, 37.6};
        //sum
        int intsum = 0;
        for (int i = 0; i <intArray.length ; i++) {
            intsum+=intArray[i];
                    }
        double doublesum = 0;
        for (int i = 0; i <doubleArray.length ; i++) {
            doublesum+=doubleArray[i];
                    }
        System.out.println("Сумма элементов массива int: " + intsum);
        System.out.println("Сумма элементов массива double " + doublesum);
        System.out.println("----------");
        //min
        int intmin = intArray[0];
            for (int i = 0; i <intArray.length ; i++) {
                if (intArray[i]<intmin) {
                intmin = intArray[i];
            }
                    }
        double doublemin = doubleArray[0];
            for (int i = 0; i <doubleArray.length ; i++) {
                if (doubleArray[i]<doublemin) {
                doublemin = doubleArray[i];
            }
        }
        System.out.println("Минимальное значение массива int: " + intmin);
        System.out.println("Минимальное значение массива double: " + doublemin);
        System.out.println("----------");
        //max
        int intmax = intArray[0];
        for (int i = 0; i <intArray.length ; i++) {
                if (intArray[i]>intmax) {
                intmax = intArray[i];
            }
        }
        double doublemax = doubleArray[0];
        for (int i = 0; i <doubleArray.length ; i++) {
            if (doubleArray[i]>doublemax) {
                doublemax = doubleArray[i];
            }
        }
        System.out.println("Максимальное значение массива int: " + intmax);
        System.out.println("Максимальное значение массива double: " + doublemax);
        System.out.println("----------");
        //max positive
        int maxPosValue =intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]>=0 && maxPosValue<intArray[i])
                maxPosValue=intArray[i];
        }
        if(maxPosValue<0){
            System.out.println("В массиве нет элементов больше нуля.");
        } else
            System.out.println("Наибольшее положительное число в массиве: "+maxPosValue);
        System.out.println("----------");
        //multiplication
        int intmult = 1;
        for (int i = 1; i <intArray.length ; i++) {
            intsum*=intArray[i];
        }
        System.out.println("Сумма помноженных чисел: " +intsum);
        System.out.println("----------");
        //modulus
        int modulusInt = intArray[0] % intArray[9];
        double modulusDouble = doubleArray[0] % doubleArray[9];
        System.out.println("Modulus Integer: " + modulusInt);
        System.out.println("Modulus Double: " + modulusDouble);
        //Second Largest Element


    }
}
