import java.util.Scanner;
class t {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int o=n,r=0;
        while(n!=0){
            int d=n%10;
            r=r*10+d;
            n/=10;
        }
        System.out.println("Reversed number: "+r);
    }
}
