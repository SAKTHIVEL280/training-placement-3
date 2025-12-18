import java.util.Scanner;

public class Bank_acc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int bal = 10000, ch, amt, i, idx = 0;

        int[] t = new int[5];

        while (true) {
            System.out.println("\n1.Deposit 2.Withdraw 3.Balance 4.History 5.Exit");
            ch = sc.nextInt();

            if (ch == 1) {
                amt = sc.nextInt();
                bal = bal + amt;
                t[idx % 5] = amt;
                idx++;
            }

            else if (ch == 2) {
                amt = sc.nextInt();
                if (amt <= bal) {
                    bal = bal - amt;
                    t[idx % 5] = -amt;
                    idx++;
                } else {
                    System.out.println("Low balance");
                }
            }

            else if (ch == 3) {
                System.out.println("Balance: " + bal);
            }

            else if (ch == 4) {
                for (i = 0; i < 5; i++) {
                    if (t[i] != 0) {
                        System.out.println(t[i]);
                    }
                }
            }

            else if (ch == 5) {
                break;
            }
        }
        sc.close();
    }
}
