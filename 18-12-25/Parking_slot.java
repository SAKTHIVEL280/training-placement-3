import java.util.Scanner;

public class Parking_slot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, ch, i, slot = -1;
        System.out.print("Enter total slots: ");
        n = sc.nextInt();
        int[] s = new int[n];
        while (true) {
            System.out.println("\n1.Park  2.Exit  3.Status  4.Close");
            ch = sc.nextInt();
          
            if (ch == 1) {
                slot = -1;
                for (i = 0; i < n; i++) {
                    if (s[i] == 0) {
                        slot = i;
                        break;
                    }
                }
                if (slot == -1) {
                    System.out.println("Parking Full");
                } else {
                    s[slot] = 1;
                    System.out.println("Car parked at slot: " + (slot + 1));
                }
            }
              
            else if (ch == 2) { 
                System.out.print("Enter slot number: ");
                int ex = sc.nextInt() - 1;

                if (ex >= 0 && ex < n && s[ex] == 1) {
                    s[ex] = 0;
                    System.out.println("Slot freed");
                } else {
                    System.out.println("Invalid or empty slot");
                }
            }

            else if (ch == 3) {
                System.out.println("Parking Status:");
                for (i = 0; i < n; i++) {
                    if (s[i] == 1) {
                        System.out.println("Slot " + (i + 1) + ": Occupied");
                    } else {
                        System.out.println("Slot " + (i + 1) + ": Free");
                    }
                }
            }

            else if (ch == 4) {  
                System.out.println("Parking Closed");
                break;
            }

            else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
