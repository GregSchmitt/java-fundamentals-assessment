public class Assessment {
    public static void main(String[] args) {

        System.out.println("the squared value of 7 is " + square(7));
        System.out.println();
        System.out.println("the sum value of 2 + 5 = " + sum(2, 5));
        System.out.println();



// <============================ AVERAGE: ============================>
    // average: should accept an array of integers, and return
    // the average of the passed numbers as a double.

        double[] values = {1, 2, 3, 4, 5};
        double total = 0;
        for (double element : values) {
            total += element;
        }
        System.out.println("The total of the numbers = " + total);

        double average = 0;
        if (values.length > 0) {
            average = total / values.length;
        }
        System.out.println("The average of the numbers = " + average);

    }


// <============================= SUM: ===============================>
    // sum: should accept 2 numbers, either integers or doubles,
    // and returns the result of adding the two numbers together.

    public static int sum(int number1, int number2){
        return number1 + number2;
    }
//    public static double sum(double number1, double number2){
//        return number1 + number2;
//    }


// <============================ SQUARE: =============================>
    // square: should accept and return a single integer number.
    // The method should return the number times itself.

    public static int square(int number){
        return number * number;
    }
}


