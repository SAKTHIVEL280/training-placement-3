import java.util.Scanner;

public class Stock_al {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 3, ch, i, qty;

        String[] p = {"Pen","Book","Bag"};
        int[] q = {50, 30, 10};

        while (true) {
            System.out.println("\n1.Sell 2.Status 3.Exit");
            ch = sc.nextInt();

            if (ch == 1) {
                i = sc.nextInt();
                qty = sc.nextInt();

                if (i >= 0 && i < n && q[i] >= qty) {
                    q[i] = q[i] - qty;
                    if (q[i] < 5) {
                        System.out.println("Low stock alert");
                    }
                } else {
                    System.out.println("Invalid");
                }
            }

            else if (ch == 2) {
                for (i = 0; i < n; i++) {
                    System.out.println(p[i] + " : " + q[i]);
                }
            }

            else if (ch == 3) {
                break;
            }
        }
        sc.close();
    }
}
