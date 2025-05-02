package ch05.exercise;

public class Exercise08 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int numOfCells = 0;
        int sum = 0;
        double avg = 0.0;

        for (int i = 0; i < array.length; i++) {
            numOfCells += array[i].length;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        avg = (double) sum / numOfCells;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
