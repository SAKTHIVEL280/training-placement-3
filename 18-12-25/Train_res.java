import java.util.Scanner;

public class Train_res {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c = 2, s = 5, ch, i, j, flag;

        int[][] seat = new int[c][s]; // 0 free, 1 booked

        while (true) {
            System.out.println("\n1.Book 2.Cancel 3.Status 4.Exit");
            ch = sc.nextInt();

            if (ch == 1) {
                flag = 0;
                for (i = 0; i < c; i++) {
                    for (j = 0; j < s; j++) {
                        if (seat[i][j] == 0) {
                            seat[i][j] = 1;
                            System.out.println("Booked Coach " + (i + 1) + " Seat " + (j + 1));
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 1) {
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println("Full");
                }
            }

            else if (ch == 2) {
                i = sc.nextInt() - 1;
                j = sc.nextInt() - 1;
                if (i >= 0 && i < c && j >= 0 && j < s && seat[i][j] == 1) {
                    seat[i][j] = 0;
                    System.out.println("Cancelled");
                } else {
                    System.out.println("Invalid");
                }
            }

            else if (ch == 3) {
                for (i = 0; i < c; i++) {
                    for (j = 0; j < s; j++) {
                        System.out.print(seat[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            else if (ch == 4) {
                break;
            }
        }
        sc.close();
    }
}
