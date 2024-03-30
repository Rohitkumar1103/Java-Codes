import java.util.Scanner;

public class Labassignment {
    public static void main(String[] args) {
        String correctAnswers = "10010110011111010101";

        boolean[][] studentAnswers = new boolean[50][20];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter answers for student " + (i + 1) + " (20 characters of 1s and 0s):");
            String answerInput = scanner.nextLine();

            for (int j = 0; j < 20; j++) {
                studentAnswers[i][j] = answerInput.charAt(j) == '1';
            }
        }

        int[] scores = new int[5];
        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {
            int score = 0;
            for (int j = 0; j < 20; j++) {
                if (studentAnswers[i][j] == (correctAnswers.charAt(j) == '1')) {
                    score += 2;
                } else {
                    score -= 1; 
                }
            }
            scores[i] = score;

            if (score >= 90) {
                grades[i] = 'O';
            } else if (score >= 80) {
                grades[i] = 'A';
            } else if (score >= 70) {
                grades[i] = 'B';
            } else if (score >= 60) {
                grades[i] = 'C';
            } else {
                grades[i] = 'D';
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + " answers: ");
            for (int j = 0; j < 20; j++) {
                System.out.print(studentAnswers[i][j] ? "1" : "0");
            }
            System.out.println(" Score: " + scores[i] + " Grade: " + grades[i]);
        }

        scanner.close();
    }
}
