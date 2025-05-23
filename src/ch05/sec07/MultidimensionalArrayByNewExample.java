package ch05.sec07;

public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];
        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;

        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        int totalStudent = 0; // 학생 수
        int totalMathSum = 0; // 수학점수의 합

        for (int i = 0; i < mathScores.length; i++) {
            totalStudent += mathScores[i].length;
            for (int j = 0; j < mathScores[i].length; j++) {
                totalMathSum += mathScores[i][j];
            }
        }
        System.out.println("수학점수합 = " + totalMathSum);
        double totalMathAvg = (double) totalMathSum / totalStudent;
        System.out.println("수학점수평균 = " + totalMathAvg);
        System.out.println();


        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];

        englishScores[0][0] = 90;
        englishScores[0][1] = 91;

        englishScores[1][0] = 92;
        englishScores[1][1] = 93;
        englishScores[1][2] = 94;

        totalStudent = 0;
        int totalEnglishSum = 0;

        for (int i = 0; i < englishScores.length; i++) {
            totalStudent += englishScores[i].length;
            for (int j = 0; j < englishScores[i].length; j++) {
                totalEnglishSum += englishScores[i][j];
            }
        }

        System.out.println("영어점수합 = " + totalEnglishSum);
        double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
        System.out.println("영어점수평균 = " + totalEnglishAvg);

    }
}
