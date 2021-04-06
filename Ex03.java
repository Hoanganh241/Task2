package task3;

public class Ex03 {
    public static void main(String[] args) {
        int[] marks;

        marks = new int[5];
        //declare and allocate a 20-element array in one statement via "new" operator
        int[] factors = new int[20];
        //declare, allocated a 6-e element array thru initialization
        int[] numbers = {11, 22, 33, 44, 55, 66};

        //array index

        marks[0] = 95;
        marks[1] = 85;
        marks[2] = 77;
        marks[3] = 69;
        marks[4] = 66;
        //retrieve elements of the array
        System.out.println(marks[0]);
        System.out.println(marks[3] + marks[4]);

        //10.2
        int[] xxx = new int[5];
        int numFactors = xxx.length;
    }
        //10.3
        /**
         * Find the mean and standard deviation of numbers kept in an array
         */
        public class MeanSDArray {
            public void main(String[] args){
                //declare
                int[] marks = {74, 43, 55, 34, 23, 32};
                int sum = 0;
                int sumSq = 0;
                double mean, stdDev;

                // Comput sum and square-sum using loop
                for (int i = 0; i < marks.length; ++i);{
                    sum += marks[i];
                    sumSq += marks[i];
                }
                mean = (double) sum / marks.length;
                stdDev = Math.sqrt((double) sumSq / marks.length - mean * mean);

                //Print results
                System.out.printf("Mean is: %.2f%n", mean);
                System.out.printf("Standard deviation is: %.2f%n", stdDev);
            }
        }
}
