import java.util.Scanner;

public class Exam_ev {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i, score = 0, att = 0;

        char[] key = {'a','b','c','d','a'};
        char[] ans = new char[5];

        for (i = 0; i < 5; i++) {
            System.out.print("Q" + (i + 1) + ": ");
            ans[i] = sc.next().charAt(0);

            if (ans[i] != 'x') {
                att++;
                if (ans[i] == key[i]) {
                    score = score + 4;
                } else {
                    score = score - 1;
                }
            }
        }

        System.out.println("Score: " + score);
        System.out.println("Attempted: " + att);

        if (score >= 15) {
            System.out.println("Grade A");
        } else if (score >= 8) {
            System.out.println("Grade B");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
