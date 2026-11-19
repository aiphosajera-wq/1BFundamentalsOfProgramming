public class QuizGrader {
    public static void main(String[] args) {

        // Gumamit tayo ng char array dahil letters ang choices sa quiz
        char[] answerKey = {'A', 'C', 'B', 'D', 'A','C', 'C', 'B', 'A', 'D'};

        // Gumawa tayo ng another char array para ma-store yung answers ng student
        char[] studentAnswers = {'A', 'B', 'B', 'D', 'C','C', 'C', 'B', 'A', 'A'};

        // Sinimulan natin sa zero dahil wala pa tayong nache-check na correct answers
        int correctCount = 0;

        // Gumamit tayo ng for loop para ma-compare yung answers sa bawat question
        for (int i = 0; i < answerKey.length; i++) {

            // Gumamit tayo ng if para malaman kung pareho yung sagot sa answer key
            if (studentAnswers[i] == answerKey[i]) {

                // Dinagdagan natin ng isa yung count kapag tama yung sagot
                correctCount++;

            } else {

                // Ginamit natin yung else para maipakita naman yung mga maling sagot
                System.out.println("Question " + (i + 1)
                        + ": Incorrect. You answered '"
                        + studentAnswers[i] + "', correct answer is '"
                        + answerKey[i] + "'");
            }
        }

        // Gumamit tayo ng double at nag-multiply sa 100 para makuha yung score percentage
        double scorePercentage = (double) correctCount / answerKey.length * 100;

        // Ipinakita natin kung ilan yung correct answers out of 10 questions
        System.out.println("\nCorrect Answers: " + correctCount + "/" + answerKey.length);

        // Ipinakita natin yung final percentage para makita yung score ng student
        System.out.println("Score Percentage: " + scorePercentage + "%");

        // Gumamit tayo ng if para ma-check kung umabot sa required passing score na 70%
        if (scorePercentage >= 70.0) {

            // Kapag 70% pataas yung score, PASS ang magiging result
            System.out.println("Result: PASS");

        } else {

            // Kapag pababa 70% naman, FAIL na ang magiging kalalabasan
            System.out.println("Result: FAIL");
        }
    }
}
