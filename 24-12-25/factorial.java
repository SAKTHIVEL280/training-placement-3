import java.util.Scanner;
class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int f=1;
        for(int i=2;i<=n;i++){
            f*=i;
        }
        System.out.println("Factorial: "+f);
    }
}
